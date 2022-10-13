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
public abstract class FiguraGeometrica {
	private Color colorBorde;
	private Color colorRelleno;
	private Rectangle area;
	private int direccion;
	private boolean maquina;

	public FiguraGeometrica() {
	}

	public FiguraGeometrica(Color colorBorde, Color colorRelleno, int direccion, boolean maquina) {
		this.colorBorde = colorBorde;
		this.colorRelleno = colorRelleno;
		this.direccion = direccion;
		this.maquina = maquina;
	}

	/**
	 * @return the colorBorde
	 */
	public Color getColorBorde() {
		return colorBorde;
	}

	/**
	 * @param colorBorde the colorBorde to set
	 */
	public void setColorBorde(Color colorBorde) {
		this.colorBorde = colorBorde;
	}

	/**
	 * @return the colorRelleno
	 */
	public Color getColorRelleno() {
		return colorRelleno;
	}

	/**
	 * @param colorRelleno the colorRelleno to set
	 */
	public void setColorRelleno(Color colorRelleno) {
		this.colorRelleno = colorRelleno;
	}

	/**
	 * @return the area
	 */
	public Rectangle getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(Rectangle area) {
		this.area = area;
	}

	/**
	 * @return the maquina
	 */
	public boolean isMaquina() {
		return maquina;
	}

	/**
	 * @param maquina the maquina to set
	 */
	public void setMaquina(boolean maquina) {
		this.maquina = maquina;
	}

	/**
	 * @return the direccion
	 */
	public int getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
