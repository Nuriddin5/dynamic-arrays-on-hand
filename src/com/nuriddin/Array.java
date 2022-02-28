package com.nuriddin;


// t.me/superJavaDeveloper 15.02.2022;


public class Array {
    private int count;
    private int[] arr;

    public Array(int count) {
        this.arr = new int[count];
    }

    public int[] getArr() {
        return arr;
    }


    public int getCount() {
        return count;
    }


    public void print() {
        System.out.println("items : ");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("length : " + arr.length);
    }


    public void insert(int item) {
        if (arr.length > count) {
            arr[count++] = item;
        } else {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            newArr[count++] = item;
            arr = newArr;
        }
    }


    public int indexOf(int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        //validate index
        //if last element remove last
        //else shift elements beginning index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("ee insofsiz yaxshilab ishlat");
        }
        if (count - 1 == arr.length / 2) {
            int[] newArr = new int[arr.length / 2];
            //[1,2,3,4,0,0] index -> 1
            // [1,3,4]
            for (int i = index; i < count; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        } else {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[count - 1] = 0;
            count--;
        }
    }

    public int max() throws Exception {
        Integer max = arr.length != 0 ? arr[0] : null;
        if (max == null) {
            throw new Exception();
        }
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
