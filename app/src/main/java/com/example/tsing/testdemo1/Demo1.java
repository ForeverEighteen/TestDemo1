package com.example.tsing.testdemo1;

/**
 * Created by Tsing on 10/19/2017.
 */

public class Demo1 {
    static {
        System.loadLibrary("testdemo1");
    }
    public static native String sayHello();
}
