import java.awt.*;
import java.util.Vector;

public abstract class CompositeNovelElements extends AbstractNovelElement{
    private Vector children = new Vector();
    private int charLength = -1;

    public NovelElement_IF getChild(int index){
        return (NovelElement_IF)children.elementAt(index);
    }

    public synchronized void addChild(NovelElement_IF child){
        synchronized (child){
            children.addElement(child);
            ((AbstractNovelElement)child).setParent(this);
            changeNotification();
        }
    }

    public synchronized void removeChild(AbstractNovelElement child){
        synchronized (child){
            if(this == child.getParent()){
                child.setParent(null);
            }
            children.removeElement(child);
            changeNotification();
        }
    }

    public void changeNotification(){
        charLength = -1;
        if(getParent() != null){
            getParent().changeNotification();
        }
    }

    @Override
    public int getCharLength() {
        int len = 0;
        for (int i=0; i<children.size(); i++){
            AbstractNovelElement thisChild;
            thisChild = (AbstractNovelElement)children.elementAt(i);
            len += thisChild.getCharLength();
        }
        charLength = len;
        return len;
    }
}
