package threadsaafeSingleton;

public class thread {
	     static thread st=null;
	     private thread() {
	    	 System.out.println("Hello ");
	     }
	     public static synchronized thread getinstance() {
	    	 if(st==null) {
	    		 st=new thread();
	    		 
	    	 }
	    	 
	    	 return st;
	     }	 
	     }

