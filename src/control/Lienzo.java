/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package control;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacman.FiguraGeometrica;
import pacman.*;

/**
 *
 * @author pablo
 */
public class Lienzo extends javax.swing.JPanel implements Runnable{
	private boolean isPlaying;
	private ArrayList<FiguraGeometrica> figurasEstaticas;
	private ArrayList<FiguraGeometrica> figurasDinamicas;

	
	/**
	 * Draw the wall
	 * @param lapiz 
	 * @param paredActual wall object to draw
	 */
	public void dibujarPared(Graphics lapiz,Pared paredActual){
        if (paredActual.getColorBorde()!=null) {
            lapiz.setColor(paredActual.getColorBorde());
        }
        lapiz.drawRect(paredActual.getX(),paredActual.getY(),
                       paredActual.getWidth(), paredActual.getHeight());
        if (paredActual.getColorRelleno()!=null) {
            lapiz.setColor(paredActual.getColorRelleno());
        }
        lapiz.fillRect(paredActual.getX(),paredActual.getY(),
                       paredActual.getWidth(), paredActual.getHeight());
    }
    
	
	/**
	 * Draw the Pacman and ghosts
	 * @param lapiz from class Graphics
	 * @param circuloActual Circle object to draw
	 */
    public void dibujarCirculo(Graphics lapiz,Circulo circuloActual){
        if (circuloActual.getColorBorde()!=null) {
            lapiz.setColor(circuloActual.getColorBorde());
        }
        lapiz.drawOval(circuloActual.getX(), circuloActual.getY(),
                       circuloActual.getRadio()*2, circuloActual.getRadio()*2);
        if (circuloActual.getColorRelleno()!=null) {
            lapiz.setColor(circuloActual.getColorRelleno());
        }
        lapiz.fillOval(circuloActual.getX(), circuloActual.getY(),
                       circuloActual.getRadio()*2, circuloActual.getRadio()*2);
    }
	
	/**
	 * Creates new form Lienzo
	 */
	public Lienzo() {
		initComponents();
		this.figurasEstaticas = new ArrayList<>();
		this.figurasDinamicas = new ArrayList<>();
		this.isPlaying = false;

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
	
	@Override
	public void paintComponent(Graphics lapiz){
		super.paintComponent(lapiz);
		for(FiguraGeometrica actual:this.getFigurasEstaticas()){
			if(actual instanceof Pared){
				dibujarPared(lapiz, (Pared) actual);
			}
		}
		for(FiguraGeometrica actual:this.getFigurasDinamicas()){
			if(actual instanceof Circulo){
				dibujarCirculo(lapiz, (Circulo) actual);
			}
		}
		
	}
	
	@Override
	public void run() {
		while(this.isPlaying){
			mover();
			repaint();
			int i = 1;
			while(i<this.figurasDinamicas.size() && this.isPlaying){
				if(((FiguraEstandar)figurasDinamicas.get(i)).getArea().intersects(((FiguraEstandar)figurasDinamicas.get(0)).getArea())){
					this.setIsPlaying(false);
				}
				i++;
			}
			esperar(10);
		}
		JOptionPane.showMessageDialog(null,"Fin");
	}
	
	/**
	 * Sleeps the thread process x milliseconds
	 * @param milisegundos Time to sleep
	 */
	private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
	/**
	 * Moves the ghosts with constant speed
	 */
	public void mover(){
		for (FiguraGeometrica actual:this.figurasDinamicas){
			if (actual == this.figurasDinamicas.get(0)) continue;
			if(actual instanceof FiguraEstandar && actual.getDireccion()==1){
				if(colisiona((FiguraEstandar)actual)){
					cambiarDireccion((FiguraEstandar) actual);
					continue;
				}
				((FiguraEstandar) actual).moverAR(1);
			}else if(actual instanceof FiguraEstandar && actual.getDireccion()==2){
				if(colisiona((FiguraEstandar)actual)){
					cambiarDireccion((FiguraEstandar) actual);
					continue;
				}
				((FiguraEstandar) actual).moverDE(1);
			}else if(actual instanceof FiguraEstandar && actual.getDireccion()==3){
				if(colisiona((FiguraEstandar)actual)){
					cambiarDireccion((FiguraEstandar) actual);
					continue;
				}
				((FiguraEstandar) actual).moverAB(1);
			}else if(actual instanceof FiguraEstandar && actual.getDireccion()==4){
				if(colisiona((FiguraEstandar)actual)){
					cambiarDireccion((FiguraEstandar) actual);
					continue;
				}
				((FiguraEstandar) actual).moverIZ(1);
			}
		}
	}
		
	/**
	 * Changes the direction of the ghost
	 * @param g ghost to change direction
	 */
	public void cambiarDireccion(FiguraEstandar g){
		while(colisiona(g)){
			g.setDireccion(getRandomInt(5,1));
		}
	}
	public static int getRandomInt(int maximum, int minimum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum;
	}
	/**
	 * Evaluate ghost collition with a wall
	 * @param g ghost to evaluate
	 */
	public boolean colisiona (FiguraEstandar g){
		int direccion =g.getDireccion();
		FiguraEstandar n = g;
		if(direccion == 1){
			n.getArea().setLocation(n.getX(),n.getY()-1);
			for(FiguraGeometrica i:this.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}else if(direccion == 2){
			n.getArea().setLocation(n.getX()+1,n.getY());
			for(FiguraGeometrica i:this.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}else if(direccion == 3){
			n.getArea().setLocation(n.getX(),n.getY()+1);
			for(FiguraGeometrica i:this.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}else if(direccion == 4){
			n.getArea().setLocation(n.getX()-1,n.getY());
			for(FiguraGeometrica i:this.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}
		
		return false;
		
	}

	/**
	 * @return the isPlaying
	 */
	public boolean getIsPlaying() {
		return isPlaying;
	}

	/**
	 * @param isPlaying the isPlaying to set
	 */
	public void setIsPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	/**
	 * @return the figurasEstaticas
	 */
	public ArrayList<FiguraGeometrica> getFigurasEstaticas() {
		return figurasEstaticas;
	}

	/**
	 * @param figurasEstaticas the figurasEstaticas to set
	 */
	public void setFigurasEstaticas(ArrayList<FiguraGeometrica> figurasEstaticas) {
		this.figurasEstaticas = figurasEstaticas;
	}

	/**
	 * @return the figurasDinamicas
	 */
	public ArrayList<FiguraGeometrica> getFigurasDinamicas() {
		return figurasDinamicas;
	}

	/**
	 * @param figurasDinamicas the figurasDinamicas to set
	 */
	public void setFigurasDinamicas(ArrayList<FiguraGeometrica> figurasDinamicas) {
		this.figurasDinamicas = figurasDinamicas;
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
