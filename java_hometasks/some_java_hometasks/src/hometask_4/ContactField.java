package hometask_4;

import java.io.Serializable;

public class ContactField implements Serializable {
    private static int value = 1;
    private static final long serialVersionUID = 1L;
    private int id;
    private ContactFieldTypes contactType;
    private String contactField;

    public ContactField(ContactFieldTypes contactType, String contactField) {
        this.id = value;
        this.contactType = contactType;
        this.contactField = contactField;
        value++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContactFieldTypes getContactType() {
        return contactType;
    }

    public void setContactType(ContactFieldTypes contactType) {
        this.contactType = contactType;
    }

    public String getContact() {
        return contactField;
    }

    public void setContact(String contactField) {
        this.contactField = contactField;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contactType=" + contactType +
                ", contactField='" + contactField + '\'' +
                '}';
    }
}
