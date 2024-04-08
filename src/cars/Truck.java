package cars;

import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;
import lombok.Getter;

@Getter
public class Truck {

    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private int seats;
    private Color color;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission, Color color) {
        this.carType = carType;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.color = color;
    }

    public String getResult() {
        return "Truck with motor: " + engine.getPower();
    }
}
