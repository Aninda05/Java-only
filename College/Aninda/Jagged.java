import java.lang.*;
class Jagged{
	public static void main(String []args){
		int a[][]={{1,2},{1,2,3},{5}};
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				System.out.println(a[i][j]);
		}
}
