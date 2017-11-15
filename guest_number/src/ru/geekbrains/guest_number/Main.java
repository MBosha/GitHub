package ru.geekbrains.guest_number;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 10; i <= 30; i += 10){
        System.out.println("Ваша задача угадать число.");
        int range;
        System.out.println("Выбирите сложность:");
        System.out.println("1. Легкий");
        System.out.println("2. Средний");
        System.out.println("3. Сложный");
        System.out.println("4. Очень сложный");
        int Up = scanner.nextInt();
        if (Up == 1)
            range = 10;
        else if (Up == 2)
            range = 25;
        else if (Up == 3)
            range = 50;
        else range = 100;
        System.out.println("Вы выбрали уровень " + Up);
        playlevel(range);
        }
        scanner.close();
    }

    private static void playlevel(int range) {
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
