import java.awt.*;

public abstract class AbstractNovelElement implements NovelElement_IF{
    private Font font;
    private CompositeNovelElements parent;

    @Override
    public CompositeNovelElements getParent() {
        return parent;
    }

    protected void setParent(CompositeNovelElements parent){
        this.parent = parent;
    }

    @Override
    public Font getFont() {
        if(font!=null)
            return font;
        else if(parent!=null)
            return parent.getFont();
        else
            return null;
    }

    @Override
    public void setFont(Font font) {
        this.font = font;
    }
}
