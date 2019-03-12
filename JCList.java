import java.util.ArrayList;
import java.util.Scanner;

public class JCList {

	public static void main(String[] args) {
		ArrayList <Integer> l1= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n,i;
		for(i=0;i<5;i++)
		{
			n=sc.nextInt();
			l1.add(n);
		}
		System.out.println(l1);
	}
}
