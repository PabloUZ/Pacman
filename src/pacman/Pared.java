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

	/**
	 * Constructor for class Pared
	 */
	public Pared() {
		super(0, 0, null, null, 0, false);
	}
	/**
	 * Constructor for class Pared
	 * @param width shape
	 * @param height shape
	 * @param x coord
	 * @param y coord
	 * @param colorBorde
	 * @param colorRelleno
	 * @param direccion represents the direction the object is facing (1 N; 2 E; 3 S; 4 W)
	 * @param maquina true if not controlled by human
	 */
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
