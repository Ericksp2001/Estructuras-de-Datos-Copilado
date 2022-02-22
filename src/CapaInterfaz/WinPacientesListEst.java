/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CapaInterfaz;


import EstEnlacesDobles.ClsListDim2;
import EstEnlacesDobles.ClsNodo2;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Erick Perez, Alexa Amaguaya
 * 22/02/2022
 */
public class WinPacientesListEst extends javax.swing.JPanel {

 ClsListDim2 lista;
 DefaultListModel Jlista = new DefaultListModel();
  ClsNodo2 aux=new ClsNodo2();
    
        
   
    public WinPacientesListEst(ClsListDim2 list) {
        
        initComponents();
        this.lista=list;
          setSize(720, 530);
      txtLista.setModel(Jlista);
      
    }
    
    
  public void listar(){
        Jlista.clear();
        aux = lista.cabizq();
        aux=aux.enlder();
       
            Jlista.addElement("Mascota"+ "       " + "Sexo"+ "       " 
                   +"Raza"+ "       " + "Fecha de Ingreso" + "       " +"Nombre Dueño");
        for (int i = 0; i < lista.nelem(); i++) {
           
            Jlista.addElement( aux.inf().NombreMascota() + "       " 
                    + aux.inf().SexoMascota()+ "       " + aux.inf().RazaMascota()
                    + "       " + aux.inf().FechaIngreso()+ "       "+aux.inf().NombreDueño());
            aux = aux.enlder();
        }
    }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imgFondo = new javax.swing.JLabel();

        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(txtLista);

        content.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 340, 390));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton1.setText("Visualizar");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton2.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        content.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 180, 60));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton2.setText("Marcar Salida");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton1.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/boton2.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        content.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 180, 60));

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/fondo_2.png"))); // NOI18N
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
       listar(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   try {

            if (lista.sacar(txtLista.getSelectedIndex(), true)) {

                JOptionPane.showMessageDialog(null, "Usuario sacado exitosamente");
                listar();

            } else {

                JOptionPane.showMessageDialog(null, "El Registro no existe");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar los datos");
        }     
    }//GEN-LAST:event_jButton2ActionPerformed

    public JPanel getContent() {
        return content;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> txtLista;
    // End of variables declaration//GEN-END:variables
}
