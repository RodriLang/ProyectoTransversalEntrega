
package vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Entidades.Alumno;
import Entidades.Inscripcion;



public class BuscarAlumnoView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo=new DefaultTableModel();
    public BuscarAlumnoView() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTestado = new javax.swing.JTextField();
        jTfechaNac = new javax.swing.JTextField();
        jTnombreAlumno = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jTidAlumno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBuscar = new javax.swing.JButton();
        jTOpcionDato = new javax.swing.JTextField();
        jTDato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboDato = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(910, 696));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(223, 232, 225));

        jPanel2.setBackground(new java.awt.Color(2, 64, 126));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BUSCAR ALUMNO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTestado.setEditable(false);
        jTestado.setBackground(new java.awt.Color(230, 244, 245));

        jTfechaNac.setEditable(false);
        jTfechaNac.setBackground(new java.awt.Color(230, 244, 245));

        jTnombreAlumno.setEditable(false);
        jTnombreAlumno.setBackground(new java.awt.Color(230, 244, 245));

        jTapellido.setEditable(false);
        jTapellido.setBackground(new java.awt.Color(230, 244, 245));

        jTdni.setEditable(false);
        jTdni.setBackground(new java.awt.Color(230, 244, 245));

        jTidAlumno.setEditable(false);
        jTidAlumno.setBackground(new java.awt.Color(230, 244, 245));

        jLabel7.setText("Estado:");

        jLabel6.setText("Fecha de Nacimiento:");

        jLabel5.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel3.setText("Id:");

        jLabel8.setText("Dni:");

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jTOpcionDato.setEditable(false);
        jTOpcionDato.setBackground(new java.awt.Color(230, 244, 245));

        jTDato.setBackground(new java.awt.Color(230, 244, 245));
        jTDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDatoKeyTyped(evt);
            }
        });

        jLabel2.setText("Ingrese Dato:");

        jComboDato.setBackground(new java.awt.Color(230, 244, 245));
        jComboDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDatoActionPerformed(evt);
            }
        });

        jTableMaterias.setBackground(new java.awt.Color(223, 232, 225));
        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(351, 351, 351))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboDato, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTDato, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jTOpcionDato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jBuscar)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuscar)
                    .addComponent(jTOpcionDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDatoActionPerformed
        limpiarCampos();
        String opcionDato=(String)jComboDato.getSelectedItem();
        jTOpcionDato.setText(opcionDato);
    }//GEN-LAST:event_jComboDatoActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            String opcionDato = jTOpcionDato.getText();
            int dato = Integer.parseInt(jTDato.getText());
            limpiarTabla();
            AlumnoData alu = new AlumnoData();

            limpiarCampos();

            if (opcionDato.equals("DNI")) {
                limpiarTabla();
                Alumno alumnoDni = (Alumno) alu.buscarAlumnoDni(dato);

                jTdni.setText(alumnoDni.getDni() + "");
                jTidAlumno.setText(alumnoDni.getId() + "");
                jTapellido.setText(alumnoDni.getApellido());
                jTnombreAlumno.setText(alumnoDni.getNombre());
                jTfechaNac.setText(alumnoDni.getFechaNacimiento().toString());
                if (alumnoDni.isEstado() == true) {
                    jTestado.setText("Activo");
                } else {
                    jTestado.setText("Dado de Baja");
                }
                llenarTablaDni(alumnoDni.getId());
            }

            if (opcionDato.equals("ID")) {
                limpiarTabla();
                Alumno alumnoId = (Alumno) alu.buscarAlumnoId(dato);

                jTdni.setText(alumnoId.getDni() + "");
                jTidAlumno.setText(alumnoId.getId() + "");
                jTapellido.setText(alumnoId.getApellido());
                jTnombreAlumno.setText(alumnoId.getNombre());
                jTfechaNac.setText(alumnoId.getFechaNacimiento().toString());
                if (alumnoId.isEstado() == true) {
                    jTestado.setText("Activo");
                } else {
                    jTestado.setText("Dado de Baja");
                }
                llenarTablaId(alumnoId.getId());

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe llenar el campo 'Ingrese Dato' para realizar una búsqueda." + ex.toString());
        }
//          } catch (NullPointerException ex) {
//            JOptionPane.showMessageDialog(this,"Debe llenar el campo 'Ingrese Dato' para realizar una búsqueda."+ex.toString());
//          }


    }//GEN-LAST:event_jBuscarActionPerformed

    private void jTDatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDatoKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_jTDatoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<String> jComboDato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDato;
    private javax.swing.JTextField jTOpcionDato;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTestado;
    private javax.swing.JTextField jTfechaNac;
    private javax.swing.JTextField jTidAlumno;
    private javax.swing.JTextField jTnombreAlumno;
    // End of variables declaration//GEN-END:variables
   private void cargarCombo(){
        jComboDato.addItem("DNI");
        jComboDato.addItem("ID");
    
    }
   private void limpiarCampos(){
       jTDato.setText("");
       jTdni.setText(" ");
       jTidAlumno.setText(" ");
       jTapellido.setText(" ");
       jTnombreAlumno.setText(" ");
       jTfechaNac.setText(" ");
       jTestado.setText(" ");
       
   }
   
  private void armarCabecera(){
    modelo.addColumn("Materia");
    modelo.addColumn("Año");
    modelo.addColumn("Nota");
    jTableMaterias.setModel(modelo);  

}
  private void llenarTablaId(int Id){
      MateriaData mat=new MateriaData();
      AlumnoData alu=new AlumnoData();
      List<Inscripcion> inscripciones=new ArrayList();
      InscripcionData insc= new InscripcionData(mat,alu);
      inscripciones=insc.obtenerInscripcionesPorAlumno(Id);
      
       for (Inscripcion i:inscripciones){
             modelo.addRow(new Object[]{
                i.getMateria().getNombre(),
                i.getMateria().getAnio(),
                i.getNota()
                });
        }
       //System.out.println(inscripciones.toString());
  }
  private void llenarTablaDni(int dni){
      MateriaData mat=new MateriaData();
      AlumnoData alu=new AlumnoData();
      List<Inscripcion> inscripciones=new ArrayList();
      InscripcionData insc= new InscripcionData(mat,alu);
      inscripciones=insc.obtenerInscripcionesPorAlumno(dni);
      
       for (Inscripcion i:inscripciones){
             modelo.addRow(new Object[]{
                i.getMateria().getNombre(),
                i.getMateria().getAnio(),
                i.getNota()
                });
        }
       //System.out.println(inscripciones.toString());
  }
  
    private void limpiarTabla() {
        for (int i = 0; i < jTableMaterias.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
   
  
}
