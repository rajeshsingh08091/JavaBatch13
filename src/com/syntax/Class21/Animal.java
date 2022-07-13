package com.syntax.Class21;

public class Animal {
    String name;
    String color;
    String breed;
    int age;

    public Animal(String name,String color, String breed, int age){
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
    }
    void printInfo(){
        System.out.println("Name "+name+" color"+color+" Breed"+breed+" Age"+age);
    }
}






