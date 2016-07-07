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
public class Vehicle {

    public static final Integer SPEED_PER_MILE = 10;
    private static final Logger LOG = Logger.getLogger(Vehicle.class.getName());

    private Double speed;

    public Vehicle() {
    }
    
    public long predictDeliveryTime(Mail mail){
        return Math.round((mail.getSize()*mail.getWeigth())/Vehicle.SPEED_PER_MILE)*1000;
    }

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

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + "speed=" + speed + '}';
    }
}
