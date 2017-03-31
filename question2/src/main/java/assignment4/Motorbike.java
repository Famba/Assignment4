package assignment4;

/**
 * Created by Admin on 2017/03/30.
 */
public class Motorbike {
    private Vehicle motorBike;
    public Motorbike() {
    }

    public Motorbike(Vehicle motorBike) {
        this.motorBike = motorBike;
    }

    public int getNumberOfSeats() {
        return 1;
    }

    public int getNumberOfWheels() {
        return 2;
    }

    public String getVehicleType() {
        return "Motor Bike";
    }

    public void move() {
        System.out.print("Motor Bikes are a fast medium of transport.");
    }

    public void drive() {
        System.out.print("You are driving a motor bike.");
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "motorBike=" + motorBike +
                '}';
    }
}
