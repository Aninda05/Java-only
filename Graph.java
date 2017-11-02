import java.util.*;
import java.lang.*;
class Graph
{
	protected static int n,g[][],x[],m;

	public static void mcoloring(int k){
		int i;
		do{
			nextvalue(k);
			if(x[k]==0)
				return;
			if(k==n){
				for (i=1; i<=n; i++) {
					if(i==n)
						System.out.println(x[i]);
					else
						System.out.println(x[i]);
				}
			}
		else
			mcoloring(k+1);
		}while(false);
	}

	public static void nextvalue(int k){
		int j;
		do{
			x[k]=(x[k]+1)%(m+1);
			if(x[k]==0)
				return;
			for(j=1;j<=n;j++){
				if((g[j][k]!=0)&&(x[j]==x[k]))
					break;
			}
			if(j==n+1)
				return;
		}while(false);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,e,u,v;
		System.out.println("Enter the number of vertices,edes and color");
		n=sc.nextInt();
		e=sc.nextInt();
		m=sc.nextInt();
		g=new int[n-1][n-1];
		x=new int[n-1];
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++)
				g[i][j]=0;
		}
		for(i=1;i<=e;i++){
			System.out.println("Enter starting and ending vertex");
			u=sc.nextInt();
			v=sc.nextInt();
			g[u][v]=g[v][u]=1;
		}
		mcoloring(1);
	}
}
