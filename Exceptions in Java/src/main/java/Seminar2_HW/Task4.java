// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Seminar2_HW;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Введите строку: " + stringEnter());
    }

    public static String stringEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        if (line.length() == 0)
            throw new RuntimeException("Пустые строки вводить нельзя");
        return line;
    }
}
