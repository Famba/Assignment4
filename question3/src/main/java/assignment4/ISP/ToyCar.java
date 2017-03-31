package assignment4.ISP;

/**
 * Created by Admin on 2017/03/30.
 */
public class ToyCar implements Toy, Movable{
    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("ToyCar: Start moving car.\n");
    }

    @Override
    public String toString() {
        return "ToyCar{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}
