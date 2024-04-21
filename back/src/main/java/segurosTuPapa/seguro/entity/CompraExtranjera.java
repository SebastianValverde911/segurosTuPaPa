package segurosTuPapa.seguro.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "compraextranjera")
public class CompraExtranjera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="idtransaccion")
    private String idTransaccion;

    @Column(name="monto")
    private String monto;

    @Column(name="moneda")
    private String moneda;

    public CompraExtranjera() {
    }

    public CompraExtranjera(String moneda, long id, String idTransaccion, String monto) {
        this.moneda = moneda;
        this.id = id;
        this.idTransaccion = idTransaccion;
        this.monto = monto;
    }

}
