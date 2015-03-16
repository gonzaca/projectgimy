package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "SaludCliente")
public class SaludCliente {
    @DatabaseField
    private int lesion_osea;
    @DatabaseField
    private String desc_lesion_osea;
    @DatabaseField
    private int lesion_muscular;
    @DatabaseField
    private String desc_lesion_muscular;
    @DatabaseField
    private int enfermedad_cardiovascular;
    @DatabaseField
    private String desc_enfermedad_cardiovascular;
    @DatabaseField
    private int asfixia_por_ejercicio;
    @DatabaseField
    private int asmatico;
    @DatabaseField
    private int hipertenso;
    @DatabaseField
    private int diabetico;
    @DatabaseField
    private int fumador;
    @DatabaseField
    private int epileptico;
    @DatabaseField
    private int embarazo;
    @DatabaseField
    private int anemia;
    @DatabaseField
    private int mareos;
    @DatabaseField
    private int desmayo;
    @DatabaseField
    private int nauseas;
    @DatabaseField
    private int dificul_respirar;
    @DatabaseField
    private int pract_act_deportiva;
    @DatabaseField
    private int estuvo_otro_gym;
    @DatabaseField
    private String otro_padecimiento;
    @DatabaseField(id = true)
    private String cliente;
    
     public SaludCliente(){
     }

    public SaludCliente(int lesion_osea, String desc_lesion_osea,
            int lesion_muscular, String desc_lesion_muscular,
            int enfermedad_cardiovascular, String desc_enfermedad_cardiovascular,
            int asfixia_por_ejercicio, int asmatico, int hipertenso,
            int diabetico, int fumador, int epileptico,
            int embarazo, int anemia, int mareos,
            int desmayo, int nauseas, int dificul_respirar,
            int pract_act_deportiva, int estuvo_otro_gym,
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

    public int getLesion_osea() {
        return lesion_osea;
    }

    public String getDesc_lesion_osea() {
        return desc_lesion_osea;
    }

    public int getLesion_muscular() {
        return lesion_muscular;
    }

    public String getDesc_lesion_muscular() {
        return desc_lesion_muscular;
    }

    public int getEnfermedad_cardiovascular() {
        return enfermedad_cardiovascular;
    }

    public String getDesc_enfermedad_cardiovascular() {
        return desc_enfermedad_cardiovascular;
    }

    public int getAsfixia_por_ejercicio() {
        return asfixia_por_ejercicio;
    }

    public int getAsmatico() {
        return asmatico;
    }

    public int getHipertenso() {
        return hipertenso;
    }

    public int getDiabetico() {
        return diabetico;
    }

    public int getFumador() {
        return fumador;
    }

    public int getEpileptico() {
        return epileptico;
    }

    public int getEmbarazo() {
        return embarazo;
    }

    public int getAnemia() {
        return anemia;
    }

    public int getMareos() {
        return mareos;
    }

    public int getDesmayo() {
        return desmayo;
    }

    public int getNauseas() {
        return nauseas;
    }

    public int getDificul_respirar() {
        return dificul_respirar;
    }

    public int getPract_act_deportiva() {
        return pract_act_deportiva;
    }

    public int getEstuvo_otro_gym() {
        return estuvo_otro_gym;
    }

    public String getOtro_padecimiento() {
        return otro_padecimiento;
    }

    public String getCliente() {
        return cliente;
    }

}
