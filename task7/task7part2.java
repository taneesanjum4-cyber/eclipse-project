package task7part2;

import java.util.Scanner;

public class task7part2 {

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
				for(int j=0;j<n-1-i;i++) {
			if(arr[j]<arr[j+1]) {
				int t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
				}
			}
			
			System.out.println("sorted descending");	
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+"");	
			}
			sc.close();
		}

	}

	


