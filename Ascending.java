
public class Ascending {
//sorting the array
	//using recursion
	//checking if array is ascending
	public static boolean sort(int array [] , int indxx  ) {
		if(indxx==array.length-1) {
			return true;
			
		}
		if(array[indxx]< array[indxx+1]) {
			return sort(array, indxx+1);
			
		}
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//input an array
		int[] array = {2,4,5,77,87,2};  
		System.out.println(sort(array,0));
	}
}
