package task9part3;
import java.util.Scanner;

public class task9part3 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] a = {1, 2, 2, 3};
		        int[] b = {3, 4, 5};
		        int[] c = new int[a.length + b.length];
		        int k=0;
		        for(int i=0; i<a.length; i++){
		            boolean found=false;
		            for(int j=0;j<k;j++) if(c[j]==a[i]) found=true;
		            if(!found) c[k++]=a[i];
		        }
		        for(int i=0; i<b.length; i++){
		            boolean found=false;
		            for(int j=0;j<k;j++) if(c[j]==b[i]) found=true;
		            if(!found) c[k++]=b[i];
		        }
		        for(int i=0;i<k;i++) System.out.print(c[i]+" ");
		        sc.close();
		    }
		}
		