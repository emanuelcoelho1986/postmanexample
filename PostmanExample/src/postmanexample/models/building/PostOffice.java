package postmanexample.models.building;

import java.util.List;
import postmanexample.models.Address;
import postmanexample.models.Postman;
import postmanexample.models.delivery.Mail;

/**
 *
 * @author emanuelcoelho
 */
public class PostOffice extends Office{

    private List<Mail> mails;
    private List<Postman> postmans;
    
    public PostOffice(String name, Address address) {
        super(name, address);
    }
    
    public void assignPostMansToMail(){
        // Assign Postman to Mails
        // Java 7 foreach loop
        // I'm going to assign manuall 1 to 1
        // For the example I did 3 on purpose to have 3 to 3
        for (Mail mail : getMails()) {
            mail.setCarrier(getPostmans().get(getMails().indexOf(mail)));
            getPostmans().get(getMails().indexOf(mail)).setMail(mail);
        }
        
    }
    
    public void startDelivery(){
        
    }
    
    public void initDelivery(){
        // Init the delivery system
        for (Postman postman : getPostmans()) {
            new Thread(postman).start();
        }
    }

    public List<Mail> getMails() {
        return mails;
    }

    public void setMails(List<Mail> mails) {
        this.mails = mails;
    }

    public List<Postman> getPostmans() {
        return postmans;
    }

    public void setPostmans(List<Postman> postmans) {
        this.postmans = postmans;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
