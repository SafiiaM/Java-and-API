// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class HeapSort {

    //возвращение левого потомка `A[i]`
    private static int LEFT(int i) {
        return (2 * i + 1);
    }

    //возвращение правого потомка `A[i]`
    private static int RIGHT(int i) {
        return (2 * i + 2);
    }

    //вспомогательная функция swap для замены двух индексов в массиве
    private static void swap(int[] sortArr, int i, int j) {
        int swap = sortArr[i];
        sortArr[i] = sortArr[j];
        sortArr[j] = swap;
    }

    //Рекурсия. Узел с индексом `i` и 2 его прямых потомка нарушают свойство кучи
    private static void cheapish(int[] sortArr, int i, int size) {
        // получение левого и правого потомков узла с индексом `i`
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;

        //сравнение `A[i]` с его левым и правым дочерними элементами и нахождение наибольшего значения
        if (left < size && sortArr[left] > sortArr[i]) largest = left;
        if (right < size && sortArr[right] > sortArr[largest]) largest = right;

        //change с потомком, имеющим большее значение, и вызов ниспадающей cheapish-down для дочернего элемента
        if (largest != i) {
            swap(sortArr, i, largest);
            cheapish(sortArr, largest, size);
        }
    }

    //функция удаления элемента с наивысшим приоритетом (присутствует в корне)
    public static int pop(int[] sortArr, int size) {
        //если в куче нет элементов
        if (size <= 0) {
            return -1;
        }
        int top = sortArr[0];

        //change корневого узла кучи последним элементом массива
        sortArr[0] = sortArr[size - 1];
        //вызов cheapish-down на корневом узле
        cheapish(sortArr, 0, size - 1);
        return top;
    }

    //функция пирамидальной сортировки массива `A` размера `n`
    public static void heapSort(int[] sortArr) {
        //приоритетная очередь и инициализация ее заданным массивом
        int n = sortArr.length;

        //вызов cheapish, начиная с последнего внутреннего узла до корневого узла
        int i = (n - 2) / 2;
        while (i >= 0) {
            cheapish(sortArr, i--, n);
        }

        // извлечение из кучи, пока она не станет пустой
        while (n > 0) {
            sortArr[n - 1] = pop(sortArr, n);
            n--;
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {13, 8, 9, 89, 90,8,1, 77, 33};
        heapSort(sortArr);
        for (int j : sortArr) {
            System.out.print(j + "\n");
        }
    }
}