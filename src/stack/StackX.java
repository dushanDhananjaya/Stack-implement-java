package stack;

public class StackX {
	private int maxSize;
	private int top;
	private double[] stackArray;
	
	public StackX(int s) {
		this.maxSize = s;
		this.top = -1;
		this.stackArray = new double[this.maxSize];
	}
	
	public void push(double j) {
		if(top == maxSize - 1) { // check stackArray is full
			System.out.println("stack is full");
		} else {
			top++;
			stackArray[top] = j; // stackArray[++top] = j
		}
	}
	
	public double pop() {
		if(top == -1) { // check stackArray is empty
			return -99;
		} else {
			double x = stackArray[top]; // double x = stackArray[top--]
			top--;
			
			return x;
		}
	}
	
	public double peek() {
		if(top == -1) { // check stackArray is empty
			return -99;
		} else {
			double y = stackArray[top];
			
			return y;
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize - 1));
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		} else {
			
			while(top != -1) {
				System.out.println(stackArray[top--]);
			}
		}
	}
	
	
}
