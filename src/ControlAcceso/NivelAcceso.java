package ControlAcceso;

import javax.swing.JFrame;
import vistas.MenuPrincipal;

public class NivelAcceso {

    private int nivel;
    private MenuPrincipal ventana;

    public NivelAcceso(MenuPrincipal ventana) {
        this.ventana = ventana;
    }

    public void habiltarAcceso(TipoUsuario usuario) {
        switch (usuario.getNivelAcceso()) {
            case 1:
                accesoAlumno();
                break;
            case 3:
                accesoProfesor();
                break;
            case 5:
                accesoAdministrativo();
                break;
            case 9:
                accesoTotal();
                break;
        }
    }

    private void accesoAlumno() {
        ventana.getMenuAlumno().setEnabled(true);
        ventana.getMenuMateria().setEnabled(false);
        ventana.getMenuItemInscribir().setEnabled(true);
        ventana.getMenuItemAsignNota().setEnabled(false);
        ventana.getMenuConsultas().setEnabled(true);
    }

    private void accesoProfesor() {
        ventana.getMenuAlumno().setEnabled(false);
        ventana.getMenuMateria().setEnabled(true);
        ventana.getMenuItemInscribir().setEnabled(false);
        ventana.getMenuItemAsignNota().setEnabled(true);
        ventana.getMenuConsultas().setEnabled(true);
    }

    private void accesoAdministrativo() {
        ventana.getMenuAlumno().setEnabled(true);
        ventana.getMenuMateria().setEnabled(true);
        ventana.getMenuItemInscribir().setEnabled(true);
        ventana.getMenuItemAsignNota().setEnabled(false);
        ventana.getMenuConsultas().setEnabled(true);
    }

    private void accesoTotal() {
        ventana.getMenuAlumno().setEnabled(true);
        ventana.getMenuMateria().setEnabled(true);
        ventana.getMenuItemInscribir().setEnabled(true);
        ventana.getMenuItemAsignNota().setEnabled(true);
        ventana.getMenuConsultas().setEnabled(true);
    }

}
