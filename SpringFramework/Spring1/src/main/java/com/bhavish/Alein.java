package com.bhavish;

import org.springframework.stereotype.Component;

public class Alein {

    private int age;
    private Computer com;
    public Alein(){
        System.out.println("Object Created");
    }

    public Alein(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
