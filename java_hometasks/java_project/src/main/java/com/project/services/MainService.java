package com.project.services;

import com.project.interfaces.IService;
import com.project.models.Contact;
import com.project.models.User;
import com.project.repositories.FilesRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainService implements IService {
    private User loginedUser = null;
    private final FilesRepository filesRepository = new FilesRepository();

    public void setLoginedUser(User user) {
        this.loginedUser = user;
    }

    @Override
    public User getLoginedUser() {
        return loginedUser;
    }


    @Override
    public boolean logIn(String login, String password) {
        List<User> registeredUsers = filesRepository.getRegisteredUsers();
        Optional<User> founding = registeredUsers.stream().filter(item -> item.getLogin().equals(login) && item.getPassword().equals(password)).findFirst();
        if (!founding.isPresent()) {
            return false;
        }
        loginedUser = founding.get();
        return true;
    }

    @Override
    public boolean signIn(User user) {
        List<User> registeredUsers = filesRepository.getRegisteredUsers();
        registeredUsers.add(user);
        return filesRepository.saveRegisteredUsers(registeredUsers);
    }

    @Override
    public void logOut() {
        loginedUser = null;
    }


    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = loginedUser.getContacts();
        if (contacts.size() > 0) return contacts;
        return null;
    }

    @Override
    public boolean findTheSameLogin(String login) {
        List<User> registeredUsers = filesRepository.getRegisteredUsers();
        return registeredUsers.stream().anyMatch(n -> n.getLogin().equals(login));
    }

    @Override
    public boolean addNewContact(String firstName, String lastName, String phomeNumber) {
        Contact contact = new Contact(firstName, lastName, phomeNumber);
        loginedUser.addContact(contact);
        return updateRegisteredUsers(loginedUser);
    }

    @Override
    public boolean updateRegisteredUsers(User updatedUser) {
        List<User> registeredUsers = filesRepository.getRegisteredUsers();
        List<User> newRegisteredUsers = registeredUsers.stream().map(user -> {
            if (user.getId().equals(updatedUser.getId())) return updatedUser;
            return user;
        }).collect(Collectors.toList());
        return filesRepository.saveRegisteredUsers(newRegisteredUsers);
    }

    @Override
    public boolean deleteAllContacts() {
        loginedUser.deleteAllContacts();
        return updateRegisteredUsers(loginedUser);
    }
}

