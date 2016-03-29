package edu.info498.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();

        Dog[] pups = Dog.createPuppies(3);
        System.out.println(Arrays.toString(pups)); 

        Husky dubs = new Husky("dubs");
        dubs.bark();
        dubs.pullSled();
        dubs.hug();

        TeddyBear baby = new TeddyBear();
        baby.hug();
	}
}