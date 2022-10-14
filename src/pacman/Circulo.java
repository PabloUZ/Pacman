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

	public Circulo() {
		super(0, 0, null, null, 0, false);
	}

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
