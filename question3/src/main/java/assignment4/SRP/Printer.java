package assignment4.SRP;

/**
 * Created by Admin on 2017/03/30.
 */
public class Printer {
    Text text;

    public Printer(Text text) {
        this.text = text;
    }
    public void printText(){
        System.out.print("Text sent to printer to be printed");

    }
}
