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
	// Using a Mediator - more reusable add/remove buttons
	public static void main(String[] args) {
		new TodoGUI().go();
	}

	private List list = new List();
	private TextField itemField = new TextField();
	private Button addButton = new Button("Add");
	private Button removeButton = new Button("Remove");
	@SuppressWarnings("unused")
	private Mediator mediator1 = new Mediator(addButton, removeButton, list, itemField);

	@SuppressWarnings("serial")
	private void go() {
		new Frame() {{
			setLayout(new BorderLayout());
			add(BorderLayout.WEST, list);
			add(BorderLayout.CENTER, new Panel(new BorderLayout()) {{
				add(BorderLayout.NORTH, itemField);
				add(BorderLayout.SOUTH, new Panel(new FlowLayout(FlowLayout.RIGHT)) {{
					add(new Panel(new GridLayout(1,0,3,3)) {{
						add(addButton);
						add(removeButton);
					}});
				}});
			}});
			addWindowListener(new WindowAdapter() {
				@Override public void windowClosing(WindowEvent e) {
					System.exit(0);
				}});
			pack();
			setVisible(true);
		}};
	}
}
