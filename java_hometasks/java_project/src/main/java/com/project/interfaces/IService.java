package com.project.interfaces;

import com.project.models.Contact;
import com.project.models.User;

import java.util.List;

public interface IService {
    boolean logIn(User user);
    boolean logOut();
    boolean signIn(User user);
    List<User> getAllRegisteredUsers();
    List<Contact> getAllContacts();
    User getLoginedUser();
    boolean saveContacts(List<Contact> contacts);
    boolean findTheSameLogin(String login);
}
