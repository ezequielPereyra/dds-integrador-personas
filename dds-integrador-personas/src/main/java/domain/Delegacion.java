package domain;

public class Delegacion {

    private Persona delegador;
    private Persona autorizado;
    private Motivo motivo;

    public Persona getDelegador() {
        return delegador;
    }

    public void setDelegador(Persona delegador) {
        this.delegador = delegador;
    }

    public Persona getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Persona autorizado) {
        this.autorizado = autorizado;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
}
