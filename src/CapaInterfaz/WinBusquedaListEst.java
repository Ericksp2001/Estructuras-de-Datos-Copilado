/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CapaInterfaz;


import EstDatosNormales.ColaEst;
import EstEnlacesDobles.ClsListDim2;
import EstEnlacesDobles.ClsNodo2;
import EstEnlacesDobles.ClsPilaDim2;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author Erick Perez
 */
public class WinBusquedaListEst extends javax.swing.JPanel {

    ClsListDim2 lista;
    ClsNodo2 aux=new ClsNodo2(); 
    ColaEst cola;

    

     
    public WinBusquedaListEst(ClsListDim2 list){
        initComponents();
        this.lista=list;
        setSize(720, 530);
        cola = new ColaEst(lista.nelem());
        aux = lista.cabizq().enlder();
        while(aux!=null){
            cola.encolar(aux.inf());
            aux = aux.enlder();
        }
    }

   
    public void buscar(JTextArea Area, String texto) {
        
        
        
        if (texto.length() >= 1 ) {
        if (cola.getCola().buscarMascota(texto)==true || cola.getCola().buscarIdDueño(texto)==true || cola.getCola().buscarDueño(texto)==true){
             
            DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
            Highlighter h = Area.getHighlighter();
            h.removeAllHighlights();
            String textoArea = Area.getText();
            String caracteres = texto;
            Pattern p = Pattern.compile("(?i)" + caracteres);
            Matcher m = p.matcher(textoArea);
            while (m.find()) {
                try {
                    h.addHighlight(m.start(), m.end(), highlightPainter);
                } catch (BadLocationException ex) {
                    System.out.println("Un error ha ocurrido");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El ususario no esta registro");
        }
        
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingresa la palabra a buscar");
        }
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGroup1 = new javax.swing.ButtonGroup();
        content = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        cmpBuscar = new javax.swing.JTextField();
        btnMascota = new javax.swing.JRadioButton();
        btnDueño = new javax.swing.JRadioButton();
        btnId = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        imgFondo = new javax.swing.JLabel();

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 160, 320));
        content.add(cmpBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 30));

        botonGroup1.add(btnMascota);
        btnMascota.setForeground(new java.awt.Color(0, 0, 0));
        btnMascota.setText("Nombre Mascota");
        btnMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotaActionPerformed(evt);
            }
        });
        content.add(btnMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        botonGroup1.add(btnDueño);
        btnDueño.setForeground(new java.awt.Color(0, 0, 0));
        btnDueño.setText("Nombre Dueño");
        btnDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDueñoActionPerformed(evt);
            }
        });
        content.add(btnDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        botonGroup1.add(btnId);
        btnId.setForeground(new java.awt.Color(0, 0, 0));
        btnId.setText("Id Dueño");
        btnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdActionPerformed(evt);
            }
        });
        content.add(btnId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton2.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        content.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, 60));

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/fondo_3.png"))); // NOI18N
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

    private void btnMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotaActionPerformed
          txtArea.setText(cola.getCola().InfoMascotas());
    }//GEN-LAST:event_btnMascotaActionPerformed

    private void btnDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDueñoActionPerformed
        txtArea.setText(cola.getCola().InfoDueños());
    }//GEN-LAST:event_btnDueñoActionPerformed

    private void btnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdActionPerformed
        txtArea.setText(cola.getCola().InfoIdDueños());
    }//GEN-LAST:event_btnIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String busqueda  = cmpBuscar.getText();
   
        if(btnDueño.isSelected()){
            buscar(txtArea,busqueda);
        }
        if(btnMascota.isSelected()){
            buscar(txtArea,busqueda);
        }
        if(btnId.isSelected()){
            buscar(txtArea,busqueda);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    public JPanel getContent() {
        return content;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonGroup1;
    private javax.swing.JRadioButton btnDueño;
    private javax.swing.JRadioButton btnId;
    private javax.swing.JRadioButton btnMascota;
    private javax.swing.JTextField cmpBuscar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
