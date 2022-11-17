package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n=5;
		int Num1 = 0 ;
		int Num2 = 1;
		int sum = 0;
		
		System.out.println(Num1);
		System.out.println(Num2);
		for(int i=0; i<=5; i++) {
			
			sum=Num1+Num2;
			Num1=Num2;
			Num2=sum;
		}

	}

}
