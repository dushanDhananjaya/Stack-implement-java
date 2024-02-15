package stack;

public class Main {

	public static void main(String[] args) {
		
		StackX myStack1 = new StackX(3);
		
		myStack1.push(1); 
		myStack1.push(2); 
		myStack1.push(3); 
		
		System.out.println(myStack1.peek());
		
		
	}

}
