package com.company.web;

public class Main {

    public static void main(String[] args) {

        //Task5
        Task5Child task5Child=new Task5Child();
        task5Child.method();
        //Task 6
        Task6Child task6Child =new Task6Child();
        task6Child.method();

//        task1.task6();
//        SuperClass task10 = (SuperClass) new Task1();
//        if (task10 instanceof SuperClass) {
//            Task1 task11 = (Task1) task10;
//        }
        //Task 20
        Task20 task20=new Task20();
        task20.task20Kovariant();
        //Task 21
        Task13 task21 = new Task20();
        task21.task20Kovariant();
//        //Task 22
//        com.company.web.Task18 task22 = new Task18();
//        task22.task22();
//        //Task 23
//        com.company.web.Task18.task23();
        //Task 24
        Task24Child task24=new Task24Child();
        System.out.println(task24 instanceof Task24);
        System.out.println(task24 instanceof Task24Super);
        System.out.println(task24 instanceof Task18);
        //Task 25
        task24.task22(); //in default method interface task18
        //Task 26
        Task26Child task26Child=new Task26Child();

    }
}
