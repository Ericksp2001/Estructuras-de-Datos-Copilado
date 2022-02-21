/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CapaInterfaz;


import EstDatosNormales.ColaEst;
import EstEnlacesDobles.ClsNodo2;
import EstEnlacesDobles.ClsPilaDim2;

import javax.swing.JPanel;

/**
 *
 * @author Erick Perez
 */
public class WinBusqueda extends javax.swing.JPanel {

    ClsPilaDim2 pila;
    ClsNodo2 aux=new ClsNodo2(); 
    ColaEst cola;

    

     
    public WinBusqueda(ClsPilaDim2 pil){
        initComponents();
        this.pila=pil;
        setSize(720, 530);
        cola = new ColaEst(pila.nelem());
        aux = pil.CabIzq().enlder();
        while(aux!=null){
            cola.encolar(aux.inf());
            aux = aux.enlder();
        }
    }

   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        content = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmpResultados = new javax.swing.JTextArea();
        btnBusqueda = new javax.swing.JButton();
        cmpBuscar = new javax.swing.JTextField();
        btnMascota = new javax.swing.JRadioButton();
        btnDueño = new javax.swing.JRadioButton();
        btnRaza = new javax.swing.JRadioButton();
        btnId = new javax.swing.JRadioButton();
        imgFondo = new javax.swing.JLabel();

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmpResultados.setColumns(20);
        cmpResultados.setRows(5);
        jScrollPane1.setViewportView(cmpResultados);

        content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 270));

        btnBusqueda.setText("Buscar");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        content.add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 100, 30));
        content.add(cmpBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 180, 30));

        btnMascota.setForeground(new java.awt.Color(0, 0, 0));
        btnMascota.setText("Nombre Mascota");
        btnMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotaActionPerformed(evt);
            }
        });
        content.add(btnMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        btnDueño.setForeground(new java.awt.Color(0, 0, 0));
        btnDueño.setText("Nombre Dueño");
        content.add(btnDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        btnRaza.setForeground(new java.awt.Color(0, 0, 0));
        btnRaza.setText("Raza");
        content.add(btnRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        btnId.setForeground(new java.awt.Color(0, 0, 0));
        btnId.setText("Id Dueño");
        content.add(btnId, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

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

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        cmpResultados.setText("");
        String busqueda  = cmpBuscar.getText();
        String res;
        if(btnDueño.isSelected()){
            res = cola.getCola().buscarDueño(busqueda);
        }else if(btnRaza.isSelected()){
            res = cola.getCola().buscarRaza(busqueda);
        }else if(btnId.isSelected()){
            res = cola.getCola().buscarIdDueño(busqueda);
        }else{
            res = cola.getCola().buscarMascota(busqueda);
        }
        cmpResultados.setText(res);
        cmpBuscar.setText("");
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMascotaActionPerformed

    public JPanel getContent() {
        return content;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JRadioButton btnDueño;
    private javax.swing.JRadioButton btnId;
    private javax.swing.JRadioButton btnMascota;
    private javax.swing.JRadioButton btnRaza;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cmpBuscar;
    private javax.swing.JTextArea cmpResultados;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
