// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

package Seminar1_HW;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] fArray = getFilledArray(8);
        int[] sArray = getFilledArray(8);

        int[] divArray = divArrays(fArray, sArray);
        printArray(divArray);

        int[] wrongArray = divArrays(null, sArray);
    }

    public static int[] divArrays(int[] fArray, int[] sArray) {
        if (fArray == null || sArray == null) throw new RuntimeException("Массивов нет");
        if(fArray.length != sArray.length) throw new RuntimeException("Длины массивов не равны");


        int[] resultArr = new int[fArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = fArray[i]/sArray[i];
        }
        return resultArr;
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(1,16);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int number: array){
            System.out.println(number);
        }
    }

}
