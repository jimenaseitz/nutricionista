/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import Persistencia.comidaData;
import Persistencia.dietaData;
import Persistencia.itemComidasData;
import Persistencia.pacienteData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    private Dieta die = new Dieta();
    itemComidasData icomdata = new itemComidasData();
    int codigo, sumacalorias;

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
        GirldComidas = new javax.swing.JTable();

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "codigo", "Fecha Inicio", "Fecha Fin", "Peso Buscado", "Peso Inicial", "Limite Calórico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(girlddieta);

        GirldComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "cod", "Nombre", "Calorias"
            }
        ));
        jScrollPane2.setViewportView(GirldComidas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                            .addComponent(combopacientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jButton1)
                .addGap(197, 197, 197))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        armarGrillaDieta();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void combopacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopacientesActionPerformed

        
    }//GEN-LAST:event_combopacientesActionPerformed

    private void combopacientesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combopacientesFocusLost

        pas = (Paciente) this.combopacientes.getSelectedItem();

        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesFocusLost
    private void armarGrillaDieta() {
        ArrayList<Dieta> templm = new ArrayList();
        templm = ddata.buscarDietasxPaciente(pas);
        sumacalorias = 0;
        System.out.println("----dietas seleccionadas:");
        System.out.println(templm);
        
        String datos[] = new String[6];
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        modelo.setNumRows(0);
        for (Dieta aux  : templm) {
            datos[0] = aux.getId_Dieta()+"";
            datos[1] = aux.getInicioDieta().toString();
            datos[2] = aux.getFinDieta().toString();
            datos[3] = aux.getPesoBuscado() + "";
            datos[4] = aux.getPesoInicial() + "";
            datos[5] = aux.getLimiteCalorico() + "";
            modelo.addRow(datos);
        }

/*
//      codigo = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));    
//    armarGrillaComidas(1);
    JOptionPane.showInputDialog(this, "valor enviado: " + codigo);
    }

    private void armarGrillaComidas(int Codigo) {

        ArrayList<Comida> templc = new ArrayList();
        templc = icomdata.obtenerComidasporDieta(codigo);
        String datos[] = new String[3];
        DefaultTableModel modeloc = (DefaultTableModel) this.girlddieta.getModel();
        modeloc.setNumRows(0);
        sumacalorias = 0;
        for (Comida aux : templc) {
            datos[0] = aux.getId_comida() + "";
            datos[1] = aux.getNombre();
            datos[2] = aux.getCalorias() + "";
            modeloc.addRow(datos);
            sumacalorias = sumacalorias + aux.getCalorias();
        }
*/
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GirldComidas;
    private javax.swing.JComboBox<Paciente> combopacientes;
    private javax.swing.JTable girlddieta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
