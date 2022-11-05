import java.util.Scanner;

public class InvertedHalfPyramid {
//printing inverted half pyramid
	//via taking  value of number of stairs
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc. nextInt();
		for(int i =n ; i >0; i--) {
			for(int j = 1 ; j <=i; j ++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}

}
