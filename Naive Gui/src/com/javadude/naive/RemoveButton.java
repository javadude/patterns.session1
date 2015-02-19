package com.javadude.naive;

import java.awt.Button;

public class RemoveButton extends Button {
	private static final long serialVersionUID = 1L;
	public interface RemoveButtonListener {
		void removePressed();
	}
	private RemoveButtonListener removeButtonListener;

	public void setRemoveButtonListener(RemoveButtonListener removeButtonListener) {
		this.removeButtonListener = removeButtonListener;
	}

	public RemoveButton() {
		super("Remove");
		addActionListener(e -> removeButtonListener.removePressed());
	}
}
