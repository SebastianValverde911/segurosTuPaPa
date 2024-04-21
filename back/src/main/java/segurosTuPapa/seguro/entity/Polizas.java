package segurosTuPapa.seguro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "polizas")
public class Polizas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="valor")
    private String valor;

    @Column(name="cobertura")
    private String cobertura;

    public Polizas() {
    }

    public Polizas(long id, String nombre, String descripcion, String valor, String cobertura) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.cobertura = cobertura;
    }

}
