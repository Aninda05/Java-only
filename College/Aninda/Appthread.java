import java.lang.*;
import java.awt.*;
import java.applet.*;
public class Appthread extends Applet implements Runnable
{
	Thread t1;
	int x,y,r,g,b;
	Color c;
	public void init()
	{
		
		t1=new Thread(this);
		x=100;
		y=100;
		
		t1.start();
	}
	public void paint(Graphics g)
	{
		g.setColor(c);
		g.drawString("Hi",x,y);
		
	}
	public void run()
	{
		while(true){
			x=x-10;
			
			if(x<0)
				x=300;
			r=(int)(Math.random()*256);
			g=(int)(Math.random()*256);
			b=(int)(Math.random()*256);
			c=new Color(r,g,b);
			try
			{
				Thread.sleep(300);
				repaint();
			}
			catch(Exception e){}
		}
	}
}	
	
/*<applet code="Appthread.class" height=500 width=300>
 </applet> */
