package methodoverloading;

public class display {
	public void show(int b,double c);
		System.out.println(b);
                System.out.println(c);
	}
	public void show(String b,int c) {
		System.out.println(b);
		System.out.println(c);
	}
	public void show(boolean b,double c) {
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		display d1=new display();
		d1.show("hello", 90);
		d1.show(10,8.9);
		d1.show(true, 78.6);
	}

}
