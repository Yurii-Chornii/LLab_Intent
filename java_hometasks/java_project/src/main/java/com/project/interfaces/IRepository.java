package com.project.interfaces;

import com.project.models.Contact;
import com.project.models.User;

import java.util.List;

public interface IRepository {
    boolean saveRegisteredUsers(List<User> users);
    List<User> getRegisteredUsers();
    List<Contact> getUserContacts(Long id);
}
