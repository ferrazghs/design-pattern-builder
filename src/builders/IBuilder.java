package builders;

import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public interface IBuilder {

    void setCarType(CarType carType);
    void setEngine(Engine engine);

    void setSeats(int seats);

    void setColor(Color color);

    void setTransmission(Transmission transmission);
}
