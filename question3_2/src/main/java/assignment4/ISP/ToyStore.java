package assignment4.ISP;

/**
 * Created by Admin on 2017/03/31.
 */
public class ToyStore implements Toy {
        double price;
        String color;

        public void setPrice(double price) {
            this.price = price;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void move() {
            System.out.print("Not all toys created can move!\n");
        }

        public void fly() {
            System.out.print("Not all toys created can fly!");
        }
    }