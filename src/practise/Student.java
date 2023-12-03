package practise;

import java.util.ArrayList;

class Student<T,U>{
	T name;
	U id;
	
	public Student() {
		super();
		this.name = null;
		this.id = null;
	}
	
	public Student(T name, U id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("id   : " + this.id);
	}
	
	public void displayList(ArrayList<Student<T, U>> student) {
		int i = 0;
		
		for(Student<T, U> stu: student) {
			
			System.out.println("stu no : " + ++i);
			System.out.println("name   : " + stu.name);
			System.out.println("id     : " + stu.id + "\n");
		}
	}
}
