/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author vyhna
 */
public class MergeSort {

    // this function can be used for "mergeSort call" where you only pass array
    // it generates "from" and "to" parameters
    public static void mergeSortExecutor(int[] input) {
        mergeSort(input, 0, input.length - 1);
    }

    public static void mergeSort(int[] input, int from, int to) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSort(input, from, middle);
            mergeSort(input, middle + 1, to);
            merge(input, from, middle, to);
        }
    }

    public static void merge(int[] input, int from, int middle, int to) {
        int lengthLeft = middle - from + 1;
        int lengthRight = to - middle;
        int[] left = new int[lengthLeft + 1];
        int[] right = new int[lengthRight + 1];

        for (int i = 0; i < lengthLeft; i++) {
            left[i] = input[from + i];
        }
        for (int i = 0; i < lengthRight; i++) {
            right[i] = input[middle + i + 1];
        }
        left[lengthLeft] = Integer.MAX_VALUE;
        right[lengthRight] = Integer.MAX_VALUE;

        int leftPointer = 0;
        int rightPointer = 0;
        for (int i = from; i <= to; i++) {
            if (left[leftPointer] > right[rightPointer]) {
                input[i] = right[rightPointer];
                rightPointer++;
            } else {
                input[i] = left[leftPointer];
                leftPointer++;
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
        int[] input = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};
        mergeSortExecutor(input);
        printArray(input);
    }

}
