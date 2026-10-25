package task8part2;

import java.util.*;

public class task8part2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}	
			for(int i=0;i<n;i++) {
				int count=1;
				if(arr[i]==-99999) {
					continue;
				}
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=-99999;
					}
					if(count>1) {
				System.out.println(arr[i]+"="+count+"times");	
					}
		}
			
			sc.close();
		}
						
	}}
			

	


