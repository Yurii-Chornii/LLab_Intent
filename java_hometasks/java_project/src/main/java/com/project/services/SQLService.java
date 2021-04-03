package com.project.services;

import com.project.interfaces.IService;
import com.project.models.Contact;
import com.project.models.User;
import com.project.repositories.SQLRepository;

import java.util.List;
import java.util.Optional;

public class SQLService implements IService {
    private User loginedUser = null;
    private final SQLRepository sqlRepository = new SQLRepository();

    @Override
    public void setLoginedUser(User loginedUser) {
        this.loginedUser = loginedUser;
    }

    @Override
    public User getLoginedUser() {
        return loginedUser;
    }

    @Override
    public boolean logIn(String login, String password) {
        List<User> registeredUsers = sqlRepository.getRegisteredUsers();
        Optional<User> founding = registeredUsers.stream()
                .filter(item -> item.getLogin().equals(login)
                        &&
                        item.getPassword().equals(password))
                .findFirst();
        if (!founding.isPresent()) {
            return false;
        }
        loginedUser = founding.get();
        return true;
    }

    @Override
    public void logOut() {
        loginedUser = null;
    }

    @Override
    public boolean signUp(User user) {
        sqlRepository.saveUser(user);
        return true;
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = sqlRepository.getUserContacts(loginedUser.getId());
        if (contacts.size() > 0) return contacts;
        return null;
    }

    @Override
    public boolean findTheSameLogin(String login) {
        List<User> registeredUsers = sqlRepository.getRegisteredUsers();
        return registeredUsers.stream()
                .anyMatch(n -> n.getLogin().equals(login));
    }

    @Override
    public boolean addNewContact(String firstName, String lastName, String phomeNumber) {
        Contact contact = new Contact(firstName, lastName, phomeNumber);
        sqlRepository.saveContact(contact, loginedUser.getId());
        return true;
    }

    @Override
    public boolean deleteAllContacts() {
        sqlRepository.deleteAllContacts(loginedUser.getId());
        return true;
    }

    @Override
    public boolean updateRegisteredUsers(User updatedUser) {
        return false;
    }
}
