package com.company;

public class Car implements AutoCloseable{
    private String name;

    Car(String name){
        this.name = name;
    }
    Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drive() {
        System.out.println(getName() + " журуп жатат.");
    }

    @Override
    public void close() throws ArithmeticException {
        System.out.println(getName()+" жабылып жатат.");
    }
}
