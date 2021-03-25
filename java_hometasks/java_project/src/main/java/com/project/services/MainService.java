package com.project.services;

import com.project.interfaces.IService;
import com.project.models.Contact;
import com.project.models.User;
import com.project.repositories.FilesRepository;

import java.util.List;

public class MainService implements IService {
    private User loginedUser = null;
    private FilesRepository filesRepository = new FilesRepository();

    public void setLoginedUser(User user) {
        this.loginedUser = user;
    }

    @Override
    public User getLoginedUser() {
        return loginedUser;
    }


    @Override
    public boolean logIn(User user) {
        return false;
    }

    @Override
    public boolean signIn(User user) {
        List<User> registeredUsers = filesRepository.getRegisteredUsers();
        registeredUsers.add(user);
        boolean status = filesRepository.saveRegisteredUsers(registeredUsers);
        System.out.println(filesRepository.getRegisteredUsers());
        return status;
    }

    @Override
    public boolean logOut() {
        return false;
    }

    @Override
    public List<User> getAllRegisteredUsers() {
        return null;
    }

    @Override
    public boolean saveContacts(List<Contact> contacts) {
        return false;
    }

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public boolean findTheSameLogin(String login) {
        List<User> registeredUsers = filesRepository.getRegisteredUsers();
        return registeredUsers.stream().anyMatch(n -> n.getLogin().equals(login));
    }
}

