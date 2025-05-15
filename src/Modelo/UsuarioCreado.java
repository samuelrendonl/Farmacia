package Modelo;

public class UsuarioCreado {
    private String nombre;
    private String contraseña;

    public UsuarioCreado(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
}

