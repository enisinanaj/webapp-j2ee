package com.sia.ipviewer.designer.nodo;

public class Shape //extends SvgShape
{

	private int width;
	private int height;
	private String colorHex;
	private double opacity;
	private double borderRadius;
	
	public double getBorderRadius() {
		return borderRadius;
	}
	
	public void setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
	}

	public String getColorHex() {
		return colorHex;
	}

	public void setColorHex(String colorHex) {
		this.colorHex = colorHex;
	}

	public double getOpacity() {
		return opacity;
	}

	public void setOpacity(double opacity) {
		this.opacity = opacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
