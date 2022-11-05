import java.util.Scanner;

public class TowerOfHanoi2 {
	public static void hanoi(int n , String src, String helper, String des) {
		if (n==0) {
			return;
		}
		hanoi(n-1,src,helper,des);
		System.out.println("transfer disk "+ n+"from the "+ src+ "to the " + des );
		hanoi(n-1, helper,src,des);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of blocks ");
		int n =sc.nextInt();
		hanoi(n-1, "helper","src","destination");


	}

}
