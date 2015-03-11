package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "SaludCliente")
public class SaludCliente {
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
    private String cliente;

    public SaludCliente(String lesion_osea, String desc_lesion_osea,
            String lesion_muscular, String desc_lesion_muscular,
            String enfermedad_cardiovascular, String desc_enfermedad_cardiovascular,
            String asfixia_por_ejercicio, String asmatico, String hipertenso,
            String diabetico, String fumador, String epileptico,
            String embarazo, String anemia, String mareos,
            String desmayo, String nauseas, String dificul_respirar,
            String pract_act_deportiva, String estuvo_otro_gym,
            String otro_padecimiento, String cliente) {
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
        this.cliente = cliente;
    }

    public String getLesion_osea() {
        return lesion_osea;
    }

    public String getDesc_lesion_osea() {
        return desc_lesion_osea;
    }

    public String getLesion_muscular() {
        return lesion_muscular;
    }

    public String getDesc_lesion_muscular() {
        return desc_lesion_muscular;
    }

    public String getEnfermedad_cardiovascular() {
        return enfermedad_cardiovascular;
    }

    public String getDesc_enfermedad_cardiovascular() {
        return desc_enfermedad_cardiovascular;
    }

    public String getAsfixia_por_ejercicio() {
        return asfixia_por_ejercicio;
    }

    public String getAsmatico() {
        return asmatico;
    }

    public String getHipertenso() {
        return hipertenso;
    }

    public String getDiabetico() {
        return diabetico;
    }

    public String getFumador() {
        return fumador;
    }

    public String getEpileptico() {
        return epileptico;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public String getAnemia() {
        return anemia;
    }

    public String getMareos() {
        return mareos;
    }

    public String getDesmayo() {
        return desmayo;
    }

    public String getNauseas() {
        return nauseas;
    }

    public String getDificul_respirar() {
        return dificul_respirar;
    }

    public String getPract_act_deportiva() {
        return pract_act_deportiva;
    }

    public String getEstuvo_otro_gym() {
        return estuvo_otro_gym;
    }

    public String getOtro_padecimiento() {
        return otro_padecimiento;
    }

    public String getCliente() {
        return cliente;
    }

}
