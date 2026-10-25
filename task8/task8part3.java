package task8part3;

import java.util.Scanner;

public class task8part3 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("size");
			int n=sc.nextInt();
			int[]arr=new int[n];
			System.out.println("elements");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}	
			System.out.println("after removing duplicates");
				for(int i=0;i<n;i++) {
				boolean dup=false;
					for(int j=0;j<i;j++) {
						if(arr[i]==arr[j]) {
						dup=true;
						break;
						}
						}
						if(!dup) {
					System.out.println(arr[i]+"");	
						}
			}
				
				sc.close();
			}
							
		}
				

		


	


