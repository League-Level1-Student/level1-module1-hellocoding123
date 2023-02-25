package _07_duck;

import java.util.Random;

public class Dog {
	
	String name;
	String favoriteTreat;
	int age; 
	
	Dog(String name, String favoriteTreat, int age) {
		this.name = name;
		this.age = age;
		this.favoriteTreat = favoriteTreat;
		System.out.println("You created a new Dog. Your Dog's name is " + name + ", your Dog is " + age + " years old and its favorite treat is " + favoriteTreat + ".");
	}
	
	void bark(int barks) {
		
		System.out.println("Your dog barks " + barks + " times!");
	}
	
	void walk(int feet) {
		
		Random r = new Random();
		int feetWalked = 0;
		
		for(int i = 0; i < feet; i++, feetWalked++) {
			
			if(r.nextInt(6) == 1) {
				
				if(r.nextInt(2) == 1) {
					
					System.out.println("You dog stopped to pee after " + feetWalked + " feet!" );
				}
				else {
					
					System.out.println("You dog stopped to poop after " + feetWalked + " feet!");					
				}
				
				feetWalked = 0;
			}
			
		}
		
		System.out.println("Your dog has finished its " + feet + " feet walk!");
		
	}
}
