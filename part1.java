package task4part1;

import java.util.Scanner;

public class part1 {

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

		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				found=true;
				break;
			}
		}
		if(found) {
		System.out.println("number found!");
		}
		else {
		System.out.println("number not found!");
		}
		sc.close();
		}

	}

	
	


