import java.util.Scanner;

public class printNumbers {
//using recursion
	public static void printNumb(int n ) {
		if(n==10) {
			return ;
		}
		System.out.println(n);
		printNumb(n+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter n ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		printNumb(n);
	}

}
