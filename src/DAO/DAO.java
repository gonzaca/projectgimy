package DAO;

import Modelo.Cliente;
import Modelo.Pago;
import Modelo.SaludCliente;
import Modelo.Seguimiento;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
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

/*import Modelo.Cliente;
 import Modelo.Pago;
 import Modelo.SaludCliente;
 import Modelo.Seguimiento;
 import com.j256.ormlite.dao.Dao;
 import com.j256.ormlite.dao.DaoManager;
 import com.j256.ormlite.jdbc.JdbcConnectionSource;
 import java.util.List;
 import java.sql.SQLException;
 import java.util.HashMap;
 import java.util.Observable;*/
public class DAO extends Observable {

    private Dao<Cliente, String> daoCliente;
    private Dao<SaludCliente, String> daoSaludCliente;
    private Dao<Seguimiento, String> daoSeguimiento;
    private Dao<Pago, String> daoPago;
    private JdbcConnectionSource connection;
    private static String databaseUrl = "jdbc:mysql://localhost:3306/gym";
    private String tipo_unidad;

    public DAO() throws Exception {
        connection = new JdbcConnectionSource(databaseUrl);
        connection.setUsername("pablo");
        connection.setPassword("20dejulio");
        daoCliente = DaoManager.createDao(connection, Cliente.class);
        daoSeguimiento = DaoManager.createDao(connection, Seguimiento.class);
        daoSaludCliente = DaoManager.createDao(connection, SaludCliente.class);
        daoPago = DaoManager.createDao(connection, Pago.class);
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
        List<Cliente> l = null;
        try {
            switch (type) {
                case "E-mail":
                    l = daoCliente.queryForEq("email", att);
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
                            daoCliente.queryBuilder().where().isNotNull("email").prepare())
                            .stream().map((a) -> {
                                return a.getEmail();
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

    public List<Cliente> getClientesSegunPagos(String segun) {
        List<Cliente> clientes = new ArrayList();
        List<Cliente> aux = new ArrayList();
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
                                    (LocalDate.now().lengthOfMonth()-7) 
                                    &&  (this.getDiasEntreFechas(conFechaMasActual.getFecha())) < 30;// pero no se haya pasado de 30 
                        }).collect(Collectors.toList());
                break;
            case "Clientes que están al día":
                 clientes = aux.stream().filter(a -> {
                            Pago conFechaMasActual = a.getPagos().stream().reduce((current, previous)
                                    -> fromStringToDate(current.getFecha()).compareTo(
                                            fromStringToDate(previous.getFecha())) > 0 ? current : previous
                            ).get();//saca el pago mas reciente
                            return this.getDiasEntreFechas(conFechaMasActual.getFecha()) < (LocalDate.now().lengthOfMonth()-7);
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("es-CR"));
        LocalDate newDate = LocalDate.parse(date, formatter);
        return newDate;
    }
    
}
