package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ClienteRutina")
public class ClienteRutina {
    @DatabaseField(uniqueCombo = true)
    private String cliente;
    @DatabaseField(uniqueCombo = true)
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
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
    
}
