package com.company;

import java.util.ArrayList;

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





    }
}
