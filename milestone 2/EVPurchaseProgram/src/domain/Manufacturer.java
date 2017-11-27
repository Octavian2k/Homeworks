package domain;

import java.util.Arrays;

public class Manufacturer {

    private String name;
    private Car[] cars;


    public Manufacturer(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
