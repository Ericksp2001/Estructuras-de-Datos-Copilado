/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CapaInterfaz;


import ClsVeterinaria.ClsVeterinaria;
import EstEnlacesDobles.ClsListDim2;
import EstEnlacesDobles.ClsNodo2;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

/**
 *
 * @author Erick Perez
 */
public class WinPacientesListEst extends javax.swing.JPanel {

    ClsListDim2 lista;
    ClsNodo2 aux=new ClsNodo2(); 
    ClsVeterinaria datos;
    private DefaultListModel lista1 = new DefaultListModel();
    
   
    public WinPacientesListEst(   ClsListDim2   list) {
        
        initComponents();
        ListInf.setModel(lista1);
        this.lista=list;
        setSize(720, 530);
    }

       
       public void listar(){
        
        lista1.clear();
        aux = lista.cabizq();
        aux=aux.enlder();
        for (int i = 0; i < lista.nelem(); i++) {
            lista1.addElement((i + 1) + "           " + aux.inf().NombreDueño()+ "                  "
                + aux.inf().IdDueño() + "        " + aux.inf().NombreMascota()
                +"         "+aux.inf().CostoFactura());
            aux = aux.enlder();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        btnVisualizar = new javax.swing.JPanel();
        txtVisualizar = new javax.swing.JLabel();
        btnSalida = new javax.swing.JPanel();
        txtSalida = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListInf = new javax.swing.JList<>();
        imgFondo = new javax.swing.JLabel();

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseExited(evt);
            }
        });

        txtVisualizar.setBackground(new java.awt.Color(255, 255, 255));
        txtVisualizar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtVisualizar.setForeground(new java.awt.Color(0, 0, 0));
        txtVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVisualizar.setText("Visualizar");
        txtVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVisualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnVisualizarLayout = new javax.swing.GroupLayout(btnVisualizar);
        btnVisualizar.setLayout(btnVisualizarLayout);
        btnVisualizarLayout.setHorizontalGroup(
            btnVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        btnVisualizarLayout.setVerticalGroup(
            btnVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        content.add(btnVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, 50));

        btnSalida.setBackground(new java.awt.Color(255, 255, 255));
        btnSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalidaMouseExited(evt);
            }
        });

        txtSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtSalida.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(0, 0, 0));
        txtSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalida.setText("Marcar salida");

        javax.swing.GroupLayout btnSalidaLayout = new javax.swing.GroupLayout(btnSalida);
        btnSalida.setLayout(btnSalidaLayout);
        btnSalidaLayout.setHorizontalGroup(
            btnSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        btnSalidaLayout.setVerticalGroup(
            btnSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        content.add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 200, 50));

        jScrollPane2.setViewportView(ListInf);

        content.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 350, 380));

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/fondo.png"))); // NOI18N
        content.add(imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseEntered
        btnVisualizar.setBackground(new Color(0, 160, 230));
        txtVisualizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnVisualizarMouseEntered

    private void btnVisualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseExited
        btnVisualizar.setBackground(Color.WHITE);
        txtVisualizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnVisualizarMouseExited

    private void btnSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseEntered
        btnSalida.setBackground(new Color(0, 160, 230));
        txtSalida.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSalidaMouseEntered

    private void btnSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseExited
        btnSalida.setBackground(Color.WHITE);
        txtSalida.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalidaMouseExited

    private void txtVisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVisualizarMouseClicked
    listar();
    }//GEN-LAST:event_txtVisualizarMouseClicked

    public JPanel getContent() {
        return content;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListInf;
    private javax.swing.JPanel btnSalida;
    private javax.swing.JPanel btnVisualizar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtSalida;
    private javax.swing.JLabel txtVisualizar;
    // End of variables declaration//GEN-END:variables
}
