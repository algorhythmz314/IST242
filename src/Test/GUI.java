package Test;
/* Filename:	GUI.java
 * Author:		Team 1
 * Assignment:	Contains Main GUI Elements
 * Date:		April 24, 2020
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame
{
	JTextField	txtID,
				txtName,
				txtType,
				txtPrice,
				txtWeight,
				txtDistributor,
				txtQuantity,
				txtSearch;
	
	JLabel		lblID,
				lblName,
				lblType,
				lblPrice,
				lblWeight,
				lblDistributor,
				lblQuantity,
				lblSearch;

	
	private JTextField display;
	double dfirstnumber; 
	double dsecondnumber;
	String strSavedSign;
	
	private static final int FRAME_WIDTH = 1280;
	private static final int FRAME_HEIGHT = 720;

	public GUI()
	{
		createButtonPanel();
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Inventory Tracker");
		getContentPane().setBackground(Color.black);
		setLocationRelativeTo(null);
		setVisible(true);
	
	}
	      
	private void createButtonPanel()
	{      
		JPanel main = new JPanel();
		
		txtID 			= new JTextField(10);
		txtName 		= new JTextField(10);
		txtType			= new JTextField(10);
		txtPrice 		= new JTextField(10);
		txtWeight 		= new JTextField(10);
		txtDistributor 	= new JTextField(10);
		txtQuantity 	= new JTextField(10);
		txtSearch		= new JTextField(10);
		
		lblID 			= new JLabel("ID:");
		lblName 		= new JLabel("Name:");
		lblType 		= new JLabel("Type");
		lblPrice 		= new JLabel("Price");
		lblWeight 		= new JLabel("Weight");
		lblDistributor	= new JLabel("Distributor:");
		lblQuantity		= new JLabel("Quantity:");
		lblSearch		= new JLabel("Search by Name");
		
//		Font bigFont = txtID.getFont().deriveFont(Font.PLAIN, 150f);
		
		
		JButton buttonClear;
		JButton buttonEnterL;
		JButton buttonEnterR;
		JButton buttonHelp;
	
		BufferedImage buttonIconEnterL = null;
		BufferedImage buttonIconClear = null;
		BufferedImage buttonIconEnterR = null;
		BufferedImage buttonIconHelp = null;
		
		try {
			buttonIconEnterL = ImageIO.read(new File("src/Image/EnterButton.png"));
			buttonIconClear = ImageIO.read(new File("src/Image/ClearButton.png"));
			buttonIconEnterR = ImageIO.read(new File("src/Image/EnterButton.png"));
			buttonIconHelp = ImageIO.read(new File("src/Image/HelpButton.png"));
			} 
		catch (IOException e){e.printStackTrace();}
		
		buttonEnterL = new JButton(new ImageIcon(buttonIconEnterL));
		buttonEnterL.setBorder(BorderFactory.createEmptyBorder());
		buttonEnterL.setContentAreaFilled(false);
		
		buttonClear = new JButton(new ImageIcon(buttonIconClear));
		buttonClear.setBorder(BorderFactory.createEmptyBorder());
		buttonClear.setContentAreaFilled(false);
		
		buttonEnterR = new JButton(new ImageIcon(buttonIconEnterR));
		buttonEnterR.setBorder(BorderFactory.createEmptyBorder());
		buttonEnterR.setContentAreaFilled(false);
		
		buttonHelp = new JButton(new ImageIcon(buttonIconHelp));
		buttonHelp.setBorder(BorderFactory.createEmptyBorder());
		buttonHelp.setContentAreaFilled(false);
		
		//button = new JButton("Button");
		
		main.setLayout(null);
		buttonEnterL.setBounds(250,370,201,51);
		buttonClear.setBounds(30,370,201,51);
		buttonEnterR.setBounds(1050,609,201,51);
		buttonHelp.setBounds(30,609,201,51);
		
	
		buttonEnterL.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e)
	        {System.out.println("You clicked the Left Enter button");}});
		
		buttonClear.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e)
	        {System.out.println("You clicked the clear button");}});
		
		buttonEnterR.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e)
	        {System.out.println("You clicked the Right Enter button");}});
		
		buttonHelp.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e)
	        {System.out.println("You clicked the Help button");}});
		
//		txtID.setFont(bigFont);
//		txtName.setFont(bigFont);
//		txtType.setFont(bigFont);
//		txtPrice.setFont(bigFont);
//		txtWeight.setFont(bigFont);
//		txtDistributor.setFont(bigFont);
//		txtQuantity.setFont(bigFont);
		
		lblID.setBounds			(30, 30, 150, 25);
		lblName.setBounds		(30, 60, 150, 25);
		lblType.setBounds		(30, 90, 150, 25);
		lblPrice.setBounds		(30, 120, 150, 25);
		lblWeight.setBounds		(30, 150, 150, 25);
		lblDistributor.setBounds(30, 180, 150, 25);
		lblQuantity.setBounds	(30, 210, 150, 25);
		lblSearch.setBounds		(1040, 530, 150, 25);
		
		lblID.setForeground			(Color.white);
		lblName.setForeground		(Color.white);
		lblType.setForeground		(Color.white);
		lblPrice.setForeground		(Color.white);
		lblWeight.setForeground		(Color.white);
		lblDistributor.setForeground(Color.white);
		lblQuantity.setForeground	(Color.white);
		lblSearch.setForeground		(Color.white);
		
		txtID.setBounds			(140, 30, 200, 25);
		txtName.setBounds		(140, 60, 200, 25);
		txtType.setBounds		(140, 90, 200, 25);
		txtPrice.setBounds		(140, 120, 200, 25);
		txtWeight.setBounds		(140, 150, 200, 25);
		txtDistributor.setBounds(140, 180, 200, 25);
		txtQuantity.setBounds	(140, 210, 200, 25);
		txtSearch.setBounds		(1040, 570, 200, 25);
		
		main.add(buttonEnterL);
		main.add(buttonClear);
		main.add(buttonEnterR);
		main.add(buttonHelp);
		
		main.add(lblID);
		main.add(lblName);
		main.add(lblType);
		main.add(lblPrice);
		main.add(lblWeight);
		main.add(lblDistributor);
		main.add(lblQuantity);
		main.add(lblSearch);
		
		main.add(txtID);
		main.add(txtName);
		main.add(txtType);
		main.add(txtPrice);
		main.add(txtWeight);
		main.add(txtDistributor);
		main.add(txtQuantity);
		main.add(txtSearch);
		
		//buttonEnterL.addActionListener(new ActionListener());
		{
			
		}
		
		main.setBackground(Color.black);
		getContentPane().add(main);
		 
		 
	}
	
}
	   
	
//	   class DigitButtonListener implements ActionListener
//	   {
//	      private String digit;
//	      
//	      /**
//	         Constructs a listener whose actionPerformed method adds a digit
//	         to the display.
//	         @param aDigit the digit to add
//	      */
//	      public DigitButtonListener(String aDigit)
//	      {
//	         digit = aDigit;
//	      }
//	      
//	      public void actionPerformed(ActionEvent event)
//	      {  
//	    	  System.out.println("Something was clicked " + event.getActionCommand());
//	    	  
//	    	//  display.setText(event.getActionCommand());
//	    	  switch(event.getActionCommand())
//	    	  {
//	    	  	case "close":
//	    		  System.exit(0);
//	    		  break;
//	    	  
//	    	  	case "clr":
//	    	  		display.setText("");
//	    	  		dfirstnumber = 0;
//	    	  		dsecondnumber = 0;
//	        	  break;
//	        	  
//	    	  	case "+":
//	    	  	case "-":
//	    	  	case "*":
//	    	  	case "/":
//	    	  		strSavedSign = event.getActionCommand();
//	    	  		dfirstnumber = Double.parseDouble(display.getText());
//	    	  		display.setText("");
//	    	  		System.out.println("A button was pushed" + strSavedSign);
//	    	  		
//	    	  		break;
//	    	  
//	        	  
//	    	  	case "=":
//	    	  		System.out.println("Equal was pushed");
//	    	  		double dTotal = 0.0;
//	    	  		//total = first number + second number
//	    	  		dsecondnumber = Double.parseDouble(display.getText());
//	    	  		dTotal = CalcTotal(dfirstnumber, dsecondnumber);
//	    	  		display.setText(dTotal + "");
//	    	  		break;
//	    	  		
//	    	  	default:
//	    	  		display.setText(display.getText() + digit );
//	        	  
//	        	  
//	    	  
//	    	  }
//	      }        
//	   }
//
//	   public double CalcTotal (double d1, double d2)
//	   {
//		   double dTotal = 0.0;
//		   
//		   switch (strSavedSign)
//		   {
//		   case "+":
//			   dTotal = d1 + d2;
//			   break;
//		   case "-":
//			   dTotal = d1 - d2;
//			   break;
//		   case "*":
//			   dTotal = d1 * d2;
//			   break;
//		   case "/":
//			   dTotal = d1 / d2;
//			   break;
//		   }
//		   return dTotal;
//	   }
//	   
//	   /**
//	      Makes a button representing a digit of a calculator.
//	      @param digit the digit of the calculator
//	      @return the button of the calculator
//	   */
//	   public JButton makeDigitButton(String digit)
//	   {
//	      JButton button = new JButton(digit);
//	      
//	      ActionListener listener = new DigitButtonListener(digit);
//	      button.addActionListener(listener);  
//	      return button;    
//	   } 
//
//	   /**
//	      Makes a button representing an operator of a calculator.
//	      @param op the operator of the calculator
//	      @return button the button of the calculator
//	   */
//	   public JButton makeOperatorButton(String op)
//	   {
//	      JButton button = new JButton(op);
//	      ActionListener listener = new DigitButtonListener(op);
//	      
//	      button.addActionListener(listener);
//	      return button;    
//	   }     

