package com.project;

import com.project.interfaces.IService;
import com.project.models.Contact;
import com.project.models.User;
import com.project.services.MainService;
import com.project.services.SQLService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Front {

    MainService mainService = new MainService();
    SQLService sqlService = new SQLService();

    //you can choose here where you wanna save data (in file or in DB)
    IService chosenService = sqlService;

    public void consoleDialog() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";

        do {
            if (chosenService.getLoginedUser() == null) {
                System.out.println("Введіть 1, щоб зареєструватись, 2, щоб увійти, 0, щоб завершити програму");
                answer = bufferedReader.readLine();

                switch (answer) {
                    case "1":
                        System.out.println("Реєстрація");
                        System.out.println("Введіть логін");
                        String login = bufferedReader.readLine();

                        if (chosenService.findTheSameLogin(login)) {
                            System.out.println("Такий логін вже зайнятий");
                        } else {
                            System.out.println("Введіть пароль");
                            String password = bufferedReader.readLine();
                            User user = new User(login, password);

                            if (chosenService.signUp(user)) {
                                chosenService.setLoginedUser(user);
                                System.out.println("Ви зареєструвались і залогінились");
                            }
                        }
                        break;
                    case "2":
                        System.out.println("Вхід");

                        System.out.println("Введіть логін");
                        String signInLogin = bufferedReader.readLine();

                        System.out.println("Введіть пароль");
                        String signInPassword = bufferedReader.readLine();

                        if (chosenService.logIn(signInLogin, signInPassword))
                            System.out.println("Ви увійшли в свій акаунт");
                        else System.out.println("Не вдалось знайти акаунт, або неправильний логін або пароль");
                        break;
                    case "0":
                        System.out.println("Програма завершує виконання.");
                        break;
                    default:
                        System.out.println("Введіть 1 або 2");
                }
            } else {
                System.out.println("Введіть: 1 - переглянути список контактів, 2 - очистити список контактів, " +
                        "3 - додати новий контакт, 4 - розлогінитись, 0 - завершити програму");
                answer = bufferedReader.readLine();

                switch (answer) {
                    case "0":
                        System.out.println("Програма завершує виконання.");
                        break;
                    case "1":
                        System.out.println("Список ваших контактів:");
                        List<Contact> contacts = chosenService.getAllContacts();
                        if (contacts == null) {
                            System.out.println("У вас немає жодного контакту");
                        } else contacts.forEach(System.out::println);
                        break;
                    case "2":
                        System.out.println("Видалення всіх контактів");
                        chosenService.deleteAllContacts();
                        break;
                    case "3":
                        System.out.println("Додавання нового контакту");

                        System.out.println("Введіть ім'я контакту");
                        String firstName = bufferedReader.readLine();

                        System.out.println("Введіть прізвище контакту");
                        String lastName = bufferedReader.readLine();

                        System.out.println("Введіть номер телефону контакту");
                        String phoneNumber = bufferedReader.readLine();

                        if (chosenService.addNewContact(firstName, lastName, phoneNumber)) {
                            System.out.println("Контакт додано");
                        } else System.out.println("Контакт не було додано");
                        break;
                    case "4":
                        System.out.println("Розлогінення");
                        chosenService.logOut();
                        break;
                }
            }
        } while (!answer.equals("0"));

    }

}
