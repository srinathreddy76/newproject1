package Exceptions;

public class ExceptionT {
	public static void main(String[] args) {
		int a=90;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception s) {
			System.out.println("not possible");
		}
		finally{
			System.out.println("");
		}
		}
	}
