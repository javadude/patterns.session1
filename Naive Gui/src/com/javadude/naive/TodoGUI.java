package com.javadude.naive;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TodoGUI {
	// Ewwwwwwwwwwwwwwwwwwwwww...............
	public static void main(String[] args) {
		List list = new List();
		TextField itemField = new TextField();
		Button addButton = new Button("Add");
		Button removeButton = new Button("Remove");
		
		addButton.addActionListener(e -> list.add(itemField.getText()));
		removeButton.addActionListener(e -> list.remove(list.getSelectedIndex()));

		Panel buttons = new Panel(new GridLayout(1,0,3,3));
		buttons.add(addButton);
		buttons.add(removeButton);
		Panel bottom = new Panel(new FlowLayout(FlowLayout.RIGHT));
		bottom.add(buttons);
		Panel centerPanel = new Panel(new BorderLayout());
		centerPanel.add(BorderLayout.NORTH, itemField);
		centerPanel.add(BorderLayout.SOUTH, buttons);

		Frame frame = new Frame();
		frame.setLayout(new BorderLayout());
		frame.add(BorderLayout.WEST, list);
		frame.add(BorderLayout.CENTER, centerPanel);
		frame.pack();
		frame.addWindowListener(new WindowAdapter() {
			@Override public void windowClosing(WindowEvent e) {
				System.exit(0);
			}});
		frame.setVisible(true);
	}
}
