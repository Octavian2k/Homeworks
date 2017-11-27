package domain;

import java.util.Arrays;

public class Dealership {

    private Manufacturer[] manufacturers;

    public Dealership(Manufacturer[] manufacturers) {
        this.manufacturers = manufacturers;
    }

    public Manufacturer[] getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Manufacturer[] manufacturers) {
        this.manufacturers = manufacturers;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "manufacturers=" + Arrays.toString(manufacturers) +
                '}';
    }
}
