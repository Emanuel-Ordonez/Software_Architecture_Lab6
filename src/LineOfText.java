import java.util.Vector;

public class LineOfText extends CompositeNovelElements {
    public void addCharacters(String text){
        for(int i=0; i<text.length(); i++){
            this.addChild(new Character(text.charAt(i)));
        }
    }
}
