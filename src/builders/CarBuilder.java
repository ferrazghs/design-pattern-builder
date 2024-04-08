package builders;

import cars.Car;
import cars.Truck;
import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public class CarBuilder implements IBuilder {

    private CarType carType;
    private Engine engine;
    private int seats;
    private Transmission transmission;

    private Color color;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getResultCar() {
        return new Car(carType, seats, engine, transmission, color);
    }
}
