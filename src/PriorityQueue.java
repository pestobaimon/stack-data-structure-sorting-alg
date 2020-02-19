
public class PriorityQueue {
	MyQueue q;

	public PriorityQueue(MyQueue q) {
		super();
		this.q = q;
	}

	// implement this.
	public void push(int x) throws Exception {
		if(q.isFull()) return;
		this.q.insertLast(x);
		int[] arrtemp = new int[this.q.size()];
		for(int i =0; i< arrtemp.length; i++) {
			arrtemp[i] = this.q.front();
			this.q.removeFirst();
		}
		int n = arrtemp.length; 
		for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arrtemp[j] > arrtemp[j+1]) 
                {
                    int temp = arrtemp[j]; 
                    arrtemp[j] = arrtemp[j+1]; 
                    arrtemp[j+1] = temp; 
                } 
		
		for(int i =0; i< arrtemp.length; i++) {
			this.q.insertLast(arrtemp[i]);
		}
	}

	// implement this.
	public void pop() throws Exception {
		this.q.removeFirst();
	}

	// implement this
	public int top() throws Exception {
		return this.q.front();
	}

}
