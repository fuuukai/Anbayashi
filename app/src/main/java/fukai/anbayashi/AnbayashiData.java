package fukai.anbayashi;

/**
 * Created by fukai on 16/04/30.
 */
public class AnbayashiData {
    private int number;
    private int addition;
    private String comment;

    //Constructer
    public AnbayashiData(int number, int addtion, String comment){
        this.number = number;
        this.addition = addtion;
        this.comment = comment;
    }

    public int getNumber(){
        return number;
    }

    public int getAddition(){
        return addition;
    }

    public String getComment(){
        return comment;
    }
}
