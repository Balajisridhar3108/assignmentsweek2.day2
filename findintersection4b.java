package week1.day4;

public class findintersection4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {3,2,11,4,6,7};
		int[] y= {1,2,8,4,9,7};
	
		for(int i=0;i<=x.length-1;i++) {
		
		
		for(int j=0;j<=y.length-1;j++) {
			if(x[i]==y[j]) {
				System.out.println(x[i]);
					
			}
		}
		
		}
	}

}
