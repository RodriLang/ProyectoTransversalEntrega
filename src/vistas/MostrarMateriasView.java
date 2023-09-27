/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Entidades.Materia;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodri
 */
public class MostrarMateriasView extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTablaActivas;
    private DefaultTableModel modeloTablaInactivas;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData matData = new MateriaData();
    private InscripcionData insData = new InscripcionData(matData, aluData);

    /**
     * Creates new form BuscarMateriaView
     */
    public MostrarMateriasView() {
        initComponents();
        modeloTablaActivas = (DefaultTableModel) tablaMaterias.getModel();
        crearCabeceraInactivas();
        llenarTabla(matData.listarMaterias());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelFondo = new javax.swing.JPanel();
        panelMostrarMaterias = new javax.swing.JPanel();
        radioButtonActivas = new javax.swing.JRadioButton();
        radioButtonInactivas = new javax.swing.JRadioButton();
        panelSuperior = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        comboBoxOrdenar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setMinimumSize(new java.awt.Dimension(660, 420));
        setPreferredSize(new java.awt.Dimension(660, 420));

        panelFondo.setBackground(new java.awt.Color(223, 232, 225));
        panelFondo.setMinimumSize(new java.awt.Dimension(660, 450));
        panelFondo.setPreferredSize(new java.awt.Dimension(660, 450));
        panelFondo.setLayout(null);

        panelMostrarMaterias.setBackground(new java.awt.Color(230, 244, 245));
        panelMostrarMaterias.setLayout(null);

        radioButtonActivas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonActivas.setSelected(true);
        radioButtonActivas.setText("MATERIAS ACTIVAS");
        radioButtonActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonActivasActionPerformed(evt);
            }
        });
        panelMostrarMaterias.add(radioButtonActivas);
        radioButtonActivas.setBounds(10, 0, 190, 30);

        radioButtonInactivas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonInactivas.setText("MATERIAS INACTIVAS");
        radioButtonInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonInactivasActionPerformed(evt);
            }
        });
        panelMostrarMaterias.add(radioButtonInactivas);
        radioButtonInactivas.setBounds(10, 30, 190, 30);

        panelFondo.add(panelMostrarMaterias);
        panelMostrarMaterias.setBounds(30, 80, 0, 0);

        panelSuperior.setBackground(new java.awt.Color(2, 64, 126));

        botonCerrar.setBackground(new java.awt.Color(2, 64, 126));
        botonCerrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrar.setText("X");
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setOpaque(true);
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCerrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCerrarMouseReleased(evt);
            }
        });
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("LISTADO DE MATERIAS");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(605, Short.MAX_VALUE)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSuperiorLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        panelFondo.add(panelSuperior);
        panelSuperior.setBounds(0, 0, 650, 50);

        tablaMaterias.setBackground(new java.awt.Color(230, 244, 245));
        tablaMaterias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MATERIA", "AÑO", "Cant de ALUMNOS"
            }
        ));
        tablaMaterias.setRowHeight(30);
        tablaMaterias.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tablaMaterias);

        panelFondo.add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 590, 180);

        comboBoxOrdenar.setBackground(new java.awt.Color(223, 232, 225));
        comboBoxOrdenar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione Orden>", "Por Nro ID", "Por Nombre A-Z", "Por Nombre Z-A", "Por Año", "Por cantidad de alumnos (ASC)", "Por cantidad de alumnos (DES)" }));
        comboBoxOrdenar.setToolTipText("");
        comboBoxOrdenar.setOpaque(true);
        comboBoxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrdenarActionPerformed(evt);
            }
        });
        panelFondo.add(comboBoxOrdenar);
        comboBoxOrdenar.setBounds(260, 80, 250, 60);

        jButton1.setBackground(new java.awt.Color(223, 232, 225));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdfIco.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelFondo.add(jButton1);
        jButton1.setBounds(550, 80, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        botonCerrar.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        botonCerrar.setBackground(new Color(15, 63, 119));
    }//GEN-LAST:event_botonCerrarMouseExited

    private void botonCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMousePressed
        botonCerrar.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_botonCerrarMousePressed

    private void botonCerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseReleased
        botonCerrar.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_botonCerrarMouseReleased

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void radioButtonActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonActivasActionPerformed
        if (radioButtonActivas.isSelected()) {
            radioButtonInactivas.setSelected(false);

            comboBoxOrdenar.addItem("Por cantidad de alumnos (DES)");
            comboBoxOrdenar.addItem("Por cantidad de alumnos (ASC)");
        } else {
            radioButtonInactivas.setSelected(true);
            comboBoxOrdenar.removeItem("Por cantidad de alumnos (DES)");
            comboBoxOrdenar.removeItem("Por cantidad de alumnos (ASC)");
        }
        ordenarMaterias();
    }//GEN-LAST:event_radioButtonActivasActionPerformed

    private void radioButtonInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonInactivasActionPerformed
        if (radioButtonInactivas.isSelected()) {
            radioButtonActivas.setSelected(false);
            comboBoxOrdenar.removeItem("Por cantidad de alumnos (DES)");
            comboBoxOrdenar.removeItem("Por cantidad de alumnos (ASC)");
        } else {
            radioButtonActivas.setSelected(true);
            comboBoxOrdenar.addItem("Por cantidad de alumnos (DES)");
            comboBoxOrdenar.addItem("Por cantidad de alumnos (ASC)");
        }
        ordenarMaterias();
    }//GEN-LAST:event_radioButtonInactivasActionPerformed

    private void comboBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrdenarActionPerformed
        ordenarMaterias();
    }//GEN-LAST:event_comboBoxOrdenarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Document documento = new Document();

            String ruta = System.getProperty("user.home");
            String ubicacion = "\\Desktop\\";
            String nombreArchivo;
            String extension = ".pdf";
            if (radioButtonActivas.isSelected()) {
                nombreArchivo = "Materias";
            } else {
                nombreArchivo = "Materias Inactivas";
            }
            if (comboBoxOrdenar.getSelectedIndex() != 0) {
                nombreArchivo += " " + comboBoxOrdenar.getSelectedItem();
            }

            ImageIcon imgPdf = new ImageIcon(getClass().getResource("/imagenes/pdfPregunta.png"));

            String nombreEspecificado = ruta + ubicacion + JOptionPane.showInputDialog(this,
                    "Indique el nombre del archivo:\n" + ruta + ubicacion, nombreArchivo);
            String ubicacionEspecificada = nombreEspecificado + extension;

            try {
                PdfWriter.getInstance(documento, new FileOutputStream(ubicacionEspecificada));
            } catch (DocumentException ex) {
                Logger.getLogger(MostrarMateriasView.class.getName()).log(Level.SEVERE, null, ex);
            }
            documento.open();
            PdfPTable tabla = new PdfPTable(tablaMaterias.getColumnCount());
            for (int i = 0; i < tablaMaterias.getColumnCount(); i++) {
                System.out.println(tablaMaterias.getColumnName(i));
                tabla.addCell(tablaMaterias.getColumnName(i));
            }
            //El for "j" recorre las filas de la tabla
            //Por cada fila, el for "i" recorre cada una de las columnas y le asigna el valor obtenido de la tablaAlumnos
            for (int j = 0; j < tablaMaterias.getRowCount(); j++) {
                System.out.println("");
                for (int i = 0; i < tablaMaterias.getColumnCount(); i++) {
                    System.out.print(tablaMaterias.getValueAt(j, i).toString() + " ");
                    tabla.addCell(tablaMaterias.getValueAt(j, i).toString());
                }
            }
            try {
                documento.add(tabla);

            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(this, ex, "No se encontró la carpeta", 0);
                System.err.println(Arrays.toString(ex.getStackTrace()));
            }
            documento.close();
            if (!nombreEspecificado.contains("null")) {
                JOptionPane.showMessageDialog(null, "Busque el archivo en:\n" + ubicacionEspecificada, "Se descargó el archivo PDF", 1);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex, "No se pudo crear el archivo", 0);
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    private void ordenarMaterias() {
        String orden = (String) comboBoxOrdenar.getSelectedItem();
        List<Materia> materias;
        if (radioButtonActivas.isSelected()) {
            materias = matData.listarMaterias();
        } else {
            materias = matData.listarMateriasInactivas();
            System.out.println(materias);
        }
        switch (orden) {
            case "Por Nombre A-Z":
                materias.sort(new Comparator<Materia>() {
                    @Override
                    public int compare(Materia materia1, Materia materia2) {
                        return materia1.getNombre().compareTo(materia2.getNombre());
                    }
                });
                break;
            case "Por Nombre Z-A":
                materias.sort(new Comparator<Materia>() {
                    @Override
                    public int compare(Materia materia1, Materia materia2) {
                        return materia1.getNombre().compareTo(materia2.getNombre());
                    }
                });
                Collections.reverse(materias);
                break;
            case "Por Año":
                materias.sort(new Comparator<Materia>() {
                    @Override
                    public int compare(Materia materia1, Materia materia2) {
                        return materia1.getAnio() - materia2.getAnio();
                    }
                });
                break;
            case "Por cantidad de alumnos (ASC)":
                materias.sort(new Comparator<Materia>() {
                    @Override
                    public int compare(Materia materia1, Materia materia2) {
                        int cantidad1 = insData.obtenerAlumnosXMateria(materia1.getId()).size();
                        int cantidad2 = insData.obtenerAlumnosXMateria(materia2.getId()).size();
                        return cantidad1 - cantidad2;
                    }
                });
                break;
            case "Por cantidad de alumnos (DES)":
                materias.sort(new Comparator<Materia>() {
                    @Override
                    public int compare(Materia materia1, Materia materia2) {
                        int cantidad1 = insData.obtenerAlumnosXMateria(materia1.getId()).size();
                        int cantidad2 = insData.obtenerAlumnosXMateria(materia2.getId()).size();
                        return cantidad2 - cantidad1;
                    }
                });
                break;
        }
        llenarTabla(materias);
    }

    private void llenarTabla(List<Materia> materias) {
        limpiarTabla();
        modeloTablaActivas.setRowCount(0);
        modeloTablaInactivas.setRowCount(0);
        if (radioButtonActivas.isSelected()) {
            tablaMaterias.setModel(modeloTablaActivas);
            for (Materia materia : materias) {
                int cantidadAlumnos = insData.obtenerAlumnosXMateria(materia.getId()).size();
                if (materia.isEstado()) {
                    modeloTablaActivas.addRow(new Object[]{materia.getId(), materia.getNombre(), materia.getAnio(), cantidadAlumnos});
                }
            }
        } else {
            tablaMaterias.setModel(modeloTablaInactivas);
            for (Materia materia : materias) {
                if (!materia.isEstado()) {
                    modeloTablaInactivas.addRow(new Object[]{materia.getId(), materia.getNombre(), materia.getAnio()});
                }
            }
        }
    }

    private void limpiarTabla() {
        int filas = modeloTablaActivas.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloTablaActivas.removeRow(0);
        }
        for (int i = 0; i < 4; i++) {
            modeloTablaActivas.addRow(new Object[4]);
        }
    }

    private void crearCabeceraInactivas() {
        modeloTablaInactivas = new DefaultTableModel();
        modeloTablaInactivas.addColumn("ID");
        modeloTablaInactivas.addColumn("MATERIA");
        modeloTablaInactivas.addColumn("AÑO");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JComboBox<String> comboBoxOrdenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMostrarMaterias;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JRadioButton radioButtonActivas;
    private javax.swing.JRadioButton radioButtonInactivas;
    private javax.swing.JTable tablaMaterias;
    // End of variables declaration//GEN-END:variables

}
