package hometask_4;

import java.io.Serializable;

public enum ContactFieldTypes implements Serializable {
    PHONE_FIELD("Phone"), EMAIL_FIELD("Email");

    private static final long serialVersionUID = 1L;
    private String alias;

    ContactFieldTypes(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "ContactTypes{" +
                "alias='" + alias + '\'' +
                "} " + super.toString();
    }
}
