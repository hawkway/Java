//Demonstrate various Vector operations.
// From http://www.java-samples.com
import java.util.*; 
public class VectorDemo {
	public static void main(String args[]) {
		// initial size is 3, increment is 2
		Vector v = new Vector(3, 2);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after four additions: " +
		v.capacity());
		v.addElement(new Double(5.45));
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("First element: " + (Integer)v.firstElement());
		System.out.println("Last element: " + (Integer)v.lastElement());
		if(v.contains(new Integer(3)))
			System.out.println("Vector contains 3.");
		// use an iterator to display contents
		Iterator vItr = v.iterator();
		System.out.println("\nElements in vector:");
		while(vItr.hasNext())
			System.out.print(vItr.next() + " ");
		System.out.println();
	}
}
/*
Initial size: 0
Initial capacity: 3
Capacity after four additions: 5
Current capacity: 5
Current capacity: 7
Current capacity: 9
First element: 1
Last element: 12
Vector contains 3.
Elements in vector:
1 2 3 4 5.45 6.08 7 9.4 10 11 12
*/