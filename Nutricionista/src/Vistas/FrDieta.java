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
    private ArrayList <Comida> listadocomida;
    private pacienteData pasdata = new pacienteData();
    private Paciente pas = new Paciente();
    dietaData ddata = new dietaData();
    private Dieta die = new Dieta();
    itemComidasData icomdata = new itemComidasData();
    comidaData cdata =new comidaData();
    int cod, sumacalorias;

    /**
     * Creates new form FxDieta
     */
    public FrDieta() {
        initComponents();
        this.combopacientes.addItem(pasdata.buscarPacientexDNI(26912333));
        this.combopacientes.addItem(pasdata.buscarPacientexDNI(33825432));
        
//        for (Comida aux : listadocomida) {
//            this.combocomida.addItem(title);
            
 //       }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combopacientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        combocomida = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        GirldComidas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSumacalComidas = new javax.swing.JTextPane();
        bagregaradieta = new java.awt.Button();
        bquitarcomida = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        girlddieta = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        combopacientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combopacientesItemStateChanged(evt);
            }
        });
        combopacientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combopacientesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combopacientesFocusLost(evt);
            }
        });
        combopacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopacientesActionPerformed(evt);
            }
        });
        combopacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                combopacientesKeyReleased(evt);
            }
        });

        jLabel1.setText("Paciente");

        jButton1.setText("AramarGrilla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        combocomida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jLabel3.setText("Calorias Actuales en comidas");

        jScrollPane3.setViewportView(txtSumacalComidas);

        bagregaradieta.setLabel("Agregar Comida a Dieta");
        bagregaradieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregaradietaActionPerformed(evt);
            }
        });

        bquitarcomida.setActionCommand("buttom2");
        bquitarcomida.setLabel("Quitar Comida de Dieta");
        bquitarcomida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquitarcomidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combocomida, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bagregaradieta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(bquitarcomida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(combocomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bagregaradieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bquitarcomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jLabel2.setText("Dietas del Paciente");

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
        girlddieta.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                girlddietaHierarchyChanged(evt);
            }
        });
        girlddieta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                girlddietaFocusGained(evt);
            }
        });
        girlddieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girlddietaMouseClicked(evt);
            }
        });
        girlddieta.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                girlddietaCaretPositionChanged(evt);
            }
        });
        girlddieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                girlddietaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                girlddietaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(girlddieta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton1)
                        .addGap(68, 68, 68)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jButton2)))
                        .addGap(295, 295, 295))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        armarGrillaDieta();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void combopacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopacientesActionPerformed
                pas = (Paciente) this.combopacientes.getSelectedItem();
         //obtengo valor calorias y saco codigo de calorias
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        if (this.girlddieta.getSelectedRow() != -1) {//me fijo si seleleccionó materia desde el grid
            cod = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));
            armarGrillaComidas(cod);
        }else {
            cod=0;
            armarGrillaComidas(cod);
        }
        this.txtSumacalComidas.setText(sumacalorias + "");
        //
        


        
        
    }//GEN-LAST:event_combopacientesActionPerformed

    private void combopacientesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combopacientesFocusLost

        pas = (Paciente) this.combopacientes.getSelectedItem();
cod=0;

        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesFocusLost

    private void girlddietaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_girlddietaKeyPressed

    }//GEN-LAST:event_girlddietaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //obtengo valor calorias y saco codigo de calorias
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        if (this.girlddieta.getSelectedRow() != -1) {//me fijo si seleleccionó materia desde el grid
            cod = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));
            armarGrillaComidas(cod);
        }
        this.txtSumacalComidas.setText(sumacalorias + "");
        //
    }//GEN-LAST:event_jButton2ActionPerformed

    private void girlddietaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_girlddietaFocusGained

    }//GEN-LAST:event_girlddietaFocusGained

    private void girlddietaHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_girlddietaHierarchyChanged
    }//GEN-LAST:event_girlddietaHierarchyChanged

    private void girlddietaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_girlddietaKeyReleased
        //obtengo valor calorias y saco codigo de calorias
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        if (this.girlddieta.getSelectedRow() != -1) {//me fijo si seleleccionó materia desde el grid
            cod = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));
            armarGrillaComidas(cod);
        }
        this.txtSumacalComidas.setText(sumacalorias + "");
        //

    }//GEN-LAST:event_girlddietaKeyReleased

    private void girlddietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girlddietaMouseClicked
        //obtengo valor calorias y saco codigo de calorias
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        if (this.girlddieta.getSelectedRow() != -1) {//me fijo si seleleccionó materia desde el grid
            cod = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));
            armarGrillaComidas(cod);
        }
        this.txtSumacalComidas.setText(sumacalorias + "");
        //

    }//GEN-LAST:event_girlddietaMouseClicked

    private void girlddietaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_girlddietaCaretPositionChanged

    }//GEN-LAST:event_girlddietaCaretPositionChanged

    private void combopacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combopacientesKeyReleased
        armarGrillaDieta();
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesKeyReleased

    private void combopacientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combopacientesItemStateChanged

        // TODO add your handling code here:ar
    }//GEN-LAST:event_combopacientesItemStateChanged

    private void combopacientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combopacientesFocusGained


    // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesFocusGained

    private void bagregaradietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregaradietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagregaradietaActionPerformed

    private void bquitarcomidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bquitarcomidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bquitarcomidaActionPerformed
    private void armarGrillaDieta() {
        ArrayList<Dieta> templm = new ArrayList();
        templm = ddata.buscarDietasxPaciente(pas);
        String datos[] = new String[6];
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        modelo.setNumRows(0);
        for (Dieta aux : templm) {
            datos[0] = aux.getId_Dieta() + "";
            datos[1] = aux.getInicioDieta().toString();
            datos[2] = aux.getFinDieta().toString();
            datos[3] = aux.getPesoBuscado() + "";
            datos[4] = aux.getPesoInicial() + "";
            datos[5] = aux.getLimiteCalorico() + "";
            modelo.addRow(datos);
        }

    }

    private void armarGrillaComidas(int codigo) {

        ArrayList<Comida> templc = new ArrayList();
        templc = icomdata.obtenerComidasporDieta(codigo);
        String datos[] = new String[3];
        DefaultTableModel modeloc = (DefaultTableModel) this.GirldComidas.getModel();
        modeloc.setNumRows(0);
        sumacalorias = 0;
        for (Comida aux : templc) {
            datos[0] = aux.getId_comida() + "";
            datos[1] = aux.getNombre();
            datos[2] = aux.getCalorias() + "";
            modeloc.addRow(datos);
            sumacalorias = sumacalorias + aux.getCalorias();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GirldComidas;
    private java.awt.Button bagregaradieta;
    private java.awt.Button bquitarcomida;
    private javax.swing.JComboBox<String> combocomida;
    private javax.swing.JComboBox<Paciente> combopacientes;
    private javax.swing.JTable girlddieta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane txtSumacalComidas;
    // End of variables declaration//GEN-END:variables
}
