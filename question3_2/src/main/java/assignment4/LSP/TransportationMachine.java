package assignment4.LSP;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * Created by Admin on 2017/03/31.
 */
public class TransportationMachine {
    private String name;
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    private double speed;
    double getSpeed() {
        return speed;
    }
    void setSpeed(double speed) {
        this.speed = speed;
    }

    private Engine engine;
    Engine getEngine() {
        return engine;
    }
    void setEngine(Engine engine) {
        this.engine = engine;
    }

    void startEngine(){
    }
}