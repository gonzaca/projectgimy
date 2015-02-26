package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;
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
            ods.setUser("gym");
            ods.setPassword("gym");
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
                    + "values(" + id_cliente + ", " + nombre + ", " 
                    + direccion + "," + email + "," + edad + "," + sexo + "," + telefono + ")";
            Statement st = this.conn.createStatement();
            st.executeUpdate(query);
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSeguimiento(
            float peso,
            String fecha,
            float imc,
            float grasa,
            float pecho,
            float espalda,
            float cadera,
            float gluteos,
            float cintura,
            float pierna_izquierda,
            float pierna_derecha,
            float pantorrilla_izquierda,
            float pantorrilla_derecha,
            float brazo_izquierdo,
            float brazo_derecho,
            float antebrazo_derecho,
            float antebrazo_izquierdo,
            String cliente) {
        String query
                = "insert into seguimiento(peso, fecha, imc, grasa, pecho, espalda, cadera, gluteos, "
                + "cintura,pierna_izquierda,pierna_derecha,pantorrilla_izquierda,pantorrilla_derecha, "
                + "brazo_izquierdo, brazo_derecho, antebrazo_derecho,antebrazo_izquierdo, cliente)"
                + "values(" +peso+","+ fecha+","+imc+","+grasa+","+pecho+","+espalda+","+cadera+","+
                gluteos+","+cintura+","+pierna_izquierda+","+pierna_derecha+","+
                pantorrilla_izquierda+","+pantorrilla_derecha+","+brazo_izquierdo+
                ","+ brazo_derecho+","+ antebrazo_derecho+","+ antebrazo_izquierdo+","+ cliente+
                ")";
        try {
            Statement st = this.conn.createStatement();
            st.executeUpdate(query);
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//    public void deleteCliente(String id_cliente) {
//        try {
//            daoCliente.deleteById(id_cliente);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public void setSaludCliente() {
//        try {
//            daoPadecimiento.createOrUpdate(p);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public Cliente getCliente(String type, String att) {
//        Cliente c = null;
//        try {
//            switch (type) {
//                case "E-mail":
//                    c = daoCliente.queryForEq("email", att).get(0);
//                    break;
//                case "Nombre":
//                    c = daoCliente.queryForEq("nombre", att).get(0);
//                    break;
//                case "Cedula":
//                    c = daoCliente.queryForEq("id_cliente", att).get(0);
//                    break;
//                default:
//                    break;
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return c;
//    }
//
//    public HashMap<String, Double> getFechasYValores(Cliente c, String at) {
//        List<Seguimiento> s = getSeguimientos(c.getId_cliente());
//        System.out.println(s.isEmpty());
//        HashMap<String, Double> m = new HashMap();
//        switch (at) {
//            case "Piernas":
//                s.stream().forEach((a) -> {
//                    double f = (a.getPierna_derecha() + a.getPierna_izquierda()) / 2;
//                    m.put(a.getFecha(), f);
//                });
//                 tipo_unidad= "cm";
//                break;
//            case "Brazos":
//                s.stream().forEach((a) -> {
//                    double f = (a.getBrazo_derecho() + a.getBrazo_izquierdo()) / 2;
//                    m.put(a.getFecha(), f);
//                }); tipo_unidad= "cm";
//                break;
//            case "Pantorrillas":
//                s.stream().forEach((a) -> {
//                    double f = (a.getPantorrilla_derecha() + a.getPantorrilla_izquierda()) / 2;
//                    m.put(a.getFecha(), f);
//                }); tipo_unidad= "cm";
//                break;
//            case "Antebrazos":
//                s.stream().forEach((a) -> {
//                    double f = (a.getAntebrazo_derecho() + a.getAntebrazo_izquierdo()) / 2;
//                    m.put(a.getFecha(), f);
//                }); tipo_unidad= "cm";
//                break;
//            case "Cintura":
//                s.stream().forEach((a) -> {
//                    double f = (a.getCintura());
//                    m.put(a.getFecha(), f);
//                }); tipo_unidad= "cm";
//                break;
//            case "Gluteos":
//                s.stream().forEach((a) -> {
//                    double f = (a.getGluteos());
//                    m.put(a.getFecha(), f);
//                }); tipo_unidad= "cm";
//                break;
//            case "Cadera":
//                s.stream().forEach((a) -> {
//                    double f = (a.getCadera());
//                    m.put(a.getFecha(), f);
//                });
//                break;
//            case "Espalda":
//                s.stream().forEach((a) -> {
//                    double f = (a.getEspalda());
//                    m.put(a.getFecha(), f);
//                }); tipo_unidad= "cm";
//                break;
//            case "Pecho":
//                s.stream().forEach((a) -> {
//                    double f = (a.getPecho());
//                    m.put(a.getFecha(), f);
//                }); tipo_unidad= "cm";
//                break;
//            case "Grasa":
//                s.stream().forEach((a) -> {
//                    double f = (a.getGrasa());
//                    m.put(a.getFecha(), f);
//                });
//                break;
//            case "Peso":
//                s.stream().forEach((a) -> {
//                    double f = (a.getPeso());
//                    m.put(a.getFecha(), f);
//                });
//                tipo_unidad= "kg";
//                break;
//            case "IMC":
//                s.stream().forEach((a) -> {
//                    double f = (a.getImc());
//                    m.put(a.getFecha(), f);
//                });
//                tipo_unidad= "imc";
//                break;
//            default:
//                break;
//        }
//        System.out.println("m: "+m.isEmpty());
//        return m;
//    }
//
//    public List<Seguimiento> getSeguimientos(String id_cliente) {
//        List<Seguimiento> list = null;
//        try {
//            list = daoSeguimiento.queryForEq("id_cliente", id_cliente);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return list;
//    }
//
//    public Padecimiento getPadecimiento(String id_cliente) {
//        Padecimiento p = null;
//        try {
//            p = daoPadecimiento.queryForId(id_cliente);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return p;
//    }
//
//    public String[] RecuperaAtributosCliente(String at) {//recupera datos como strings para llenar combobox
//        String[] hash = null;
//        try {
//            switch (at) {
//                case "E-mail":
//                    hash = daoCliente.query(
//                            daoCliente.queryBuilder().where().isNotNull("email").prepare()
//                    ).stream().
//                            map((a) -> {
//                                return a.getEmail();
//                            }).
//                            toArray(String[]::new);
//                    break;
//                case "Nombre":
//                    hash = daoCliente.query(daoCliente.queryBuilder().where().isNotNull("nombre").prepare()).stream().
//                            map((a) -> {
//                                return a.getNombre();
//                            }).
//                            toArray(String[]::new);
//                    break;
//                case "Cedula":
//                    hash = daoCliente.query(daoCliente.queryBuilder().where().isNotNull("id_cliente").prepare()).stream().
//                            map((a) -> {
//                                return a.getId_cliente();
//                            }).
//                            toArray(String[]::new);
//                    break;
//                default:
//                    break;
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return hash;
//    }
    public void cerrarConexion() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
