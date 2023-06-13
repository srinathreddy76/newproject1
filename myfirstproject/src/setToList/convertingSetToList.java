package setToList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class convertingSetToList {
	public static void main(String[] args) {
	Set<String> names = new HashSet<>();
	names.add("rohit");
	names.add("gill");
	names.add("pujara");
	names.add("Kohli");
	System.out.println("Set" + names);
	List<String> BattingOrder=new ArrayList<>(names);
	System.out.println("list"+BattingOrder);
	}
}

