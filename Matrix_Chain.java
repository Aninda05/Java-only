import java.lang.*; 
import java.util.*;
class Matrix_Chain
{
	private static int[]p;
	private static int[][]m;
	private static int[][]s;

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in ); 
		int n,i;
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		p=new int[n];
		m=new int[20][20];
		s=new int[20][20];
		System.out.println("Enter the elements");
		for (i=0;i<n;i++) {
			p[i]=sc.nextInt();			
		}
	chain(n);
	System.out.println("Matrix Chain: "+m[1][n]);
	optimal_paren(1,n);
	}

	public static void optimal_paren(int i,int j){
		if(i==j)
			System.out.println("A"+i);
		else{
			System.out.println("(");
			optimal_paren(i,s[i][j]);
			optimal_paren(s[i][j]+1,j);
			System.out.println(")");
		}
	}

	public static void chain(int n){
		int q,i,l,k,j;
		for (i=1; i<=n; i++) {
				m[i][j]=0;	
			
			
		}
		for(l=1;l<n;l++){
			for (i=1; i<n-1;i++ ) {
				j=i+2;
				m[i][j]=999;
				for (k=l;k<=j-1;k++) {
					q=m[i][k]+m[k-1][j]+p[i-1]*p[k]*p[j];
					if (q<m[i][j]) {
						m[i][j]=q;
						s[i][j]=k;
					}
				}
			}
		}
	}
}