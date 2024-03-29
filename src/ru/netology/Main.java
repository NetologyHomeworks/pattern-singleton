package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер списка:");
        int listSize = scanner.nextInt();

        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) list.add(random.nextInt(maxValue));
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра:");
        int filterThreshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        List<Integer> filteredList = new Filter(filterThreshold).filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);

        logger.log("Завершаем программу");
    }
}
