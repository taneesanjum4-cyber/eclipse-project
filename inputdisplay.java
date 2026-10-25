package task1;
import java.util.Scanner;
public class inputdisplay {//class declaration

	public static void main(String[] args) {//main method start
		Scanner sc=new Scanner(System.in);//create scanner object
		int[]arr=new int[10];//declare array of 10 integers
		System.out.println("enter 10 integers:");
		for(int i=0;i<arr.length;i++) {//loop 0 to 9 for input
			arr[i]=sc.nextInt();//store input in array
		}
System.out.println("all elements:");
for(int i=0;i<arr.length;i++) {//loop for display
	System.out.println(arr[i]+"");//print each element
}
System.out.println("elements in reverse order:");//heading for reverse
for(int i=arr.length-1;i>=0;i--) {//loop from 9 to 0
	System.out.println(arr[i]+" ");//print in reverse
}//end reverse loop
sc.close();//close scanner
}//end main
}//end class