/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CapaInterfaz;


import EstDatosNormales.ColaEst;
import EstEnlacesDobles.ClsListDim2;
import EstEnlacesDobles.ClsNodo2;


import javax.swing.*;


/**
 *
 * @author Erick Perez, Alexa Amaguaya
 * 22/02/2022
 */
public class WinCreditos extends javax.swing.JPanel {

    ClsListDim2 lista;
    ClsNodo2 aux=new ClsNodo2(); 
    ColaEst cola;

    

     
    public WinCreditos(){
        initComponents();
     
        setSize(720, 530);
       
 }

  


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGroup1 = new javax.swing.ButtonGroup();
        content = new javax.swing.JPanel();
        imgFondo = new javax.swing.JLabel();

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/fondo_5.png"))); // NOI18N
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

    public JPanel getContent() {
        return content;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonGroup1;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgFondo;
    // End of variables declaration//GEN-END:variables
}
