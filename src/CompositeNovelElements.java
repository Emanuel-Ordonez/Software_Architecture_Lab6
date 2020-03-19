import java.awt.*;

public abstract class CompositeNovelElements extends AbstractNovelElement{

    @Override
    public CompositeNovelElements getParent() {
        return null;
    }

    @Override
    public Font getFont() {
        return null;
    }

    @Override
    public void setFont(Font font) {

    }

    @Override
    public int getCharLength() {
        return 0;
    }
}
