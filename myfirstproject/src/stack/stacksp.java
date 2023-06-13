package stack;
import java.util.Stack;
public class stacksp {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	s.add(10);
	s.add(89);
	s.add(67);
	s.add(76);
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.push(10));
	System.out.println(s);
}
}