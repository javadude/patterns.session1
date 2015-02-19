package com.javadude.naive;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TodoGUI {
	// Compact inline objects (OO, but possibly wonky to read)
	public static void main(String[] args) {
		new TodoGUI().go();
	}

	private List list;
	private TextField itemField;

	@SuppressWarnings("serial")
	private void go() {
		new Frame() {{
			setLayout(new BorderLayout());
			add(BorderLayout.WEST, list=new List());
			add(BorderLayout.CENTER, new Panel(new BorderLayout()) {{
				add(BorderLayout.NORTH, itemField=new TextField());
				add(BorderLayout.SOUTH, new Panel(new FlowLayout(FlowLayout.RIGHT)) {{
					add(new Panel(new GridLayout(1,0,3,3)) {{
						add(new AddButton(list, itemField));
						add(new RemoveButton(list));
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
