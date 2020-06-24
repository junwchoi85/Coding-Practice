package com.hackerrank;

public class BubbleSort {
    public int[] sort(int[] list) {
        int n = list.length;
        boolean swapped;
        do {
            swapped = false;
            for(int i=1; i<n; i++) {
                if(list[i-1]>list[i]) {
                    //swap
                    int temp = list[i];
                    list[i] = list[i-1];
                    list[i-1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);

        return list;
    }

    /*
    The bubble sort algorithm can be optimized by observing that the n-th pass finds the n-th largest element
    and puts it into its final place. So, the inner loop can avoid looking at the last n − 1 items when running
    for the n-th time??????????
    https://en.wikipedia.org/wiki/Bubble_sort
     */
    public int[] optimizedSort(int[] list) {
        int n = list.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list[i - 1] > list[i]) {
                    //swap
                    int temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    swapped = true;
                }
                --n;
            }
        } while (swapped);

        return list;
    }
}
