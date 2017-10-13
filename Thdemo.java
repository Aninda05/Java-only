import java.lang.*;
class Thdemo
{
	Thread t1;
	Thdemo(){
		System.out.println(Thread.currentThread());
		t1.setName("Aninda");
		t1.setPriority(8);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
	}
	public static void main(String args[])
	{
		new Thdemo();
		//System.out.println(Thread.currentThread());
	}
	
}