/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Rodri
 */
public class MenuPrincipal extends javax.swing.JFrame {

    ImageIcon imgAgregarUsuarioGr = new ImageIcon(getClass().getResource("/imagenes/agregarUs.png"));
    ImageIcon imgAgregarUsuarioCh = new ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"));

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {      
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(1200,820);
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public JMenu getMenuAdministracion() {
        return menuAdministracion;
    }

    public JMenu getMenuAlumno() {
        return menuAlumno;
    }

    public JMenu getMenuConsultas() {
        return menuConsultas;
    }

    public JMenuItem getMenuItemAsignNota() {
        return menuItemAsignNota;
    }

    public JMenuItem getMenuItemBorrarAlumno() {
        return menuItemBorrarAlumno;
    }

    public JMenuItem getMenuItemBorrarMateria() {
        return menuItemBorrarMateria;
    }

    public JMenuItem getMenuItemBuscarAlumno() {
        return menuItemBuscarAlumno;
    }

    public JMenuItem getMenuItemBuscarMateria() {
        return menuItemBuscarMateria;
    }

    public JMenuItem getMenuItemCrearAlumno() {
        return menuItemCrearAlumno;
    }

    public JMenuItem getMenuItemCrearMateria() {
        return menuItemCrearMateria;
    }

    public JMenuItem getMenuItemInscribir() {
        return menuItemInscribir;
    }

    public JMenuItem getMenuItemListarAlumno() {
        return menuItemListarAlumno;
    }

    public JMenuItem getMenuItemListarMateria() {
        return menuItemListarMateria;
    }

    public JMenuItem getMenuItemModifAlumno() {
        return menuItemModifAlumno;
    }

    public JMenuItem getMenuItemModifMateria() {
        return menuItemModifMateria;
    }

    public JMenu getMenuMateria() {
        return menuMateria;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        labelFondoLogo = new javax.swing.JLabel();
        labelFooter = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        menuItemCrearAlumno = new javax.swing.JMenuItem();
        menuItemModifAlumno = new javax.swing.JMenuItem();
        menuItemBorrarAlumno = new javax.swing.JMenuItem();
        menuMateria = new javax.swing.JMenu();
        menuItemCrearMateria = new javax.swing.JMenuItem();
        menuItemModifMateria = new javax.swing.JMenuItem();
        menuItemBorrarMateria = new javax.swing.JMenuItem();
        menuAdministracion = new javax.swing.JMenu();
        menuItemInscribir = new javax.swing.JMenuItem();
        menuItemAsignNota = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuItemBuscarAlumno = new javax.swing.JMenuItem();
        menuItemListarAlumno = new javax.swing.JMenuItem();
        menuItemBuscarMateria = new javax.swing.JMenuItem();
        menuItemListarMateria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad de La Punta");
        setBackground(new java.awt.Color(102, 102, 102));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/ulpLogoFondo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        panelEscritorio.setLayout(null);

        escritorio.setBackground(new java.awt.Color(223, 232, 225));
        escritorio.setEnabled(false);

        labelFondoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoUlp.png"))); // NOI18N

        escritorio.setLayer(labelFondoLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(labelFondoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(374, 374, 374))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(labelFondoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelEscritorio.add(escritorio);
        escritorio.setBounds(0, 0, 1200, 570);

        getContentPane().add(panelEscritorio);
        panelEscritorio.setBounds(-1, 0, 1200, 570);

        labelFooter.setBackground(new java.awt.Color(15, 63, 119));
        labelFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFooter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/footerUlpVirtual.png"))); // NOI18N
        labelFooter.setToolTipText("");
        labelFooter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        labelFooter.setMaximumSize(null);
        labelFooter.setMinimumSize(null);
        labelFooter.setName(""); // NOI18N
        labelFooter.setOpaque(true);
        labelFooter.setPreferredSize(null);
        getContentPane().add(labelFooter);
        labelFooter.setBounds(0, 570, 1200, 136);

        barraMenu.setBackground(new java.awt.Color(15, 63, 119));
        barraMenu.setBorder(null);
        barraMenu.setEnabled(false);
        barraMenu.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        barraMenu.setName(""); // NOI18N
        barraMenu.setOpaque(true);
        barraMenu.setPreferredSize(new java.awt.Dimension(301, 100));

        menuAlumno.setBackground(new java.awt.Color(15, 63, 119));
        menuAlumno.setForeground(new java.awt.Color(223, 232, 225));
        menuAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/virrete.png"))); // NOI18N
        menuAlumno.setText("Alumno");
        menuAlumno.setContentAreaFilled(false);
        menuAlumno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuAlumno.setOpaque(true);
        menuAlumno.setPreferredSize(new java.awt.Dimension(180, 33));
        menuAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAlumnoMouseExited(evt);
            }
        });

        menuItemCrearAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemCrearAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemCrearAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        menuItemCrearAlumno.setText("Nuevo");
        menuItemCrearAlumno.setOpaque(true);
        menuItemCrearAlumno.setPreferredSize(new java.awt.Dimension(111, 55));
        menuItemCrearAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItemCrearAlumno);

        menuItemModifAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemModifAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemModifAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarUsuario.png"))); // NOI18N
        menuItemModifAlumno.setText("Editar");
        menuItemModifAlumno.setOpaque(true);
        menuItemModifAlumno.setPreferredSize(new java.awt.Dimension(129, 55));
        menuItemModifAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModifAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItemModifAlumno);

        menuItemBorrarAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBorrarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBorrarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarUsuario.png"))); // NOI18N
        menuItemBorrarAlumno.setText("Baja");
        menuItemBorrarAlumno.setOpaque(true);
        menuItemBorrarAlumno.setPreferredSize(new java.awt.Dimension(145, 55));
        menuItemBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBorrarAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItemBorrarAlumno);

        barraMenu.add(menuAlumno);
        menuAlumno.getAccessibleContext().setAccessibleDescription("");

        menuMateria.setBackground(new java.awt.Color(15, 63, 119));
        menuMateria.setForeground(new java.awt.Color(223, 232, 225));
        menuMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        menuMateria.setText("Materia");
        menuMateria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuMateria.setOpaque(true);
        menuMateria.setPreferredSize(new java.awt.Dimension(150, 33));
        menuMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMateriaMouseExited(evt);
            }
        });

        menuItemCrearMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemCrearMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemCrearMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarMateria.png"))); // NOI18N
        menuItemCrearMateria.setText("Nueva");
        menuItemCrearMateria.setOpaque(true);
        menuItemCrearMateria.setPreferredSize(new java.awt.Dimension(137, 55));
        menuItemCrearMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearMateriaActionPerformed(evt);
            }
        });
        menuMateria.add(menuItemCrearMateria);

        menuItemModifMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemModifMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemModifMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarMateria3.png"))); // NOI18N
        menuItemModifMateria.setText("Editar");
        menuItemModifMateria.setOpaque(true);
        menuItemModifMateria.setPreferredSize(new java.awt.Dimension(137, 55));
        menuItemModifMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModifMateriaActionPerformed(evt);
            }
        });
        menuMateria.add(menuItemModifMateria);

        menuItemBorrarMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBorrarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBorrarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desecharMateria.png"))); // NOI18N
        menuItemBorrarMateria.setText("Borrar");
        menuItemBorrarMateria.setOpaque(true);
        menuItemBorrarMateria.setPreferredSize(new java.awt.Dimension(137, 55));
        menuItemBorrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBorrarMateriaActionPerformed(evt);
            }
        });
        menuMateria.add(menuItemBorrarMateria);

        barraMenu.add(menuMateria);

        menuAdministracion.setBackground(new java.awt.Color(15, 63, 119));
        menuAdministracion.setForeground(new java.awt.Color(223, 232, 225));
        menuAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion.png"))); // NOI18N
        menuAdministracion.setText("Administración");
        menuAdministracion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuAdministracion.setMaximumSize(new java.awt.Dimension(260, 32767));
        menuAdministracion.setOpaque(true);
        menuAdministracion.setPreferredSize(new java.awt.Dimension(240, 33));
        menuAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAdministracionMouseExited(evt);
            }
        });

        menuItemInscribir.setBackground(new java.awt.Color(87, 116, 134));
        menuItemInscribir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carpeta.png"))); // NOI18N
        menuItemInscribir.setText("Inscribir");
        menuItemInscribir.setMinimumSize(new java.awt.Dimension(150, 55));
        menuItemInscribir.setOpaque(true);
        menuItemInscribir.setPreferredSize(new java.awt.Dimension(180, 55));
        menuItemInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInscribirActionPerformed(evt);
            }
        });
        menuAdministracion.add(menuItemInscribir);

        menuItemAsignNota.setBackground(new java.awt.Color(87, 116, 134));
        menuItemAsignNota.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemAsignNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nota.png"))); // NOI18N
        menuItemAsignNota.setText("Asignar Nota");
        menuItemAsignNota.setOpaque(true);
        menuItemAsignNota.setPreferredSize(new java.awt.Dimension(115, 55));
        menuItemAsignNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAsignNotaActionPerformed(evt);
            }
        });
        menuAdministracion.add(menuItemAsignNota);

        barraMenu.add(menuAdministracion);

        menuConsultas.setBackground(new java.awt.Color(15, 63, 119));
        menuConsultas.setForeground(new java.awt.Color(223, 232, 225));
        menuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        menuConsultas.setText("Consultas");
        menuConsultas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuConsultas.setMaximumSize(new java.awt.Dimension(250, 32767));
        menuConsultas.setOpaque(true);
        menuConsultas.setPreferredSize(new java.awt.Dimension(240, 35));
        menuConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuConsultasMouseExited(evt);
            }
        });

        menuItemBuscarAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBuscarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBuscarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarUsuario.png"))); // NOI18N
        menuItemBuscarAlumno.setText("Buscar alumno");
        menuItemBuscarAlumno.setOpaque(true);
        menuItemBuscarAlumno.setPreferredSize(new java.awt.Dimension(200, 55));
        menuItemBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarAlumnoActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemBuscarAlumno);

        menuItemListarAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemListarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemListarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listaUsuarios.png"))); // NOI18N
        menuItemListarAlumno.setText("Listar alumnos");
        menuItemListarAlumno.setOpaque(true);
        menuItemListarAlumno.setPreferredSize(new java.awt.Dimension(121, 55));
        menuItemListarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarAlumnoActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemListarAlumno);

        menuItemBuscarMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBuscarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBuscarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarMateria.png"))); // NOI18N
        menuItemBuscarMateria.setText("Buscar materia");
        menuItemBuscarMateria.setOpaque(true);
        menuItemBuscarMateria.setPreferredSize(new java.awt.Dimension(131, 55));
        menuItemBuscarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarMateriaActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemBuscarMateria);

        menuItemListarMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemListarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemListarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrarNotas.png"))); // NOI18N
        menuItemListarMateria.setText("Listar materias");
        menuItemListarMateria.setOpaque(true);
        menuItemListarMateria.setPreferredSize(new java.awt.Dimension(131, 55));
        menuItemListarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarMateriaActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemListarMateria);

        barraMenu.add(menuConsultas);

        jMenu2.setEnabled(false);
        jMenu2.setPreferredSize(new java.awt.Dimension(300, 55));
        barraMenu.add(jMenu2);

        menuSalir.setBackground(new java.awt.Color(15, 63, 119));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.Ico.png"))); // NOI18N
        menuSalir.setFocusable(false);
        menuSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuSalir.setMaximumSize(new java.awt.Dimension(50, 32767));
        menuSalir.setOpaque(true);
        menuSalir.setPreferredSize(new java.awt.Dimension(50, 33));
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuSalirMouseExited(evt);
            }
        });
        barraMenu.add(menuSalir);
        menuSalir.getAccessibleContext().setAccessibleDescription("salir");

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCrearAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearAlumnoActionPerformed
        mostrarInternalFrame(new CrearAlumno());
    }//GEN-LAST:event_menuItemCrearAlumnoActionPerformed

    private void menuItemListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarAlumnoActionPerformed
        mostrarInternalFrame(new ListarAlumnosView());
    }//GEN-LAST:event_menuItemListarAlumnoActionPerformed

    private void menuAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlumnoMouseEntered
        menuAlumno.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_menuAlumnoMouseEntered

    private void menuAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlumnoMouseExited
        menuAlumno.setBackground(new Color(15, 63, 119));
    }//GEN-LAST:event_menuAlumnoMouseExited

    private void menuMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMateriaMouseEntered
        menuMateria.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_menuMateriaMouseEntered

    private void menuMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMateriaMouseExited
        menuMateria.setBackground(new Color(15, 63, 119));
    }//GEN-LAST:event_menuMateriaMouseExited

    private void menuAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAdministracionMouseEntered
        menuAdministracion.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_menuAdministracionMouseEntered

    private void menuAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAdministracionMouseExited
        menuAdministracion.setBackground(new Color(15, 63, 119));
    }//GEN-LAST:event_menuAdministracionMouseExited

    private void menuConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsultasMouseEntered
        menuConsultas.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_menuConsultasMouseEntered

    private void menuConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsultasMouseExited
        menuConsultas.setBackground(new Color(15, 63, 119));
    }//GEN-LAST:event_menuConsultasMouseExited

    private void menuSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseEntered
        menuSalir.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_menuSalirMouseEntered

    private void menuSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseExited
        menuSalir.setBackground(new Color(15, 63, 119));
    }//GEN-LAST:event_menuSalirMouseExited

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

    private void menuItemBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBorrarAlumnoActionPerformed
        mostrarInternalFrame(new EliminarAlumno());
    }//GEN-LAST:event_menuItemBorrarAlumnoActionPerformed

    private void menuItemBorrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBorrarMateriaActionPerformed
        mostrarInternalFrame(new EliminarMateria());
    }//GEN-LAST:event_menuItemBorrarMateriaActionPerformed

    private void menuItemInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInscribirActionPerformed
        mostrarInternalFrame(new InscripcionVista());
    }//GEN-LAST:event_menuItemInscribirActionPerformed

    private void menuItemCrearMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearMateriaActionPerformed
        mostrarInternalFrame(new CrearMateria());
    }//GEN-LAST:event_menuItemCrearMateriaActionPerformed

    private void menuItemModifMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModifMateriaActionPerformed
        mostrarInternalFrame(new ModificarMateria());
    }//GEN-LAST:event_menuItemModifMateriaActionPerformed

    private void menuItemBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarAlumnoActionPerformed
        mostrarInternalFrame(new BuscarAlumnoView());
    }//GEN-LAST:event_menuItemBuscarAlumnoActionPerformed

    private void menuItemBuscarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarMateriaActionPerformed
        mostrarInternalFrame(new BuscarMateriaView());
    }//GEN-LAST:event_menuItemBuscarMateriaActionPerformed

    private void menuItemListarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarMateriaActionPerformed
        mostrarInternalFrame(new MostrarMateriasView());
    }//GEN-LAST:event_menuItemListarMateriaActionPerformed

    private void menuItemAsignNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAsignNotaActionPerformed
        mostrarInternalFrame(new AsignarNota());
    }//GEN-LAST:event_menuItemAsignNotaActionPerformed

    private void menuItemModifAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModifAlumnoActionPerformed
        mostrarInternalFrame(new ModificarAlumno());
    }//GEN-LAST:event_menuItemModifAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    private void mostrarInternalFrame(JInternalFrame ventana) {
        if (ventana != null) {
            escritorio.removeAll();
            escritorio.repaint();
            ventana.setVisible(true);
            ventana.setLocation(escritorio.getWidth()/2-ventana.getWidth()/2, 30);
            escritorio.add(ventana);
            escritorio.add(labelFondoLogo);
            escritorio.add(labelFooter);
            escritorio.moveToFront(this);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel labelFondoLogo;
    private javax.swing.JLabel labelFooter;
    private javax.swing.JMenu menuAdministracion;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuItemAsignNota;
    private javax.swing.JMenuItem menuItemBorrarAlumno;
    private javax.swing.JMenuItem menuItemBorrarMateria;
    private javax.swing.JMenuItem menuItemBuscarAlumno;
    private javax.swing.JMenuItem menuItemBuscarMateria;
    private javax.swing.JMenuItem menuItemCrearAlumno;
    private javax.swing.JMenuItem menuItemCrearMateria;
    private javax.swing.JMenuItem menuItemInscribir;
    private javax.swing.JMenuItem menuItemListarAlumno;
    private javax.swing.JMenuItem menuItemListarMateria;
    private javax.swing.JMenuItem menuItemModifAlumno;
    private javax.swing.JMenuItem menuItemModifMateria;
    private javax.swing.JMenu menuMateria;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JPanel panelEscritorio;
    // End of variables declaration//GEN-END:variables
}
