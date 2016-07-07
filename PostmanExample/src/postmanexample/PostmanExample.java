package postmanexample;

import java.util.ArrayList;
import java.util.List;
import postmanexample.models.Address;
import postmanexample.models.Country;
import postmanexample.models.Gender;
import postmanexample.models.Person;
import postmanexample.models.Postman;
import postmanexample.models.building.PostOffice;
import postmanexample.models.delivery.Mail;
import postmanexample.models.vehicle.Bike;
import postmanexample.models.vehicle.Car;

/**
 *
 * @author emanuelcoelho
 */
public class PostmanExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Init PostOffice
        Country dublinCountry = new Country("Ireland");
        Address dublinAddress = new Address("New Street", "666", "999", dublinCountry);
        PostOffice postOffice = new PostOffice("Dublin", dublinAddress);

        // Init List of Postmans (3 sgould be enough)
        // Set Postmans
        postOffice.setPostmans(getListOfPostmans());
        postOffice.setMails(getMails());
        
        postOffice.assignPostMansToMail();
        postOffice.initDelivery();

        System.out.println("Post Office: "+postOffice);
    }

    private static List<Postman> getListOfPostmans() {
        List<Postman> postmans = new ArrayList<>();
        
        Postman postman1 = new Postman("Postmane", "1", Gender.MAlE);
        Postman postman2 = new Postman("Postmane", "2", Gender.FEMALE);
        Postman postman3 = new Postman("Postmane", "3", Gender.MAlE);
        
        postman1.setVehicle(new Bike(12.0));
        postman2.setVehicle(new Bike(20.4));
        postman3.setVehicle(new Car(120.0));

        postmans.add(postman1);
        postmans.add(postman2);
        postmans.add(postman3);
        
        return postmans;
    }
    
    private static List<Mail> getMails(){
        List<Mail> mails = new ArrayList<>();
        
        Person person1 = new Person("Person", "1", Gender.MAlE);
        Mail mail1 = new Mail(12.3, 10.0, person1, null, "This is a mail one");
        
        Person person2 = new Person("Person", "2", Gender.FEMALE);
        Mail mail2 = new Mail(3.3, 4.0, person2, null, "This is a mail two");
        
        Person person3 = new Person("Person", "3", Gender.MAlE);
        Mail mail3 = new Mail(6.1, 5.0, person3, null, "This is a mail three");
        
        mails.add(mail1);
        mails.add(mail2);
        mails.add(mail3);
        
        return mails;
    }
}
