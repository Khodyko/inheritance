package com.company.web;

public class Task24Child extends Task24Super implements Task18, Task24{
    @Override
    public void task19() {

    }
    //Task25 already there
    @Override
    public void task22() {
        Task18.super.task22();
    }
    {String a="abc";
        if(a instanceof String){
            System.out.println("I used instance of");}
    }
}
