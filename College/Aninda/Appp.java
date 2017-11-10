import java.awt.*;
import java.awt.event.*;
class Appp extends Frame implements MouseMotionListener{
	String msg;
	Appp()
	{
		addMouseMotionListener(this);
		setSize(200,200);
		setVisible(true);
	}
	public void mouseDragged(MouseEvent e){
		Graphics g=getGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(e.getX(),e.getY(),10,10);
		}
	public void mouseMoved(MouseEvent e){}
	public static void main(String []args){
		Appp a=new Appp();
	}
}
