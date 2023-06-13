package enumerator;
enum games{
	cricket,football,volleyball,batminton;
}
public class basic4 {
	public static void main(String[] args) {
		System.out.println("The famous games in india are: ");
		for(games g : games.values()) {
			System.out.println(g);
		}
		}
}