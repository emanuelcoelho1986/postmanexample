package postmanexample.models;

import java.util.logging.Logger;

/**
 *
 * @author emanuelcoelho
 */
public class Country {
    private static final Logger LOG = Logger.getLogger(Country.class.getName());
    

    private String name;

    /**
     *
     * @param name
     */
    public Country(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
