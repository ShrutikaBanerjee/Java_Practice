import java.util.Scanner;

public class towerOfHanoi {	
	//tower of hanoi    n= no of rings  , src= source, helper , destination
		public static void towerOfHanoi(int n,int src, int helper,int des)
		{if (n==1)
		{
			System.out.println("transfer disk"+n+"from the postion"+src+" to the postion"+des);
			return;
		}
		
			towerOfHanoi( n-1,helper , src, des);
			System.out.println("transfer disk "+n+"from the postion "+src+" to the postion "+des);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("**1 is the top most");
			System.out.println("**1 is the source...2 is helper ..3 is the destination");

			System.out.println("enter no of disks in hanoi");
			Scanner sc= new Scanner(System.in);
			int n = sc.nextInt();
	        towerOfHanoi(n,1 ,2 ,3);
		}

	}


