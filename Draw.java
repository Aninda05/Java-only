import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 public class Draw extends Applet implements MouseMotionListener{
  public void init() {
    addMouseMotionListener(this);
  }
  public void mouseDragged(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(Color.RED);
    g.fillRect(e.getX(), e.getY(), 10, 10);
  }
  public void mouseMoved(MouseEvent e){
  }
}
/*
<applet code="Draw.class" height=200 width=200></applet>
*/
