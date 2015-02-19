package com.javadude.naive;

import java.awt.Button;
import java.awt.List;
import java.awt.TextField;

public class AddButton extends Button {
	private static final long serialVersionUID = 1L;

	public AddButton(List list, TextField textField) {
		super("Add");
		addActionListener(e -> list.add(textField.getText()));
	}
}
