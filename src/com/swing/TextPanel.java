package com.swing;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextArea area;

	public TextPanel() {
		area = new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(area), BorderLayout.CENTER);
	}

	public void append(String text) {
		area.append(text);
	}
}
