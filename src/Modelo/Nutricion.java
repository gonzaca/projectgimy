package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "Nutricion")
public class Nutricion {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String nombre_plan;
    @DatabaseField(foreign = true, columnName = "cliente")
    private Cliente cliente;

    public Nutricion() {
    }

    public Nutricion(String nombre_plan, Cliente cliente) {
        this.nombre_plan = nombre_plan;
        this.cliente = cliente;
    }

    public String getNombre_plan() {
        return nombre_plan;
    }

    public void setNombre_plan(String nombre_plan) {
        this.nombre_plan = nombre_plan;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
