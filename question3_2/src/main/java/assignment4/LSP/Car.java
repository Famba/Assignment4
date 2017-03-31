package assignment4.LSP;

/**
 * Created by Admin on 2017/03/31.
 */
public class Car extends TransportationMachine {
    public Car() {
    }

    @Override
    void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");
    }
}