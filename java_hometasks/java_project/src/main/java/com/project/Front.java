package com.project;

import com.project.models.User;
import com.project.services.MainService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Front {

    MainService mainService = new MainService();
//todo порішати баг з айдішками

    public void consoleDialog() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";


        do {
            if (mainService.getLoginedUser() == null) {
                System.out.println("Введіть 1, щоб зареєструватись, 2, щоб увійти, 0, щоб завершити програму");
                answer = bufferedReader.readLine();

                switch (answer) {
                    case "1":
                        System.out.println("Ви ввели 1");
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
                            if(mainService.signIn(user)){
                                mainService.setLoginedUser(user);
                                System.out.println("Ви зареєструвались і залогінились");
                            }
                        }
                        break;
                    case "2":
                        System.out.println("Ви ввели 2");
                        break;
                    case "0":
                        System.out.println("Програма завершує виконання.");
                        break;
                    default:
                        System.out.println("Введіть 1 або 2");
                }

            } else {

            }
        } while (!answer.equals("0"));

    }

}
