package segurosTuPapa.seguro.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "users")
public class User {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter
    @Column(name="nombre")
    private String nombre;

    @Setter
    @Column(name="apellido")
    private String apellido;

    @Setter
    @Column(name="correo")
    private String correo;

    @Setter
    @Column(name="telefono")
    private String telefono;

    @Column(name="contraseña")
    private String contraseña;

    public User(long id, String nombre, String apellido, String correo, String telefono , String contraseña){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }

    public User() {

    }

    public void setContraseña(String telefono) {
        this.contraseña = contraseña;
    }
}
