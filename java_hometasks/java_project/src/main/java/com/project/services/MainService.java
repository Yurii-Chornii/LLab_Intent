package com.project.services;

import com.project.interfaces.IService;
import com.project.models.Contact;
import com.project.models.User;
import com.project.repositories.FilesRepository;

import java.util.List;
import java.util.Optional;

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
    public boolean logIn(String login, String password) {
        List<User> registeredUsers = filesRepository.getRegisteredUsers();
        Optional<User> founding = registeredUsers.stream().filter(item -> item.getLogin().equals(login) && item.getPassword().equals(password)).findFirst();
        if (!founding.isPresent()){
            return false;
        }
        loginedUser = founding.get();
        return true;
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

