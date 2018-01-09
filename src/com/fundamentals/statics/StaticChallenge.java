package com.fundamentals.statics;

class Father {
	static int age = 40;

	public static int getAge() {
		return age;
	}
}

class Son extends Father {
	static int age = 5;

	public static int getAge() {
		return age;
	}
}

public class StaticChallenge {
	
	public static void main(String[] args) {
		
		Father f = new Son();

		System.out.println(f.age + f.getAge());
	}

}