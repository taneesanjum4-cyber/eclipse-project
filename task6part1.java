package task6part1;

import java.util.Scanner;

public class task6part1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		
			System.out.println("after deletion");
		
			for(int i=0;i<n-1;i++) {
				System.out.println(arr[i]+"");
			}
			sc.close();
		}

	}

	


