package assignment4.ISP;

/**
 * Created by Admin on 2017/03/30.
 */
public class ToyHouse {
    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyHouse{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}' +"\n";
    }
}