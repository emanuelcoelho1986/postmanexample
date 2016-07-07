package postmanexample.models;

import java.util.logging.Logger;
import postmanexample.models.delivery.Mail;
import postmanexample.models.vehicle.Bike;
import postmanexample.models.vehicle.Vehicle;

/**
 *
 * @author emanuelcoelho
 */
public class Postman extends Person implements Runnable {

    /**
     * For Logging purposes
     */
    private static final Logger LOG = Logger.getLogger(Postman.class.getName());

    private Vehicle vehicle;
    private Mail mail;

    /**
     * Init empty Postman Not Recomended
     */
    public Postman() {
        super();
    }

    public void deliverMail() {
        try {
            long predictDeliveryTime = vehicle.predictDeliveryTime(mail);
            Thread.sleep(predictDeliveryTime);
            System.out.println("--- Postman: " + this + " DELIVERED Mail: " + getMail() + " by " + getVehicle());
        } catch (Exception e) {
            System.out.println("Postman died.... =/");
        }
    }

    /**
     * Init Postman
     *
     * @param firstName
     * @param lastname
     * @param gender
     */
    public Postman(String firstName, String lastname, Gender gender) {
        super(firstName, lastname, gender);
    }

    /**
     *
     * @return
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     *
     * @param vehicle
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     *
     * @return
     */
    public Mail getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        System.out.println(super.toString() + " start mail route");
        deliverMail();
    }

}
