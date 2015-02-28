package Modelo;

public class Seguimiento {

    private String seg_id;
    private float peso;
    private String fecha;
    private float imc;
    private float grasa;
    private float pecho;
    private float espalda;
    private float cadera;
    private float gluteos;
    private float cintura;
    private float pierna_izquierda;
    private float pierna_derecha;
    private float pantorrilla_izquierda;
    private float pantorrilla_derecha;
    private float brazo_izquierdo;
    private float brazo_derecho;
    private float antebrazo_derecho;
    private float antebrazo_izquierdo;
    private String cliente;

    public Seguimiento(String seg_id, float peso, String fecha,
            float imc, float grasa, float pecho,
            float espalda, float cadera, float gluteos,
            float cintura, float pierna_izquierda, float pierna_derecha,
            float pantorrilla_izquierda, float pantorrilla_derecha, float brazo_izquierdo,
            float brazo_derecho, float antebrazo_derecho,
            float antebrazo_izquierdo, String cliente) {
        this.seg_id = seg_id;
        this.peso = peso;
        this.fecha = fecha;
        this.imc = imc;
        this.grasa = grasa;
        this.pecho = pecho;
        this.espalda = espalda;
        this.cadera = cadera;
        this.gluteos = gluteos;
        this.cintura = cintura;
        this.pierna_izquierda = pierna_izquierda;
        this.pierna_derecha = pierna_derecha;
        this.pantorrilla_izquierda = pantorrilla_izquierda;
        this.pantorrilla_derecha = pantorrilla_derecha;
        this.brazo_izquierdo = brazo_izquierdo;
        this.brazo_derecho = brazo_derecho;
        this.antebrazo_derecho = antebrazo_derecho;
        this.antebrazo_izquierdo = antebrazo_izquierdo;
        this.cliente = cliente;
    }

    public String getSeg_id() {
        return seg_id;
    }

    public float getPeso() {
        return peso;
    }

    public String getFecha() {
        return fecha;
    }

    public float getImc() {
        return imc;
    }

    public float getGrasa() {
        return grasa;
    }

    public float getPecho() {
        return pecho;
    }

    public float getEspalda() {
        return espalda;
    }

    public float getCadera() {
        return cadera;
    }

    public float getGluteos() {
        return gluteos;
    }

    public float getCintura() {
        return cintura;
    }

    public float getPierna_izquierda() {
        return pierna_izquierda;
    }

    public float getPierna_derecha() {
        return pierna_derecha;
    }

    public float getPantorrilla_izquierda() {
        return pantorrilla_izquierda;
    }

    public float getPantorrilla_derecha() {
        return pantorrilla_derecha;
    }

    public float getBrazo_izquierdo() {
        return brazo_izquierdo;
    }

    public float getBrazo_derecho() {
        return brazo_derecho;
    }

    public float getAntebrazo_derecho() {
        return antebrazo_derecho;
    }

    public float getAntebrazo_izquierdo() {
        return antebrazo_izquierdo;
    }

    public String getCliente() {
        return cliente;
    }

}
