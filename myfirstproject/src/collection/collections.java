package collection;
import java.util.*;
public class collections {
public static void main(String [] args) {
	Set<Integer> s=new HashSet<Integer>();
	s.add(90);
	s.add(89);
	System.out.println("set"+s);
	List<Integer> a=new ArrayList<Integer>(s);
	System.out.println("list"+a);
}
}
