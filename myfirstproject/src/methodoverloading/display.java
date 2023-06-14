package methodoverloading;

public class display {
	public void show(int c,double b) {
		System.out.println(c);
		System.out.println(b);
	}
	public void show(String c,int b) {
		System.out.println(c);
		System.out.println(b);
	}
	public void show(boolean c,double b) {
		System.out.println(c);
		System.out.println(b);
	}
	public static void main(String[] args) {
		display d1=new display();
		d1.show("hii", 900);
		d1.show(10,8.9);
		d1.show(true, 78.6);
	}

}
