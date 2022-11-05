import java.util.Scanner;

public class seriesSummation {
//adding the numbers upto a specific number n  from a specific number s and then returning the value
	//using recursion
	public static void sumN(int a, int n , int sum) {
		if(n==a) {
			//adding up till a
			sum+=a;
			System.out.println(sum);
			return;
		}
		sum=+a;
		 sumN( a+1, n ,  sum);
		 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("print value od a ");
		int a = sc.nextInt();
		System.out.println("print value od n ");
		int n = sc.nextInt();

		sumN(a,n,0);

	}

}
