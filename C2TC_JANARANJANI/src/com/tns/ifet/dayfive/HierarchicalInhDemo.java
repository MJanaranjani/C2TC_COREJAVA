package com.tns.ifet.dayfive;
public class HierarchicalInhDemo extends Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person1 p;
		p = new Person1("Dhruv", "Mumbai");
		if (p instanceof Person1)
			System.out.println("Person Details "+p);
		
		p = new Employe("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employe)
		System.out.println("Employee Details "+p);
		

		p = new Student("Pankaj", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}
