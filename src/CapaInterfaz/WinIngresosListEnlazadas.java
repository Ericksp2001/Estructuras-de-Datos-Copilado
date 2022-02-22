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
public class WinIngresosListEnlazadas extends javax.swing.JPanel {

    
    ClsListDim2 lista;
    ClsNodo2 aux=new ClsNodo2(); 
    ClsVeterinaria datos;

    
    public WinIngresosListEnlazadas(ClsListDim2 list) {
        initComponents();
   
        this.lista=list;
        setSize(720, 530);
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
        cmpFechaIngreso = new javax.swing.JTextField();
        txtPeso = new javax.swing.JLabel();
        cmpEdad = new javax.swing.JTextField();
        txtEdad = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        cmpTelefono = new javax.swing.JTextField();
        cmpId = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        txtCosto = new javax.swing.JLabel();
        cmpCosto = new javax.swing.JTextField();
        btnMacho = new javax.swing.JRadioButton();
        btnHembra = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtCosto1 = new javax.swing.JLabel();
        cmpPosicion = new javax.swing.JTextField();
        txtNomMas1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        imgFondo = new javax.swing.JLabel();

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        content.add(cmpRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, -1));
        content.add(cmpNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 100, -1));
        content.add(cmpNombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 120, -1));

        txtRaza.setBackground(new java.awt.Color(0, 0, 0));
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.setText("Especie:");
        content.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        txtNomDue.setBackground(new java.awt.Color(0, 0, 0));
        txtNomDue.setForeground(new java.awt.Color(0, 0, 0));
        txtNomDue.setText("Nombre Dueño:");
        content.add(txtNomDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 20));

        txtNomMas.setBackground(new java.awt.Color(0, 0, 0));
        txtNomMas.setForeground(new java.awt.Color(0, 0, 0));
        content.add(txtNomMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));
        content.add(cmpFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 100, -1));

        txtPeso.setBackground(new java.awt.Color(0, 0, 0));
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setText("Fecha Ingreso:");
        content.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));
        content.add(cmpEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 100, -1));

        txtEdad.setBackground(new java.awt.Color(0, 0, 0));
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setText("Edad:");
        content.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        txtTelefono.setBackground(new java.awt.Color(0, 0, 0));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setText("Telefono:");
        content.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, 20));
        content.add(cmpTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, -1));
        content.add(cmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 120, -1));

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setText("ID:");
        content.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 190, 20, 20));

        txtCosto.setBackground(new java.awt.Color(0, 0, 0));
        txtCosto.setForeground(new java.awt.Color(0, 0, 0));
        txtCosto.setText("Posicion:");
        content.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, 20));
        content.add(cmpCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 120, -1));

        Group1.add(btnMacho);
        btnMacho.setForeground(new java.awt.Color(0, 0, 0));
        btnMacho.setText("Macho");
        content.add(btnMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        Group1.add(btnHembra);
        btnHembra.setForeground(new java.awt.Color(0, 0, 0));
        btnHembra.setText("Hembra");
        content.add(btnHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton2.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        content.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 130, 60));

        txtCosto1.setBackground(new java.awt.Color(0, 0, 0));
        txtCosto1.setForeground(new java.awt.Color(0, 0, 0));
        txtCosto1.setText("Costo:");
        content.add(txtCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 20));
        content.add(cmpPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 120, -1));

        txtNomMas1.setBackground(new java.awt.Color(0, 0, 0));
        txtNomMas1.setForeground(new java.awt.Color(0, 0, 0));
        txtNomMas1.setText("Nombre Mascota:");
        content.add(txtNomMas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, 300));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton2.setText("INGRESAR");
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton2.jpg"))); // NOI18N
        content.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 370, 120, 40));

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/fondo_1.png"))); // NOI18N
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  datos= new ClsVeterinaria();
           try {
            if (lista.Buscar(cmpId.getText()) > -1) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
            } else {
                datos.NombreMascota(cmpNombreM.getText());
                datos.CostoFactura(Double.parseDouble(cmpCosto.getText()));
                datos.EdadMascota(Integer.parseInt(cmpEdad.getText()));
                datos.IdDueño(cmpId.getText());
                datos.NombreDueño(cmpNombreD.getText());
                datos.FechaIngreso(cmpFechaIngreso.getText());
                datos.RazaMascota(cmpRaza.getText());
                datos.SexoMascota();
                datos.Telefono(cmpTelefono.getText());
                if(btnMacho.isSelected()){
                datos.SexoMascota(btnMacho.getText());
                }else{
                datos.SexoMascota(btnHembra.getText());    
                }
                lista.poner(Integer.parseInt(cmpPosicion.getText()), datos, true);
                txtArea.setText(lista.listar2());
                JOptionPane.showMessageDialog(null, "Registro Procesado exitosamente");
              }
                cmpNombreM.setText(null);
                cmpCosto.setText(null);
                cmpEdad.setText(null);
                cmpId.setText(null);
                cmpNombreD.setText(null);
                cmpFechaIngreso.setText(null);
                cmpRaza.setText(null);
                cmpTelefono.setText(null);
               
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar los datos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public JPanel getContent() {
        return content;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group1;
    private javax.swing.JRadioButton btnHembra;
    private javax.swing.JRadioButton btnMacho;
    private javax.swing.JTextField cmpCosto;
    private javax.swing.JTextField cmpEdad;
    private javax.swing.JTextField cmpFechaIngreso;
    private javax.swing.JTextField cmpId;
    private javax.swing.JTextField cmpNombreD;
    private javax.swing.JTextField cmpNombreM;
    private javax.swing.JTextField cmpPosicion;
    private javax.swing.JTextField cmpRaza;
    private javax.swing.JTextField cmpTelefono;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtCosto1;
    private javax.swing.JLabel txtEdad;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtNomDue;
    private javax.swing.JLabel txtNomMas;
    private javax.swing.JLabel txtNomMas1;
    private javax.swing.JLabel txtPeso;
    private javax.swing.JLabel txtRaza;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
