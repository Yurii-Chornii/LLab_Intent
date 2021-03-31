package com.project.models;

import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String FIRSTNAME;
    private String LASTNAME;
    private String PHONE_NUMBER;
    private Long ID;


    public Contact(String firstName, String lastName, String phoneNumber) {
        this.FIRSTNAME = firstName;
        this.LASTNAME = lastName;
        this.PHONE_NUMBER = phoneNumber;
        ID = new Date().getTime();
    }

    public Contact() {
    }


    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (FIRSTNAME != null ? !FIRSTNAME.equals(contact.FIRSTNAME) : contact.FIRSTNAME != null) return false;
        if (LASTNAME != null ? !LASTNAME.equals(contact.LASTNAME) : contact.LASTNAME != null) return false;
        if (PHONE_NUMBER != null ? !PHONE_NUMBER.equals(contact.PHONE_NUMBER) : contact.PHONE_NUMBER != null)
            return false;
        return ID != null ? ID.equals(contact.ID) : contact.ID == null;
    }

    @Override
    public int hashCode() {
        int result = FIRSTNAME != null ? FIRSTNAME.hashCode() : 0;
        result = 31 * result + (LASTNAME != null ? LASTNAME.hashCode() : 0);
        result = 31 * result + (PHONE_NUMBER != null ? PHONE_NUMBER.hashCode() : 0);
        result = 31 * result + (ID != null ? ID.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "FIRSTNAME='" + FIRSTNAME + '\'' +
                ", LASTNAME='" + LASTNAME + '\'' +
                ", PHONE_NUMBER='" + PHONE_NUMBER + '\'' +
                ", ID=" + ID +
                '}';
    }
}

