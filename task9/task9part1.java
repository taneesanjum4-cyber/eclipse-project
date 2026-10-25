package task9part1;
import java.util.*;
public class task9part1 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("first array  size: ");
		        int n1 = sc.nextInt();
		        int[] a = new int[n1];
		        System.out.println("first array  elements:");
		        for(int i=0; i<n1; i++) a[i] = sc.nextInt();

		        System.out.print("second array size: ");
		        int n2 = sc.nextInt();
		        int[] b = new int[n2];
		        System.out.println("second array  elements:");
		        for(int i=0; i<n2; i++) b[i] = sc.nextInt();

		        int[] c = new int[n1+n2];
		        for(int i=0; i<n1; i++) c[i] = a[i];
		        for(int i=0; i<n2; i++) c[n1+i] = b[i];

		        System.out.println("Merged Array:");
		        for(int x : c) System.out.print(x + " ");
		        sc.close();
		    }
		}

	


