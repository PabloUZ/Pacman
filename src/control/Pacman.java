/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pacman.Circulo;
import pacman.FiguraEstandar;
import pacman.FiguraGeometrica;
import pacman.Pared;

/**
 *
 * @author pablo
 */
public class Pacman extends javax.swing.JFrame {
	
	private Lienzo areaJuego;
	private Circulo jugador;
	/**
	 * Creates new form Pacman
	 */
	public Pacman() {
		initComponents();
		this.setSize(600, 500);
		this.areaJuego = new Lienzo();
		this.areaJuego.setVisible(true);
		this.areaJuego.setSize(400, 400);
		this.areaJuego.setBackground(Color.darkGray);
		this.add(this.areaJuego);
		
		// <editor-fold defaultstate="collapsed" desc="PAREDES">
		Pared p1 = new Pared(20,400,0,0,Color.blue,Color.blue, 0,true);
		Pared p2 = new Pared(20,400,380,0,Color.blue,Color.blue,0,true);
		Pared p3 = new Pared(400,20,0,0,Color.blue,Color.blue,0,true);
		Pared p4 = new Pared(400,20,0,380,Color.blue,Color.blue,0,true);
		
		Pared p5 = new Pared(20,60,40,40,Color.blue,Color.blue, 0,true);
		Pared p6 = new Pared(20,60,340,40,Color.blue,Color.blue, 0,true);
		Pared p7 = new Pared(20,60,40,300,Color.blue,Color.blue, 0,true);
		Pared p8 = new Pared(20,60,340,300,Color.blue,Color.blue, 0,true);
		Pared p9 = new Pared(60,20,40,340,Color.blue,Color.blue, 0,true);
		Pared p10 = new Pared(60,20,300,340,Color.blue,Color.blue, 0,true);
		Pared p11 = new Pared(60,20,40,40,Color.blue,Color.blue, 0,true);
		Pared p12 = new Pared(60,20,300,40,Color.blue,Color.blue, 0,true);
		
		Pared p13 = new Pared(200,20,100,100,Color.blue,Color.blue, 0,true);
		Pared p14 = new Pared(200,20,100,280,Color.blue,Color.blue, 0,true);
		Pared p15 = new Pared(20,200,100,100,Color.blue,Color.blue, 0,true);
		Pared p16 = new Pared(20,200,280,100,Color.blue,Color.blue, 0,true);
		Pared p17 = new Pared(20,40,190,0,Color.blue,Color.blue, 0,true);
		Pared p18 = new Pared(20,40,190,360,Color.blue,Color.blue, 0,true);

		
		p1.setArea(new Rectangle(p1.getX(), p1.getY(), p1.getWidth(), p1.getHeight()));
		p2.setArea(new Rectangle(p2.getX(), p2.getY(), p2.getWidth(), p2.getHeight()));
		p3.setArea(new Rectangle(p3.getX(), p3.getY(), p3.getWidth(), p3.getHeight()));
		p4.setArea(new Rectangle(p4.getX(), p4.getY(), p4.getWidth(), p4.getHeight()));
		p5.setArea(new Rectangle(p5.getX(), p5.getY(), p5.getWidth(), p5.getHeight()));		
		p6.setArea(new Rectangle(p6.getX(), p6.getY(), p6.getWidth(), p6.getHeight()));
		p7.setArea(new Rectangle(p7.getX(), p7.getY(), p7.getWidth(), p7.getHeight()));		
		p8.setArea(new Rectangle(p8.getX(), p8.getY(), p8.getWidth(), p8.getHeight()));
		p9.setArea(new Rectangle(p9.getX(), p9.getY(), p9.getWidth(), p9.getHeight()));		
		p10.setArea(new Rectangle(p10.getX(), p10.getY(), p10.getWidth(), p10.getHeight()));	
		p11.setArea(new Rectangle(p11.getX(), p11.getY(), p11.getWidth(), p11.getHeight()));
		p12.setArea(new Rectangle(p12.getX(), p12.getY(), p12.getWidth(), p12.getHeight()));
		p13.setArea(new Rectangle(p13.getX(), p13.getY(), p13.getWidth(), p13.getHeight()));			
		p14.setArea(new Rectangle(p14.getX(), p14.getY(), p14.getWidth(), p14.getHeight()));			
		p15.setArea(new Rectangle(p15.getX(), p15.getY(), p15.getWidth(), p15.getHeight()));			
		p16.setArea(new Rectangle(p16.getX(), p16.getY(), p16.getWidth(), p16.getHeight()));
		p17.setArea(new Rectangle(p17.getX(), p17.getY(), p17.getWidth(), p17.getHeight()));			
		p18.setArea(new Rectangle(p18.getX(), p18.getY(), p18.getWidth(), p18.getHeight()));			


		
		this.areaJuego.getFigurasEstaticas().add(p1);
		this.areaJuego.getFigurasEstaticas().add(p2);
		this.areaJuego.getFigurasEstaticas().add(p3);
		this.areaJuego.getFigurasEstaticas().add(p4);
		this.areaJuego.getFigurasEstaticas().add(p5);
		this.areaJuego.getFigurasEstaticas().add(p6);
		this.areaJuego.getFigurasEstaticas().add(p7);
		this.areaJuego.getFigurasEstaticas().add(p8);
		this.areaJuego.getFigurasEstaticas().add(p9);
		this.areaJuego.getFigurasEstaticas().add(p10);
		this.areaJuego.getFigurasEstaticas().add(p11);
		this.areaJuego.getFigurasEstaticas().add(p12);
		this.areaJuego.getFigurasEstaticas().add(p13);
		this.areaJuego.getFigurasEstaticas().add(p14);
		this.areaJuego.getFigurasEstaticas().add(p15);
		this.areaJuego.getFigurasEstaticas().add(p16);
		this.areaJuego.getFigurasEstaticas().add(p17);
		this.areaJuego.getFigurasEstaticas().add(p18);

		
		//</editor-fold>
		
		// <editor-fold defaultstate="collapsed" desc="JUGADOR">
		
		jugador = new Circulo(10, 20, 20, Color.orange, Color.orange, 0,false);
		
		jugador.setArea(new Rectangle(jugador.getX(), jugador.getY(), jugador.getRadio()*2, jugador.getRadio()*2));
		
		this.areaJuego.getFigurasDinamicas().add(jugador);
		
		
		//</editor-fold>
		
		
		// <editor-fold defaultstate="collapsed" desc="FANTASMAS">
		
		
		Circulo c1 = new Circulo(10, 360, 20, Color.green, Color.white,  1,true);
		Circulo c2 = new Circulo(10, 20, 360, Color.green, Color.white,  1,true);

		
		c1.setArea(new Rectangle(c1.getX(), c1.getY(), c1.getRadio()*2, c1.getRadio()*2));
		c2.setArea(new Rectangle(c1.getX(), c1.getY(), c1.getRadio()*2, c1.getRadio()*2));

		
		this.areaJuego.getFigurasDinamicas().add(c1);
		this.areaJuego.getFigurasDinamicas().add(c2);

		
		//</editor-fold>
		
		
		this.setFocusable(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_start = new javax.swing.JButton();
        b_stop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        b_start.setText("START");
        b_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_startActionPerformed(evt);
            }
        });

        b_stop.setText("STOP");
        b_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_stopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(521, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(b_start)
                .addGap(47, 47, 47)
                .addComponent(b_stop)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_stopActionPerformed
		if(this.areaJuego.getIsPlaying()){
			this.areaJuego.setIsPlaying(false);
		}
    }//GEN-LAST:event_b_stopActionPerformed

    private void b_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_startActionPerformed
		if(!this.areaJuego.getIsPlaying()){
			this.areaJuego.setIsPlaying(true);
			Thread proceso1 = new Thread(this.areaJuego);
			proceso1.start();
		}
		this.b_start.setFocusable(false);
		this.b_stop.setFocusable(false);
		this.areaJuego.setFocusable(true);
    }//GEN-LAST:event_b_startActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
		if(evt.getKeyChar()=='w'&&!colisionJugador(jugador,'w')){
			((FiguraEstandar)this.jugador).moverAR(5);
		}else if(evt.getKeyChar()=='a'&&!colisionJugador(jugador,'a')){
			((FiguraEstandar)this.jugador).moverIZ(5);
		}else if(evt.getKeyChar()=='s'&&!colisionJugador(jugador,'s')){
			((FiguraEstandar)this.jugador).moverAB(5);
		}else if(evt.getKeyChar()=='d'&&!colisionJugador(jugador,'d')){
			((FiguraEstandar)this.jugador).moverDE(5);
		}
    }//GEN-LAST:event_formKeyPressed

	
	public boolean colisionJugador(FiguraEstandar g, char letra){
		FiguraEstandar n = g;
		if(letra=='w'){
			n.getArea().setLocation(n.getX(),n.getY()-1);
			for(FiguraGeometrica i:this.areaJuego.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}else if(letra == 'd'){
			n.getArea().setLocation(n.getX()+1,n.getY());
			for(FiguraGeometrica i:this.areaJuego.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}else if(letra == 's'){
			n.getArea().setLocation(n.getX(),n.getY()+1);
			for(FiguraGeometrica i:this.areaJuego.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}else if(letra == 'a'){
			n.getArea().setLocation(n.getX()-1,n.getY());
			for(FiguraGeometrica i:this.areaJuego.getFigurasEstaticas()){
				if(n.getArea().intersects(i.getArea())){
					return true;
				}
			}
		}
		
		return false;
		
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Pacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Pacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Pacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Pacman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Pacman().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_start;
    private javax.swing.JButton b_stop;
    // End of variables declaration//GEN-END:variables
}
