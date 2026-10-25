package task6part3;

import java.util.Scanner;

public class task6part3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
			System.out.println("position to delete(0 to start)");
		int pos=sc.nextInt();
			for(int i=pos;i<n-1;i++) {
				arr[i]=arr[i+1];
			
				System.out.println(arr[i]+"");
			}
			sc.close();
		}

	}

	

	


