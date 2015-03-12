package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "InfoRutina")
public class InfoRutina {
    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField(foreign = true)
    int rutina;
    @DatabaseField
    String ejercicio;
    @DatabaseField
    String serie;
    @DatabaseField
    String repeticion;
    @DatabaseField
    double peso;
    @DatabaseField
    String tipo;

    public InfoRutina(){
    }
    
    public InfoRutina(int id, int rutina, String ejercicio, String serie, String repeticion, double peso, String tipo) {
        this.id = id;
        this.rutina = rutina;
        this.ejercicio = ejercicio;
        this.serie = serie;
        this.repeticion = repeticion;
        this.peso = peso;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRutina() {
        return rutina;
    }

    public void setRutina(int rutina) {
        this.rutina = rutina;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
       
}