package com.sia.ipviewer.designer.nodo;

public enum NodoType {
	ROOT("r"), GARANZIA("g"), BENE_ASSICURATO("ba"), OGGETTO_DI_RISCHIO("or"), PRESTAZIONE("p");
	
	private String value;
	
	private NodoType() {
		this.value = "r";
	}
	
	NodoType(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
