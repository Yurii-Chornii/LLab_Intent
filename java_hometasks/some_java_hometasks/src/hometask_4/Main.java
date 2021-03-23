package hometask_4;

import java.io.*;

public class Main {
    private static final String memoryPath = "C:\\Users\\yurac\\OneDrive\\Рабочий стол\\OktenWeb\\LLab_Intent\\java_hometasks\\some_java_hometasks\\src\\hometask_4\\memory\\";

    public static void main(String[] args) {
//        User loginedUser = new User("yura", "1111");
        User loginedUser = null;

        User testUser = new User("Test", "1111");
        Contact testContact = new Contact("Petro", "Petrenko");
        testUser.addContact(testContact);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String answer = "";

        try {
            do {
                if (loginedUser == null) {
                    System.out.println("Натисніть 1 щоб зареєструватись або 2 щоб увійти");
                    answer = bufferedReader.readLine();


                    if (answer.equals("1")) {
                        System.out.println("ви натиснули 1");


                    } else if (answer.equals("2")) {
                        System.out.println("ви натиснули 2");
                    }
                } else if (loginedUser != null) {
                    answer = bufferedReader.readLine();
                }


            } while (!answer.equals("0"));


            //создаем 2 потока для сериализации объекта и сохранения его в файл
            FileOutputStream outputStream = new FileOutputStream(memoryPath + "memory.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // сохраняем игру в файл
            objectOutputStream.writeObject(testUser);


            FileInputStream fileInputStream = new FileInputStream(memoryPath + "memory.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            User user2 = (User) objectInputStream.readObject();

            System.out.println(user2);

            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
