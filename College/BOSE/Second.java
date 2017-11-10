import java.util.*;
import java.lang.*;

interface Parent{
	void show();
	}
interface Child extends Parent{
	void show1();
	}
	
class A implements Parent,Child{
	public void show(){
		System.out.println("HI");
		}
	public void show1(){
		System.out.println("Hello");
		}
	}
	
class Second {
	public static void main(String []args)
		{
			Child ch=new A();
			ch.show();
			ch.show1();
		}
	}
