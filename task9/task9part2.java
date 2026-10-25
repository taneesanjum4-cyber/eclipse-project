package task9part2;
import java.util.Scanner;
import java.util.Arrays;
public class task9part2 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] a = {1, 5, 3};
		        int[] b = {2, 4, 6};
		        int[] c = new int[a.length + b.length];
		        System.arraycopy(a, 0, c, 0, a.length);
		        System.arraycopy(b, 0, c, a.length, b.length);
		        Arrays.sort(c);
		        System.out.println(Arrays.toString(c));
		        sc.close();
		    }
		}

	


