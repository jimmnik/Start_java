package com.startJava.Dog.WolfTest;

public class WolfTest{

	public static void main(String[] args) {
		Wolf first = new Wolf();
		first.go(7);
		first.set_doun();
		first.sprint(70);
		System.out.println("Вес в начале " + first.getWeigt());
		first.setWeigt(40);
		System.out.println("Вес в конце " + first.getWeigt());
		System.out.println("Имя пса " + first.getName());

		Wolf second = new Wolf();
		System.out.println("Вес в начале " + second.getWeigt());
		second.setWeigt(10);
		System.out.println("Вес в конце " + second.getWeigt());

		System.out.println("Вес первого пса " + first.getWeigt());
		System.out.println("Вес второго пса " + second.getWeigt());
	}
}