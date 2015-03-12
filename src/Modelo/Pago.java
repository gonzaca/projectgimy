package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Pago")
public class Pago {

    @DatabaseField(id = true, generatedId = true)
    private int id;
    @DatabaseField
    private String fecha;
    @DatabaseField
    private double monto;
    @DatabaseField(foreign = true, columnName = "cliente")
    private Cliente cliente;

    public Pago(){
    }
    
    public Pago(int id, String fecha, double monto, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
