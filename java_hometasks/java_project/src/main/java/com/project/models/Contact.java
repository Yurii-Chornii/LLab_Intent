package com.project.models;

import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String FIRSTNAME;
    private final String LASTNAME;
    private final String PHONE_NUMBER;
    private final Long ID;


    public Contact(String firstName, String lastName, String phoneNumber) {
        this.FIRSTNAME = firstName;
        this.LASTNAME = lastName;
        this.PHONE_NUMBER = phoneNumber;
        ID = new Date().getTime();
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

