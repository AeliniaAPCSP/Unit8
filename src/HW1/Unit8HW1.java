package HW1;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//make your own 2D test array of integers (or whatever)
		int[] [] numArray = {{1, 2, 3},
				     {4, 5, 6},
				     {7, 8, 9}};
		//ask user for column number
		Scanner input = new Scanner(System.in);
		System.out.printf("");
		int userCol = 2;
		//make sure it is a valid option
		if(userCol > numArray.length || userCol < 0) {
			System.out.println("Pick a valid number");
			userCol = input.nextInt();
		}
      		userCol--;
		//print the column number they asked for with each element on a new line
		for(int row = 0; row < numArray.length; row++){
		    System.out.println(numArray[userCol][row]);
		    System.out.println("");
		}
	}
	public static void columnPrinter(int columnNumber,int[][] arr){
		System.out.println("");
	}
}
