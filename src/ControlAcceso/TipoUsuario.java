package ControlAcceso;

public enum TipoUsuario {
    ALUMNO(1),
    PROFESOR(3),
    ADMINISTRATIVO(5),
    ROOT(9);

    private int nivelAcceso;

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    private TipoUsuario(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }
}
