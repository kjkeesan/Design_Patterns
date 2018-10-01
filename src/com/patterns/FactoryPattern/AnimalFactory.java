package com.patterns.FactoryPattern;

public class AnimalFactory {
	public Animal getAnimal(String name) {
		if (name == null) {
			return null;
		}
		if (name.equalsIgnoreCase("Dog")) {
			return new Dog();

		}
		if (name.equalsIgnoreCase("Cat")) {
			return new Cat();

		}
		return null;
	}
}
