package postmanexample.models.building;

import postmanexample.models.Address;

/**
 *
 * @author emanuelcoelho
 */
public class Office {
    private String name; 
    private Address address;

    public Office(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Office{" + "name=" + name + ", address=" + address + '}';
    }
    
}
