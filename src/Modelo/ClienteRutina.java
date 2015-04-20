package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ClienteRutina")
public class ClienteRutina {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String cliente;
    @DatabaseField
    private int rutina;

    public ClienteRutina() {
    }
    
    public ClienteRutina(String cliente, int rutina) {
        this.cliente = cliente;
        this.rutina = rutina;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getRutina() {
        return rutina;
    }

    public void setRutina(int rutina) {
        this.rutina = rutina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
