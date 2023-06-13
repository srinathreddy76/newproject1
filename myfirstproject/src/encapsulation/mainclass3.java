package encapsulation;

public class mainclass3 {
	public static void main(String[] args) {
	print p=new print();
	p.setName("ajay");
	p.setAge(28);
	System.out.println("name: "+p.getName());
	System.out.println("age: "+p.getAge());

}
}