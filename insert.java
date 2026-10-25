package task5part1;

import java.util.Scanner;

public class insert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n+1];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			System.out.println("element to insert at beginning");
			int elem=sc.nextInt();
		for(int i=n;i>0;i--) {
			arr[i]=arr[i-1];
			arr[0]=elem;
			System.out.println("after insertion");
		}
			for(int i=0;i<n+1;i++) {
				System.out.println(arr[i]+"");
			}
			sc.close();
		}

	}


