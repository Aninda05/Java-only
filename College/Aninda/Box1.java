import java.util.*;
import java.lang.*;
class Box1{
	double l=5;
	double w=5;
	double h=5;
	Box1(){
		l=1;
		w=1;
		h=1;
	}
	Box1(double l,double w,double h){
		l=this.l;
		w=this.w;
		h=this.h;
	}
	
	public void setdata()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the vales of length width and height");
	l=sc.nextDouble();
	w=sc.nextDouble();
	h=sc.nextDouble();
	}
	public void volume()
	{
	System.out.println("The volume is= "+(l*w*h));
	}
}
class Boxvol{
	public static void main(String []args){
		Box1 b1=new Box1();
		
		Box1 b2=new Box1(10,10,10);
		b2.volume();
		b1.setdata();
		b1.volume();
		}
}
