package com.javadude.naive;

import java.awt.List;
import java.awt.TextField;

public class Mediator2 {
	public Mediator2(AddButton addButton, RemoveButton removeButton, List list, TextField itemField) {
		addButton.setAddButtonListener(() -> list.add(itemField.getText()));
		removeButton.setRemoveButtonListener(() -> list.remove(list.getSelectedIndex()));
	}
}
