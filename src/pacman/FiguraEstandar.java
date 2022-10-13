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

	public FiguraEstandar(int x, int y, Color colorBorde, Color colorRelleno, int direccion, boolean maquina) {
		super(colorBorde, colorRelleno, direccion, maquina);
		this.x = x;
		this.y = y;
	}
	
	 public void moverDE(int distancia){
        this.x=this.x+distancia;
    }
    public void moverIZ(int distancia){
        this.x=this.x-distancia;
	actualizarArea();
    }
    public void moverAR(int distancia){
        this.y=this.y-distancia;
	actualizarArea();
    }
    public void moverAB(int distancia){
        this.y=this.y+distancia;
	actualizarArea();
    }
	
	public void actualizarArea(){
		this.getArea().setLocation(this.x, this.y);
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
