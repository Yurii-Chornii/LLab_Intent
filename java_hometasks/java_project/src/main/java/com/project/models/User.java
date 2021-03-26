package com.project.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private final Long id;
    private final String login;
    private final String password;
    private List<Contact> contacts = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public User(String login, String password) {
        this.id = new Date().getTime();
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        this.contacts.remove(contact);
    }

    public void deleteAllContacts(){
        this.contacts = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
