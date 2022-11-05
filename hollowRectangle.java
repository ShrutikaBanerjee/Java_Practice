import java.util.Scanner;

public class hollowRectangle {
//PRINTING AN HOLLOW RECTANGLE WITH N ROWS AND M COLUMNS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows");
		int n= sc.nextInt();
		System.out.println("enter cols");
		int m= sc.nextInt();
		for(int i = 1; i <=n;i ++) {
			for(int j =1; j <=m; j ++) {
				if( i==1 || j ==1 || i == n || j == m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
