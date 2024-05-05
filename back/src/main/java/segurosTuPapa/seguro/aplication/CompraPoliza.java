package segurosTuPapa.seguro.aplication;

import jakarta.persistence.*;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCoberturapoliza() {
        return coberturapoliza;
    }

    public void setCoberturapoliza(String coberturapoliza) {
        this.coberturapoliza = coberturapoliza;
    }

    public String getNumerodecuotas() {
        return numerodecuotas;
    }

    public void setNumerodecuotas(String numerodecuotas) {
        this.numerodecuotas = numerodecuotas;
    }

    public String getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }
}
