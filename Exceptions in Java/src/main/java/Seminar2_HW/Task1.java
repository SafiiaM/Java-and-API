// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
// пользователя ввод данных.

package Seminar2_HW;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        float n = enterFloat();
        System.out.println("number = " + n);
    }

    public static float enterFloat() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Enter float number: ");
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Characters are inadmissible");
            return enterFloat();
        }
    }

}
