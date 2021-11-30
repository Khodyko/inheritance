package com.company.web;

public interface Task18 {
    public static String  a="abc";
    public void task19();
    public default void task22(){
        System.out.println("default method");
    }
    public static void task23(){
        System.out.println("static method");
    }
}
