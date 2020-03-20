public class Runner {
    public static void main(String [] args){

        //create novel
        Novel book = new Novel();

        //create pages
        Page page1 = new Page();
        Page page2 = new Page();

        //add pages to novel
        book.addChild(page1);
        book.addChild(page2);

        //create columns
        Column col1 = new Column();
        Column col2 = new Column();

        Column col3 = new Column();
        Column col4 = new Column();

        //add columns to pages
        page1.addChild(col1);
        page1.addChild(col2);

        page2.addChild(col3);
        page2.addChild(col4);

        //create lines of text
        LineOfText line1 = new LineOfText();

        //add lines of text to column
        col1.addChild(line1);

        line1.addCharacters("Design an archive system to store novels. A novel can have many pages. Within a page, there can be several columns and frames. A column can contain frames, so can a frame contain columns. Moreover, multiple images may be seen in a column or frame. A column is very likely to contain several lines of text, which can be a combination of characters and images. The Novel class and its entity classes provide methods to manipulate contents such as set(), get(), remove(). A UML class diagram is shown below that depicts many composition relationships. Please re-design it into a hierarchical representation to improve design quality." );

        System.out.println("Characters in book: " + book.getCharLength());
    }
}
