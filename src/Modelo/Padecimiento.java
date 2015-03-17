package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Padecimiento")
public class Padecimiento {

    @DatabaseField
    private String lesion_osea;
    @DatabaseField
    private String desc_lesion_osea;
    @DatabaseField
    private String lesion_muscular;
    @DatabaseField
    private String desc_lesion_muscular;
    @DatabaseField
    private String enfermedad_cardiovascular;
    @DatabaseField
    private String desc_enfermedad_cardiovascular;
    @DatabaseField
    private String asfixia_por_ejercicio;
    @DatabaseField
    private String asmatico;
    @DatabaseField
    private String hipertenso;
    @DatabaseField
    private String diabetico;
    @DatabaseField
    private String fumador;
    @DatabaseField
    private String epileptico;
    @DatabaseField
    private String embarazo;
    @DatabaseField
    private String anemia;
    @DatabaseField
    private String mareos;
    @DatabaseField
    private String desmayo;
    @DatabaseField
    private String nauseas;
    @DatabaseField
    private String dificul_respirar;
    @DatabaseField
    private String pract_act_deportiva;
    @DatabaseField
    private String estuvo_otro_gym;
    @DatabaseField
    private String otro_padecimiento;

    @DatabaseField(id = true, columnName = "id")
    private String id;
    @DatabaseField(foreign = true, unique = true, columnName = "cliente")
    private Cliente cliente;

    public Padecimiento() {
    }

    public Padecimiento(String lesion_osea, String desc_lesion_osea, String lesion_muscular,
            String desc_lesion_muscular, String enfermedad_cardiovascular,
            String desc_enfermedad_cardiovascular, String asfixia_por_ejercicio,
            String asmatico, String hipertenso, String diabetico, String fumador,
            String epileptico, String embarazo, String anemia, String mareos,
            String desmayo, String nauseas, String dificul_respirar,
            String pract_act_deportiva, String estuvo_otro_gym, String otro_padecimiento,
            String id, Cliente cliente) {
        this.lesion_osea = lesion_osea;
        this.desc_lesion_osea = desc_lesion_osea;
        this.lesion_muscular = lesion_muscular;
        this.desc_lesion_muscular = desc_lesion_muscular;
        this.enfermedad_cardiovascular = enfermedad_cardiovascular;
        this.desc_enfermedad_cardiovascular = desc_enfermedad_cardiovascular;
        this.asfixia_por_ejercicio = asfixia_por_ejercicio;
        this.asmatico = asmatico;
        this.hipertenso = hipertenso;
        this.diabetico = diabetico;
        this.fumador = fumador;
        this.epileptico = epileptico;
        this.embarazo = embarazo;
        this.anemia = anemia;
        this.mareos = mareos;
        this.desmayo = desmayo;
        this.nauseas = nauseas;
        this.dificul_respirar = dificul_respirar;
        this.pract_act_deportiva = pract_act_deportiva;
        this.estuvo_otro_gym = estuvo_otro_gym;
        this.otro_padecimiento = otro_padecimiento;
        this.id = id;
        this.cliente = cliente;
    }

    public String getLesion_osea() {
        return lesion_osea;
    }

    public void setLesion_osea(String lesion_osea) {
        this.lesion_osea = lesion_osea;
    }

    public String getDesc_lesion_osea() {
        return desc_lesion_osea;
    }

    public void setDesc_lesion_osea(String desc_lesion_osea) {
        this.desc_lesion_osea = desc_lesion_osea;
    }

    public String getLesion_muscular() {
        return lesion_muscular;
    }

    public void setLesion_muscular(String lesion_muscular) {
        this.lesion_muscular = lesion_muscular;
    }

    public String getDesc_lesion_muscular() {
        return desc_lesion_muscular;
    }

    public void setDesc_lesion_muscular(String desc_lesion_muscular) {
        this.desc_lesion_muscular = desc_lesion_muscular;
    }

    public String getEnfermedad_cardiovascular() {
        return enfermedad_cardiovascular;
    }

    public void setEnfermedad_cardiovascular(String enfermedad_cardiovascular) {
        this.enfermedad_cardiovascular = enfermedad_cardiovascular;
    }

    public String getDesc_enfermedad_cardiovascular() {
        return desc_enfermedad_cardiovascular;
    }

    public void setDesc_enfermedad_cardiovascular(String desc_enfermedad_cardiovascular) {
        this.desc_enfermedad_cardiovascular = desc_enfermedad_cardiovascular;
    }

    public String getAsfixia_por_ejercicio() {
        return asfixia_por_ejercicio;
    }

    public void setAsfixia_por_ejercicio(String asfixia_por_ejercicio) {
        this.asfixia_por_ejercicio = asfixia_por_ejercicio;
    }

    public String getAsmatico() {
        return asmatico;
    }

    public void setAsmatico(String asmatico) {
        this.asmatico = asmatico;
    }

    public String getHipertenso() {
        return hipertenso;
    }

    public void setHipertenso(String hipertenso) {
        this.hipertenso = hipertenso;
    }

    public String getDiabetico() {
        return diabetico;
    }

    public void setDiabetico(String diabetico) {
        this.diabetico = diabetico;
    }

    public String getFumador() {
        return fumador;
    }

    public void setFumador(String fumador) {
        this.fumador = fumador;
    }

    public String getEpileptico() {
        return epileptico;
    }

    public void setEpileptico(String epileptico) {
        this.epileptico = epileptico;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(String embarazo) {
        this.embarazo = embarazo;
    }

    public String getAnemia() {
        return anemia;
    }

    public void setAnemia(String anemia) {
        this.anemia = anemia;
    }

    public String getMareos() {
        return mareos;
    }

    public void setMareos(String mareos) {
        this.mareos = mareos;
    }

    public String getDesmayo() {
        return desmayo;
    }

    public void setDesmayo(String desmayo) {
        this.desmayo = desmayo;
    }

    public String getNauseas() {
        return nauseas;
    }

    public void setNauseas(String nauseas) {
        this.nauseas = nauseas;
    }

    public String getDificul_respirar() {
        return dificul_respirar;
    }

    public void setDificul_respirar(String dificul_respirar) {
        this.dificul_respirar = dificul_respirar;
    }

    public String getPract_act_deportiva() {
        return pract_act_deportiva;
    }

    public void setPract_act_deportiva(String pract_act_deportiva) {
        this.pract_act_deportiva = pract_act_deportiva;
    }

    public String getEstuvo_otro_gym() {
        return estuvo_otro_gym;
    }

    public void setEstuvo_otro_gym(String estuvo_otro_gym) {
        this.estuvo_otro_gym = estuvo_otro_gym;
    }

    public String getOtro_padecimiento() {
        return otro_padecimiento;
    }

    public void setOtro_padecimiento(String otro_padecimiento) {
        this.otro_padecimiento = otro_padecimiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
