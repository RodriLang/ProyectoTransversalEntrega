/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author joelb
 */
public class ModificarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarAlumno
     */
    public ModificarAlumno() {
        initComponents();
        initComponents();
        jLabel1.setOpaque(true);
        jLabel1.setBackground(new Color(2, 64, 126));
        jPanel1.setBackground(new Color(223, 232, 225));
        calendario.setDateFormatString("dd/MM/yyyy");
        jbModificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbModificar.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbModificar.setBackground(new Color(223, 232, 225));
            }
        });

        jbBuscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbBuscar.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbBuscar.setBackground(new Color(223, 232, 225));
            }
        });

        jbLimpiar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbLimpiar.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbLimpiar.setBackground(new Color(223, 232, 225));
            }
        });

         JTextFieldDateEditor editor = (JTextFieldDateEditor) calendario.getDateEditor(); //se convierte el jDateChooser en jTextFieldDateEditor para desactivar la edicion del campo de texto
        editor.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDatos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jbLimpiar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Alumno");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarUsuario.png"))); // NOI18N

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR ALUMNO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Buscar alumno para modificar por:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 40, 260, 30);

        jtfDatos.setBackground(new java.awt.Color(230, 244, 245));
        jtfDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDatosKeyTyped(evt);
            }
        });
        jPanel1.add(jtfDatos);
        jtfDatos.setBounds(180, 100, 110, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 170, 110, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 250, 70, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("APELLIDO");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 210, 68, 17);

        jtfNombre.setBackground(new java.awt.Color(230, 244, 245));
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtfNombre);
        jtfNombre.setBounds(200, 170, 180, 22);

        jtfApellido.setBackground(new java.awt.Color(230, 244, 245));
        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtfApellido);
        jtfApellido.setBounds(200, 210, 180, 22);

        jtfDni.setBackground(new java.awt.Color(230, 244, 245));
        jtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtfDni);
        jtfDni.setBounds(200, 250, 180, 22);

        jbModificar.setBackground(new java.awt.Color(230, 244, 245));
        jbModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbModificarMouseExited(evt);
            }
        });
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar);
        jbModificar.setBounds(420, 280, 132, 30);

        jbBuscar.setBackground(new java.awt.Color(230, 244, 245));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarUsuario.png"))); // NOI18N
        jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBuscarMouseExited(evt);
            }
        });
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar);
        jbBuscar.setBounds(350, 60, 60, 60);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("FECHA NAC.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 290, 90, 17);

        calendario.setBackground(new java.awt.Color(230, 244, 245));
        jPanel1.add(calendario);
        calendario.setBounds(200, 290, 180, 22);

        jbLimpiar.setBackground(new java.awt.Color(230, 244, 245));
        jbLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseExited(evt);
            }
        });
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar);
        jbLimpiar.setBounds(450, 210, 104, 28);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "DNI" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(80, 100, 72, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMouseEntered
        // TODO add your handling code here:
        jbModificar.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbModificarMouseEntered

    private void jbModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMouseExited
        // TODO add your handling code here:
        jbModificar.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbModificarMouseExited

    private void jbBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseEntered
        // TODO add your handling code here:
        jbBuscar.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbBuscarMouseEntered

    private void jbBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseExited
        // TODO add your handling code here:
        jbBuscar.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbBuscarMouseExited

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        if (jtfDatos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos vacíos");
        } else {
            try {
                if ("DNI".equals(jComboBox1.getSelectedItem())) {
                    int DNI = Integer.parseInt(jtfDatos.getText());
                    AlumnoData alu = new AlumnoData();
                    Alumno alumnoEncontrado = alu.buscarAlumnoDni(DNI);
                    if (alumnoEncontrado != null) {
                        String id = String.valueOf(alumnoEncontrado.getId());
                        jtfNombre.setText(alumnoEncontrado.getNombre());
                        jtfApellido.setText(alumnoEncontrado.getApellido());
                        String dni = String.valueOf(alumnoEncontrado.getDni());
                        jtfDni.setText(dni);
                        LocalDate localDate = alumnoEncontrado.getFechaNacimiento();
                        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                        calendario.setDate(date);
                    }
                } else{
                    int id;
                    id= Integer.parseInt(jtfDatos.getText());
                    AlumnoData alu = new AlumnoData();
                    Alumno alumnoEncontrado = alu.buscarAlumnoId(id);
                    if (alumnoEncontrado != null) {
                        jtfNombre.setText(alumnoEncontrado.getNombre());
                        jtfApellido.setText(alumnoEncontrado.getApellido());
                        String dni = String.valueOf(alumnoEncontrado.getDni());
                        jtfDni.setText(dni);
                        LocalDate localDate = alumnoEncontrado.getFechaNacimiento();
                        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                        calendario.setDate(date);//
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Vuelva a intentarlo. La segunda es la vencida!");
                jtfDatos.setText("");
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        if (jtfNombre.getText().isEmpty() || jtfApellido.getText().isEmpty() || jtfDni.getText().isEmpty() || calendario.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Complete los campos vacíos");
        } else {
            try {
                boolean estado = true;
                int id = Integer.parseInt(jtfDatos.getText());
                int dni = Integer.parseInt(jtfDni.getText());
                String nombre = jtfNombre.getText();
                String apellido = jtfApellido.getText();
                LocalDate fecha = calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar este alumno?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_NO_OPTION) {
                    Alumno alu = new Alumno(id, dni, apellido, nombre, fecha, estado);
                    AlumnoData alumnoData = new AlumnoData();
                    alumnoData.modificarAlumno(alu);
                } else if (resp == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese solo números");
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jtfDatos.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDni.setText("");
        calendario.setDate(null);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseEntered
        // TODO add your handling code here:
        jbLimpiar.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbLimpiarMouseEntered

    private void jbLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseExited
        // TODO add your handling code here:
        jbLimpiar.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbLimpiarMouseExited

    private void jtfDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDatosKeyTyped
        // TODO add your handling code here:
         if(jtfDatos.getText().length()>10){
          evt.consume();        
        }
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfDatosKeyTyped

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        // TODO add your handling code here:
        if(jtfNombre.getText().length()>49){
            evt.consume();
        }
        char c = evt.getKeyChar();
        if(c < 'A' || c > 'z'){
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyTyped
        // TODO add your handling code here:
        if(jtfApellido.getText().length()>49){
            evt.consume();
        }
        char c = evt.getKeyChar();
        if(c < 'A' || c > 'z'){
            evt.consume();
        }
    }//GEN-LAST:event_jtfApellidoKeyTyped

    private void jtfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniKeyTyped
        // TODO add your handling code here:
          if(jtfDni.getText().length()>10){
            evt.consume();
        }
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfDniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDatos;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
