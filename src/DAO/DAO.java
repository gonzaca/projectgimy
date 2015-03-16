package DAO;

import Modelo.Cliente;
import Modelo.SaludCliente;
import Modelo.Seguimiento;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import java.util.List;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Observable;

public class DAO extends Observable {

    private Dao<Cliente, String> daoCliente;
    private Dao<SaludCliente, String> daoSaludCliente;
    private Dao<Seguimiento, String> daoSeguimiento;
    private JdbcConnectionSource connection;
    private static String databaseUrl = "jdbc:mysql://localhost:3306/gym";
    private String tipo_unidad;

    public DAO() throws Exception {
        connection = new JdbcConnectionSource(databaseUrl);
        connection.setUsername("gym");
        connection.setPassword("gym");
        daoCliente = DaoManager.createDao(connection, Cliente.class);
        daoSeguimiento = DaoManager.createDao(connection, Seguimiento.class);
        daoSaludCliente = DaoManager.createDao(connection, SaludCliente.class);
        tipo_unidad = "cm";
    }

    public String getTipo_unidad() {
        return tipo_unidad;
    }

    public void setCliente(Cliente c) {
        try {
            daoCliente.createOrUpdate(c);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSaludCliente(SaludCliente saludC) {
        try {
            daoSaludCliente.createOrUpdate(saludC);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSeguimiento(Seguimiento seg) {
        try {
            daoSeguimiento.createOrUpdate(seg);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteCliente(String id_cliente) {
        try {
            daoCliente.deleteById(id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Cliente getCliente(String type, String att) {
        Cliente c = null;
        try {
            switch (type) {
                case "E-mail":
                    c = daoCliente.queryForEq("email", att).get(0);
                    break;
                case "Nombre":
                    c = daoCliente.queryForEq("nombre", att).get(0);
                    break;
                case "Cedula":
                    c = daoCliente.queryForEq("id_cliente", att).get(0);
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public SaludCliente getSaludCliente(String att) {
        SaludCliente c = null;
        try {
            c = daoSaludCliente.queryForEq("cliente", att).get(0);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public HashMap<String, Double> getFechasYValores(Cliente c, String at) {
        List<Seguimiento> s = getSeguimientos(c.getId_cliente());
        System.out.println(s.isEmpty());
        HashMap<String, Double> m = new HashMap<String, Double>();
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
        List<Seguimiento> list = null;
        try {
            list = daoSeguimiento.queryForEq("id_cliente", id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public String[] RecuperaAtributosCliente(String at) {//recupera datos como strings para llenar combobox
        String[] hash = null;
        try {
            switch (at) {
                case "E-mail":
                    hash = daoCliente.query(
                            daoCliente.queryBuilder().where().isNotNull("email").prepare()
                    ).stream().
                            map((a) -> {
                                return a.getEmail();
                            }).
                            toArray(String[]::new);
                    break;
                case "Nombre":
                    hash = daoCliente.query(daoCliente.queryBuilder().where().isNotNull("nombre").prepare()).stream().
                            map((a) -> {
                                return a.getNombre();
                            }).
                            toArray(String[]::new);
                    break;
                case "Cedula":
                    hash = daoCliente.query(daoCliente.queryBuilder().where().isNotNull("id_cliente").prepare()).stream().
                            map((a) -> {
                                return a.getId_cliente();
                            }).
                            toArray(String[]::new);
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return hash;
    }

    public void cerrarConexion() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
