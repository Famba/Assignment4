package assignment4.LSP;

/**
 * Created by Admin on 2017/03/31.
 */
public class Bicycle extends TransportationMachine {
    public Bicycle() {
    }

    @Override
    void startEngine() {
        super.startEngine();
        System.out.print("Bicycle: Bicycles do not have engines");
    }
}