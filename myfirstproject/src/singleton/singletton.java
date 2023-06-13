package singleton;

public class singletton {
     static singletton st=new singletton();
     private singletton() {
    	 System.out.println("hello");
     }
     public static singletton getinstance() {
    	 
    	 return st;
     }	 
     }