package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nataliia on 05.08.2015.
 */
public class Quiz6 {
       public static boolean isListsEqual (ArrayList<String> s, ArrayList<String> f) {
        if (s.size() != f.size()) {
            return false;
        }
            if (s.equals(f)) {
                return true;
            }
        return false;
        }
    public static void print  (String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        //public static boolean isEqual (String []a, ArrayList<String> s){
        //String []a = new ArrayList <>;


   }



    public static void main (String[] args){
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("b");
        System.out.println(s);

        ArrayList<String> f = new ArrayList<>();
        f.add("a"); f.add("b");
        f.add("c");
        f.add("d");
        f.add("d");
        System.out.println(f);
        System.out.println(isListsEqual(s, f));

        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        System.out.println(isListsEqual(s1, s2));

        String[] a = {"a", "b", "c", "d", "b"};
        print(a);

        //System.out.println(isEqual(a, s));




    }
}
