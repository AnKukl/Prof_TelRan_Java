package com.proftelran.Homework.userRequestStorageSystem;

import java.sql.SQLOutput;
import java.util.*;

public class RequestsStorageSystem {
    public static void main(String[] args) {

        User user1 = new User("user1");
        User user2 = new User("user2");

        Storage storage = new Storage(user1);
        Storage storage2 = new Storage(user2);

        storage.saveInfo("www.de.de");
        storage.saveInfo("www.ebay.blabla");

        storage2.saveInfo("www.ebay.de");
        storage2.saveInfo("www.amazon.de");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите ли вы посмотреть статистику по пользователю:");
        String answer = scanner.nextLine();
        if ("да".equals(answer.toLowerCase())) {
            System.out.println("Выберите пользователя: \n1.user1       2.user2");
            String name = scanner.nextLine();
            if ("1".equals(name) || "user1".equals(name.toLowerCase())) storage.getInfo();
            if ("2".equals(name) || "user2".equals(name.toLowerCase())) storage2.getInfo();
        } else System.out.println("Спасибо за использование нашей системы");
    }

}
