import java.util.ArrayList;

public class ArrayListStack implements Stack {
	private ArrayList<Integer> a;
	private int top;
	private static final int MAX_SIZE = 1000;

	// implement a default constructor and all methods from interface Stack.
	// Additional methods maybe required in order to run tests.
	public ArrayListStack() {
		a = new ArrayList<Integer>(MAX_SIZE);
		this.top = -1;
	}

	public ArrayList<Integer> getA() {
		return a;
	}

	@Override
	public boolean isEmpty() {
		return (this.top < 0);
	}

	@Override
	public boolean isFull() {
		if(this.top >= MAX_SIZE - 1) return true;
		return false;
	}

	@Override
	public void makeEmpty() {
		this.top = -1;
		return;
	}

	@Override
	public int top() throws Exception {
		return this.a.get(this.top);
	}

	@Override
	public void pop() throws Exception {
		if(!this.isEmpty()) {
			this.top--;
			return;
		}
		return;
	}

	@Override
	public void push(int data) throws Exception {
		if(this.isFull()) return;
		this.top++;
		this.a.add(this.top,data);
		return;
	}

}
