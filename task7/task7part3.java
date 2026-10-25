package task7part3;

import java.util.Arrays;
import java.util.Scanner;

public class task7part3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
			Arrays.sort(arr);
			
			System.out.println("sorted array");	
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+"");	
			}
			sc.close();
		}

	}

	

	


