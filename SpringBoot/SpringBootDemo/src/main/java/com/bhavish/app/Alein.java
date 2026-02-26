package com.bhavish.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alein {
    @Autowired
    Laptop laptop;
    public void code(){
        laptop.compile();
        System.out.println("Coding");
    }
}
