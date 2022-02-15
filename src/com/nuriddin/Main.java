package com.nuriddin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array array = new Array(3);
        System.out.println(Arrays.toString(array.arr));
        System.out.println(array.arr.length);
        System.out.println(array.indexOfLastElement());
        array.insert(25);
        array.insert(25);
        array.insert(25);
        array.insert(25);
        array.insert(25);
        array.insert(25);
        array.insert(25);
        array.insert(25);
        array.insert(25);
        array.insert(22);
        array.insert(25);
        System.out.println(array.indexOfLastElement());
        System.out.println(Arrays.toString(array.arr));
        System.out.println(array.indexOf(22));
        System.out.println(array.indexOf(0));

    }
}
