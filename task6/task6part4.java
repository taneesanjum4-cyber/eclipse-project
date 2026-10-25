package task6part4;

import java.util.Scanner;

public class task6part4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
			System.out.println("element to delete");
		int elem=sc.nextInt();
		int pos=-1;
			for(int i=0;i<n;i++) {
				if(arr[i]==elem) {
					pos=i;
					break;
				}
			}
			if(pos==-1) {
			
				System.out.println("element not found");
			}
			else {
				for(int i=pos;i<n-1;i++) {
					arr[i]=arr[i+1];
				System.out.println(arr[i]+"");
				}
			sc.close();
		}
	}
	}

	

	


