import java.util.Scanner;
//with recursion
//printing the sum of akk natural numbers

public class sumOfNNaturalNumbers {
	public static void sum(int n, int sum) {
		if(n==0) {
			System.out.println(sum);
			
			return;
		}
		//addind all the reverse values up till n 
		sum+=n;
		//calling the function so as to get values 
		sum(n-1, sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter va;lue of n ");
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
sum(n, 0);


	
	
	}
}
