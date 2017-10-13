import java.applet.*;
import java.awt.*;
public class Appdemo1 extends Applet{
	String msg;
	public void init(){
		msg="Welcome";
	}
	public void paint(Graphics g){
		
		g.drawString(msg,20,50);
	}
}
	/*
	<applet code="Appdemo1.class" height=300 width=300></applet>
*/