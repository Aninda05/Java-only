import java.awt.*;
import java.applet.*;
public class Appdemo1 extends Applet{
	public void paint(Graphics g){
		g.drawLine(100,100,100,200);
		g.drawLine(100,200,200,200);
		g.drawLine(200,200,200,100);
		g.drawLine(200,100,150,50);
		g.drawLine(150,50,100,100);
		g.drawString("HI",150,150);
	}
}
/*<applet code="Appdemo1.class" height=300 width=300></applet>*/

