package DAO;

import Modelo.Cliente;
import Modelo.SaludCliente;
import Modelo.Seguimiento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Properties;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

public class DAO extends Observable {

    private Connection conn;
    private String tipo_unidad;

    public DAO() {
        try {
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            OracleDataSource ods = new OracleDataSource();
            Properties prop = new Properties();
            prop.put("internal_logon", "sysdba");
            ods.setUser("gym");
            ods.setPassword("gym");
            ods.setConnectionProperties(prop);
            ods.setURL(url);
            conn = ods.getConnection();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Can't find database driver: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Can't connect to database: " + e.getMessage());
        }
        tipo_unidad = "cm";
    }

    public String getTipo_unidad() {
        return tipo_unidad;
    }

    public void setCliente(String id_cliente, String nombre, String direccion,
            String email, String edad, String sexo, String telefono) {
        try {
            String query
                    = "insert into Cliente(id_cliente, nombre, direccion,"
                    + " email, edad, sexo, telefono) "
                    + "values('" + id_cliente + "', '" + nombre + "', '"
                    + direccion + "', '" + email + "'," + edad + ", '" + sexo + "', '" + telefono + "')";
            Statement st = this.conn.createStatement();
            st.executeUpdate(query);
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSeguimiento(float peso, String fecha, float imc, float grasa,
            float pecho, float espalda, float cadera, float gluteos,
            float cintura, float pierna_izquierda, float pierna_derecha,
            float pantorrilla_izquierda, float pantorrilla_derecha, float brazo_izquierdo,
            float brazo_derecho, float antebrazo_derecho, float antebrazo_izquierdo, String cliente) {
        String query
                = "insert into seguimiento(peso, fecha, imc, grasa,"
                + " pecho, espalda, cadera, gluteos, "
                + "cintura,pierna_izquierda,pierna_derecha,pantorrilla_izquierda,pantorrilla_derecha, "
                + "brazo_izquierdo, brazo_derecho, antebrazo_derecho,antebrazo_izquierdo, cliente)"
                + "values(" + peso + "," + fecha + "," + imc + "," + grasa + ","
                + pecho + "," + espalda + "," + cadera + "," + gluteos + ","
                + cintura + "," + pierna_izquierda + "," + pierna_derecha + ","
                + pantorrilla_izquierda + "," + pantorrilla_derecha + "," + brazo_izquierdo
                + "," + brazo_derecho + "," + antebrazo_derecho + "," + antebrazo_izquierdo + "," + cliente
                + ")";
        try {
            Statement st = this.conn.createStatement();
            st.executeUpdate(query);
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteCliente(String id_cliente) {
        try {
            Statement st = this.conn.createStatement();
            st.executeUpdate("delete from Cliente where id_cliente =" + id_cliente);
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSaludCliente(String lesion_osea, String desc_lesion_osea, String lesion_muscular,
            String desc_lesion_muscular, String enfermedad_cardiovascular, String desc_enfermedad_cardiovascular,
            String asfixia_por_ejercicio, String asmatico, String hipertenso,
            String diabetico, String fumador, String epileptico,
            String embarazo, String anemia, String mareos,
            String desmayo, String nauseas, String dificul_respirar,
            String pract_act_deportiva, String estuvo_otro_gym, String otro_padecimiento,
            String cliente) {
        String query = "insert into saludCliente( lesion_osea, desc_lesion_osea, lesion_muscular,"
                + " desc_lesion_muscular, enfermedad_cardiovascular, desc_enfermedad_cardiovascular,"
                + " asfixia_por_ejercicio, asmatico, hipertenso,"
                + " diabetico, fumador, epileptico,"
                + " embarazo, anemia, mareos,"
                + " desmayo, nauseas, dificul_respirar,"
                + " pract_act_deportiva, estuvo_otro_gym , otro_padecimiento,"
                + " cliente)" + "values("
                + lesion_osea + "," + desc_lesion_osea + "," + lesion_muscular + ","
                + desc_lesion_muscular + "," + enfermedad_cardiovascular + "," + desc_enfermedad_cardiovascular + ","
                + asfixia_por_ejercicio + "," + asmatico + "," + hipertenso + ","
                + diabetico + "," + fumador + "," + epileptico + ","
                + embarazo + "," + anemia + "," + mareos + ","
                + desmayo + "," + nauseas + "," + dificul_respirar + ","
                + pract_act_deportiva + "," + estuvo_otro_gym + "," + otro_padecimiento + ","
                + cliente + ")";
        try {
            Statement st = this.conn.createStatement();
            st.executeUpdate(query);
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Cliente getCliente(String type, String att) {
        Cliente c = new Cliente();
        try {
            Statement st = this.conn.createStatement();
            String query = "";
            switch (type) {
                case "E-mail":
                    query = "select * from cliente where email =" + att;
                    break;
                case "Nombre":
                    query = "select * from cliente where nombre =" + att;
                    break;
                case "Cedula":
                    query = "select * from cliente where id_cliente =" + att;
                    break;
                default:
                    break;
            }
            ResultSet rs = st.executeQuery(query);
            rs.next();
            System.out.println(rs.getString("id_cliente"));
            c = new Cliente(rs.getString("id_cliente"), rs.getString("nombre"),
                        rs.getString("direccion"), rs.getString("email"),
                        Integer.parseInt(rs.getString("edad")), rs.getString("sexo"),
                        rs.getString("telefono"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public HashMap<String, Double> getFechasYValores(Cliente c, String at) {
        List<Seguimiento> s = getSeguimientos(c.getId_cliente());
        System.out.println(s.isEmpty());
        HashMap<String, Double> m = new HashMap();
        switch (at) {
            case "Piernas":
                s.stream().forEach((a) -> {
                    double f = (a.getPierna_derecha() + a.getPierna_izquierda()) / 2;
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Brazos":
                s.stream().forEach((a) -> {
                    double f = (a.getBrazo_derecho() + a.getBrazo_izquierdo()) / 2;
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Pantorrillas":
                s.stream().forEach((a) -> {
                    double f = (a.getPantorrilla_derecha() + a.getPantorrilla_izquierda()) / 2;
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Antebrazos":
                s.stream().forEach((a) -> {
                    double f = (a.getAntebrazo_derecho() + a.getAntebrazo_izquierdo()) / 2;
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Cintura":
                s.stream().forEach((a) -> {
                    double f = (a.getCintura());
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Gluteos":
                s.stream().forEach((a) -> {
                    double f = (a.getGluteos());
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Cadera":
                s.stream().forEach((a) -> {
                    double f = (a.getCadera());
                    m.put(a.getFecha(), f);
                });
                break;
            case "Espalda":
                s.stream().forEach((a) -> {
                    double f = (a.getEspalda());
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Pecho":
                s.stream().forEach((a) -> {
                    double f = (a.getPecho());
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "cm";
                break;
            case "Grasa":
                s.stream().forEach((a) -> {
                    double f = (a.getGrasa());
                    m.put(a.getFecha(), f);
                });
                break;
            case "Peso":
                s.stream().forEach((a) -> {
                    double f = (a.getPeso());
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "kg";
                break;
            case "IMC":
                s.stream().forEach((a) -> {
                    double f = (a.getImc());
                    m.put(a.getFecha(), f);
                });
                tipo_unidad = "imc";
                break;
            default:
                break;
        }
        System.out.println("m: " + m.isEmpty());
        return m;
    }

    public List<Seguimiento> getSeguimientos(String id_cliente) {
        List<Seguimiento> list = new ArrayList();
        try {
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Seguimiento where cliente =" + id_cliente);
            while (rs.next()) {
                list.add(new Seguimiento(
                        rs.getString("seg_id"), Float.parseFloat(rs.getString("peso")), rs.getString("fecha"),
                        Float.parseFloat(rs.getString("imc")), Float.parseFloat(rs.getString("grasa")), Float.parseFloat(rs.getString("pecho")),
                        Float.parseFloat(rs.getString("espalda")), Float.parseFloat(rs.getString("cadera")), Float.parseFloat(rs.getString("gluteos")),
                        Float.parseFloat(rs.getString("cintura")), Float.parseFloat(rs.getString("pierna_izquierda")), Float.parseFloat(rs.getString("pierna_derecha")),
                        Float.parseFloat(rs.getString("pantorrilla_izquierda")), Float.parseFloat(rs.getString("pantorrilla_derecha")), Float.parseFloat(rs.getString("brazo_izquierdo")),
                        Float.parseFloat(rs.getString("brazo_derecho")), Float.parseFloat(rs.getString("antebrazo_derecho")),
                        Float.parseFloat(rs.getString("antebrazo_izquierdo")), rs.getString("antebrazo_derecho")
                ));
            }
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public SaludCliente getSaludCliente(String id_cliente) {
        SaludCliente sc = null;
        try {
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("select * from SaludCliente where cliente =" + id_cliente);
            while (rs.next()) {
                sc = new SaludCliente(
                        rs.getString("lesion_osea"), rs.getString("desc_lesion_osea"),
                        rs.getString("lesion_muscular"), rs.getString("desc_lesion_muscular"),
                        rs.getString("enfermedad_cardiovascular"), rs.getString("desc_enfermedad_cardiovascular"),
                        rs.getString("asfixia_por_ejercicio"), rs.getString("asmatico"), rs.getString("hipertenso"),
                        rs.getString("diabetico"), rs.getString("fumador"), rs.getString("epileptico"),
                        rs.getString("embarazo"), rs.getString("anemia"), rs.getString("mareos"),
                        rs.getString("desmayo"), rs.getString("nauseas"), rs.getString("dificul_respirar"),
                        rs.getString(" pract_act_deportiva"), rs.getString("estuvo_otro_gym"),
                        rs.getString("otro_padecimiento"), rs.getString("cliente")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return sc;
    }

    public String[] RecuperaAtributosCliente(String at) {//recupera datos como strings para llenar combobox
        String[] hash = null;
        ArrayList<String> atributos = new ArrayList();
        String atributo = "";
        String query = "";
        try {
            switch (at) {
                case "E-mail":
                    query = "select email from cliente";
                    atributo = "email";
                    break;
                case "Nombre":
                    query = "select nombre from cliente";
                    atributo = "nombre";
                    break;
                case "Cedula":
                    query = "select id_cliente from cliente";
                    atributo = "id_cliente";
                    break;
                default:
                    break;
            }
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                atributos.add(rs.getString(atributo));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return atributos.stream().toArray(String[]::new);
    }

    public void cerrarConexion() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
