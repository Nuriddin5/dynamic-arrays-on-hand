package com.nuriddin;


// t.me/superJavaDeveloper 15.02.2022;


import java.util.Arrays;

public class Array {
    int length;
    int[] arr;

    public Array(int length) {
        this.length = length;
        this.arr = new int[length];
    }


    public void insert(int number) {
        if ((indexOfLastElement() == arr.length - 1)) {
            int[] newArr = new int[++length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[length-1] = number;
            arr = newArr;
        } else {
            arr[indexOfLastElement() + 1] = number;
        }
    }

    public int indexOfLastElement() {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAt(int index) {
        return true;
    }

}
