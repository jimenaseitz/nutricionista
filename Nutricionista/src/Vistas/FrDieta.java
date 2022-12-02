/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Dieta;
import Entidades.Paciente;
import Persistencia.dietaData;
import Persistencia.pacienteData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sistema
 */
public class FrDieta extends javax.swing.JInternalFrame {

    private ArrayList<Paciente> listado;
    private pacienteData pasdata = new pacienteData();
    private Paciente pas = new Paciente();
    dietaData ddata = new dietaData();

    /**
     * Creates new form FxDieta
     */
    public FrDieta() {
        initComponents();
        this.combopacientes.addItem(pasdata.buscarPaciente(26912333));
        this.combopacientes.addItem(pasdata.buscarPaciente(33825432));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combopacientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        girlddieta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        combopacientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combopacientesFocusLost(evt);
            }
        });
        combopacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopacientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Paciente");

        jLabel2.setText("Dietas del Paciente");

        jButton1.setText("AramarGrilla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        girlddieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha Inicio", "Fecha Fin", "Peso Buscado", "Peso Inicial", "Limite Calórico"
            }
        ));
        jScrollPane1.setViewportView(girlddieta);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Calorias"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                            .addComponent(combopacientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton1)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        armarGrillaMaterias();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void combopacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesActionPerformed

    private void combopacientesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combopacientesFocusLost

pas=(Paciente)this.combopacientes.getSelectedItem();

        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesFocusLost
    private void armarGrillaMaterias() {
        ArrayList<Dieta> templm = new ArrayList();
        templm = ddata.buscarDietasxPaciente(pas);
        String datos[] = new String[5];
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        modelo.setNumRows(0);
        for (Dieta aux : templm) {
            datos[0] = aux.getInicioDieta().toString();
            datos[1] = aux.getFinDieta().toString();
            datos[2] = aux.getPesoBuscado() + "";
            datos[3] = aux.getPesoInicial() + "";
            datos[4] = aux.getLimiteCalorico() + "";
            modelo.addRow(datos);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> combopacientes;
    private javax.swing.JTable girlddieta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
