import java.applet.*;
import java.awt.*;
public class Appdemo extends Applet{
	public void paint(Graphics g){
		g.drawLine(100,100,100,200);
		g.drawLine(100,200,200,200);
		g.drawLine(200,200,200,100);
		g.drawLine(200,100,150,50);
		g.drawLine(150,50,100,100);
	}

}
/*
	<applet code="Appdemo.class" height=300 width=300></applet>
*/