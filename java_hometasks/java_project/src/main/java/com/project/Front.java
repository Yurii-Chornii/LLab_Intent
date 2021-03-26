package com.project;

import com.project.models.User;
import com.project.services.MainService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Front {

    MainService mainService = new MainService();

    public void consoleDialog() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";


        do {
            if (mainService.getLoginedUser() == null) {
                System.out.println("Введіть 1, щоб зареєструватись, 2, щоб увійти, 0, щоб завершити програму");
                answer = bufferedReader.readLine();

                switch (answer) {
                    case "1":
                        System.out.println("Реєстрація");
                        System.out.println("Введіть логін");
                        answer = bufferedReader.readLine();
                        String login = answer;
                        if (mainService.findTheSameLogin(login)) {
                            System.out.println("Такий логін вже зайнятий");
                        } else {
                            System.out.println("Введіть пароль");
                            answer = bufferedReader.readLine();
                            String password = answer;
                            User user = new User(login, password);
                            if (mainService.signIn(user)) {
                                mainService.setLoginedUser(user);
                                System.out.println("Ви зареєструвались і залогінились");
                            }
                        }
                        break;
                    case "2":
                        System.out.println("Вхід");
                        System.out.println("Введіть логін");

                        answer = bufferedReader.readLine();
                        String signInLogin = answer;

                        System.out.println("Введіть пароль");
                        answer = bufferedReader.readLine();
                        String signInPassword = answer;
                        if (mainService.logIn(signInLogin, signInPassword))
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
                System.out.println("Введіть: 1 - переглянути список контактів, 2 - очистити список контактів, 3 - додати новий контакт, 4 - розлогінитись, 0 - завершити програму");
                answer = bufferedReader.readLine();

                switch (answer) {
                    case "0":
                        System.out.println("Програма завершує виконання.");
                        break;
                    case "1":
                        System.out.println("Список ваших контактів:");
                        break;
                    case "2":
                        System.out.println("Видалення всіх контактів");
                        break;
                    case "3":
                        System.out.println("Додавання нового контакту");
                        break;
                    case "4":
                        System.out.println("Розлогінення");
                        break;

                }
            }
        } while (!answer.equals("0"));

    }

}
