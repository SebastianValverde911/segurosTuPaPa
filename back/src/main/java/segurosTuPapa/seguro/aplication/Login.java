package segurosTuPapa.seguro.aplication;

public class Login {

    private String correo;
    private String contraseña;

    public Login(String contraseña, String correo) {
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
