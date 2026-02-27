package com.bhavish;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling using the Desktop");
    }
}
