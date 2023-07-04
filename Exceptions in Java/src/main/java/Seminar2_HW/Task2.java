// Если необходимо, исправьте данный код:
// try {
//   int d = 0;
//   double caughtRes1 = intArray[8] / d;
//   System.out.println("caughtRes1 = " + caughtRes1);
//} catch (ArithmeticException e) {
//   System.out.println("Catching exception: " + e);
//}

package Seminar2_HW;

public class Task2 {

    public static void main(String[] args) {
        int[] intArray = new int[15];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        try {
            int d = 0;
            double caughtRes1 = intArray[8] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
