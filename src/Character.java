import java.awt.*;

class Character extends AbstractNovelElement{
    private char character;

    public Character(char ch){
        this.character = ch;
    }

    @Override
    public int getCharLength() {
        return 1;
    }
}
