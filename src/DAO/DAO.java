package DAO;

import Modelo.*;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import java.util.List;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Observable;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class DAO extends Observable {

    private Dao<Cliente, String> daoCliente;
    private Dao<SaludCliente, String> daoSaludCliente;
    private Dao<Rutina, String> daoRutina;
    private Dao<EjerciciosRutina, String> daoEjerciciosRutina;
    private Dao<ClienteRutina, String> daoClienteRutina;
    private Dao<Seguimiento, String> daoSeguimiento;
    private Dao<Pago, String> daoPago;
    private Dao<Nutricion, String> daoNutricion;
    private Dao<Administrador, String> daoAdmin;
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
        daoRutina = DaoManager.createDao(connection, Rutina.class);
        daoEjerciciosRutina = DaoManager.createDao(connection, EjerciciosRutina.class);
        daoClienteRutina = DaoManager.createDao(connection, ClienteRutina.class);
        daoPago = DaoManager.createDao(connection, Pago.class);
        daoNutricion = DaoManager.createDao(connection, Nutricion.class);
        daoAdmin = DaoManager.createDao(connection, Administrador.class);
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

    public void setPago(Pago p) {
        try {
            daoPago.createOrUpdate(p);
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

    public void setNutricionCliente(Nutricion NutricionC) {
        try {
            daoNutricion.createOrUpdate(NutricionC);
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

    public void setRutina(Rutina r) {
        try {
            daoRutina.createOrUpdate(r);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setEjerciciosRutina(EjerciciosRutina r) {
        try {
            daoEjerciciosRutina.createOrUpdate(r);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setClienteRutina(ClienteRutina r) {
        try {
            daoClienteRutina.create(r);
            JOptionPane.showMessageDialog(null, "Rutina Asignada correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Rutina ya fue se asignada, o no se pudo asignar esa rutina.", "Error", JOptionPane.INFORMATION_MESSAGE);
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

    public List<Cliente> todoClientes() throws SQLException {
        return daoCliente.queryForAll();
    }

    public List<Rutina> todoRutina() throws SQLException {
        return daoRutina.queryForAll();
    }

    public Rutina getRutina(int att) {
        Rutina r = null;
        List<Rutina> l = null;
        try {
            l = daoRutina.queryForEq("id", att);
            r = !l.isEmpty() ? l.get(0) : null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return r;
    }
    
    public Rutina getRutinaCliente(String att) {
        Rutina r = null;
        ClienteRutina cr = null;
        List<ClienteRutina> l = null;
        try {
            l = daoClienteRutina.queryForEq("cliente", att);
            cr = !l.isEmpty() ? l.get(l.size()-1) : null;
            r= getRutina(cr.getRutina());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return r;
    }
    

    public SaludCliente getSaludCliente(String att) {
        SaludCliente c = null;
        List<SaludCliente> l = null;
        try {
            l = daoSaludCliente.queryForEq("cliente", att);
            c = !l.isEmpty() ? l.get(0) : null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public Nutricion getNutricionCliente(String att) {
        Nutricion c = null;
        List<Nutricion> l = null;
        try {
            l = daoNutricion.queryForEq("cliente", att);
            c = !l.isEmpty() ? l.get(0) : null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public List<EjerciciosRutina> getEjeRutina(int att) {
        List<EjerciciosRutina> l = null;
        try {
            l = daoEjerciciosRutina.queryForEq("rutina", att);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return l;
    }
    
    public Administrador getAdmin(String user, String pass) {
        Administrador a = null;
        List<Administrador> l = null;
        try {
            l = daoAdmin.query(daoAdmin.queryBuilder().where().eq("userid", user).and().eq("pass", pass).prepare());
            a = !l.isEmpty() ? l.get(0) : null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public List<EjerciciosRutina> getSizeParte(int att,String part) {
        List<EjerciciosRutina> l = null;
        try {
        QueryBuilder<EjerciciosRutina, String> qb = daoEjerciciosRutina.queryBuilder();
        Where where = qb.where();
        where.eq("rutina", att);
        where.and();
        where.eq("parteCuerpo", part);
            l = qb.query();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return l;
    }
    
    public HashMap<String, Double> getFechasYValores(Cliente c, String at) {
        List<Seguimiento> s = getSeguimientos(c.getId_cliente());
         HashMap<String, Double> m = new HashMap<String, Double>();
        if(s.size() > 1){
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
            return m;
        } else {
            return null;
        }
    }

    public List<Seguimiento> getSeguimientos(String id_cliente) {
        List<Seguimiento> list = null;
        try {
            list = daoSeguimiento.queryForEq("cliente", id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public List<Pago> getPagos(String id_cliente) {
        List<Pago> list = null;
        try {
            list = daoPago.queryForEq("cliente", id_cliente);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public String[] RecuperaAtributosCliente(String at) {//recupera datos como strings para llenar combobox
        String[] hash = null;
        try {
            switch (at) {
                case "Apellidos":
                    hash = daoCliente.query(daoCliente.queryBuilder().where().isNotNull("apellidos").prepare())
                            .stream().map((a) -> {
                                return a.getApellidos();
                            }).
                            toArray(String[]::new);
                    break;
                case "Nombre":
                    hash = daoCliente.query(daoCliente.queryBuilder().where().isNotNull("nombre").prepare())
                            .stream().map((a) -> {
                                return a.getNombre();
                            }).
                            toArray(String[]::new);
                    break;
                case "Cedula":
                    hash = daoCliente.query(daoCliente.queryBuilder().where().isNotNull("id_cliente").prepare())
                            .stream().map((a) -> {
                                return a.getId_cliente();
                            }).
                            toArray(String[]::new);
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("RecuperaAtributosCliente: " + ex.getMessage());
        }
        return hash;
    }

    public Cliente getCliente(String type, String att) {
        Cliente c = null;
        List<Cliente> l = null;
        try {
            switch (type) {
                case "Apellidos":
                    l = daoCliente.queryForEq("apellidos", att);
                    c = !l.isEmpty() ? l.get(0) : null;
                    break;
                case "Nombre":
                    l = daoCliente.queryForEq("nombre", att);
                    c = !l.isEmpty() ? l.get(0) : null;
                    break;
                case "Cedula":
                    l = daoCliente.queryForEq("id_cliente", att);
                    c = !l.isEmpty() ? l.get(0) : null;
                    break;
                default:
                    break;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public Cliente getCliente(String apellidos, String nombre, String cedula) {
        Cliente c = null;
        List<Cliente> l = null;
        try {
            c = daoCliente.queryForAll().stream().filter(
                    a -> {
                        return a.getApellidos().equals(apellidos) && a.getNombre().equals(nombre)
                        && a.getId_cliente().equals(cedula);
                    }
            ).findFirst().get();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }
    
    

    public List<Cliente> getClientesSegunPagos(String segun) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Cliente> aux = new ArrayList<Cliente>();
        try {
            aux = daoCliente.queryForAll().stream().filter(a -> {
                return !a.getPagos().isEmpty();
            }).collect(Collectors.toList());
        } catch (SQLException ex) {
            System.out.println("segun pagos: " + ex.getMessage());
        }
        switch (segun) {
            case "Clientes morosos":
                clientes = aux.stream().filter(a -> {
                    Pago conFechaMasActual = a.getPagos().stream().reduce((current, previous)
                            -> fromStringToDate(current.getFecha()).compareTo(
                                    fromStringToDate(previous.getFecha())) > 0 ? current : previous
                    ).get(); //saca el pago mas reciente
                    return this.getDiasEntreFechas(conFechaMasActual.getFecha()) > 30;// se haya pasado de 30 días
                }).collect(Collectors.toList());
                break;
            case "Cancelan en los próximos 7 días":
                clientes = aux.stream().filter(a -> {
                    Pago conFechaMasActual = a.getPagos().stream().reduce((current, previous)
                            -> fromStringToDate(current.getFecha()).compareTo(
                                    fromStringToDate(previous.getFecha())) > 0 ? current : previous
                    ).get();//saca el pago mas reciente
                    return (this.getDiasEntreFechas(conFechaMasActual.getFecha())) > // sea haya pasado de 23 dias
                            (LocalDate.now().lengthOfMonth() - 7)
                            && (this.getDiasEntreFechas(conFechaMasActual.getFecha())) < 30;// pero no se haya pasado de 30 
                }).collect(Collectors.toList());
                break;
            case "Clientes que están al día":
                clientes = aux.stream().filter(a -> {
                    Pago conFechaMasActual = a.getPagos().stream().reduce((current, previous)
                            -> fromStringToDate(current.getFecha()).compareTo(
                                    fromStringToDate(previous.getFecha())) > 0 ? current : previous
                    ).get();//saca el pago mas reciente
                    return this.getDiasEntreFechas(conFechaMasActual.getFecha()) < (LocalDate.now().lengthOfMonth() - 7);
                    //no tengan menos de 23 días de haber cancelado
                }).collect(Collectors.toList());
                break;
            default:
                break;
        }
        return clientes;
    }

    public void cerrarConexion() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public long getDiasEntreFechas(String fecha2) {
        return ChronoUnit.DAYS.between(fromStringToDate(fecha2), LocalDate.now());
    }

    public static LocalDate fromStringToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy", Locale.forLanguageTag("es-CR"));
        LocalDate newDate = LocalDate.parse(date, formatter);
        return newDate;
    }
}
