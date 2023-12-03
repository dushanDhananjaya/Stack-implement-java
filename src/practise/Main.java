package practise;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student<String, Integer>> student = new ArrayList<>(); 
		Student<String, Integer> stu = new  Student<>();
		
		student.add(new Student<>("a", 1));
		student.add(new Student<>("b", 2));
		student.add(new Student<>("c", 3));
		student.add(new Student<>("d", 4));
		
		stu.displayList(student);
		
		
	}
}


