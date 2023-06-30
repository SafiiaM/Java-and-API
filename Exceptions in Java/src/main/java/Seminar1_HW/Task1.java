// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
// Посмотрите на код и подумайте, сколько разных типов исключений вы тут сможете получить?

package Seminar1_HW;

import org.jetbrains.annotations.NotNull;

public class Task1 {

    public static void main(String[] args) {
        String[] sArray = {"first string", null, "third string"};
        int[] array = {1,2,3,4,5,6,7,8,9};
        division(8, 0);
        printValueByIndex(array,9);
        printStringArray(sArray);

    }
    // ArithmeticException - деление на ноль


    public static void division(double firstNumber, double secondNumber){
        if(secondNumber == 0) throw new ArithmeticException("На ноль делить нельзя!");
        double result = firstNumber/secondNumber;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNumber, secondNumber, result);
    }
    // IndexOutOfBoundsException - выход за границы массива


    public static void printValueByIndex(int [] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемент с индексом x не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    // NullPointerException - отсутствие элемента (обращение к массиву по несуществующему индексу)

    public static void printStringArray(String [] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("Элемент отсутствует");
            System.out.println(item);
        }
    }
}
