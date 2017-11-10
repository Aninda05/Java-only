import java.util.*;
import java.lang.*;

interface BOSE{
	void input();
	void show();
}
interface BOSE2 extends BOSE{
	 void calc();
}
abstract class Give
{
	abstract void check();
}
class Get extends Give implements BOSE2 ,BOSE{
		protected String s;
		protected int a,sum=0,p=0;
		
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		s=sc.nextLine();
		System.out.println(s+" Enter your age please");
		a=sc.nextInt();
	}
	public void calc(){
		p=s.length();
		sum=p+a;
	}
	
	public void show(){
	System.out.println("NAME			Age");
	System.out.println(s+"		"+a);
	System.out.println("Sum of your name and age is:- "+sum);
	}
	
	public void check(){
		System.out.println("Dun Dun Dun Dun");
	}
}

public class First{
	public static void main(String []args){
		BOSE2 bo1=new Get();
		Get gt=new Get();
		bo1.input();
		bo1.calc();
		bo1.show();
		gt.check();
	}
}	


