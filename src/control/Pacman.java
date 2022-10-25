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
	 * Creates new form for the game Pacman
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
		
		Pared p5 = new Pared(80,20,40,40,Color.blue,Color.blue, 0,true);
		Pared p6 = new Pared(80,20,280,40,Color.blue,Color.blue, 0,true);
		Pared p7 = new Pared(20,60,40,40,Color.blue,Color.blue, 0,true);
		Pared p8 = new Pared(20,60,340,40,Color.blue,Color.blue, 0,true);
		Pared p9 = new Pared(40,140,180,0,Color.blue,Color.blue, 0,true);
		Pared p10 = new Pared(20,60,140,40,Color.blue,Color.blue, 0,true);
		Pared p11 = new Pared(20,60,240,40,Color.blue,Color.blue, 0,true);
		Pared p12 = new Pared(80,20,80,80,Color.blue,Color.blue, 0,true);
		
		Pared p13 = new Pared(80,20,240,80,Color.blue,Color.blue, 0,true);
		Pared p14 = new Pared(20,60,80,80,Color.blue,Color.blue, 0,true);
		Pared p15 = new Pared(20,60,300,80,Color.blue,Color.blue, 0,true);
		Pared p16 = new Pared(40,20,60,120,Color.blue,Color.blue, 0,true);
		Pared p17 = new Pared(40,20,300,120,Color.blue,Color.blue, 0,true);
		Pared p18 = new Pared(160,20,120,120,Color.blue,Color.blue, 0,true);
		
		
		Pared p19 = new Pared(20,160,20,120,Color.blue,Color.blue, 0,true);
		Pared p20 = new Pared(20,160,360,120,Color.blue,Color.blue, 0,true);
		Pared p21 = new Pared(100,20,60,160,Color.blue,Color.blue, 0,true);
		Pared p22 = new Pared(100,20,60,220,Color.blue,Color.blue, 0,true);
		Pared p23 = new Pared(100,20,240,160,Color.blue,Color.blue, 0,true);
		Pared p24 = new Pared(100,20,240,220,Color.blue,Color.blue, 0,true);
		Pared p25 = new Pared(20,40,60,160,Color.blue,Color.blue, 0,true);
		Pared p26 = new Pared(20,40,140,160,Color.blue,Color.blue, 0,true);
		Pared p27 = new Pared(20,40,280,160,Color.blue,Color.blue, 0,true);
		Pared p28 = new Pared(20,40,100,200,Color.blue,Color.blue, 0,true);
		Pared p29 = new Pared(20,40,240,200,Color.blue,Color.blue, 0,true);
		Pared p30 = new Pared(20,40,320,200,Color.blue,Color.blue, 0,true);
		Pared p31 = new Pared(40,80,180,160,Color.blue,Color.blue, 0,true);

		Pared p32 = new Pared(40,20,60,260,Color.blue,Color.blue, 0,true);
		Pared p33 = new Pared(40,20,300,260,Color.blue,Color.blue, 0,true);
		Pared p34 = new Pared(160,20,120,260,Color.blue,Color.blue, 0,true);
		Pared p35 = new Pared(40,140,180,260,Color.blue,Color.blue, 0,true);
		Pared p36 = new Pared(20,60,80,260,Color.blue,Color.blue, 0,true);
		Pared p37 = new Pared(20,60,300,260,Color.blue,Color.blue, 0,true);
		Pared p38 = new Pared(20,60,40,300,Color.blue,Color.blue, 0,true);
		Pared p39 = new Pared(20,60,140,300,Color.blue,Color.blue, 0,true);
		Pared p40 = new Pared(20,60,240,300,Color.blue,Color.blue, 0,true);
		Pared p41 = new Pared(20,60,340,300,Color.blue,Color.blue, 0,true);
		Pared p42 = new Pared(80,20,80,300,Color.blue,Color.blue, 0,true);
		Pared p43 = new Pared(80,20,240,300,Color.blue,Color.blue, 0,true);
		Pared p44 = new Pared(80,20,40,340,Color.blue,Color.blue, 0,true);
		Pared p45 = new Pared(80,20,280,340,Color.blue,Color.blue, 0,true);


		

		
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
		
		p19.setArea(new Rectangle(p19.getX(), p19.getY(), p19.getWidth(), p19.getHeight()));
		p20.setArea(new Rectangle(p20.getX(), p20.getY(), p20.getWidth(), p20.getHeight()));
		p21.setArea(new Rectangle(p21.getX(), p21.getY(), p21.getWidth(), p21.getHeight()));
		p22.setArea(new Rectangle(p22.getX(), p22.getY(), p22.getWidth(), p22.getHeight()));
		p23.setArea(new Rectangle(p23.getX(), p23.getY(), p23.getWidth(), p23.getHeight()));
		p24.setArea(new Rectangle(p24.getX(), p24.getY(), p24.getWidth(), p24.getHeight()));
		p25.setArea(new Rectangle(p25.getX(), p25.getY(), p25.getWidth(), p25.getHeight()));
		p26.setArea(new Rectangle(p26.getX(), p26.getY(), p26.getWidth(), p26.getHeight()));
		p27.setArea(new Rectangle(p27.getX(), p27.getY(), p27.getWidth(), p27.getHeight()));
		p28.setArea(new Rectangle(p28.getX(), p28.getY(), p28.getWidth(), p28.getHeight()));
		p29.setArea(new Rectangle(p29.getX(), p29.getY(), p29.getWidth(), p29.getHeight()));
		p30.setArea(new Rectangle(p30.getX(), p30.getY(), p30.getWidth(), p30.getHeight()));
		p31.setArea(new Rectangle(p31.getX(), p31.getY(), p31.getWidth(), p31.getHeight()));

		p32.setArea(new Rectangle(p32.getX(), p32.getY(), p32.getWidth(), p32.getHeight()));
		p33.setArea(new Rectangle(p33.getX(), p33.getY(), p33.getWidth(), p33.getHeight()));
		p34.setArea(new Rectangle(p34.getX(), p34.getY(), p34.getWidth(), p34.getHeight()));
		p35.setArea(new Rectangle(p35.getX(), p35.getY(), p35.getWidth(), p35.getHeight()));
		p36.setArea(new Rectangle(p36.getX(), p36.getY(), p36.getWidth(), p36.getHeight()));
		p37.setArea(new Rectangle(p37.getX(), p37.getY(), p37.getWidth(), p37.getHeight()));
		p38.setArea(new Rectangle(p38.getX(), p38.getY(), p38.getWidth(), p38.getHeight()));
		p39.setArea(new Rectangle(p39.getX(), p39.getY(), p39.getWidth(), p39.getHeight()));
		p40.setArea(new Rectangle(p40.getX(), p40.getY(), p40.getWidth(), p40.getHeight()));
		p41.setArea(new Rectangle(p41.getX(), p41.getY(), p41.getWidth(), p41.getHeight()));
		p42.setArea(new Rectangle(p42.getX(), p42.getY(), p42.getWidth(), p42.getHeight()));
		p43.setArea(new Rectangle(p43.getX(), p43.getY(), p43.getWidth(), p43.getHeight()));
		p44.setArea(new Rectangle(p44.getX(), p44.getY(), p44.getWidth(), p44.getHeight()));
		p45.setArea(new Rectangle(p45.getX(), p45.getY(), p45.getWidth(), p45.getHeight()));

		


		
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
		
		this.areaJuego.getFigurasEstaticas().add(p19);
		this.areaJuego.getFigurasEstaticas().add(p20);
		this.areaJuego.getFigurasEstaticas().add(p21);
		this.areaJuego.getFigurasEstaticas().add(p22);
		this.areaJuego.getFigurasEstaticas().add(p23);
		this.areaJuego.getFigurasEstaticas().add(p24);
		this.areaJuego.getFigurasEstaticas().add(p25);
		this.areaJuego.getFigurasEstaticas().add(p26);
		this.areaJuego.getFigurasEstaticas().add(p27);
		this.areaJuego.getFigurasEstaticas().add(p28);
		this.areaJuego.getFigurasEstaticas().add(p29);
		this.areaJuego.getFigurasEstaticas().add(p30);
		this.areaJuego.getFigurasEstaticas().add(p31);

		this.areaJuego.getFigurasEstaticas().add(p32);
		this.areaJuego.getFigurasEstaticas().add(p33);
		this.areaJuego.getFigurasEstaticas().add(p34);
		this.areaJuego.getFigurasEstaticas().add(p35);
		this.areaJuego.getFigurasEstaticas().add(p36);
		this.areaJuego.getFigurasEstaticas().add(p37);
		this.areaJuego.getFigurasEstaticas().add(p38);
		this.areaJuego.getFigurasEstaticas().add(p39);
		this.areaJuego.getFigurasEstaticas().add(p40);
		this.areaJuego.getFigurasEstaticas().add(p41);
		this.areaJuego.getFigurasEstaticas().add(p42);
		this.areaJuego.getFigurasEstaticas().add(p43);
		this.areaJuego.getFigurasEstaticas().add(p44);
		this.areaJuego.getFigurasEstaticas().add(p45);

		
		//</editor-fold>
		
		// <editor-fold defaultstate="collapsed" desc="JUGADOR">
		
		jugador = new Circulo(10, 20, 20, Color.orange, Color.orange, 0,false);
		
		jugador.setArea(new Rectangle(jugador.getX(), jugador.getY(), jugador.getRadio()*2, jugador.getRadio()*2));
		
		this.areaJuego.getFigurasDinamicas().add(jugador);
		
		
		//</editor-fold>
		
		
		// <editor-fold defaultstate="collapsed" desc="FANTASMAS">
		
		
		Circulo c1 = new Circulo(10, 360, 20, Color.green, Color.white,  1,true);
		Circulo c2 = new Circulo(10, 20, 360, Color.green, Color.white,  1,true);
		Circulo c3 = new Circulo(10, 360, 360, Color.green, Color.white,  1,true);

		
		c1.setArea(new Rectangle(c1.getX(), c1.getY(), c1.getRadio()*2, c1.getRadio()*2));
		c2.setArea(new Rectangle(c2.getX(), c2.getY(), c2.getRadio()*2, c2.getRadio()*2));
		c3.setArea(new Rectangle(c3.getX(), c3.getY(), c3.getRadio()*2, c3.getRadio()*2));


		
		this.areaJuego.getFigurasDinamicas().add(c1);
		this.areaJuego.getFigurasDinamicas().add(c2);
		this.areaJuego.getFigurasDinamicas().add(c3);

		
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
        b_restart = new javax.swing.JButton();

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

        b_restart.setText("RESTART");
        b_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(505, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b_restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(b_start)
                .addGap(47, 47, 47)
                .addComponent(b_stop)
                .addGap(47, 47, 47)
                .addComponent(b_restart)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	/**
	 * Pause the game
	 */
    private void b_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_stopActionPerformed
		if(this.areaJuego.getIsPlaying()){
			this.areaJuego.setIsPlaying(false);
		}
    }//GEN-LAST:event_b_stopActionPerformed
	
	/**
	 * Starts / Resume the game
	 */
    private void b_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_startActionPerformed
		if(!this.areaJuego.getIsPlaying()){
			this.areaJuego.setIsPlaying(true);
			Thread proceso1 = new Thread(this.areaJuego);
			proceso1.start();
		}
		this.b_start.setFocusable(false);
		this.b_stop.setFocusable(false);
		this.b_restart.setFocusable(false);
		this.areaJuego.setFocusable(true);
    }//GEN-LAST:event_b_startActionPerformed

	/**
	 * Detects keyboard pressed
	 */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
		if (this.areaJuego.getIsPlaying()){
			if(evt.getKeyChar()=='w'&&!colisionJugador(jugador,'w')){
				((FiguraEstandar)this.jugador).moverAR(5);
			}else if(evt.getKeyChar()=='a'&&!colisionJugador(jugador,'a')){
				((FiguraEstandar)this.jugador).moverIZ(5);
			}else if(evt.getKeyChar()=='s'&&!colisionJugador(jugador,'s')){
				((FiguraEstandar)this.jugador).moverAB(5);
			}else if(evt.getKeyChar()=='d'&&!colisionJugador(jugador,'d')){
				((FiguraEstandar)this.jugador).moverDE(5);
			}
		}
    }//GEN-LAST:event_formKeyPressed

    private void b_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_restartActionPerformed
	if(!this.areaJuego.getIsPlaying()){
		this.jugador.setX(20);
		this.jugador.setY(20);
		
		((FiguraEstandar)this.areaJuego.getFigurasDinamicas().get(1)).setX(360);
		((FiguraEstandar)this.areaJuego.getFigurasDinamicas().get(1)).setY(20);
		
		((FiguraEstandar)this.areaJuego.getFigurasDinamicas().get(2)).setX(20);
		((FiguraEstandar)this.areaJuego.getFigurasDinamicas().get(2)).setY(360);
		
		((FiguraEstandar)this.areaJuego.getFigurasDinamicas().get(3)).setX(360);
		((FiguraEstandar)this.areaJuego.getFigurasDinamicas().get(3)).setY(360);
		repaint();
	}
    }//GEN-LAST:event_b_restartActionPerformed

	/**
	 * Detects when a player try to pass over a wall
	 * @param g Player (Moving figure)
	 * @param letra Character catched from keyboard that indicates the direction player should move
	 */
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
    private javax.swing.JButton b_restart;
    private javax.swing.JButton b_start;
    private javax.swing.JButton b_stop;
    // End of variables declaration//GEN-END:variables
}
