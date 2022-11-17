package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i,c=0;
		
		for(i=1;i<=n;i++) {
			
			if(n%i==0)
				c++;
			}
	
	if(c==2) {
		System.out.println("n is a prime number");
	}
	else
	{
		System.out.println("n is not a prime number");
	}
	}

}
