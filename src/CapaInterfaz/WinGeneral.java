/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaInterfaz;




import EstEnlacesDobles.ClsListDim2;

import javax.swing.JPanel;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Erick Perez, Alexa Amaguaya
 * 22/02/2022
 */
public class WinGeneral extends javax.swing.JFrame {

  ClsListDim2  lista=new ClsListDim2() ;
  WinIngresosListEnlazadas win1;
  WinPacientesListEst win2;
  WinVisualizarGrafo win3;
  WinBusquedaListEst win4;
    WinCreditos win5;
  
    public WinGeneral( ) {
        initComponents();
        setLocationRelativeTo(null);
        setSize(716, 548);
    }

       
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        imgBienvenido = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        Opciones = new javax.swing.JMenu();
        Ingreso = new javax.swing.JMenuItem();
        btnPacientes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnVisualizar = new javax.swing.JMenuItem();
        Creditos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/fondo_4.png"))); // NOI18N
        content.add(imgBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 720, 530));

        Opciones.setText("Opciones");

        Ingreso.setText("Ingreso");
        Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoActionPerformed(evt);
            }
        });
        Opciones.add(Ingreso);

        btnPacientes.setText("Pacientes");
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });
        Opciones.add(btnPacientes);

        jMenuItem1.setText("Buscar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Opciones.add(jMenuItem1);

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        Opciones.add(btnVisualizar);

        Menu.add(Opciones);

        Creditos.setText("Creditos");
        Creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreditosMouseClicked(evt);
            }
        });
        Menu.add(Creditos);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        win2 = new WinPacientesListEst(lista);
        showPanel(win2.getContent());
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoActionPerformed
      
       win1=new WinIngresosListEnlazadas(lista);
        showPanel(win1.getContent());
    }//GEN-LAST:event_IngresoActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
       win3=new WinVisualizarGrafo(lista);
       showPanel(win3.getContent());
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            win4=new WinBusquedaListEst(lista);
       showPanel(win4.getContent());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditosMouseClicked
       win5=new WinCreditos();
       showPanel(win5.getContent());
    }//GEN-LAST:event_CreditosMouseClicked

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
            java.util.logging.Logger.getLogger(WinGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinGeneral().setVisible(true);
            }
        });
    }
    
    private void showPanel(JPanel p) {
        p.setSize(720, 530);
        p.setLocation(0, 0);
        content.removeAll();
        content.add(p, new AbsoluteConstraints(0, 0, -1, -1));
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Creditos;
    private javax.swing.JMenuItem Ingreso;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Opciones;
    private javax.swing.JMenuItem btnPacientes;
    private javax.swing.JMenuItem btnVisualizar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgBienvenido;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
