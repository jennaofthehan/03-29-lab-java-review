package edu.info498.review;

//Inheritance tutorial

public class Husky extends Dog implements Huggable {
    
    public Husky(String name){
        super(name, "Husky");
    }

    public void pullSled(){
        System.out.println(this + " pulls the sled!");
    }

    public void bark(){
        System.out.println(this + " says: Woof!");
    }

    public void hug(){
        System.out.println(this + " gives you a warm hug :3");
    }
}