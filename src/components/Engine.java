package components;

import lombok.Getter;

@Getter
public class Engine {

    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
