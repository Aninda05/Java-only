import java.awt.*;
import java.awt.event.*;

public class Drawing extends Frame implements MouseMotionListener{
 Drawing(){
 
  addMouseMotionListener(this);
  setSize(200,200);
  setVisible(true);
 
  addWindowListener(new WindowAdapter() {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
});
 }
  public void mouseDragged(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(Color.RED);
    g.fillRect(e.getX(), e.getY(), 10, 10);
  }
  public void mouseMoved(MouseEvent e){
  }
  public static void main(String []args){
    Drawing dr=new Drawing();
  }
}