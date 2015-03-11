package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Cliente")
public class Cliente {
    @DatabaseField
    private String id_cliente;
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
    private String sexo;
    @DatabaseField
    private String telefono;
    
    public Cliente(){    
    }
    
    public Cliente(String id_cliente, String nombre, String apellidos, String direccion,
            String email, String fechaNacimiento, String sexo, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
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

    public String getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

}
