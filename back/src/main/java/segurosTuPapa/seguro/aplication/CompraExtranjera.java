package segurosTuPapa.seguro.aplication;


import jakarta.persistence.*;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}
