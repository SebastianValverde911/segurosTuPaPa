package segurosTuPapa.seguro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "comprapoliza")
public class CompraPoliza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="iduser")
    private long iduser;

    @Column(name="nombre")
    private String nombre;

    @Column(name="correo")
    private String correo;

    @Column(name="apellido")
    private String apellido;

    @Column(name="telefono")
    private String telefono;

    @Column(name="coberturapoliza")
    private String coberturapoliza;

    @Column(name="formadepago")
    private String formadepago;

    @Column(name="numerodecuotas")
    private String numerodecuotas;

    public CompraPoliza() {
    }

    public CompraPoliza(long id, String numerodecuotas, String formadepago, String coberturapoliza, String telefono, String apellido, String correo, String nombre, long iduser) {
        this.id = id;
        this.numerodecuotas = numerodecuotas;
        this.formadepago = formadepago;
        this.coberturapoliza = coberturapoliza;
        this.telefono = telefono;
        this.apellido = apellido;
        this.correo = correo;
        this.nombre = nombre;
        this.iduser = iduser;
    }

}
