package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Rutina")
public class Rutina {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private int tipo_rutina;
    @DatabaseField
    private String nombre;

    public Rutina() {
    }

    public Rutina(int tipo_rutina, String nombre) {
        this.tipo_rutina = tipo_rutina;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public int getTipo_rutina() {
        return tipo_rutina;
    }

    public void setTipo_rutina(int tipo_rutina) {
        this.tipo_rutina = tipo_rutina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

}
