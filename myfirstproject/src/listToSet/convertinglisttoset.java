package listToSet;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class convertinglisttoset {
	public static void main(String[] args) {
	List<Integer> values = new ArrayList<>();
	values.add(10);
	values.add(20);
	values.add(90);
	values.add(76);
	values.add(20);
	System.out.println("list" + values);
	Set<Integer> numbers=new HashSet<>(values);
	System.out.println("set"+numbers);
	}
}
