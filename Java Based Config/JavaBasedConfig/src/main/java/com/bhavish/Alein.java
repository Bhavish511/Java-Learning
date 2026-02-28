package com.bhavish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Alein {
    @Value("21")
    private int age;
//    @Qualifier("laptop")
//@Autowired() // Field Injection

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

    @Autowired() // Field Injection
//    @Qualifier("laptop")
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
