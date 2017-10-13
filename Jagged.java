import java.lang.*;
import java.util.*;
class Jagged
{
	public static void main(String[] args) {
		int row,column,i,k;
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		int a[][]=new int[row][];
		for(i=0;i<a.length;i++){
			System.out.println("Enter column");
			column=sc.nextInt();
			a[i]=new int[column];
		}
		for(i=0;i<a.length;i++){
			for(k=0;k<a[i].length;k++)
				a[i][k]=sc.nextInt();
		}
		for(i=0;i<a.length;i++){
			for(k=0;k<a[i].length;k++)
				System.out.println(a[i][k]+"");
			System.out.println();
		}
	}
}