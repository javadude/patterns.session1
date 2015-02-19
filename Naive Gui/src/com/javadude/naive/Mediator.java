package com.javadude.naive;

import java.awt.Button;
import java.awt.List;
import java.awt.TextField;

public class Mediator {
	public Mediator(Button addButton, Button removeButton, List list, TextField itemField) {
		addButton.addActionListener(e -> list.add(itemField.getText()));
		removeButton.addActionListener(e -> list.remove(list.getSelectedIndex()));
	}
}
