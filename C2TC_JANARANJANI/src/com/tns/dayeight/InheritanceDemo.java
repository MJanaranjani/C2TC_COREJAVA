package com.tns.dayeight;
public class InheritanceDemo extends Inheritance {
	int bonus=10000;
	float total=salary+bonus;
	public static void main(String[] args) {
		InheritanceDemo in=new InheritanceDemo();
		System.out.println("Programmer salary is:"+in.salary);  
		System.out.println("Bonus of Programmer is:"+in.bonus);
		System.out.println("Total salary including bonus:"+in.total);
	}

}
