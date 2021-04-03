package com.project.repositories;

import com.project.interfaces.IRepository;
import com.project.models.Contact;
import com.project.models.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FilesRepository implements IRepository {
    private final String memoryPath = "C:\\Users\\yurac\\OneDrive\\Рабочий стол\\OktenWeb\\LLab_Intent\\java_hometasks\\java_project\\src\\main\\java\\com\\project\\memory\\";

    @Override
    public boolean saveRegisteredUsers(List<User> users) {
        try {
            FileOutputStream outputStream = new FileOutputStream(memoryPath + "registeredUsers.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> getRegisteredUsers() {
        List<User> registeredUsers = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(memoryPath + "registeredUsers.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            registeredUsers = (List<User>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return registeredUsers;
    }

    @Override
    public List<Contact> getUserContacts(Long id) {
        return null;
    }
}
