package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4};
        System.out.println(Arrays.toString(array));
        CountingSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void CountingSort(int[] array) {

        int offset = -(Arrays.stream(array).min().getAsInt());
        int[] newArray = new int[Arrays.stream(array).max().getAsInt() + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[array[i]]++;
        }

        int index = 0;
        for(int i = 0; i< newArray.length; i++){
            for(int j = 0; j < newArray[i]; j++){
                array[index] = i;
                index++;
            }
        }
    }

}