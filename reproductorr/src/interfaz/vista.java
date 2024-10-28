
package interfaz;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class vista extends javax.swing.JFrame {

    private ImageIcon  imagen;
    private Icon icono;
    
    public vista() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.pintarImagen(this.lab1, "src/fotos/Anterior.png");
        this.pintarImagen(this.lab2, "src/fotos/Pausa.png");
        this.pintarImagen(this.lab3, "src/fotos/Play.png");
        this.pintarImagen(this.lab4, "src/fotos/Siguiente.png");
        this.pintarImagen(this.lab5, "src/fotos/Carpeta.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lab4 = new javax.swing.JLabel();
        labImagen = new javax.swing.JLabel();
        bot1 = new javax.swing.JButton();
        bot2 = new javax.swing.JButton();
        bot3 = new javax.swing.JButton();
        bot4 = new javax.swing.JButton();
        btnplay5 = new javax.swing.JButton();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 70, 60));

        labImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(labImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 470, 320));

        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });
        jPanel1.add(bot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 90, 30));

        bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot2ActionPerformed(evt);
            }
        });
        jPanel1.add(bot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 90, 30));

        bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot3ActionPerformed(evt);
            }
        });
        jPanel1.add(bot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 100, 30));

        bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot4ActionPerformed(evt);
            }
        });
        jPanel1.add(bot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 100, 30));

        btnplay5.setText("Importar");
        btnplay5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplay5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnplay5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 50));

        lab1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 70, 50));

        lab2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 70, 50));

        lab3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 70, 50));

        lab5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 70, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/5.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 340));

        jMenu1.setText("Archivos");

        jMenuItem1.setText("Buscar imágenes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot1ActionPerformed

    private void bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot3ActionPerformed

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot4ActionPerformed

    private void btnplay5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplay5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnplay5ActionPerformed

    private void bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot2ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_bot2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
JFileChooser jfile= new JFileChooser();

int resultado = jfile.showOpenDialog(this);
if(resultado != JFileChooser.CANCEL_OPTION){
    File fileName = jfile.getSelectedFile();
    
    this.pintarImagen(labImagen, fileName.getAbsolutePath());
}
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });      

    }
    
    private void pintarImagen(JLabel lab, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lab.getWidth(),lab.getHeight(),Image.SCALE_DEFAULT));
        
        lab.setIcon(this.icono);
        this.repaint();
        
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot1;
    private javax.swing.JButton bot2;
    private javax.swing.JButton bot3;
    private javax.swing.JButton bot4;
    private javax.swing.JButton btnplay5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel labImagen;
    // End of variables declaration//GEN-END:variables

    private void putar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
