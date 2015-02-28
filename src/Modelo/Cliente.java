package Modelo;

public class Cliente {

    private String id_cliente;
    private String nombre;
    private String direccion;
    private String email;
    private int edad;
    private String sexo;
    private String telefono;
    
    public Cliente(){
        
    }

    public Cliente(String id_cliente, String nombre, String direccion,
            String email, int edad, String sexo, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

}
