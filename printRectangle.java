import java.util.Scanner;

public class printRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter rows");
		Scanner sc= new  Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter cols");
		int c = sc.nextInt();
		for (int i = 0 ; i <=n;i ++) {
			for(int j =0; j <=c; j ++) {
				System.out.print          ("*");
			}
			System.out.println();
		}
		

	}

}
