package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "EjerciciosRutina")
public class EjerciciosRutina {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String parteCuerpo;
    @DatabaseField
    private String ejercicio;
    @DatabaseField
    private String serie;
    @DatabaseField
    private String repeticion;
    @DatabaseField
    private String peso;
    @DatabaseField(foreign = true, unique = true, columnName = "rutina")
    private Rutina rutina;

    public EjerciciosRutina() {
    }

    public EjerciciosRutina(String parteCuerpo, String ejercicio, String serie, String repeticion, String peso, Rutina rutina) {
        this.parteCuerpo = parteCuerpo;
        this.ejercicio = ejercicio;
        this.serie = serie;
        this.repeticion = repeticion;
        this.peso = peso;
        this.rutina = rutina;        
    }

    public int getId() {
        return id;
    }

    public String getParteCuerpo() {
        return parteCuerpo;
    }

    public void setParteCuerpo(String parteCuerpo) {
        this.parteCuerpo = parteCuerpo;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(String repeticion) {
        this.repeticion = repeticion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public void setId(int id) {
        this.id = id;
    }

}
