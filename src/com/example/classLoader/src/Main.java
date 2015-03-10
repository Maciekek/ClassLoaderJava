package com.example.classLoader.src;

import com.example.classLoader.classLoader.StandardClassLoader;

/**
 * Created by Maciek on 2015-03-10.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException, InterruptedException {
        System.out.println("Welcome in my first class loader");

        MessageService s0, s1, s2;

        for (int i = 0; i < 10; i++) {
            if (i > 2) {
                MessageService m1 =  StandardClassLoader.newInstance();
                System.out.println(m1.getMessage());
            } else {
                s0 = new MessageImpl();
                System.out.println(s0.getMessage());


            }
            Thread.sleep(2000);
        }
    }
}
