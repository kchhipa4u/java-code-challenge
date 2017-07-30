package com.oop.inheritance;

class Parent {

	int x = 1;

	Parent() {
		System.out.println(this);
	}

	int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", getX()=" + getX() + "]";
	}

}

class Child extends Parent {
	int x = 2;

	Child() {
		System.out.println(this);
	}

	int getX() {
		return x;
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		Parent a = new Child();
	}
}
