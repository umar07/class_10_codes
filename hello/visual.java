package hello;
import java.awt.*;
import javax.swing.JFrame;//can be swing.*;

public class visual extends JFrame 
{
	public visual()
	{
	    setBackground(Color.BLACK);
		setTitle("khatarnaak");
		setSize(800,800);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.fillOval(200,200,200,200);
		g.setColor(Color.red);
		g.drawArc(200, 200, 200, 200, 0, 0);
	}
	public static void main(String[] args) 
	{
		visual obj=new visual();
		obj.paint(null);
	}

}
