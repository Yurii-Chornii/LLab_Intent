package com.project.repositories;

import com.project.interfaces.IRepository;
import com.project.models.Contact;
import com.project.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLRepository implements IRepository {
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/jdbc_homework?serverTimezone=UTC";
    private static final String USER_NAME = "root";
    private static final String USER_PASSWORD = "backspace";

    @Override
    public boolean saveRegisteredUsers(List<User> users) {
        return false;
    }

    @Override
    public List<User> getRegisteredUsers() {
        List<User> loginedUsers = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, USER_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM registered_users;");
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong(1));
                user.setLogin(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                loginedUsers.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return loginedUsers;
    }

    @Override
    public List<Contact> getUserContacts(Long id) {
        List<Contact> contactList = new ArrayList<>();
        try {
            String query = String.format(
                    "SELECT * FROM contacts WHERE user_ID=%d;",
                    id
            );
            Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, USER_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Contact contact = new Contact();
                contact.setID(resultSet.getLong(2));
                contact.setFIRSTNAME(resultSet.getString(3));
                contact.setLASTNAME(resultSet.getString(4));
                contact.setPHONE_NUMBER(resultSet.getString(5));
                contactList.add(contact);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contactList;
    }

    public void saveUser(User user) {
        long id = user.getId();
        String login = user.getLogin();
        String password = user.getPassword();
        try {
            String query = String.format(
                    "INSERT INTO registered_users " +
                            "(id, login, password) " +
                            "VALUES (%d, \"%s\", \"%s\");",
                    id,
                    login,
                    password
            );
            Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, USER_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void saveContact(Contact contact, long userId) {
        long id = contact.getID();
        String firstName = contact.getFIRSTNAME();
        String lastName = contact.getLASTNAME();
        String phoneNumber = contact.getPHONE_NUMBER();
        try {
            String query = String.format(
                    "INSERT INTO contacts " +
                            "(user_ID, contact_ID, first_name, last_name, phone_number) " +
                            "VALUES (%d, %d, \"%s\", \"%s\", \"%s\");",
                    userId,
                    id,
                    firstName,
                    lastName,
                    phoneNumber
            );
            Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, USER_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteAllContacts(long userId) {
        try {
            String query = String.format(
                    "DELETE FROM contacts WHERE user_ID=%d;",
                    userId
            );
            Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, USER_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
