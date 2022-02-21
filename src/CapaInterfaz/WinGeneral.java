/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaInterfaz;



import ClsVeterinaria.ClsVeterinaria;
import EstEnlacesDobles.ClsListDim2;
import EstEnlacesDobles.ClsPilaDim2;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Erick Perez
 */
public class WinGeneral extends javax.swing.JFrame {

  ClsPilaDim2 pila;
  WinIngresosPila win1;
  WinPacientesListEst win2;
  WinVisualizarGrafo win3;
    
  
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
        btnVisualizar = new javax.swing.JMenuItem();
        Creditos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Bienvenida.png"))); // NOI18N
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

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        Opciones.add(btnVisualizar);

        Menu.add(Opciones);

        Creditos.setText("Creditos");
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
        win2 = new WinPacientesListEst(pila);
        showPanel(win2.getContent());
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoActionPerformed
       pila=new ClsPilaDim2(); 
       win1=new WinIngresosPila(pila);
        showPanel(win1.getContent());
    }//GEN-LAST:event_IngresoActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
       win3=new WinVisualizarGrafo(pila);
       showPanel(win3.getContent());
    }//GEN-LAST:event_btnVisualizarActionPerformed

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
    // End of variables declaration//GEN-END:variables
}
