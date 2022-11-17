package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=23432,r,temp=n;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Palindrome number");
		}
		else
			System.out.println("Not palindrome number");

	}

}
