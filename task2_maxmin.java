package task2;
import java.util.Scanner;
public class task2_maxmin {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	int[]arr=new int[10];
	System.out.println("enter 10 integers:");
	for(int i=0;i<10;i++) {// input loop
		arr[i]=sc.nextInt();//read value
	}//end input
int max=arr[0];
int min=arr[0];
int maxindex=0;//index of max
int minindex=0;//index of min
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];//update max
		maxindex=i;//update max index
	}//end if max
	if(arr[i]<min) {
		min=arr[i];
		minindex=i;
	}//end if min
}//end loop
int secondmin=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++) {//loop to find second min
	if(arr[i]<min&&arr[i]<secondmin) {
		secondmin=arr[i];
	}
}
System.out.println("largest:"+max+"at index"+maxindex);//print max
System.out.println("smallest:"+min+"at index"+minindex);//print min
System.out.println("second minimum:"+secondmin);
sc.close();
	}//end main

}//end class
