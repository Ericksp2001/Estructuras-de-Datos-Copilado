/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CapaInterfaz;


import ClsVeterinaria.*;

import EstEnlacesDobles.*;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Erick Perez
 */
public class WinIngresosPila extends javax.swing.JPanel {

    
     ClsListDim2 lista;
    ClsNodo2 aux=new ClsNodo2(); 
    ClsVeterinaria datos;
    private DefaultListModel lista1 = new DefaultListModel();
    
    public WinIngresosPila(   ClsListDim2 list) {
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
                + aux.inf().IdDueño());
            aux = aux.enlder();
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group1 = new javax.swing.ButtonGroup();
        content = new javax.swing.JPanel();
        cmpRaza = new javax.swing.JTextField();
        cmpNombreM = new javax.swing.JTextField();
        cmpNombreD = new javax.swing.JTextField();
        txtRaza = new javax.swing.JLabel();
        txtNomDue = new javax.swing.JLabel();
        txtNomMas = new javax.swing.JLabel();
        cmpPeso = new javax.swing.JTextField();
        txtPeso = new javax.swing.JLabel();
        cmpEdad = new javax.swing.JTextField();
        txtEdad = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        cmpTelefono = new javax.swing.JTextField();
        cmpId = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        cmpPosicion = new javax.swing.JTextField();
        txtCosto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmpCosto = new javax.swing.JTextField();
        btnMacho = new javax.swing.JRadioButton();
        btnHembra = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListInf = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        imgFondo = new javax.swing.JLabel();

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        content.add(cmpRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, -1));
        content.add(cmpNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 100, -1));
        content.add(cmpNombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, -1));

        txtRaza.setBackground(new java.awt.Color(0, 0, 0));
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.setText("Raza:");
        content.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 20));

        txtNomDue.setBackground(new java.awt.Color(0, 0, 0));
        txtNomDue.setForeground(new java.awt.Color(0, 0, 0));
        txtNomDue.setText("Nombre Dueño:");
        content.add(txtNomDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 20));

        txtNomMas.setBackground(new java.awt.Color(0, 0, 0));
        txtNomMas.setForeground(new java.awt.Color(0, 0, 0));
        txtNomMas.setText("Nombre Mascota:");
        content.add(txtNomMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));
        content.add(cmpPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 100, -1));

        txtPeso.setBackground(new java.awt.Color(0, 0, 0));
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setText("Peso Mascota:");
        content.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));
        content.add(cmpEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 100, -1));

        txtEdad.setBackground(new java.awt.Color(0, 0, 0));
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setText("Edad:");
        content.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 20));

        txtTelefono.setBackground(new java.awt.Color(0, 0, 0));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setText("Telefono:");
        content.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, 20));
        content.add(cmpTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 120, -1));
        content.add(cmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 120, -1));

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setText("ID:");
        content.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 20));

        cmpPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpPosicionActionPerformed(evt);
            }
        });
        content.add(cmpPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 60, -1));

        txtCosto.setBackground(new java.awt.Color(0, 0, 0));
        txtCosto.setForeground(new java.awt.Color(0, 0, 0));
        txtCosto.setText("Costo:");
        content.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Posicion:");
        content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));
        content.add(cmpCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 120, -1));

        Group1.add(btnMacho);
        btnMacho.setForeground(new java.awt.Color(0, 0, 0));
        btnMacho.setText("Macho");
        content.add(btnMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        Group1.add(btnHembra);
        btnHembra.setForeground(new java.awt.Color(0, 0, 0));
        btnHembra.setText("Hembra");
        content.add(btnHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jScrollPane1.setViewportView(ListInf);

        content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 170, 360));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/huella1.png"))); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/huella1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/huella2.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        content.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 120, 100));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/huella3.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/huella3.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/huella4.png"))); // NOI18N
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        content.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 120, 100));

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

    private void cmpPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpPosicionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  datos= new ClsVeterinaria();
           try {
               aux=lista.cabizq();
            if (lista.Buscar(cmpId.getText()) > -1) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
            } else {
                datos.NombreMascota(cmpNombreM.getText());
                datos.CostoFactura(Double.parseDouble(cmpCosto.getText()));
                datos.EdadMascota(Integer.parseInt(cmpEdad.getText()));
                datos.IdDueño(cmpId.getText());
                datos.NombreDueño(cmpNombreD.getText());
                datos.PesoMascota(Double.parseDouble(cmpPeso.getText()));
                datos.RazaMascota(cmpRaza.getText());
                datos.SexoMascota();
                datos.Telefono(cmpTelefono.getText());
                if(btnMacho.isSelected()){
                datos.SexoMascota(btnMacho.getText());
                }else{
                datos.SexoMascota(btnMacho.getText());    
                }
                lista.poner((Integer.parseInt(cmpPosicion.getText())), datos, true);
                JOptionPane.showMessageDialog(null, "Registro Procesado exitosamente");
              }
                cmpNombreM.setText(null);
                cmpCosto.setText(null);
                cmpEdad.setText(null);
                cmpId.setText(null);
                cmpNombreD.setText(null);
                cmpPeso.setText(null);
                cmpRaza.setText(null);
                cmpTelefono.setText(null);
                cmpPosicion.setText(null);
                listar();
                
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar los datos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {

            if (lista.sacar(ListInf.getSelectedIndex() + 1, true) == true) {
                JOptionPane.showMessageDialog(null, "Usuario sacado exitosamente");
                lista1.clear();
                ClsNodo2 aux = lista.cabizq().enlder();
                listar();

            } else {

                JOptionPane.showMessageDialog(null, "El Registro no existe");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar los datos");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    public JPanel getContent() {
        return content;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group1;
    private javax.swing.JList<String> ListInf;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JRadioButton btnHembra;
    private javax.swing.JRadioButton btnMacho;
    private javax.swing.JTextField cmpCosto;
    private javax.swing.JTextField cmpEdad;
    private javax.swing.JTextField cmpId;
    private javax.swing.JTextField cmpNombreD;
    private javax.swing.JTextField cmpNombreM;
    private javax.swing.JTextField cmpPeso;
    private javax.swing.JTextField cmpPosicion;
    private javax.swing.JTextField cmpRaza;
    private javax.swing.JTextField cmpTelefono;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtEdad;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtNomDue;
    private javax.swing.JLabel txtNomMas;
    private javax.swing.JLabel txtPeso;
    private javax.swing.JLabel txtRaza;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
