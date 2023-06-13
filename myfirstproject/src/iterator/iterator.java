package iterator;
import java.util.Iterator;
import java.util.ArrayList;
public class iterator {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(78 );
		marks.add(39);
		marks.add(40);
		marks.add(52);
		Iterator<Integer> it=marks.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
