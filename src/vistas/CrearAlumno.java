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
import javax.swing.JOptionPane;
/**
 *
 * @author joelb
 */
public class CrearAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearAlumno
     */
    public CrearAlumno() {
        initComponents();
        this.setSize(600, 400);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) calendario.getDateEditor(); //se convierte el jDateChooser en jTextFieldDateEditor para desactivar la edicion del campo de texto
        editor.setEditable(false);
        jLabel1.setOpaque(true);
        jLabel1.setBackground(new Color(2, 64, 126));
        jPanel1.setBackground(new Color(223, 232, 225));
        calendario.setDateFormatString("dd/MM/yyyy");
        jbCrear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbCrear.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbCrear.setBackground(new Color(223, 232, 225));
            }
        });

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jbCrear = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 255));
        setClosable(true);
        setTitle("Alumno");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(223, 232, 225));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 232, 225));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR ALUMNO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 70, 110, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 127, 80, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("N° DNI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 170, 44, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("FECHA NAC.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 210, 90, 50);

        calendario.setBackground(new java.awt.Color(230, 244, 245));
        jPanel1.add(calendario);
        calendario.setBounds(240, 220, 220, 22);

        jbCrear.setBackground(new java.awt.Color(230, 244, 245));
        jbCrear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbCrear.setText("CREAR");
        jbCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCrearMouseExited(evt);
            }
        });
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jbCrear);
        jbCrear.setBounds(470, 290, 94, 28);

        jtfNombre.setBackground(new java.awt.Color(230, 244, 245));
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtfNombre);
        jtfNombre.setBounds(240, 70, 220, 22);

        jtfApellido.setBackground(new java.awt.Color(230, 244, 245));
        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtfApellido);
        jtfApellido.setBounds(240, 120, 220, 22);

        jtfDni.setBackground(new java.awt.Color(230, 244, 245));
        jtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtfDni);
        jtfDni.setBounds(240, 170, 220, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
        if (jtfNombre.getText().isEmpty() || jtfApellido.getText().isEmpty() || jtfDni.getText().isEmpty() || calendario.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Complete los campos vacíos");
        } else {
            try {
                String nombre = jtfNombre.getText();
                String apellido = jtfApellido.getText();
                int dni = Integer.parseInt(jtfDni.getText());
                LocalDate fecha = calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de crear este alumno?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if(resp == JOptionPane.YES_NO_OPTION){
                Alumno alumno = new Alumno(dni, apellido, nombre, fecha, true);
                AlumnoData alu = new AlumnoData();
                alu.guardarAlumno(alumno);
                jtfNombre.setText("");
                jtfApellido.setText("");
                jtfDni.setText("");
                calendario.setDate(null);
                }
                else if(resp == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Operación cancelada","Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo números en DNI");
                jtfDni.setText("");//
            }
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCrearMouseEntered
        // TODO add your handling code here:
        jbCrear.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbCrearMouseEntered

    private void jbCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCrearMouseExited
        // TODO add your handling code here:
        jbCrear.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbCrearMouseExited

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCrear;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
