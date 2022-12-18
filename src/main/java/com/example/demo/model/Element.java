package com.example.demo.model;

public class Element {
	
	private int element;
	
	

	public Element(int element) {
		super();
		this.element = element;
	}

	public Element() {
		super();
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "Element [element=" + element + "]";
	}
	
	
}
