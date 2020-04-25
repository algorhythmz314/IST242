package Test;
/* Filename:	BackgroundImage.java
 * Author:		Team 1
 * Assignment:	Contains elements for a background image GUI
 * Date:		April 24, 2020
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundImage extends JFrame implements ActionListener
{
	JLabel label;
	JPanel panel;
	String imagePath;
	
	protected ImageIcon imageicon = new ImageIcon();//Please choose the picture with suitable size
	
	public BackgroundImage(String imagePath) 
	{
		this.imagePath = imagePath;
		ImageIcon imageicon = new ImageIcon(imagePath);
		JLabel label = new JLabel(imageicon);
		label.setBounds(0, 0, imageicon.getIconWidth(), imageicon.getIconHeight());
		
		panel = (JPanel)this.getContentPane();
		panel.setOpaque(true);
		
		panel.setLayout(new BorderLayout());
		JButton testButton = new JButton("Continue");
		panel.add(testButton, BorderLayout.SOUTH);
		
		//add action listener
		testButton.addActionListener(this);
		
		this.getLayeredPane();
		
		int i = Integer.MIN_VALUE;
		this.getLayeredPane().add(label, i);
		
		this.setSize(imageicon.getIconWidth(), imageicon.getIconHeight());
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getActionCommand().equals("Continue"))
		{
			if (this.imagePath.equals("src/Image/Splash.png"))
					{
						this.setVisible(false);
						
						JFrame G = new GUI();
						
					}
			else
			{
				System.out.println("Continue Pressed!");
			}
		}
	}
	

}
