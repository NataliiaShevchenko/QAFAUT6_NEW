package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nataliia on 04.08.2015.
 */
public class Lesson1 {
    public static void main(String[] args){
                     //������
        ArrayList<Integer> a= new ArrayList<Integer>();
        System.out.println(a.size());
        a.add(10);  //0 �������� ������
        System.out.println(a.size());
        a.add(1); //1 �������� ������
        a.add(5); // 2 �������� ������
        System.out.println(a.get(1));  //get - ������� �������� �� ������
        System.out.println(a.get(2));
        a.remove(0);               // remove - ������� �������� �� ������
        System.out.println(a.size());

        Integer []a1 = {1,2,10,20}; // ������� �������� �� ������� � ������
        a.addAll(Arrays.asList(a1));
        System.out.println(a);



    }
}


