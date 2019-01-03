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
      //  Collections.sort(arr,Collections.reverseOrder());
        for(int i=0;i<=arr.size();i++)
        {
            if(arr.get(i)>=arr.get(i+1))
            {
                temp=arr.get(i);
            }
        }

        System.out.println(arr);
    }
}
