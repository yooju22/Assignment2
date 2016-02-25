package Assignment2;

import java.awt.*;
import javax.swing.*;

public class FigurePane extends JPanel{
	public void paintComponent(Graphics comp){
		Graphics2D comp2D = (Graphics2D)comp;
		
		GradientPaint p1 = new GradientPaint(2F, 2F, Color.red, 355F, 335F, Color.blue);
		
		comp2D.setPaint(p1);
		
		Stroke stroke = new BasicStroke(2.0f ,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER);
		comp2D.setStroke(stroke);
		for(int i = 0; i <=480; i+= 20){
			for(int j = 0; j <=480; j+= 20){
				

				comp2D.drawArc(5+j, 5+i, 20, 22, 0, -180);
			}
		}
	}


}
