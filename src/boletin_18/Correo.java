package boletin_18;


public class Correo {
    private boolean estado;
    private String contido;

    public Correo() {
    }

    public Correo(String contido) {
        this.estado = false; //inicializo en false porque al crearlo no estsa leido
        this.contido = contido;
    }

    @Override
    public String toString() {
        return "Correo{" + "estado=" + estado + ", contido=" + contido + '}';
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }
    
    
}
