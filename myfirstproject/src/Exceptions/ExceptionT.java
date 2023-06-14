package Exceptions;

public class ExceptionT {
	public static void main(String[] args) {
		int d=909;
		int b=0;
		try {
		int c=d/b;
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
