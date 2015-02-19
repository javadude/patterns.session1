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
	// A little better (very procedural)
	public static void main(String[] args) {
		new TodoGUI().go();
	}

	private Button addButton;
	private Button removeButton;
	private List list;
	private TextField itemField;
	private Frame frame;
	private Panel centerPanel;
	private Panel bottomPanel;
	private Panel buttonsPanel;

	private void go() {
		createFrame().setVisible(true);
	}

	private Frame createFrame() {
		if (frame == null) {
			frame = new Frame();
			frame.setLayout(new BorderLayout());
			frame.add(BorderLayout.WEST, getList());
			frame.add(BorderLayout.CENTER, createCenterPanel());
			frame.addWindowListener(new WindowAdapter() {
				@Override public void windowClosing(WindowEvent e) {
					System.exit(0);
				}});
			frame.pack();
		}
		return frame;
	}

	private List getList() {
		if (list == null) {
			list = new List();
		}
		return list;
	}
	private TextField getItemField() {
		if (itemField == null) {
			itemField = new TextField();
		}
		return itemField;
	}
	private Panel createCenterPanel() {
		if (centerPanel == null) {
			centerPanel = new Panel(new BorderLayout());
			centerPanel.add(BorderLayout.NORTH, getItemField());
			centerPanel.add(BorderLayout.SOUTH, createBottom());
		}
		return centerPanel;
	}
	private Panel createButtons() {
		if (buttonsPanel == null) {
			buttonsPanel = new Panel(new GridLayout(1,0,3,3));
			buttonsPanel.add(createAddButton());
			buttonsPanel.add(createRemoveButton());
		}
		return buttonsPanel;
	}
	private Panel createBottom() {
		if (bottomPanel == null) {
			bottomPanel = new Panel(new FlowLayout(FlowLayout.RIGHT));
			bottomPanel.add(createButtons());
		}
		return bottomPanel;
	}
	private Button createAddButton() {
		if (addButton == null) {
			addButton = new Button("Add");
			addButton.addActionListener(e -> getList().add(getItemField().getText()));
		}
		return addButton;
	}
	private Button createRemoveButton() {
		if (removeButton == null) {
			removeButton = new Button("Remove");
			removeButton.addActionListener(e -> getList().remove(getList().getSelectedIndex()));
		}
		return removeButton;
	}
}
