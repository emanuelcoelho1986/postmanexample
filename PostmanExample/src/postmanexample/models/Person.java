package postmanexample.models;

import java.util.logging.Logger;

/**
 *
 * @author emanuelcoelho
 */
public class Person extends Human {
    private static final Logger LOG = Logger.getLogger(Address.class.getName());

    // This should be associated with a house and not 
    // a Person. For the purpose I think it's Ok.
    // A House should have a List<Person> who live there
    // and the house have an address
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastname, Gender gender) {
        super(firstName, lastname, gender);
    }

    /**
     *
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}
