package postmanexample.models.vehicle;

import postmanexample.models.delivery.Mail;

/**
 *
 * @author emanuelcoelho
 */
public class Bike extends Vehicle {

    public Bike(Double speed) {
        super(speed);
    }

    @Override
    public int predictDeliveryTime(Mail mail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
