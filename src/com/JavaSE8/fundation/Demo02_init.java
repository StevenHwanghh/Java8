package com.JavaSE8.fundation;

public class Demo02_init {
	int x=1;
	int y;
	boolean z;
	
	public Demo02_init() {
		System.out.println("Default Construtor");
	}
	
	// instance Initialization will be invoked before constructor
	// That is, the following code will run first
	{
		System.out.println("instance Initialization");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	// before invoke constructor, the object has already created
		System.out.println(this);
	}
	
	static {
		System.out.println("static Initinalization");
	}
	public static void main(String[] args) {
		System.out.println("main method!");
		Demo02_init test = new Demo02_init();
		System.out.println(test.x);
	}

}
