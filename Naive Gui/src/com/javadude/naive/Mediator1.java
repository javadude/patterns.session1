package com.javadude.naive;

import java.awt.List;
import java.awt.TextField;

import com.javadude.naive.AddButton.AddButtonListener;
import com.javadude.naive.RemoveButton.RemoveButtonListener;

public class Mediator1 implements AddButtonListener, RemoveButtonListener {
	private List list;
	private TextField itemField;
	public Mediator1(AddButton addButton, RemoveButton removeButton, List list, TextField itemField) {
		this.list = list;
		this.itemField = itemField;
		addButton.setAddButtonListener(this);
		removeButton.setRemoveButtonListener(this);
	}

	@Override public void addPressed() {
		list.add(itemField.getText());
	}
	@Override public void removePressed() {
		list.remove(list.getSelectedIndex());
	}
}
