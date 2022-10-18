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
public class Circulo extends FiguraEstandar{
	private int radio;

	/**
	 * Constructor for lass Circulo
	 */
	public Circulo() {
		super(0, 0, null, null, 0, false);
	}

	/**
	 * Constructor for lass Circulo
	 * @param radio
	 * @param x coord
	 * @param y coord
	 * @param colorBorde
	 * @param colorRelleno
	 * @param direccion represents the direction the object is facing (1 N; 2 E; 3 S; 4 W)
	 * @param maquina true if not controlled by human
	 */
	public Circulo(int radio, int x, int y, Color colorBorde, Color colorRelleno, int direccion, boolean maquina) {
		super(x, y, colorBorde, colorRelleno, direccion, maquina);
		this.radio = radio;
	}

	/**
	 * @return the radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
}
