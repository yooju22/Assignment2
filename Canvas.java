package Assignment2;

import java.awt.*;
import javax.swing.*;

class Canvas extends JFrame{
	public Canvas(){
		super("Assignment 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(530, 550);
		FigurePane f = new FigurePane();
		getContentPane().add(f);
	}
}
