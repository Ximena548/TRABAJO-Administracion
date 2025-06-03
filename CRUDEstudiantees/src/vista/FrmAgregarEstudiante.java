package vista;
import controlador.ControladorCRUDEstudiantes;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class FrmAgregarEstudiante extends javax.swing.JFrame {
    ControladorCRUDEstudiantes objControladorCRUDEst;    
    public FrmAgregarEstudiante(ControladorCRUDEstudiantes objCtrlCRUDEst) {
        initComponents();
        this.objControladorCRUDEst= objCtrlCRUDEst;        
    }
private void limpiarCampos() {
    txtNumControl.setText("");
    txtNombre.setText("");
    txtApellidos.setText("");
    cboSemestre.setSelectedIndex(0);
    cboCarrera.setSelectedIndex(0);
    rdbtnGrupoA.setSelected(true); // Seleccionar el grupo A por defecto
    txtNumControl.requestFocus(); // Regresar el foco al primer campo
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpoBotonesGrupo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumControl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboSemestre = new javax.swing.JComboBox<>();
        rdbtnGrupoA = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rdbtnGrupoB = new javax.swing.JRadioButton();
        rdbtnGrupoC = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cboCarrera = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda de Estudiantes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tecnológico del Valle de Oaxaca");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Registrar  Estudiantes");

        jLabel1.setText("Num Control");

        txtNumControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumControlKeyPressed(evt);
            }
        });

        jLabel4.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel5.setText("Apellidos");

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });

        jLabel6.setText("Semestre");

        cboSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        cboSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboSemestreKeyPressed(evt);
            }
        });

        gpoBotonesGrupo.add(rdbtnGrupoA);
        rdbtnGrupoA.setSelected(true);
        rdbtnGrupoA.setText("A");
        rdbtnGrupoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdbtnGrupoAKeyPressed(evt);
            }
        });

        jLabel7.setText("Grupo");

        gpoBotonesGrupo.add(rdbtnGrupoB);
        rdbtnGrupoB.setText("B");
        rdbtnGrupoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdbtnGrupoBKeyPressed(evt);
            }
        });

        gpoBotonesGrupo.add(rdbtnGrupoC);
        rdbtnGrupoC.setText("C");
        rdbtnGrupoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdbtnGrupoCKeyPressed(evt);
            }
        });

        jLabel8.setText("Carrera");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar48px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ing. Informática", "Ing. en TIC", "Ing. en Ciencia de Datos", "Ing. en Gestión Empresarial", "Ing. Forestal", "Ing. en Agronomía", "Lic. en Biología" }));
        cboCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboCarreraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbtnGrupoA)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbtnGrupoB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbtnGrupoC))
                                    .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnGuardar)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbtnGrupoA)
                        .addComponent(rdbtnGrupoB)
                        .addComponent(rdbtnGrupoC))
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnGuardar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumControlKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.txtNombre.requestFocus();
    }//GEN-LAST:event_txtNumControlKeyPressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.txtApellidos.requestFocus();
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.cboSemestre.requestFocus();
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void cboSemestreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboSemestreKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.rdbtnGrupoA.requestFocus();
    }//GEN-LAST:event_cboSemestreKeyPressed

    private void rdbtnGrupoAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdbtnGrupoAKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.cboCarrera.requestFocus();
    }//GEN-LAST:event_rdbtnGrupoAKeyPressed

    private void rdbtnGrupoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdbtnGrupoBKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.cboCarrera.requestFocus();
    }//GEN-LAST:event_rdbtnGrupoBKeyPressed

    private void rdbtnGrupoCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdbtnGrupoCKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.cboCarrera.requestFocus();
    }//GEN-LAST:event_rdbtnGrupoCKeyPressed

    private void cboCarreraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCarreraKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            this.btnGuardar.requestFocus();
    }//GEN-LAST:event_cboCarreraKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
        // TODO add your handling code here:
        //Guardar el registro
        String numControl = this.txtNumControl.getText();
        String nombre = this.txtNombre.getText();
        String ape = this.txtApellidos.getText();
        String semestre = this.cboSemestre.getSelectedItem().toString();        
        String grupo;
        if (this.rdbtnGrupoA.isSelected()) grupo="A";
        else if (this.rdbtnGrupoB.isSelected()) grupo="B";
        else grupo="C";
        String carrera = this.cboCarrera.getSelectedItem().toString();
        this.objControladorCRUDEst.guardarRegistro(numControl, nombre, ape, semestre, grupo, carrera);
        JOptionPane.showMessageDialog(this,"Registro guardado con éxito");
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarKeyPressed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
        String numControl = this.txtNumControl.getText();
    String nombre = this.txtNombre.getText();
    String ape = this.txtApellidos.getText();
    String semestre = this.cboSemestre.getSelectedItem().toString();        
    String grupo;
    if (this.rdbtnGrupoA.isSelected()) grupo = "A";
    else if (this.rdbtnGrupoB.isSelected()) grupo = "B";
    else grupo = "C";
    String carrera = this.cboCarrera.getSelectedItem().toString();
    this.objControladorCRUDEst.guardarRegistro(numControl, nombre, ape, semestre, grupo, carrera);
    JOptionPane.showMessageDialog(this, "Registro guardado con éxito");
    limpiarCampos();
    }//GEN-LAST:event_btnGuardarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JComboBox<String> cboSemestre;
    private javax.swing.ButtonGroup gpoBotonesGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rdbtnGrupoA;
    private javax.swing.JRadioButton rdbtnGrupoB;
    private javax.swing.JRadioButton rdbtnGrupoC;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumControl;
    // End of variables declaration//GEN-END:variables
}
