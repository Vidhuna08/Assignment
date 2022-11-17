package week1.day2;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [] {1,2,3,4,5,6,7,8};
		int missN;
		int n=8;
		int sumN=n*(n+1)/2;
		int sum=0;
				
				for(int i=0;i<arr.length;i++) {
					
					sum=sum+arr[i];
		
		
			}
		missN=sumN-sum;
		System.out.println(missN);

	}

}
