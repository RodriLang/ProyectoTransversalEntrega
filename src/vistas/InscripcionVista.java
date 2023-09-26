package vistas;


import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Entidades.Materia;
import Entidades.Inscripcion;

public class InscripcionVista extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
private AlumnoData alumData=new AlumnoData();
private MateriaData matData=new MateriaData();
private InscripcionData inscData=new InscripcionData(matData, alumData);

   
    public InscripcionVista() {
        initComponents();
        armarModelo();
        modeloBoxAlumnos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscripcion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbVerMaterias = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jboxAlumnos = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(223, 232, 225));
        setClosable(true);
        setTitle("Administración");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracionIco.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(223, 232, 225));
        jPanel3.setLayout(null);

        jtMaterias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMaterias.getTableHeader().setReorderingAllowed(false);
        jtMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMaterias);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(50, 170, 460, 154);

        jbInscripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbInscripcion.setText("Inscribirme");
        jbInscripcion.setEnabled(false);
        jbInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscripcionActionPerformed(evt);
            }
        });
        jPanel3.add(jbInscripcion);
        jbInscripcion.setBounds(410, 350, 93, 30);

        jLabel3.setBackground(new java.awt.Color(170, 194, 205));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID ALUMNO:");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 110, 150, 25);

        jbVerMaterias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbVerMaterias.setText("Ver materias");
        jbVerMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerMateriasActionPerformed(evt);
            }
        });
        jPanel3.add(jbVerMaterias);
        jbVerMaterias.setBounds(450, 110, 116, 29);

        jLabel5.setBackground(new java.awt.Color(2, 64, 126));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INSCRIPCIONES");
        jLabel5.setOpaque(true);
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 590, 40);

        jboxAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jboxAlumnosMouseClicked(evt);
            }
        });
        jPanel3.add(jboxAlumnos);
        jboxAlumnos.setBounds(170, 110, 270, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVerMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerMateriasActionPerformed
        cargarMaterias(((Alumno)jboxAlumnos.getSelectedItem()).getId());
    }//GEN-LAST:event_jbVerMateriasActionPerformed

    private void jbInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscripcionActionPerformed
        try {
           int filaSeleccionada= jtMaterias.getSelectedRow();
        if (jtMaterias.getSelectedRow()>-1) {
        Inscripcion ins1= new Inscripcion();
        ins1.setNota(0);
        ins1.setAlumno((Alumno)jboxAlumnos.getSelectedItem());
        ins1.setMateria(matData.buscarMateria((int)jtMaterias.getValueAt(filaSeleccionada, 0)));        
         inscData.guardarInscripcion(ins1);
        limpiar();
        cargarMaterias(((Alumno)jboxAlumnos.getSelectedItem()).getId());}  
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al inscribirte"); 
            limpiar();
        }
    }//GEN-LAST:event_jbInscripcionActionPerformed
    
    private void jtMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriasMouseClicked
       jbInscripcion.setEnabled(true);      
    }//GEN-LAST:event_jtMateriasMouseClicked

    private void jboxAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jboxAlumnosMouseClicked
      limpiar();
      jbInscripcion.setEnabled(false);
    }//GEN-LAST:event_jboxAlumnosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbInscripcion;
    private javax.swing.JButton jbVerMaterias;
    private javax.swing.JComboBox<Alumno> jboxAlumnos;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    public void armarModelo(){
    
        modelo.addColumn("IdMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtMaterias.setModel(modelo);
    }
    
    public void cargarMaterias(int id){
        limpiar();
        for (Materia materia : inscData.obtenerMateriasNoCursadas(id)) {
            modelo.addRow(new Object[]{materia.getId(),materia.getNombre(),materia.getAnio()});
        }    
    }
    private void limpiar(){
    int filas =modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    
    }
    private void modeloBoxAlumnos(){  
    for (Alumno a : alumData.listarAlumnos()) {
        jboxAlumnos.addItem(a);
    }
}
}
