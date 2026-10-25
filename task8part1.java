package task8part1;

import java.util.Arrays;
import java.util.Scanner;

public class task8part1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
			System.out.println("duplicate elements");	
			for(int i=0;i<n;i++) {
				for(int j=i+1;i<n;j++) {
					if(arr[i]==arr[j]) {
				System.out.println(arr[i]+"");	
				break;
					}
				}
			}
			sc.close();
		}

	}

	

	

	


