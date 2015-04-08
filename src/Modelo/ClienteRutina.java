package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Cliente_Rutina")
public class ClienteRutina {

    @DatabaseField(uniqueCombo = true)
    private String cliente;
    @DatabaseField(uniqueCombo = true)
    private int rutina;

    public ClienteRutina(String cliente, int rutina) {
        this.cliente = cliente;
        this.rutina = rutina;
    }
    
}
