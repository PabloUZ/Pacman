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
public class FiguraEstandar extends FiguraGeometrica{
	private int x;
	private int y;

	public FiguraEstandar(int x, int y, Color colorBorde, Color colorRelleno, Rectangle area, boolean maquina) {
		super(colorBorde, colorRelleno, area, maquina);
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	
	
}
