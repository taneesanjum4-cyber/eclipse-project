package task5part3;

import java.util.Scanner;

public class part3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n+1];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			System.out.println("element to insert at end");
			int elem=sc.nextInt();
			arr[n]=elem;
			System.out.println("after insertion");
		
			for(int i=0;i<n+1;i++) {
				System.out.println(arr[i]+"");
			}
			sc.close();
		}

	}



	


