package postmanexample.models.delivery;

import java.util.logging.Logger;
import postmanexample.models.Address;
import postmanexample.models.Person;

/**
 *
 * @author emanuelcoelho
 */
public class Mail {
    private static final Logger LOG = Logger.getLogger(Address.class.getName());

    private Double weigth;
    private Double size;

    private Person receiver;
    private Person carrier;

    private String description;

    /**
     * 
     * @param weigth
     * @param size
     * @param receiver
     * @param carrier
     * @param description 
     */
    public Mail(Double weigth, Double size, Person receiver, Person carrier, String description) {
        this.weigth = weigth;
        this.size = size;
        this.receiver = receiver;
        this.carrier = carrier;
        this.description = description;
    }

    /**
     * 
     * @return 
     */
    public Double getWeigth() {
        return weigth;
    }

    /**
     * 
     * @param weigth 
     */
    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    /**
     * 
     * @return 
     */
    public Double getSize() {
        return size;
    }

    /**
     * 
     * @param size 
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * 
     * @return 
     */
    public Person getReceiver() {
        return receiver;
    }

    /**
     * 
     * @param receiver 
     */
    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    /**
     * 
     * @return 
     */
    public Person getCarrier() {
        return carrier;
    }

    /**
     * 
     * @param carrier 
     */
    public void setCarrier(Person carrier) {
        this.carrier = carrier;
    }

    /**
     * 
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
