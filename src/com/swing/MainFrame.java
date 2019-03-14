package com.swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private TextPanel area; // custom panel that has a textArea in it
	private Toolbar toolbar;
	private FormPanel formPanel;
	public MainFrame() {
		super("Hello World");

		setLayout(new BorderLayout());
		area = new TextPanel();
		toolbar = new Toolbar();
		formPanel = new FormPanel();
		toolbar.setTextPanel(new StringListener() {
			
			@Override
			public void stringEmitted(String text) {
				area.append(text);
				
			}
		});
		add(toolbar, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
