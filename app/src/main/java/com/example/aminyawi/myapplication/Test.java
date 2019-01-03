package com.example.aminyawi.myapplication;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public  static void main(String[]args)
    {
        int temp=0;
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arrSorted=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(8);
        arr.add(4);
        arr.add(0);
       // Collections.sort(arr);
        Collections.sort(arr,Collections.reverseOrder());

        System.out.println(arr);
    }
}
