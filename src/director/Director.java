package director;

import builders.IBuilder;
import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public class Director {

    private IBuilder builder;

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setEngine(new Engine(2000));
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setColor(Color.RED);
    }

    public void constructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setEngine(new Engine(4800));
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setColor(Color.BLACK);
    }

    public void constructCarSport(IBuilder builder) {
        builder.setCarType(CarType.SPORTCAR);
        builder.setEngine(new Engine(4800));
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setColor(Color.YELLOW);
    }
}
