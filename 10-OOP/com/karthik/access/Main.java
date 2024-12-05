package com.karthik.access;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        A obj = new A(1,new int[] {1,2,2,4,5,6},"Hello");

        System.out.println(Arrays.toString(obj.arr));


    }
}
