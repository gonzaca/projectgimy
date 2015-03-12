package Modelo;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Rutina")
public class Rutina {
    @DatabaseField
    String tipo_rutina;
    @DatabaseField(id = true)
    int id;
    @DatabaseField
    String descripcion;
    @DatabaseField
    String tipo;
    @DatabaseField(foreign = true)
    Cliente cliente;
    @ForeignCollectionField
    private ForeignCollection<InfoRutina> infoRutinas;
     
     public Rutina(){
     }

    public Rutina(String tipo_rutina, int id, String descripcion, String tipo, Cliente cliente) {
        this.tipo_rutina = tipo_rutina;
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getTipo_rutina() {
        return tipo_rutina;
    }

    public void setTipo_rutina(String tipo_rutina) {
        this.tipo_rutina = tipo_rutina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ForeignCollection<InfoRutina> getInfoRutinas() {
        return infoRutinas;
    }

}
