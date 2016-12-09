package com.sia.ipviewer.designer.nodo;

public class NodoGaranzia extends NodoProdotto {
	
	private static final long serialVersionUID = 1L;

	public NodoGaranzia(String name, NodoType type) {
		super(name, type);
	}
	
	public NodoGaranzia(String name) {
		super(name, NodoType.GARANZIA);
	}

}
