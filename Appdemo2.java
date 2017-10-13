import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Appdemo2 extends Applet implements ActionListener{
	Label l1;
	TextField tf1;
	Button b1,b2;
	public void init()
	{
		//designing
		l1=new Label("USERNAME");
		tf1=new TextField(20);
		b1=new Button("OK");
		b2=new Button("CLEAR");
		add(l1);
		add(tf1);
		add(b1);
		add(b2);
		//coding
		b1.addActionListener(this);
		b2.addActionListener(this);
	} 
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1)
			tf1.setText("INDIA");
		else
			tf1.setText("");
	}
}
/*
	<applet code="Appdemo2.class" height=300 width=300></applet>
*/