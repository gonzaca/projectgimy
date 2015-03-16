package Modelo;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Cliente")
public class Cliente {
    @DatabaseField(id = true)
    private String id_cliente;
    @ForeignCollectionField
    private ForeignCollection<Seguimiento> seguimientos;
    @ForeignCollectionField
    private ForeignCollection<Pago> pagos;
    @ForeignCollectionField
    private ForeignCollection<Rutina> rutinas;
    @ForeignCollectionField
    private ForeignCollection<Padecimiento> padecimientos;
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
    
    public Cliente(){    
    }
    
    public Cliente(String id_cliente, String nombre, String apellidos, String direccion,
            String email, String fechaNacimiento, int sexo, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
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

    public ForeignCollection<Rutina> getRutinas() {
        return rutinas;
    }

    public ForeignCollection<Padecimiento> getPadecimientos() {
        return padecimientos;
    }

}
