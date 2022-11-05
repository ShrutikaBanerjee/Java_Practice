import java.util.Scanner;

public class HalfNoPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter");
int s= sc.nextInt();
for(int i = 0; i <=s; i ++) {
	for(int j = 1;j<=i ; j ++) {
		System.out.print(j +" ");
	}
	System.out.println();
}

	}

}
