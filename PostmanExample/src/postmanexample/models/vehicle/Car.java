package postmanexample.models.vehicle;

import postmanexample.models.delivery.Mail;

/**
 *
 * @author emanuelcoelho
 */
public class Car extends Vehicle{

    public Car(Double speed) {
        super(speed);
    }

    @Override
    public int predictDeliveryTime(Mail mail) {
       // Avoid cast, but for the example it's ok
       return (int) Math.round(mail.getSize()*mail.getWeigth());
    }
    
}
