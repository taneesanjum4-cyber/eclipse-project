package task8part4;

import java.util.Scanner;

public class task8part4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}	
		System.out.println("unique element");
			for(int i=0;i<n;i++) {
			boolean unique=true;
				for(int j=0;j<n;j++) {
					if(i!=j&&arr[i]==arr[j]) {
					unique=false;
					break;
					}
					}
					if(unique) {
				System.out.println(arr[i]+"");	
					}
		}
			
			sc.close();
		}
						
	}
			

	


