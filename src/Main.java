import builders.CarBuilder;
import builders.TruckBuilder;
import cars.Car;
import cars.Truck;
import director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructCarSport(carBuilder);
        Car car = carBuilder.getResultCar();

        System.out.println(car.getCarType());
    }
}