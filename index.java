package task4part2;
import java.util.Scanner;
public class index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		int sum=0;
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			System.out.println("search number");
			int key=sc.nextInt();

		int count=0;
		System.out.println("found at indices");
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.println(i+"");
				count++;
			}
		}
		if(count==0) {
		System.out.println("\nnumber found!");
		}
		else {
		System.out.println("\ntotal"+count+"times found");
		}
		sc.close();
		}

	}

	


