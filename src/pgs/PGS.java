package pgs;

import Controlador.Controlador;
import DAO.DAO;
import Vista.Login;
import Vista.SelectUser;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import java.util.Properties;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PGS {

    public static void main(String[] args) {
        try {
          Properties prop = new Properties();
          prop.put("backgroundColor", "255 255 255");
          prop.put("backgroundPattern", "off");
          McWinLookAndFeel.setTheme(prop);
          UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        SwingUtilities.invokeLater(() -> {
            mostrarInterfaz();
        });
    }

    public static void mostrarInterfaz() {  
        Controlador control = new Controlador();
        SelectUser v = new SelectUser(control);
        v.mostrar();
    }

}
