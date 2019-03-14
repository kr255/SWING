package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JButton firstB;
	private JButton secondB;
	private StringListener area;
	
    public Toolbar()
    {
    	firstB = new JButton("first");
    	secondB = new JButton("second");
    	firstB.addActionListener(this);
    	secondB.addActionListener(this);
    	
    	setLayout(new FlowLayout(FlowLayout.LEFT));
    	add(firstB);
    	add(secondB);
    }

	public void setTextPanel(StringListener area) {
		// TODO Auto-generated method stub
		this.area = area;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn1 = (JButton)e.getSource();
				
		if(btn1 == firstB)
		{
			//System.out.println("Clicked 1st Button");
			if(area != null)
			{
				area.stringEmitted("Hello\n");
			}
		}
		else
		{
			//System.out.println("Clicked 2nd Button");
			if(area != null)
			{
				area.stringEmitted("GoodBye\n");
			}
		}
	}
}
