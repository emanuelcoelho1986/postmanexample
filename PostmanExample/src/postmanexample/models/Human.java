package postmanexample.models;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author emanuelcoelho
 */
public abstract class Human {
    private static final Logger LOG = Logger.getLogger(Human.class.getName());
    

    private String firstName;
    private String lastname;

    private Gender gender;

    /**
     *
     */
    public Human() {
    }

    public Human(String firstName, String lastname, Gender gender) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastname(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.firstName);
        hash = 17 * hash + Objects.hashCode(this.lastname);
        hash = 17 * hash + Objects.hashCode(this.gender);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        return true;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     *
     * @return
     */
    public Gender getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
