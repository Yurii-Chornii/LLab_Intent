package hometask_4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private List<ContactField> contactFields = new ArrayList<>();


    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //todo створити метод додавання філдів

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
