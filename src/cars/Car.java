package cars;

import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public class Car {

    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private final int seats;

    private Color color;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, Color color) {
        this.carType = carType;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public Color getColor() {
        return color;
    }
}
