package Modelo;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@DatabaseTable(tableName = "Cliente")
public class Cliente {
    @DatabaseField(id = true)
    private String id_cliente;
    @ForeignCollectionField
    private ForeignCollection<Seguimiento> seguimientos;
    @ForeignCollectionField(eager = true)
    private ForeignCollection<Pago> pagos;
    @ForeignCollectionField
    private ForeignCollection<Nutricion> planes_nutricionales;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String apellidos;
    @DatabaseField
    private String direccion;
    @DatabaseField
    private String email;
    @DatabaseField
    private String fechaNacimiento;
    @DatabaseField
    private int sexo;
    @DatabaseField
    private String telefono;
    @DatabaseField
    private String fechaInscripcion;
    
    public Cliente(){    
    }
    
    public Cliente(String id_cliente, String nombre, String apellidos, String direccion,
            String email, String fechaNacimiento, int sexo, String telefono, String fechaInscripcion) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.fechaInscripcion = fechaInscripcion;
    }
    
    private String currenDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public ForeignCollection<Seguimiento> getSeguimientos() {
        return seguimientos;
    }

    public ForeignCollection<Pago> getPagos() {
        return pagos;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }


    public ForeignCollection<Nutricion> getPlanes_nutricionales() {
        return planes_nutricionales;
    }

    public void setPlanes_nutricionales(ForeignCollection<Nutricion> planes_nutricionales) {
        this.planes_nutricionales = planes_nutricionales;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
}
