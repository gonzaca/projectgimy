package Modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Administradores")
public class Administrador {
    @DatabaseField(id = true)
    private String userid;
    @DatabaseField
    private String pass;
    
    public Administrador(){
        
    }
    public Administrador(String n, String p){
        this.userid = n;
        this.pass=p;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
