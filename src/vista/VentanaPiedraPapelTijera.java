package vista;

import controlador.Administrador;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class VentanaPiedraPapelTijera extends javax.swing.JFrame {
    // "btn_papel2.png", "btn_piedra2.png", "btn_tijera2.png"
    private Administrador admin;
    private String[][] vistorias = {
        {"btn_papel2.png", "btn_tijera2.png"},
        {"btn_tijera2.png", "btn_papel2.png"},
        {"btn_tijera2.png", "btn_piedra2.png"},
        {"btn_piedra2.png", "btn_tijera2.png"},
        {"btn_papel2.png", "btn_piedra2.png"},
        {"btn_piedra2.png", "btn_papel2.png"}
    };

    public VentanaPiedraPapelTijera() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonJugador = new javax.swing.JButton();
        botonMaquina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonPapel = new javax.swing.JButton();
        botonPiedra = new javax.swing.JButton();
        botonTijera = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        txtGanador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 43, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnIncognito.png"))); // NOI18N
        botonJugador.setBorderPainted(false);
        botonJugador.setFocusPainted(false);
        botonJugador.setOpaque(false);
        jPanel1.add(botonJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 150, 150));

        botonMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnIncognito.png"))); // NOI18N
        botonMaquina.setBorderPainted(false);
        botonMaquina.setFocusPainted(false);
        botonMaquina.setOpaque(false);
        botonMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMaquinaActionPerformed(evt);
            }
        });
        jPanel1.add(botonMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 150, 150));

        jLabel1.setFont(new java.awt.Font("Chiller", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 241, 128));
        jLabel1.setText("Vs");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 80, 80));

        jLabel3.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 241, 128));
        jLabel3.setText("Jugador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, 30));

        jLabel4.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 241, 128));
        jLabel4.setText("Máquina");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, 30));

        botonPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_papel1.png"))); // NOI18N
        botonPapel.setBorderPainted(false);
        botonPapel.setFocusPainted(false);
        botonPapel.setOpaque(false);
        botonPapel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_papel1.png"))); // NOI18N
        botonPapel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_papel1_pressed.png"))); // NOI18N
        botonPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPapelActionPerformed(evt);
            }
        });
        jPanel1.add(botonPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, 120));

        botonPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_tpiedra1.png"))); // NOI18N
        botonPiedra.setBorderPainted(false);
        botonPiedra.setFocusPainted(false);
        botonPiedra.setOpaque(false);
        botonPiedra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_tpiedra1.png"))); // NOI18N
        botonPiedra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_tpiedra1_pressed.png"))); // NOI18N
        botonPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPiedraActionPerformed(evt);
            }
        });
        jPanel1.add(botonPiedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 120, 120));

        botonTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_tijera1.png"))); // NOI18N
        botonTijera.setBorderPainted(false);
        botonTijera.setFocusPainted(false);
        botonTijera.setOpaque(false);
        botonTijera.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_tijera1.png"))); // NOI18N
        botonTijera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_tijera1_pressed.png"))); // NOI18N
        botonTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTijeraActionPerformed(evt);
            }
        });
        jPanel1.add(botonTijera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 120, 120));

        botonReiniciar.setBackground(new java.awt.Color(33, 43, 65));
        botonReiniciar.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        botonReiniciar.setForeground(new java.awt.Color(255, 124, 172));
        botonReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reiniciar.png"))); // NOI18N
        botonReiniciar.setText("Reiniciar");
        botonReiniciar.setBorderPainted(false);
        botonReiniciar.setFocusPainted(false);
        botonReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonReiniciar.setOpaque(false);
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(botonReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 100, 30));

        txtGanador.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        txtGanador.setForeground(new java.awt.Color(255, 255, 255));
        txtGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGanador.setText("Ha ganado Jugador");
        jPanel1.add(txtGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, 30));

        jPanel2.setBackground(new java.awt.Color(94, 241, 128));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 20, 140));

        jPanel10.setBackground(new java.awt.Color(94, 241, 128));
        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 690, 10));

        jPanel3.setBackground(new java.awt.Color(94, 241, 128));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 20, 140));

        jPanel4.setBackground(new java.awt.Color(94, 241, 128));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 20, 140));

        jLabel5.setBackground(new java.awt.Color(33, 43, 65));
        jLabel5.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Creador: Alfredo Calle Aguilar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 690, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPiedraActionPerformed
        admin.eleccionMaquina(botonMaquina);
        admin.eleccionUsuario(botonJugador, "btn_piedra2.png");
    }//GEN-LAST:event_botonPiedraActionPerformed

    private void botonMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMaquinaActionPerformed

    private void botonTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTijeraActionPerformed
        admin.eleccionMaquina(botonMaquina);
        admin.eleccionUsuario(botonJugador, "btn_tijera2.png");
    }//GEN-LAST:event_botonTijeraActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReiniciarActionPerformed

    private void botonPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPapelActionPerformed
        admin.eleccionMaquina(botonMaquina);
        admin.eleccionUsuario(botonJugador, "btn_papel2.png");
    }//GEN-LAST:event_botonPapelActionPerformed

    public void setAdministrador(Administrador admin) {
        this.admin = admin;
    }
    /*
    public void eleccionMaquina() {
        String[] nombreImagenes = {"btn_papel2.png", "btn_piedra2.png", "btn_tijera2.png"};
        Random rd = new Random();
        int i = rd.nextInt(nombreImagenes.length);
        botonMaquina.setIcon(new ImageIcon(getClass().getResource("/images/" + nombreImagenes[i])));
        System.out.println("se activo eleccionMaquina");
    }
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
            java.util.logging.Logger.getLogger(VentanaPiedraPapelTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPiedraPapelTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPiedraPapelTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPiedraPapelTijera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPiedraPapelTijera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonJugador;
    private javax.swing.JButton botonMaquina;
    private javax.swing.JButton botonPapel;
    private javax.swing.JButton botonPiedra;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonTijera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtGanador;
    // End of variables declaration//GEN-END:variables

}
