import java.lang.*;
import java.util.*;
class Sieve{
	int a[],n;
	Sieve(int n)
	{
		this.n=n;
		a=new int[n];
	}
	public void input()
	{
		int i;
		for(i=0;i<n-1;i++)
			a[i]=i+2;
	}
	public static void main(String args[])
	{
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		a=sc.nextInt();
		Sieve sv=new Sieve(a);
		sv.input();
		sv.prime();
		sv.display();
	}
	public void display()
	{
		int i;
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public void prime()
	{
		int i,j,k;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]%a[i]==0)
					for(k=j;k<n-1;k++)
						a[k]=a[k+1];
				n--;
			}
		}
	}
}