package hometask_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final String memoryPath = "C:\\Users\\yurac\\OneDrive\\Рабочий стол\\OktenWeb\\LLab_Intent\\java_hometasks\\some_java_hometasks\\src\\hometask_4\\memory\\";


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream RegisterFileInputStream = new FileInputStream(memoryPath + "registeredUsers.ser");
        ObjectInputStream RegisterObjectInputStream = new ObjectInputStream(RegisterFileInputStream);
        List<User> registeredUsers = (List<User>) RegisterObjectInputStream.readObject();


        User loginedUser;

        FileInputStream loginedUserFileInputStream = new FileInputStream(memoryPath + "loginedUser.ser");
        ObjectInputStream loginedUserObjectInputStream = new ObjectInputStream(loginedUserFileInputStream);
        loginedUser = (User) loginedUserObjectInputStream.readObject();


        System.out.println(loginedUser);

//чисто тести чи створюється новий юзер і чи додаються йому контакти
        //todo до контакків створити ше АррейЛіст з філдами! done
        User testUser = new User("Test", "1111");
        Contact testContact = new Contact("Petro", "Petrenko");
        testUser.addContact(testContact);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String answer = "";

        do {
            if (loginedUser == null) {
                System.out.println("Натисніть 1 щоб зареєструватись або 2 щоб увійти");
                answer = bufferedReader.readLine();

                if (answer.equals("1")) {

                    System.out.println("Введіть ваш логін");
                    answer = bufferedReader.readLine();
                    String login = answer;

                    System.out.println("Введіть ваш пароль");
                    answer = bufferedReader.readLine();
                    String password = answer;

                    User user = new User(login, password);
                    loginedUser = user;

                    registeredUsers.add(user);

                    FileOutputStream RegisterOutputStream = new FileOutputStream(memoryPath + "registeredUsers.ser");
                    ObjectOutputStream RegisterObjectOutputStream = new ObjectOutputStream(RegisterOutputStream);
                    RegisterObjectOutputStream.writeObject(registeredUsers);
                    System.out.println("Ваш акаунт створено, і ви автоматично авторизувались");

                } else if (answer.equals("2")) {
                    System.out.println("ви натиснули 2");
                    System.out.println("Введіть ваш логін");
                    answer = bufferedReader.readLine();
                    String login = answer;

                    System.out.println("Введіть ваш пароль");
                    answer = bufferedReader.readLine();
                    String password = answer;

                    User user = new User(login, password);

                    if (registeredUsers.contains(user)){
                        loginedUser = user;
                        System.out.println("такий юзер знайдений, ви увійшли в свій акаунт");
                    }else{
                        System.out.println("такого юзера не знайдено");
                    }
                }
            } else if (loginedUser != null) {
                System.out.println("Дії для залогіненого юзера");
                System.out.println("введіть 9 - щоб розлогінитись");
                answer = bufferedReader.readLine();
                if (answer.equals("9")){
                    loginedUser = null;
                }
            }
        } while (!answer.equals("0"));


//        try {
//            do {
//                if (loginedUser == null) {
//                    System.out.println("Натисніть 1 щоб зареєструватись або 2 щоб увійти");
//                    answer = bufferedReader.readLine();
//
//                    if (answer.equals("1")) {
//
//                        System.out.println("Введіть ваш логін");
//                        answer = bufferedReader.readLine();
//                        String login = answer;
//
//                        System.out.println("Введіть ваш пароль");
//                        answer = bufferedReader.readLine();
//                        String password = answer;
//
//                        User user = new User(login, password);
//                        loginedUser = user;
//
//                        registeredUsers.add(user);
//
//                        FileOutputStream RegisterOutputStream = new FileOutputStream(memoryPath + "registeredUsers.ser");
//                        ObjectOutputStream RegisterObjectOutputStream = new ObjectOutputStream(RegisterOutputStream);
//                        RegisterObjectOutputStream.writeObject(registeredUsers);
//                        System.out.println("Ваш акаунт створено, і ви автоматично авторизувались");
//
//                    } else if (answer.equals("2")) {
//                        System.out.println("ви натиснули 2");
//                    }
//                } else if (loginedUser != null) {
//                    answer = bufferedReader.readLine();
//                }
//
//
//            } while (!answer.equals("0"));
//
//
//            //создаем 2 потока для сериализации объекта и сохранения его в файл
//            FileOutputStream outputStream = new FileOutputStream(memoryPath + "memory.ser");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//            // сохраняем игру в файл
//            objectOutputStream.writeObject(testUser);
//
//
//            FileInputStream fileInputStream = new FileInputStream(memoryPath + "memory.ser");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            User user2 = (User) objectInputStream.readObject();
//
//            System.out.println(user2);
//
//            //закрываем поток и освобождаем ресурсы
//            objectOutputStream.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }

}

