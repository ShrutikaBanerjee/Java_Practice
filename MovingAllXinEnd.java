import java.util.Scanner;

public class MovingAllXinEnd {
//moving all the x on the end 
	public static void moveit(String str, int indx, int count, String newstr ) {
		//specify the condition
		if(indx==str.length()) {
			for (int i =0 ; i <=count ; i ++) {

			newstr+='x';
			System.out.println(newstr);
		}
		}
		char currChar= str.charAt(indx);
		if(currChar== 'x') {
			count++;
			moveit(str, indx+1, count, newstr);
		}
		else {
	newstr+=currChar;
	moveit(str, indx+1, count, newstr);
	return;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter'");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		moveit(str, 0, 0, "");

	}

}
