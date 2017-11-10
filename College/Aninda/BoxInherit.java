import java.util.*;
import java.lang.*;
class Box{
	double l=5;
	double w=5;
	double h=5;
	Box(){
		l=1;
		w=1;
		h=1;
	}
	Box(double a,double b,double c){
		l=a;
		w=b;
		h=c;
	}
	void vol(){
		System.out.println("Volume is "+(l*w*h));
	}
}
class BoxExt extends Box{
	double weight;
	BoxExt(){
		weight=1;
		}
	BoxExt(double a1,double b1,double c1,double d1){
		super(a1,b1,c1);
		weight=d1;
		}
	void show(){
		System.out.println("Lenght="+l);
		}
}
class BoxInherit{
	public static void main(String []args){
		BoxExt be=new BoxExt(1,2,3,4);
		be.vol();
		be.show();
	}
}

