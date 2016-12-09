package com.sia.ipviewer.designer.nodo;

import java.io.Serializable;

public class NodoProdotto extends Shape 
implements Serializable, Comparable<NodoProdotto> {

	private static final long serialVersionUID = 1L;
	private String name;
	private NodoType type;
	
	public NodoProdotto(String name, NodoType type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public int compareTo(NodoProdotto o) {
		return this.getName().compareTo(o.getName());
	}
	
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NodoProdotto other = (NodoProdotto) obj;
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        if (getType() == null) {
            if (other.getType() != null)
                return false;
        } else if (!getType().equals(other.getType()))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return getName();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NodoType getType() {
		return type;
	}

	public void setType(NodoType type) {
		this.type = type;
	}
}
