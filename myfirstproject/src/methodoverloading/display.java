package methodoverloading;

public class display {
	public void show(int a,double b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void show(String a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void show(boolean a,double b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		display d1=new display();
		d1.show("hello", 90);
		d1.show(10,8.9);
		d1.show(true, 78.6);
	}

}
