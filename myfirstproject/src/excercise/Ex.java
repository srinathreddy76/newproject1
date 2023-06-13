package excercise;
import java.util.*;
public class Ex {
	public static void main(String []  args) {
		List<String> s=new ArrayList<String>();
		s.add("john");
		s.add("alex");
		s.add("roy");
		s.add("smith");
		System.out.println("list1"+s);
		List<String> l=new ArrayList<String>();
		l.add("hi");
		l.add("hello");
		l.add("hey");
		l.add("ko");
		System.out.println("list2"+l);
	    Collections.copy(s,l);
	    System.out.println("copy s to l,\nAfter copy");
		System.err.println("list1:"+s);
		System.out.println("list2:"+l);
		
	}

}
