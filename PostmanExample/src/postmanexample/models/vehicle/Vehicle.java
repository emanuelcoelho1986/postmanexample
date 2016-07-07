/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postmanexample.models.vehicle;

import java.util.logging.Logger;
import postmanexample.models.delivery.Mail;

/**
 *
 * @author emanuelcoelho
 */
public abstract class Vehicle {

    public static final Integer SPEED_PER_MILE = 10;
    private static final Logger LOG = Logger.getLogger(Vehicle.class.getName());

    private Double speed;

    public Vehicle() {
    }
    
    public abstract int predictDeliveryTime(Mail mail);

    /**
     *
     * @param speed
     */
    public Vehicle(Double speed) {
        this.speed = speed;
    }

    /**
     *
     * @return
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

}
