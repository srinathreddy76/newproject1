package Exceptions;
public class arrayException {
	public static void main(String[] args) {
		int [] arr= {1,98,33,56,67};
		try {
		System.out.println(arr[8]);
	}
		catch(Exception s) {
			System.out.println("enter a valid index");
		}
	}
}
