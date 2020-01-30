//test code for collection objects

import java.util.*;

public class arraysandlists {
	public static void main(String[] args) {
		
		ArrayList<String> A = new ArrayList<String>();
		A.add("One");
		A.add("two");
		A.add("three");
		A.add("Four");
		//System.out.println(A.get(1));
		A.add(3,"Hurry");
		//initialize and iterator
		//Iterator<String> I = A.iterator();
		
		//while(I.hasNext()) {
		//	System.out.println(I.next());
		//}
		
		//for(String x : A) {
		//	System.out.println(x);
		//}
		
		//ArrayList<String> B = (ArrayList<String>) A.clone();
		
		//List<String> nL = Arrays.asList("A","B","C","D","E","F");
		//A.clear();
		//LIST COMPARISON
		//System.out.println(A.containsAll(nL));
		
		//LinkedList<String> LL = new LinkedList<String>();
		//LL.add("Red"); LL.add("Green"); LL.add("Blue"); LL.add("Prurple");
		//LL.addFirst("Dinosaur"); LL.addLast("Cookie");
		//System.out.println(LL);
		//LL.remove(3);
		//System.out.println(LL);
		//A.remove(3);
		//System.out.println("A contains Four = " + A.contains("Four"));
		
		
		
		//ArrayList<Integer> forward = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5);
		//ArrayList<Integer> backward = (ArrayList<Integer>) Arrays.asList(5, 4, 3, 2, 1);
		
		//ArrayList<E> stuff = new ArrayList<E>();
		
		//Jan 29 class
		
		
		Vector<Object> V = new Vector<>();
		
		V.add(1);
		V.add(2);
		V.add(3);
		V.add("red");
		V.add("Blue");
		V.add(false);
		
		//System.out.println(Collections.frequency(V, "Blue"));
		
		//STACK
		Stack stack = new Stack();
		
		stack.push("m");
		stack.push("o");
		stack.push("o");
		stack.push("m");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		
		System.out.println(palidrome(stack));
		
		
		
		
		}
	
	public static boolean palidrome(Stack<String> stack) {
		
		boolean isPal = true;
		int lastPos = stack.size();
		
		for(int i = 0; i < stack.size(); i++) {
			if(stack.get(i) != stack.get(lastPos - 1)) {
				isPal = false;
			}
			lastPos -= 1;
			
		}
		
		return isPal;
		
	}
	
	}
	
	
