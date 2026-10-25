package task3;
import java.util.*;
public class sum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("size");
	int n=sc.nextInt();
	int[]arr=new int[n];
	int sum=0;
	System.out.println("elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	System.out.println("sum="+sum);
	sc.close();
	}

}
