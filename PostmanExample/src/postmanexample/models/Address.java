package postmanexample.models;

import java.util.logging.Logger;

/**
 *
 * @author emanuelcoelho
 */
public class Address {
    private static final Logger LOG = Logger.getLogger(Address.class.getName());

    private String streetName;
    private String door;
    private String floor;
    private Country country;

    public Address(String streetName, String door, String floor, Country country) {
        this.streetName = streetName;
        this.door = door;
        this.floor = floor;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", door=" + door + ", floor=" + floor + ", country=" + country + '}';
    }
}
