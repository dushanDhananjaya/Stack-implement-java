package stack;

public class Main {

	public static void main(String[] args) {
		
		StackX myStack1 = new StackX(5);
		
		myStack1.push(1); 
		myStack1.push(2); 
		myStack1.push(3); 
		
		System.out.println("peek : " + myStack1.peek());
		
		myStack1.printStack();
		
		while(!myStack1.isEmpty()) {
			System.out.println("pop value : " + myStack1.pop());
		}
		
		myStack1.printStack();
	}

}
