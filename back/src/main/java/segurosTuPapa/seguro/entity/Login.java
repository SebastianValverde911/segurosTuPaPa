package segurosTuPapa.seguro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Login {

    private String correo;
    private String contraseña;

    public Login(String contraseña, String correo) {
        this.contraseña = contraseña;
        this.correo = correo;
    }

}
