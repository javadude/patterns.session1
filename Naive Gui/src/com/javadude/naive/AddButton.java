package com.javadude.naive;

import java.awt.Button;

public class AddButton extends Button {
	private static final long serialVersionUID = 1L;
	public interface AddButtonListener {
		void addPressed();
	}
	private AddButtonListener addButtonListener;

	public void setAddButtonListener(AddButtonListener addButtonListener) {
		this.addButtonListener = addButtonListener;
	}

	public AddButton() {
		super("Add");
		addActionListener(e -> addButtonListener.addPressed());
	}
}
