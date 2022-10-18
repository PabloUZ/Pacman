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

	/**
	 * Constructor for class FiguraEstandar
	 * @param x coord
	 * @param y coord
	 * @param colorBorde
	 * @param colorRelleno
	 * @param direccion represents the direction the object is facing (1 N; 2 E; 3 S; 4 W)
	 * @param maquina true if not controlled by human
	 */
	public FiguraEstandar(int x, int y, Color colorBorde, Color colorRelleno, int direccion, boolean maquina) {
		super(colorBorde, colorRelleno, direccion, maquina);
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * Moves the figure to the Right
	 * @param distancia number of pixels it should move
	 */
	 public void moverDE(int distancia){
        this.x=this.x+distancia;
    }
	 
	 /**
	 * Moves the figure to the left
	 * @param distancia number of pixels it should move
	 */
    public void moverIZ(int distancia){
        this.x=this.x-distancia;
	actualizarArea();
    }
	
	/**
	 * Moves the figure up
	 * @param distancia number of pixels it should move
	 */
    public void moverAR(int distancia){
        this.y=this.y-distancia;
	actualizarArea();
    }
	
	/**
	 * Moves the figure down
	 * @param distancia number of pixels it should move
	 */
    public void moverAB(int distancia){
        this.y=this.y+distancia;
	actualizarArea();
    }
	/**
	 * updates the area position when the figure moves
	 */
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
