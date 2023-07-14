package org.example.modules;

public class Kata {
    public static int[] flip(char dir, int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int v = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = v;
                }
            }
        }

        if (dir == 'L') {
            int[] newArr = new int[arr.length];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[arr.length - i - 1];
            }

            arr = newArr;
        }

        return arr;
    }
}
