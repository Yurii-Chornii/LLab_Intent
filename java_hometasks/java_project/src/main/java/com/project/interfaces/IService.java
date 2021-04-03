package com.project.interfaces;

import com.project.models.Contact;
import com.project.models.User;

import java.util.List;

public interface IService {
    boolean logIn(String login, String password);

    void logOut();

    boolean signUp(User user);

    List<Contact> getAllContacts();

    User getLoginedUser();

    void setLoginedUser(User loginedUser);

    boolean findTheSameLogin(String login);

    boolean addNewContact(String firstName, String lastName, String phomeNumber);

    boolean deleteAllContacts();

    boolean updateRegisteredUsers(User updatedUser);
}
