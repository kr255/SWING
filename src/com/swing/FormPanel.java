package com.swing;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel{

	private JTextField name;
	private JTextField occupation;
	private JLabel	   labelName;
	private JLabel     labelOccupation;
	private JButton    btn;
	public FormPanel()
	{
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		labelName = new JLabel("Name: ");
		labelOccupation = new JLabel("Occupation: ");
		name = new JTextField(10);
		occupation = new JTextField(10);
		
		btn = new JButton("submit");
	    
		Border innerBorder = BorderFactory.createTitledBorder("Add a Person");
		Border outterBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outterBorder, innerBorder));
	
	
	}
}
