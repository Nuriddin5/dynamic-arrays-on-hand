package com.nuriddin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Array array = new Array(1);

//        System.out.println(Arrays.toString(array.arr));
//        System.out.println(array.arr.length);
//        System.out.println(array.indexOfLastElement());
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.insert(1);
        System.out.println(Arrays.toString(array.getArr()));

        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));
        array.removeAt(1);
        System.out.println(Arrays.toString(array.getArr()));

//        error occurring
//        array.removeAt(1);
//        System.out.println(Arrays.toString(array.getArr()));

        array.insert(3);
        array.insert(30);
        array.insert(222);
        try {
            System.out.println(array.max());
        } catch (Exception e) {
            e.printStackTrace();
        }
        int[] arr = {30,1};
        array.intersect(arr).print();

//        System.out.println(array.indexOf(22));
//        System.out.println(array.indexOf(0));
//        java.lang.reflect.Array array1 = new Array
        array.reverse();
        System.out.println(Arrays.toString(array.getArr()));

    }
}
