package task3part3;
import java.util.Scanner;
public class greaterthanaverage {

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
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>avg) {
				count++;
			}
		}
		System.out.println("average="+avg);
		System.out.println("average greater element="+count);
		sc.close();
		}

	}
