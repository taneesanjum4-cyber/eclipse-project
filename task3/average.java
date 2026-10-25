package task3part2;
import java.util.Scanner;
public class average {
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
		double avg=(double)sum/n;
		System.out.println("average="+avg);
		sc.close();
		}

	}


	


