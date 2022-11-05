import java.util.Scanner;

public class HalfPyramid {
//printing half pyramid
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of stairs you want");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		//moving on to the cols
		for(int i = 0; i <=n; i ++) {
			//moving on to the rows 
			for(int j = 0; j <=i; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
