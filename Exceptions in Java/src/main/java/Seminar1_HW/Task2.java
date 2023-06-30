// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

package Seminar1_HW;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        int[] fArray = getFilledArray(8);
        int[] sArray = getFilledArray(7);

        int[] difArray = difArrays(fArray, sArray);
    }

    public static int[] difArrays(int[] fArray, int[] sArray) {
        if(fArray.length != sArray.length) throw new RuntimeException("Длины массивов не равны");
        int[] resultArr = new int[fArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = fArray[i] - sArray[i];
        }
        return resultArr;
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(15);
        }
        return array;
    }

}
