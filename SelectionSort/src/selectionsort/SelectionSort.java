package selectionsort;

/**
 *
 * @author LukasVyhnalek
 */
public class SelectionSort {

    public static void selectionSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // i points at first number behind "wall"
            int indexOfSmallest = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > input[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            // swap
            int temp = input[i];
            input[i] = input[indexOfSmallest];
            input[indexOfSmallest] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //initialize
        int[] input = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};

        //sort
        selectionSort(input);

        //print
        printArray(input);
    }

}
