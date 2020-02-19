
public class UseStack {
	
	//implement this method.
	public static Stack sort(Stack s) throws Exception {
		long startTime = System.nanoTime();
		if(s.isEmpty()) return s;
		ArrayListStack a = new ArrayListStack();
		int pivot;
		
		while(!s.isEmpty()) {
			pivot = s.top();
			s.pop();
			a.push(pivot);
			
			if(s.isEmpty()) break;
			
			if(s.top() > pivot) {
				pivot = s.top();
				s.pop();
				while(pivot > a.top()) {
					s.push(a.top());
					a.pop();
					if(a.isEmpty()) break;
				}
				
				if(a.isEmpty()) {
					a.push(pivot);
				}
				else if(pivot <= a.top()) {
					a.push(pivot);
				}
			}
			
		}
		long endTime   = System.nanoTime();
		long totalTime = (endTime - startTime)/1000;
		System.out.println(totalTime);
		return a;
	}
}
