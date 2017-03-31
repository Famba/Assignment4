package assignment4.DIP;

/**
 * Created by Admin on 2017/03/30.
 */
public class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
