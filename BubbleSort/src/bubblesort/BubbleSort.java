package bubblesort;

/**
 *
 * @author LukasVyhnalek
 */
public class BubbleSort {

    public static void bubbleSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // i represents how many elements have bubbled to correct place
            for (int j = 0; j + 1 < input.length - i; j++) {
                if (input[j] > input[j + 1]) {
                    //swap
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOpt(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // i represents how many elements have bubbled to correct place
            boolean swapped = false;
            for (int j = 0; j + 1 < input.length - i; j++) {
                if (input[j] > input[j + 1]) {
                    //swap
                    swapped = true;
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            if (!swapped) {
                return;
            }
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
        int[] inputOpt = input;

        //sort
        bubbleSort(input);
        bubbleSortOpt(inputOpt);

        //print
        printArray(input);
        printArray(inputOpt);
    }

}
