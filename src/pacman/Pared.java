/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacman;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author pablo
 */
public class Pared extends FiguraEstandar{
	private int width;
	private int height;

	public Pared() {
		super(0, 0, null, null, 0, false);
	}

	public Pared(int width, int height, int x, int y, Color colorBorde, Color colorRelleno, int direccion, boolean maquina) {
		super(x, y, colorBorde, colorRelleno, direccion, maquina);
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
