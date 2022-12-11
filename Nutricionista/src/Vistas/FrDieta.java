/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import Entidades.itemComidas;
import Persistencia.comidaData;
import Persistencia.dietaData;
import Persistencia.itemComidasData;
import Persistencia.pacienteData;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sistema
 */
public class FrDieta extends javax.swing.JInternalFrame {

    private ArrayList<Paciente> listado;
    private ArrayList<Comida> listadocomida;
    private pacienteData pasdata = new pacienteData();
    private Paciente pas = new Paciente();
    private dietaData ddata = new dietaData();
    private Dieta die = new Dieta();
    private itemComidasData icomdata = new itemComidasData();
    private comidaData cdata = new comidaData();
    private Comida comida = new Comida();
    private int cod,coddie, sumacalorias;
    int boton = 0;

    /**
     * Creates new form FxDieta
     */
    public FrDieta() {
        initComponents();

        listado = pasdata.buscarpacientes();
        for (Paciente paciente : listado) {
            this.combopacientes.addItem(paciente);
        }

        listadocomida = cdata.buscaComidasActivas();
        for (Comida aux : listadocomida) {
            this.combocomida.addItem(aux);

        }
        this.palenModificar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combopacientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        combocomida = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        GirldComidas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSumacalComidas = new javax.swing.JTextPane();
        bquitarcomida = new java.awt.Button();
        bagregaradieta = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        girlddieta = new javax.swing.JTable();
        palenModificar = new javax.swing.JPanel();
        txPesoBuscado = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        TxPesoInicial = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        labelfechafin = new java.awt.Label();
        txFechaFin = new java.awt.TextField();
        jtxFechaInicio = new com.toedter.calendar.JDateChooser();
        txLimiteCalorico = new java.awt.TextField();
        jButton3 = new javax.swing.JButton();
        guardarCambiosDieta = new javax.swing.JButton();
        bAltaDieta = new javax.swing.JButton();
        bModificarDieta = new javax.swing.JButton();
        beliminarDieta = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ALTA - BAJA - MODIFICACION DIETAS");

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
        combopacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combopacientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                combopacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                combopacientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combopacientesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                combopacientesMouseReleased(evt);
            }
        });
        combopacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopacientesActionPerformed(evt);
            }
        });
        combopacientes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                combopacientesPropertyChange(evt);
            }
        });
        combopacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combopacientesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                combopacientesKeyReleased(evt);
            }
        });
        combopacientes.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                combopacientesVetoableChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Paciente");

        jButton1.setText("Consultar Dietas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(GirldComidas);

        jLabel3.setText("Calorias Actuales en comidas");

        txtSumacalComidas.setBackground(new java.awt.Color(255, 255, 153));
        txtSumacalComidas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSumacalComidas.setForeground(new java.awt.Color(255, 255, 255));
        txtSumacalComidas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSumacalComidas.setEnabled(false);
        jScrollPane3.setViewportView(txtSumacalComidas);

        bquitarcomida.setActionCommand("buttom2");
        bquitarcomida.setLabel("Quitar Comida de Dieta");
        bquitarcomida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquitarcomidaActionPerformed(evt);
            }
        });

        bagregaradieta.setLabel("Agregar Comida a Dieta");
        bagregaradieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregaradietaActionPerformed(evt);
            }
        });

        jLabel6.setText("Listado de comidas que contiene la dieta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bagregaradieta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bquitarcomida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(combocomida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(combocomida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bagregaradieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bquitarcomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jLabel2.setText("Dietas del Paciente");

        girlddieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "Fecha Inicio", "Fecha Fin", "Peso Buscado", "Peso Inicial", "Limite Calórico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                girlddietaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        palenModificar.setBackground(new java.awt.Color(113, 178, 221));

        txPesoBuscado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txPesoBuscadoFocusLost(evt);
            }
        });

        label1.setText("Peso Buscado");

        label2.setText("Peso Inicial");

        TxPesoInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxPesoInicialFocusLost(evt);
            }
        });
        TxPesoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxPesoInicialActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Inicio");

        label4.setText("Limite Calórico");

        labelfechafin.setText("Fecha Finalizacion");

        txFechaFin.setEditable(false);

        jtxFechaInicio.setDateFormatString("yyyy-MM-dd");
        jtxFechaInicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtxFechaInicioPropertyChange(evt);
            }
        });

        txLimiteCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLimiteCaloricoActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        guardarCambiosDieta.setText("Guardar Cambios");
        guardarCambiosDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosDietaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout palenModificarLayout = new javax.swing.GroupLayout(palenModificar);
        palenModificar.setLayout(palenModificarLayout);
        palenModificarLayout.setHorizontalGroup(
            palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palenModificarLayout.createSequentialGroup()
                .addGroup(palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(palenModificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(palenModificarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(palenModificarLayout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txLimiteCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(palenModificarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(palenModificarLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(guardarCambiosDieta))
                                    .addGroup(palenModificarLayout.createSequentialGroup()
                                        .addGap(231, 231, 231)
                                        .addComponent(jButton3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, palenModificarLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        palenModificarLayout.setVerticalGroup(
            palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palenModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txLimiteCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelfechafin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19)
                .addGroup(palenModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(guardarCambiosDieta))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        bAltaDieta.setText("Alta Dieta");
        bAltaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaDietaActionPerformed(evt);
            }
        });

        bModificarDieta.setText("Modificar");
        bModificarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarDietaActionPerformed(evt);
            }
        });

        beliminarDieta.setText("Eliminar Dieta");
        beliminarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarDietaActionPerformed(evt);
            }
        });

        bSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Listado comidas por Dieta");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(palenModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bAltaDieta)
                                .addGap(18, 18, 18)
                                .addComponent(bModificarDieta)
                                .addGap(18, 18, 18)
                                .addComponent(beliminarDieta)))
                        .addGap(108, 108, 108)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAltaDieta)
                    .addComponent(bModificarDieta)
                    .addComponent(beliminarDieta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(palenModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSalir)
                .addGap(31, 31, 31))
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
        } else {
            cod = 0;
            armarGrillaComidas(cod);
        }
        this.txtSumacalComidas.setText(sumacalorias + "");
        //


    }//GEN-LAST:event_combopacientesActionPerformed

    private void combopacientesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combopacientesFocusLost

        pas = (Paciente) this.combopacientes.getSelectedItem();
        cod = 0;

        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesFocusLost

    private void girlddietaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_girlddietaKeyPressed

    }//GEN-LAST:event_girlddietaKeyPressed

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

        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesKeyReleased

    private void combopacientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combopacientesItemStateChanged

   

        // TODO add your handling code here:ar
    }//GEN-LAST:event_combopacientesItemStateChanged

    private void combopacientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combopacientesFocusGained



        armarGrillaDieta();
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesFocusGained

    private void bagregaradietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregaradietaActionPerformed

        comida = new Comida();
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        if (this.girlddieta.getSelectedRow() != -1) {//me fijo si seleleccionó dieta desde el grid
            cod = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));
            comida = (Comida) this.combocomida.getSelectedItem();
            die = ddata.buscarDieta(cod);

            if ((sumacalorias + comida.getCalorias()) < die.getLimiteCalorico()) {
                JOptionPane.showMessageDialog(this, "Comida Agregada a la dieta");

                icomdata.altaComidaaDieta(die, comida);

                armarGrillaComidas(cod);
            } else {
                JOptionPane.showMessageDialog(this, "no es posible agregar la comida a la dieta.Se Exede a las  calorias");
            }
        }


    }//GEN-LAST:event_bagregaradietaActionPerformed

    private void bquitarcomidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bquitarcomidaActionPerformed
       DefaultTableModel modelo1 = (DefaultTableModel) this.girlddieta.getModel();
        coddie = Integer.parseInt(String.valueOf(modelo1.getValueAt(this.girlddieta.getSelectedRow(), 0)));
        DefaultTableModel modelo = (DefaultTableModel) this.GirldComidas.getModel();
        if (this.GirldComidas.getSelectedRow() != -1) {//me fijo si seleleccionó 1 comida desde el grid
            cod = Integer.parseInt(String.valueOf(modelo.getValueAt(this.GirldComidas.getSelectedRow(), 0)));
       
            icomdata.bajaComidaaDieta(cod);
            
            System.out.println("el codigo de la dieta es: "+coddie);
            armarGrillaComidas(coddie);
            // TODO add your handling code here:
        }
    }//GEN-LAST:event_bquitarcomidaActionPerformed

    private void combopacientesVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_combopacientesVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesVetoableChange

    private void combopacientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combopacientesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesKeyPressed

    private void combopacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combopacientesMouseClicked
  armarGrillaDieta();
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesMouseClicked

    private void combopacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combopacientesMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesMouseEntered

    private void combopacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combopacientesMouseExited
  
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesMouseExited

    private void combopacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combopacientesMousePressed
        armarGrillaDieta();
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesMousePressed

    private void combopacientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combopacientesMouseReleased
        armarGrillaDieta();
        // TODO add your handling code here:
    }//GEN-LAST:event_combopacientesMouseReleased

    private void bAltaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaDietaActionPerformed
        this.txPesoBuscado.setText("");
        this.TxPesoInicial.setText("");
        this.txLimiteCalorico.setText("");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.txFechaFin.setText(LocalDate.now().plusDays(7).format(formatter).toString());
        ///
        String fecha = String.valueOf(LocalDate.now().toString());
        LocalDate inputAdDate = LocalDate.parse(fecha, formatter);
        java.util.Date f = Date.from(inputAdDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.jtxFechaInicio.setDate(f);
//
        this.palenModificar.setVisible(true);
        this.bModificarDieta.setEnabled(false);
        this.beliminarDieta.setEnabled(false);
        boton = 1;
// TODO add your handling code here:
    }//GEN-LAST:event_bAltaDietaActionPerformed

    private void bModificarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarDietaActionPerformed
        boton = 0;

        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        if (this.girlddieta.getSelectedRow() != -1) {//me fijo si seleleccionó 1 comida desde el grid
            this.palenModificar.setVisible(true);
            this.bAltaDieta.setEnabled(false);
            this.beliminarDieta.setEnabled(false);
            coddie = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));
            this.txPesoBuscado.setText(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 3)));
            this.TxPesoInicial.setText(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 4)));
            this.txLimiteCalorico.setText(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 5)));
//Insertar fecha en jcalendar
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 1));
            LocalDate inputAdDate = LocalDate.parse(fecha, formatter);
            java.util.Date f = Date.from(inputAdDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            this.jtxFechaInicio.setDate(f);
//            
            inputAdDate = inputAdDate.plusDays(7);//sumo 7 días a la fecha de inicio
            this.txFechaFin.setText(inputAdDate.toString());

            armarGrillaComidas(coddie);

        } else {
            JOptionPane.showMessageDialog(this, "No hay dieta Seleccionada!");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_bModificarDietaActionPerformed

    private void beliminarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarDietaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.girlddieta.getModel();
        if (this.girlddieta.getSelectedRow() != -1) {//me fijo si seleleccionó 1 dieta desde el grid

            coddie = Integer.parseInt(String.valueOf(modelo.getValueAt(this.girlddieta.getSelectedRow(), 0)));
            int n = JOptionPane.showConfirmDialog(this, " está seguro que DESEA ELIMINAR LA DIETA?", "", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                ddata.bajaDieta(coddie);
                armarGrillaDieta();
            }

        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado una Dieta");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_beliminarDietaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_bSalirActionPerformed

    private void combopacientesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_combopacientesPropertyChange
   
    }//GEN-LAST:event_combopacientesPropertyChange

    private void guardarCambiosDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosDietaActionPerformed

        die = new Dieta();
        die.setInicioDieta(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jtxFechaInicio.getDate())));
        this.txFechaFin.setText(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jtxFechaInicio.getDate())).plusDays(7).toString());

        die.setInicioDieta(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jtxFechaInicio.getDate())));
        /////
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputAdDate = LocalDate.parse(this.txFechaFin.getText(), formatter);
        die.setFinDieta(inputAdDate);
        ///
        die.setLimiteCalorico(Integer.parseInt(this.txLimiteCalorico.getText()));
        die.setPaciente((Paciente) this.combopacientes.getSelectedItem());
        die.setPesoBuscado(Double.parseDouble(this.txPesoBuscado.getText()));
        die.setPesoInicial(Double.parseDouble(this.TxPesoInicial.getText()));

        if (boton == 0) {///modificar
            die.setId_Dieta(cod);
            ddata.modificaDieta(die);

        } else {
            ddata.altaDieta(die);
        }
        this.palenModificar.setVisible(false);
        armarGrillaDieta();
        this.bModificarDieta.setEnabled(true);
        this.beliminarDieta.setEnabled(true);
        this.bAltaDieta.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_guardarCambiosDietaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.palenModificar.setVisible(false);
        this.bModificarDieta.setEnabled(true);
        this.beliminarDieta.setEnabled(true);
        this.bAltaDieta.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txLimiteCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLimiteCaloricoActionPerformed
        if (!this.txLimiteCalorico.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
            this.txLimiteCalorico.requestFocus();
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_txLimiteCaloricoActionPerformed

    private void jtxFechaInicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtxFechaInicioPropertyChange

        //Me dice la propiedad que cambió, por ejemplo date(la fecha)

        //Para obtener la nueva fecha
        if (evt.getNewValue() instanceof Date) {
            this.txFechaFin.setText(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jtxFechaInicio.getDate())).plusDays(7).toString());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jtxFechaInicioPropertyChange

    private void TxPesoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxPesoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxPesoInicialActionPerformed

    private void TxPesoInicialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxPesoInicialFocusLost
        if (!this.TxPesoInicial.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
            this.TxPesoInicial.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxPesoInicialFocusLost

    private void txPesoBuscadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txPesoBuscadoFocusLost
        if (!this.txPesoBuscado.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
            this.txPesoBuscado.requestFocus();
        }        // TODO add your handling code here:

    }//GEN-LAST:event_txPesoBuscadoFocusLost

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

        ArrayList<itemComidas> templc = new ArrayList();
        //ArrayList <Comida> templc = new ArrayList();
        // templc = icomdata.obtenerComidasporDieta(codigo);
        templc = icomdata.obtenerComidasporDietaId(codigo);
        String datos[] = new String[3];
        DefaultTableModel modeloc = (DefaultTableModel) this.GirldComidas.getModel();
        modeloc.setNumRows(0);
        sumacalorias = 0;
        for (itemComidas aux : templc) {
            datos[0] = aux.getId_itemcomida() + "";
            datos[1] = aux.getComida().getNombre();
            datos[2] = aux.getComida().getCalorias() + "";
            modeloc.addRow(datos);
            sumacalorias = sumacalorias + aux.getComida().getCalorias();
        }
        this.txtSumacalComidas.setText(sumacalorias + "");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GirldComidas;
    private java.awt.TextField TxPesoInicial;
    private javax.swing.JButton bAltaDieta;
    private javax.swing.JButton bModificarDieta;
    private javax.swing.JButton bSalir;
    private java.awt.Button bagregaradieta;
    private javax.swing.JButton beliminarDieta;
    private java.awt.Button bquitarcomida;
    private javax.swing.JComboBox<Comida> combocomida;
    private javax.swing.JComboBox<Paciente> combopacientes;
    private javax.swing.JTable girlddieta;
    private javax.swing.JButton guardarCambiosDieta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jtxFechaInicio;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label labelfechafin;
    private javax.swing.JPanel palenModificar;
    private java.awt.TextField txFechaFin;
    private java.awt.TextField txLimiteCalorico;
    private java.awt.TextField txPesoBuscado;
    private javax.swing.JTextPane txtSumacalComidas;
    // End of variables declaration//GEN-END:variables
}
