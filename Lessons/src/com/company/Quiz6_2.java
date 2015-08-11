package com.company;

import java.util.ArrayList;

/**
 * Created by Nataliia on 10.08.2015.
 */
public class Quiz6_2 {
    public static void sayHello() {
        System.out.println("Hello class");
    }

    public static String hello() {
        return "Hello Engineers!";
    }

    public static String hello(String a) {
        return "Hello" + " " + a;
    }

    public static void test(String a, String hello) {
        if (a.equals(hello)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Expected: " + hello + "\n" + "Actual: " + a);
        }
    }

    public static String hello (int i){
        return hello(i);
    }




    public static void main(String[] args) {
        sayHello();
        // Hello Class!
        System.out.println(hello());
        // Hello Engineers!
        System.out.println(hello("Friends"));
        // Hello Friends
        System.out.println(hello("Friends").equals(hello("Friends")));
        // true
        System.out.println(hello("Friends") == hello("Friends"));
        // false
        test("Hello Engineers!", hello());
        // Test PASSED
        test("Hello Enginers!", hello());
        // Test FAILED
        // Expected: Hello Engineers!
        // Actual:   Hello Enginers!
        test("Hello Friends", hello("Friends"));
        // Test PASSED
        test("Hello Good Men", hello("Good Men"));
        // Test PASSED
        //test("Hello to all 14 students!", hello(14));  //перегрузка методов
        // Test PASSED
        //test("Hello student!", hello(1));
        // Test PASSED



    }
}


