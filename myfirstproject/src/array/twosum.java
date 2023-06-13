package array;

public class twosum {
	public static void findpair(int n[], int target) {
		for(int i=0;i<n.length-1;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]+n[j]==target) {
					System.out.printf("pair found (%d,%d)",n[i],n[j]);
				}
			}
		}
		System.out.println("pair not found");			
		}	
	public static void main(String[] args) {
		int [] n= {8,7,2,3,5,1};
		int target=8;
		findpair(n,target);
	}
}
