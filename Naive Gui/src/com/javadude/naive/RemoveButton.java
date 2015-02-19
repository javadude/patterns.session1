package com.javadude.naive;

import java.awt.Button;
import java.awt.List;

public class RemoveButton extends Button {
	private static final long serialVersionUID = 1L;

	public RemoveButton(List list) {
		super("Remove");
		addActionListener(e -> list.remove(list.getSelectedIndex()));
	}
}
