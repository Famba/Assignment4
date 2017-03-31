package assignment4.LSP;

/**
 * Created by Admin on 2017/03/30.
 */
public class Car extends EnginePoweredMachine {
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");
    }
}