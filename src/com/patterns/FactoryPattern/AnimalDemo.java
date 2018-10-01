package com.patterns.FactoryPattern;

public class AnimalDemo {

	public static void main(String[] args) {
		AnimalFactory animalFactory=new AnimalFactory();
		Animal animal1=animalFactory.getAnimal("Dog");
		animal1.makeSound();
		
		Animal animal2=animalFactory.getAnimal("Cat");
		animal2.makeSound();
		
		Animal animal3=animalFactory.getAnimal("Elephant");
		animal3.makeSound();

	}

}
