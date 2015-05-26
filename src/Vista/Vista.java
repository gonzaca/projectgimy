package Vista;

import pgs.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import Controlador.Controlador;
import DAO.DAO;
import Modelo.Cliente;
import Modelo.ClienteRutina;
import Modelo.EjerciciosRutina;
import Modelo.Nutricion;
import Modelo.Pago;
import Modelo.Rutina;
import Modelo.SaludCliente;
import Modelo.Seguimiento;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.common.views.DocumentViewController;
import org.icepdf.ri.util.PropertiesManager;
import org.jfree.chart.ChartPanel;

public class Vista extends javax.swing.JFrame {

    public Vista(Controlador c) {
        this.control = c;
        photoLocation = "C:\\PGS\\photos\\";
        popupMenu = new JPopupMenu();
        initComponents();
        buildPopupMenus();
        Image icon = new ImageIcon(getClass().getResource("/Imagen/pgs-logo.png")).getImage();
        setIconImage(icon);
        setIconTab();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(screenSize);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void closeTheCurrentFrameAndOpenNew(java.awt.event.ActionEvent evt) {
        this.dispose();
        LogAdmin l = new LogAdmin(control);
        l.mostrar();

    }

    private void setIconTab() {
        JLabel lab = new JLabel();
        lab.setPreferredSize(new Dimension(120, 70));
        ImageIcon i = new ImageIcon(getClass().getResource("/Imagen/pgs-logo_ico.png"));
        lab.setText("Inicio");
        lab.setHorizontalTextPosition(JLabel.RIGHT);
        Font font = jTabbedPane1.getFont();
        Font boldFont = new Font(font.getName(), font.getStyle(), font.getSize());
        lab.setFont(boldFont);
        lab.setIcon(i);
        jTabbedPane1.setTabComponentAt(0, lab);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotoChooser = new javax.swing.JFileChooser();
        panel_busquedas = new javax.swing.JPanel();
        combo_busqueda = new javax.swing.JComboBox();
        lb_user = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jl_PGS = new javax.swing.JLabel();
        jL_imagen = new javax.swing.JLabel();
        jL_bienvenido = new javax.swing.JLabel();
        jL_bienvenido2 = new javax.swing.JLabel();
        panel_registro_cliente = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        jbRegistrarCliente = new javax.swing.JButton();
        jbDesactivarCliente = new javax.swing.JButton();
        jbEditarCliente = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        panel_datos = new javax.swing.JScrollPane();
        panel_fisico = new javax.swing.JPanel();
        panel_reg_fisico = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLPadecimientos = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        combo_embarazo = new javax.swing.JComboBox();
        muscular_desc = new javax.swing.JTextField();
        osea_desc = new javax.swing.JTextField();
        cardio_desc = new javax.swing.JTextField();
        combo_lesion_osea = new javax.swing.JComboBox();
        combo_lesion_musc = new javax.swing.JComboBox();
        combo_enfer_cardio = new javax.swing.JComboBox();
        combo_asfixia = new javax.swing.JComboBox();
        combo_anemia = new javax.swing.JComboBox();
        combo_asmatico = new javax.swing.JComboBox();
        combo_hipertenso = new javax.swing.JComboBox();
        combo_diabetico = new javax.swing.JComboBox();
        combo_fumador = new javax.swing.JComboBox();
        combo_epileptico = new javax.swing.JComboBox();
        combo_mareos = new javax.swing.JComboBox();
        combo_desmayos = new javax.swing.JComboBox();
        combo_nauseas = new javax.swing.JComboBox();
        combo_dif_respirar = new javax.swing.JComboBox();
        jPanel13 = new javax.swing.JPanel();
        jLMail = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLFechaNac = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLEdad = new javax.swing.JLabel();
        jLTel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLDatosPersonales = new javax.swing.JLabel();
        nacimiento = new datechooser.beans.DateChooserCombo();
        jLApellidos = new javax.swing.JLabel();
        jLSexo = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        cb_sexo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jBAddCliente = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_otro_padecimiento = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jLFoto = new javax.swing.JLabel();
        combo_gimnasio = new javax.swing.JComboBox();
        combo_practica_act_deport = new javax.swing.JComboBox();
        jLabel49 = new javax.swing.JLabel();
        desactivar_Cliente = new javax.swing.JPanel();
        jBDesactivarCliente = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        text_cliente_desactivar = new javax.swing.JTextField();
        panel_registro_rutinas = new javax.swing.JPanel();
        panel_menu1 = new javax.swing.JPanel();
        jBAsignarRutina = new javax.swing.JButton();
        jBCrearRutina = new javax.swing.JButton();
        jBVerRutina = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        panel_datos1 = new javax.swing.JScrollPane();
        panel_imp_rutinas = new javax.swing.JPanel();
        panel_crear_rutina = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        text_nombre_rutina = new javax.swing.JTextPane();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jBCreateRutina1 = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        tablePiernas = new javax.swing.JTable();
        jScrollPane35 = new javax.swing.JScrollPane();
        tablePantorrilla = new javax.swing.JTable();
        jScrollPane39 = new javax.swing.JScrollPane();
        tableBiceps1 = new javax.swing.JTable();
        jScrollPane41 = new javax.swing.JScrollPane();
        tableTriceps = new javax.swing.JTable();
        jScrollPane37 = new javax.swing.JScrollPane();
        tableAntebraso = new javax.swing.JTable();
        jScrollPane43 = new javax.swing.JScrollPane();
        tableHombros = new javax.swing.JTable();
        jScrollPane45 = new javax.swing.JScrollPane();
        tablePecho = new javax.swing.JTable();
        jScrollPane47 = new javax.swing.JScrollPane();
        tableEspalda = new javax.swing.JTable();
        jScrollPane33 = new javax.swing.JScrollPane();
        tableTrapecio = new javax.swing.JTable();
        bt_Print = new javax.swing.JButton();
        jBEditarRutina = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        panel_asignar_rutina = new javax.swing.JPanel();
        text_cliente_rutina = new javax.swing.JTextField();
        asigna_rutina_cliente = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combo_rutinas_creadas = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        panel_registro_nutricional = new javax.swing.JPanel();
        panel_menu2 = new javax.swing.JPanel();
        btn_perfiles_Nutricionales = new javax.swing.JButton();
        btn_asignar_pNutricional = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        panel_datos4 = new javax.swing.JScrollPane();
        panel_nutricion = new javax.swing.JPanel();
        panel_crear_perfil_nutricional = new javax.swing.JPanel();
        jLNombre2 = new javax.swing.JLabel();
        jLDatosPersonales2 = new javax.swing.JLabel();
        jCBListFood = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel28 = new javax.swing.JLabel();
        btn_add_plan_nutricional = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        panel_asignar_perfil = new javax.swing.JPanel();
        text_cliente_nutricion = new javax.swing.JTextField();
        btn_Asigna_Nutricion = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCBListFood2 = new javax.swing.JComboBox();
        jLabel53 = new javax.swing.JLabel();
        panel_control_pagos = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        label_fecha_seguimiento1 = new javax.swing.JLabel();
        dateChooserCobro = new datechooser.beans.DateChooserCombo();
        jLabel63 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        boton_pagar_cobro = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btn_buscar_cliente_cobro = new javax.swing.JButton();
        text_nombre_cobro = new javax.swing.JTextField();
        text_apellidos_cobro = new javax.swing.JTextField();
        text_cedula_cobro = new javax.swing.JTextField();
        detalle1 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel99 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jcombo_projec_cobros = new javax.swing.JComboBox();
        jbutton_enviar_correo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        text_cedula_pago = new javax.swing.JTextField();
        text_nombre_pago = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        text_apellidos_pago = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        btn_buscar_cliente_pago = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        panel_seguimientos = new javax.swing.JPanel();
        panel_datos_seg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        imc = new javax.swing.JTextField();
        grasa = new javax.swing.JTextField();
        pecho = new javax.swing.JTextField();
        espalda = new javax.swing.JTextField();
        cadera = new javax.swing.JTextField();
        gluteos = new javax.swing.JTextField();
        cintura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pantorrilla_derecha = new javax.swing.JTextField();
        pierna_derecha = new javax.swing.JTextField();
        pantorrilla_izquierda = new javax.swing.JTextField();
        pierna_izquierda = new javax.swing.JTextField();
        brazo_derecho = new javax.swing.JTextField();
        brazo_izquierdo = new javax.swing.JTextField();
        antebrazo_derecho = new javax.swing.JTextField();
        antebrazo_izquierdo = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        boton_añadir_seguimiento = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label_fecha_seguimiento = new javax.swing.JLabel();
        text_nombre_seguimiento = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        text_apellidos_seguimiento = new javax.swing.JTextField();
        btn_busca_cliente_seg = new javax.swing.JButton();
        combo_fecha_seguimiento = new datechooser.beans.DateChooserCombo();
        jLabel26 = new javax.swing.JLabel();
        text_cedula_seguimiento = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        label_cliente_seguimiento = new javax.swing.JLabel();
        panel_busqueda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        panel_busqueda_cliente = new javax.swing.JPanel();
        panel_parametros = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        btn_busca_cliente_bp = new javax.swing.JButton();
        panel_muestra_datos = new javax.swing.JPanel();
        lb_foto = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_apellidos = new javax.swing.JLabel();
        lb_cedula = new javax.swing.JLabel();
        panel_proyeccion = new javax.swing.JPanel();
        jp_chart = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jcb_proyec = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        fotoChooser.setControlButtonsAreShown(false);
        fotoChooser.setCurrentDirectory(new java.io.File("C:\\"));
            fotoChooser.setDialogTitle("Escoger Fotografia");

            combo_busqueda.setSelectedIndex(-1);

            lb_user.setText("Seleccione un usuario");

            javax.swing.GroupLayout panel_busquedasLayout = new javax.swing.GroupLayout(panel_busquedas);
            panel_busquedas.setLayout(panel_busquedasLayout);
            panel_busquedasLayout.setHorizontalGroup(
                panel_busquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_busquedasLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(panel_busquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(combo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_user))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel_busquedasLayout.setVerticalGroup(
                panel_busquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_busquedasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lb_user)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(combo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jLabel45.setText("jLabel45");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Power Gym System");
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    formWindowClosed(evt);
                }
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    formWindowClosing(evt);
                }
            });

            jTabbedPane1.setAutoscrolls(true);
            jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
            jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTabbedPane1.setPreferredSize(new java.awt.Dimension(783, 399));

            panel_inicio.setAutoscrolls(true);

            jl_PGS.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
            jl_PGS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jl_PGS.setText("Power Gym System");

            jL_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBienvenida.png"))); // NOI18N

            jL_bienvenido.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
            jL_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL_bienvenido.setText("Bienvenido");

            jL_bienvenido2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGS.jpg"))); // NOI18N

            javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
            panel_inicio.setLayout(panel_inicioLayout);
            panel_inicioLayout.setHorizontalGroup(
                panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_inicioLayout.createSequentialGroup()
                    .addContainerGap(147, Short.MAX_VALUE)
                    .addComponent(jL_imagen)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                    .addComponent(jL_bienvenido2)
                    .addContainerGap(147, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jl_PGS, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                        .addComponent(jL_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            panel_inicioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jL_bienvenido, jl_PGS});

            panel_inicioLayout.setVerticalGroup(
                panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_inicioLayout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jl_PGS)
                    .addGap(18, 18, 18)
                    .addComponent(jL_bienvenido)
                    .addGap(53, 53, 53)
                    .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jL_imagen)
                        .addComponent(jL_bienvenido2))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Inicio", new javax.swing.ImageIcon(getClass().getResource("/Imagen/pgs-logo_ico.png")), panel_inicio); // NOI18N

            jbRegistrarCliente.setBackground(new java.awt.Color(0, 0, 0));
            jbRegistrarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jbRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registro.jpg"))); // NOI18N
            jbRegistrarCliente.setText("Registro del Cliente");
            jbRegistrarCliente.setBorder(null);
            jbRegistrarCliente.setBorderPainted(false);
            jbRegistrarCliente.setContentAreaFilled(false);
            jbRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbRegistrarClienteActionPerformed(evt);
                }
            });

            jbDesactivarCliente.setVisible(false);
            jbDesactivarCliente.setBackground(new java.awt.Color(0, 0, 0));
            jbDesactivarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jbDesactivarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/desacivar.png"))); // NOI18N
            jbDesactivarCliente.setText("Desactivar Cliente");
            jbDesactivarCliente.setBorder(null);
            jbDesactivarCliente.setBorderPainted(false);
            jbDesactivarCliente.setContentAreaFilled(false);
            jbDesactivarCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbDesactivarClienteActionPerformed(evt);
                }
            });

            jbEditarCliente.setBackground(new java.awt.Color(0, 0, 0));
            jbEditarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jbEditarCliente.setForeground(new java.awt.Color(0, 51, 51));
            jbEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registro.jpg"))); // NOI18N
            jbEditarCliente.setText("Modificar Datos Cliente");
            jbEditarCliente.setBorder(null);
            jbEditarCliente.setBorderPainted(false);
            jbEditarCliente.setContentAreaFilled(false);
            jbEditarCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jbEditarClienteActionPerformed(evt);
                }
            });

            jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/left_panel.png"))); // NOI18N

            javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
            panel_menu.setLayout(panel_menuLayout);
            panel_menuLayout.setHorizontalGroup(
                panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menuLayout.createSequentialGroup()
                    .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addComponent(jbDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 36, Short.MAX_VALUE))
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel_menuLayout.setVerticalGroup(
                panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menuLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jbRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(jbEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(jbDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(719, Short.MAX_VALUE))
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            panel_datos.setBackground(new java.awt.Color(255, 255, 255));
            panel_datos.setBorder(null);
            panel_datos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            panel_datos.getVerticalScrollBar().setUnitIncrement(20);
            panel_datos.setPreferredSize(new java.awt.Dimension(972, 600));

            panel_reg_fisico.setVisible(false);
            panel_reg_fisico.setOpaque(false);

            jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));
            jPanel12.setOpaque(false);

            jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel30.setText("Esta ud. embarazada o sospecha estarlo (Solo Mujeres):");

            jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel32.setText("Indique si ha sufrido de alguno de estos sintomas al realizar ejercicio fisico:");

            jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel34.setText("Padece de Anemia en la Actualidad: ");

            jLPadecimientos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLPadecimientos.setText("Datos de Salud");

            jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel20.setText("Ha tenido o tiene una lesion muscular: ");

            jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel21.setText("Ha tenido o tiene una lesion osea: ");

            jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel22.setText("Padece alguna enfermedad cardiovascular: ");

            jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel23.setText("Se asfixia con facilidad al realizar ejercicio:");

            jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel24.setText("Es usted:");

            jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel19.setText("Asmático/a :");

            jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel81.setText("Hipertenso/a :");

            jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel85.setText("Diabético/a :");

            jLabel86.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel86.setText("Fumador/a :");

            jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel87.setText("Epiléptico/a:");

            jLabel88.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel88.setText("Mareos:");

            jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel89.setText("Desmayos o Lipotimias:");

            jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel90.setText("Nauseas:");

            jLabel91.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel91.setText("Dificultada para respirar:");

            combo_embarazo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO"}));
            combo_embarazo.setSelectedIndex(-1);
            combo_embarazo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_embarazoActionPerformed(evt);
                }
            });

            combo_lesion_osea.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ","NO","SI"}));
            combo_lesion_osea.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_lesion_oseaActionPerformed(evt);
                }
            });

            combo_lesion_musc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "NO", "SI"}));
            combo_lesion_musc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_lesion_muscActionPerformed(evt);
                }
            });

            combo_enfer_cardio.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));
            combo_enfer_cardio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_enfer_cardioActionPerformed(evt);
                }
            });

            combo_asfixia.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_anemia.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_asmatico.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_hipertenso.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_diabetico.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));
            combo_diabetico.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_diabeticoActionPerformed(evt);
                }
            });

            combo_fumador.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_epileptico.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_mareos.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_desmayos.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_nauseas.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_dif_respirar.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
            jPanel12.setLayout(jPanel12Layout);
            jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap(116, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combo_anemia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combo_asfixia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(combo_lesion_osea, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(muscular_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                                        .addComponent(jLabel20)
                                                        .addGap(29, 29, 29))
                                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel22)
                                                            .addComponent(cardio_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(combo_lesion_musc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(combo_enfer_cardio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addComponent(jLabel21)
                                .addComponent(osea_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(jLabel24))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel81)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel85)
                                        .addComponent(jLabel86)
                                        .addComponent(jLabel87))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(combo_dif_respirar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combo_nauseas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(combo_asmatico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_hipertenso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_diabetico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_fumador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_epileptico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel88)
                                        .addComponent(jLabel89))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combo_desmayos, 0, 42, Short.MAX_VALUE)
                                        .addComponent(combo_mareos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(218, 218, 218)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel90)
                                        .addComponent(jLabel91)))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addGap(18, 18, 18)
                                    .addComponent(combo_embarazo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(116, Short.MAX_VALUE))
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel32))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLPadecimientos)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_asmatico, combo_diabetico, combo_epileptico, combo_fumador, combo_hipertenso});

            jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_anemia, combo_asfixia, combo_enfer_cardio, combo_lesion_musc, combo_lesion_osea});

            jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_desmayos, combo_dif_respirar, combo_mareos, combo_nauseas});

            jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLPadecimientos)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(combo_lesion_osea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel24)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(osea_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(jLabel81)
                                .addComponent(combo_lesion_musc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(muscular_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel85))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel86)
                                .addComponent(combo_enfer_cardio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cardio_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel87)))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(combo_asmatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(combo_hipertenso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_diabetico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_fumador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_epileptico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(combo_asfixia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(combo_anemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addComponent(jLabel32)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel91))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(combo_mareos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(combo_desmayos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel88)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel89))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                            .addComponent(combo_nauseas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(combo_dif_respirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_embarazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20))
            );

            jPanel12Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_asmatico, combo_diabetico, combo_epileptico, combo_fumador, combo_hipertenso});

            jPanel12Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_anemia, combo_asfixia, combo_enfer_cardio, combo_lesion_musc, combo_lesion_osea});

            jPanel12Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_desmayos, combo_dif_respirar, combo_mareos, combo_nauseas});

            jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(153, 153, 0)));
            jPanel13.setOpaque(false);

            jLMail.setText("E-Mail:");

            nombre.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nombreActionPerformed(evt);
                }
            });
            nombre.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    nombreKeyPressed(evt);
                }
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    nombreKeyTyped(evt);
                }
            });

            edad.setEditable(false);
            edad.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    edadActionPerformed(evt);
                }
            });

            telefono.setInheritsPopupMenu(true);
            telefono.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    telefonoKeyTyped(evt);
                }
            });

            jLNombre.setText("Nombre:");

            jLFechaNac.setText("Fecha de Nacimiento:");

            jLDireccion.setText("Dirección:");

            jLEdad.setText("Edad:");

            jLTel.setText("Teléfono:");

            email.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    emailFocusLost(evt);
                }
            });
            email.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    emailActionPerformed(evt);
                }
            });

            jLDatosPersonales.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLDatosPersonales.setText("Datos Personales");

            nacimiento.setCalendarPreferredSize(new java.awt.Dimension(300, 180));
            nacimiento.setNothingAllowed(false);
            try {
                nacimiento.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
            } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
                e1.printStackTrace();
            }
            nacimiento.setLocale(Locale.forLanguageTag("es-CR"));
            nacimiento.setCurrentNavigateIndex(0);
            nacimiento.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
                public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                    nacimientoOnSelectionChange(evt);
                }
            });
            nacimiento.addCommitListener(new datechooser.events.CommitListener() {
                public void onCommit(datechooser.events.CommitEvent evt) {
                    nacimientoOnCommit(evt);
                }
            });

            jLApellidos.setText("Apellidos:");

            jLSexo.setText("Sexo:");

            jLabel38.setText("Cedula");

            cedula.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    cedulaKeyTyped(evt);
                }
            });

            apellidos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    apellidosActionPerformed(evt);
                }
            });
            apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    apellidosKeyPressed(evt);
                }
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    apellidosKeyTyped(evt);
                }
            });

            cb_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femenino", "Masculino" }));
            cb_sexo.setSelectedIndex(-1);
            cb_sexo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cb_sexoActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
            jPanel13.setLayout(jPanel13Layout);
            jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap(70, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLNombre)
                        .addComponent(jLApellidos)
                        .addComponent(jLEdad)
                        .addComponent(jLFechaNac))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cedula))
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(93, 93, 93)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLMail)
                        .addComponent(jLTel)
                        .addComponent(jLDireccion)
                        .addComponent(jLSexo))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(70, Short.MAX_VALUE))
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLDatosPersonales)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLDatosPersonales)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLNombre)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLTel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLApellidos)
                        .addComponent(jLMail)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLFechaNac))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLEdad)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLDireccion)
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLSexo)
                                .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(24, 24, 24))
            );

            jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

            jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(153, 153, 0)));
            jPanel5.setOpaque(false);

            jLabel37.setText("Ha practicado o practica actividad deportiva:");

            jBAddCliente.setBackground(new java.awt.Color(204, 51, 0));
            jBAddCliente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
            jBAddCliente.setForeground(new java.awt.Color(102, 0, 0));
            jBAddCliente.setText("Agregar Cliente");
            jBAddCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 1, true));
            jBAddCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBAddClienteActionPerformed(evt);
                }
            });

            jLabel36.setText("Ha estado inscrito en algun gimnasio o instalacion deportiva: ");

            jLabel33.setText("Algun otro padecimiento:");

            textarea_otro_padecimiento.setColumns(20);
            textarea_otro_padecimiento.setRows(5);
            jScrollPane1.setViewportView(textarea_otro_padecimiento);

            jLabel35.setText("Fotografia:");

            jLFoto.setBackground(new java.awt.Color(204, 204, 204));
            jLFoto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLFoto.setText("Clic");
            jLFoto.setBorder(new javax.swing.border.MatteBorder(null));
            jLFoto.setOpaque(true);
            jLFoto.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLFotoMouseClicked(evt);
                }
            });

            combo_gimnasio.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            combo_practica_act_deport.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap(68, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel37)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(combo_practica_act_deport, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(26, 26, 26)
                                    .addComponent(combo_gimnasio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jBAddCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(111, 111, 111))))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(combo_gimnasio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(combo_practica_act_deport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jBAddCliente)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34))
            );

            jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_gimnasio, combo_practica_act_deport});

            javax.swing.GroupLayout panel_reg_fisicoLayout = new javax.swing.GroupLayout(panel_reg_fisico);
            panel_reg_fisico.setLayout(panel_reg_fisicoLayout);
            panel_reg_fisicoLayout.setHorizontalGroup(
                panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_reg_fisicoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE))
                .addGroup(panel_reg_fisicoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            panel_reg_fisicoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel12, jPanel13});

            panel_reg_fisicoLayout.setVerticalGroup(
                panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_reg_fisicoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBackgroundVista.PNG"))); // NOI18N

            javax.swing.GroupLayout panel_fisicoLayout = new javax.swing.GroupLayout(panel_fisico);
            panel_fisico.setLayout(panel_fisicoLayout);
            panel_fisicoLayout.setHorizontalGroup(
                panel_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_fisicoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_reg_fisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(panel_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_fisicoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );
            panel_fisicoLayout.setVerticalGroup(
                panel_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_fisicoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_reg_fisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(panel_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_fisicoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel49)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );

            panel_datos.setViewportView(panel_fisico);

            desactivar_Cliente.setVisible(false);

            jBDesactivarCliente.setText("Desactivar Cliente");
            jBDesactivarCliente.setMultiClickThreshhold(1L);
            jBDesactivarCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBDesactivarClienteActionPerformed(evt);
                }
            });

            jLabel47.setText("Cliente");

            text_cliente_desactivar.setEditable(false);
            text_cliente_desactivar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    text_cliente_desactivarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout desactivar_ClienteLayout = new javax.swing.GroupLayout(desactivar_Cliente);
            desactivar_Cliente.setLayout(desactivar_ClienteLayout);
            desactivar_ClienteLayout.setHorizontalGroup(
                desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                    .addGroup(desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                            .addGroup(desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addComponent(jBDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(jLabel47)))
                            .addGap(0, 70, Short.MAX_VALUE))
                        .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(text_cliente_desactivar)))
                    .addContainerGap())
            );
            desactivar_ClienteLayout.setVerticalGroup(
                desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desactivar_ClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel47)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(text_cliente_desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jBDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout panel_registro_clienteLayout = new javax.swing.GroupLayout(panel_registro_cliente);
            panel_registro_cliente.setLayout(panel_registro_clienteLayout);
            panel_registro_clienteLayout.setHorizontalGroup(
                panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                    .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
                .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_clienteLayout.createSequentialGroup()
                        .addContainerGap(399, Short.MAX_VALUE)
                        .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(400, Short.MAX_VALUE)))
            );
            panel_registro_clienteLayout.setVerticalGroup(
                panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_clienteLayout.createSequentialGroup()
                        .addContainerGap(198, Short.MAX_VALUE)
                        .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(693, Short.MAX_VALUE)))
            );

            jTabbedPane1.addTab("Clientes", new javax.swing.ImageIcon(getClass().getResource("/Imagen/AsignarIcon.png")), panel_registro_cliente); // NOI18N

            panel_registro_rutinas.setVisible(false);

            panel_menu1.setBackground(new java.awt.Color(255, 255, 255));

            jBAsignarRutina.setBackground(new java.awt.Color(255, 255, 255));
            jBAsignarRutina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jBAsignarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AsignarIcon.png"))); // NOI18N
            jBAsignarRutina.setText("Asignar Rutina");
            jBAsignarRutina.setBorder(null);
            jBAsignarRutina.setBorderPainted(false);
            jBAsignarRutina.setContentAreaFilled(false);
            jBAsignarRutina.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBAsignarRutinaActionPerformed(evt);
                }
            });

            jBCrearRutina.setBackground(new java.awt.Color(255, 255, 255));
            jBCrearRutina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jBCrearRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
            jBCrearRutina.setText("Crear Rutina");
            jBCrearRutina.setBorder(null);
            jBCrearRutina.setBorderPainted(false);
            jBCrearRutina.setContentAreaFilled(false);
            jBCrearRutina.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBCrearRutinaActionPerformed(evt);
                }
            });

            jBVerRutina.setBackground(new java.awt.Color(255, 255, 255));
            jBVerRutina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jBVerRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/verImg.png"))); // NOI18N
            jBVerRutina.setText("Ver Rutina");
            jBVerRutina.setBorder(null);
            jBVerRutina.setBorderPainted(false);
            jBVerRutina.setContentAreaFilled(false);
            jBVerRutina.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBVerRutinaActionPerformed(evt);
                }
            });

            jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/left_panel.png"))); // NOI18N

            javax.swing.GroupLayout panel_menu1Layout = new javax.swing.GroupLayout(panel_menu1);
            panel_menu1.setLayout(panel_menu1Layout);
            panel_menu1Layout.setHorizontalGroup(
                panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menu1Layout.createSequentialGroup()
                    .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBCrearRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAsignarRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(915, 915, 915))
                .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu1Layout.createSequentialGroup()
                        .addComponent(jBVerRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 938, Short.MAX_VALUE)))
                .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu1Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(0, 20, Short.MAX_VALUE)))
            );
            panel_menu1Layout.setVerticalGroup(
                panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menu1Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jBCrearRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(jBAsignarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1030, Short.MAX_VALUE))
                .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jBVerRutina)
                        .addContainerGap(950, Short.MAX_VALUE)))
                .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu1Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(0, 351, Short.MAX_VALUE)))
            );

            panel_datos1.setBorder(null);
            panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            panel_datos1.getVerticalScrollBar().setUnitIncrement(20);

            panel_crear_rutina.setVisible(false);
            panel_crear_rutina.setOpaque(false);

            jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel39.setText("Piernas");

            jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel40.setText("Pantorillas");

            jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel52.setText("Biceps");

            jLabel74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel74.setText("Triceps");

            jLabel75.setText("Nombre de la Rutina:");

            text_nombre_rutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel93.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel93.setText("Antebrazo");

            jLabel94.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel94.setText("Hombros");

            jLabel95.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel95.setText("Pecho");

            jLabel96.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel96.setText("Espalda");

            jLabel97.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel97.setText("Trapecios");

            jBCreateRutina1.setText("Crear Rutina");
            jBCreateRutina1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBCreateRutina1ActionPerformed(evt);
                }
            });

            jScrollPane32.getVerticalScrollBar().setUnitIncrement(20);

            tablePiernas.setModel(setModelo("pi"));
            jScrollPane32.setViewportView(tablePiernas);

            jScrollPane35.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane35.setAutoscrolls(true);

            tablePantorrilla.setModel(setModelo("pa"));
            jScrollPane35.setViewportView(tablePantorrilla);

            jScrollPane39.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane39.setAutoscrolls(true);

            tableBiceps1.setModel(setModelo("bi"));
            jScrollPane39.setViewportView(tableBiceps1);

            jScrollPane41.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane41.setAutoscrolls(true);

            tableTriceps.setModel(setModelo("tri"));
            jScrollPane41.setViewportView(tableTriceps);

            jScrollPane37.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane37.setAutoscrolls(true);

            tableAntebraso.setModel(setModelo("an"));
            jScrollPane37.setViewportView(tableAntebraso);

            jScrollPane43.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane43.setAutoscrolls(true);

            tableHombros.setModel(setModelo("hom"));
            jScrollPane43.setViewportView(tableHombros);

            jScrollPane45.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane45.setAutoscrolls(true);

            tablePecho.setModel(setModelo("pe"));
            jScrollPane45.setViewportView(tablePecho);

            jScrollPane47.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane47.setAutoscrolls(true);

            tableEspalda.setModel(setModelo("es"));
            jScrollPane47.setViewportView(tableEspalda);

            jScrollPane33.getVerticalScrollBar().setUnitIncrement(20);
            jScrollPane33.setAutoscrolls(true);

            tableTrapecio.setModel(setModelo("tra"));
            jScrollPane33.setViewportView(tableTrapecio);

            javax.swing.GroupLayout panel_crear_rutinaLayout = new javax.swing.GroupLayout(panel_crear_rutina);
            panel_crear_rutina.setLayout(panel_crear_rutinaLayout);
            panel_crear_rutinaLayout.setHorizontalGroup(
                panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crear_rutinaLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCreateRutina1)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40)
                        .addComponent(jLabel39)
                        .addComponent(jLabel52)
                        .addComponent(jLabel74)
                        .addComponent(jLabel93)
                        .addComponent(jLabel94)
                        .addComponent(jLabel97)
                        .addComponent(jLabel96)
                        .addComponent(jLabel95)
                        .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                            .addComponent(jLabel75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(text_nombre_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10))
            );
            panel_crear_rutinaLayout.setVerticalGroup(
                panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel75)
                        .addComponent(text_nombre_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addComponent(jLabel39)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel40)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(jLabel52)
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel74)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel93)
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel94)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel95)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jLabel96)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jLabel97)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jBCreateRutina1)
                    .addContainerGap())
            );

            bt_Print.setBackground(new java.awt.Color(255, 255, 255));
            bt_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/printer.png"))); // NOI18N
            bt_Print.setToolTipText("Imprimir esta Rutina");
            bt_Print.setBorder(null);
            bt_Print.setBorderPainted(false);
            bt_Print.setVisible(false);
            bt_Print.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_PrintActionPerformed(evt);
                }
            });

            jBEditarRutina.setBackground(new java.awt.Color(255, 255, 255));
            jBEditarRutina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jBEditarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
            jBEditarRutina.setToolTipText("Editar esta Rutina");
            jBEditarRutina.setBorder(null);
            jBEditarRutina.setBorderPainted(false);
            jBEditarRutina.setContentAreaFilled(false);
            jBEditarRutina.setVisible(false);
            jBEditarRutina.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBEditarRutinaActionPerformed(evt);
                }
            });

            jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBackgroundVista.PNG"))); // NOI18N

            javax.swing.GroupLayout panel_imp_rutinasLayout = new javax.swing.GroupLayout(panel_imp_rutinas);
            panel_imp_rutinas.setLayout(panel_imp_rutinasLayout);
            panel_imp_rutinasLayout.setHorizontalGroup(
                panel_imp_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_imp_rutinasLayout.createSequentialGroup()
                    .addContainerGap(160, Short.MAX_VALUE)
                    .addComponent(panel_crear_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel_imp_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bt_Print, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(jBEditarRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(210, Short.MAX_VALUE))
                .addGroup(panel_imp_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_imp_rutinasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );
            panel_imp_rutinasLayout.setVerticalGroup(
                panel_imp_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_imp_rutinasLayout.createSequentialGroup()
                    .addComponent(panel_crear_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 58, Short.MAX_VALUE))
                .addGroup(panel_imp_rutinasLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(bt_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBEditarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panel_imp_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_imp_rutinasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );

            panel_datos1.setViewportView(panel_imp_rutinas);

            panel_asignar_rutina.setVisible(false);
            panel_asignar_rutina.setOpaque(false);

            text_cliente_rutina.setEditable(false);
            text_cliente_rutina.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    text_cliente_rutinaActionPerformed(evt);
                }
            });

            asigna_rutina_cliente.setText("Asignar Rutina");
            asigna_rutina_cliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    asigna_rutina_clienteActionPerformed(evt);
                }
            });

            jLabel61.setText("Cliente");

            jLabel17.setText("Rutina:");

            combo_rutinas_creadas.setSelectedIndex(-1);
            combo_rutinas_creadas.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_rutinas_creadasActionPerformed(evt);
                }
            });

            jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBackgroundVista.PNG"))); // NOI18N

            javax.swing.GroupLayout panel_asignar_rutinaLayout = new javax.swing.GroupLayout(panel_asignar_rutina);
            panel_asignar_rutina.setLayout(panel_asignar_rutinaLayout);
            panel_asignar_rutinaLayout.setHorizontalGroup(
                panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                    .addContainerGap(259, Short.MAX_VALUE)
                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                            .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel61)
                                .addComponent(jLabel17))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(combo_rutinas_creadas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_cliente_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(asigna_rutina_cliente))
                    .addContainerGap(259, Short.MAX_VALUE))
                .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignar_rutinaLayout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addContainerGap(26, Short.MAX_VALUE)))
            );
            panel_asignar_rutinaLayout.setVerticalGroup(
                panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61)
                        .addComponent(text_cliente_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(combo_rutinas_creadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(asigna_rutina_cliente)
                    .addContainerGap(270, Short.MAX_VALUE))
                .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(105, Short.MAX_VALUE)))
            );

            javax.swing.GroupLayout panel_registro_rutinasLayout = new javax.swing.GroupLayout(panel_registro_rutinas);
            panel_registro_rutinas.setLayout(panel_registro_rutinasLayout);
            panel_registro_rutinasLayout.setHorizontalGroup(
                panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                    .addComponent(panel_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(panel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))
                .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_rutinasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)))
            );
            panel_registro_rutinasLayout.setVerticalGroup(
                panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                    .addComponent(panel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_rutinasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(623, 623, 623)))
            );

            jTabbedPane1.addTab("Rutinas", new javax.swing.ImageIcon(getClass().getResource("/Imagen/pesa.png")), panel_registro_rutinas); // NOI18N

            panel_menu2.setBackground(new java.awt.Color(255, 255, 255));

            btn_perfiles_Nutricionales.setBackground(new java.awt.Color(255, 255, 255));
            btn_perfiles_Nutricionales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            btn_perfiles_Nutricionales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
            btn_perfiles_Nutricionales.setText("Perfiles Nutricionales");
            btn_perfiles_Nutricionales.setBorderPainted(false);
            btn_perfiles_Nutricionales.setContentAreaFilled(false);
            btn_perfiles_Nutricionales.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_perfiles_NutricionalesActionPerformed(evt);
                }
            });

            btn_asignar_pNutricional.setBackground(new java.awt.Color(255, 255, 255));
            btn_asignar_pNutricional.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            btn_asignar_pNutricional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AsignarIcon.png"))); // NOI18N
            btn_asignar_pNutricional.setText("Asignar Perfil Nutricional");
            btn_asignar_pNutricional.setBorder(null);
            btn_asignar_pNutricional.setBorderPainted(false);
            btn_asignar_pNutricional.setContentAreaFilled(false);
            btn_asignar_pNutricional.setName(""); // NOI18N
            btn_asignar_pNutricional.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_asignar_pNutricionalActionPerformed(evt);
                }
            });

            jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/left_panel.png"))); // NOI18N

            javax.swing.GroupLayout panel_menu2Layout = new javax.swing.GroupLayout(panel_menu2);
            panel_menu2.setLayout(panel_menu2Layout);
            panel_menu2Layout.setHorizontalGroup(
                panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menu2Layout.createSequentialGroup()
                    .addGroup(panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_asignar_pNutricional, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_perfiles_Nutricionales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel84)))
            );
            panel_menu2Layout.setVerticalGroup(
                panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menu2Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(btn_perfiles_Nutricionales, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_asignar_pNutricional)
                    .addContainerGap(817, Short.MAX_VALUE))
                .addGroup(panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu2Layout.createSequentialGroup()
                        .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                        .addContainerGap()))
            );

            panel_datos4.setBorder(null);

            panel_crear_perfil_nutricional.setVisible(false);

            jLNombre2.setText("Nombre del Perfi:");

            jLDatosPersonales2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLDatosPersonales2.setText("Perfil Nutricional");

            jCBListFood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            listarArchivos(jCBListFood);
            jCBListFood.setSelectedIndex(-1);
            jCBListFood.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCBListFoodActionPerformed(evt);
                }
            });

            PropertiesManager properties = new PropertiesManager(
                System.getProperties(),
                ResourceBundle.getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));

            properties.setInt(PropertiesManager.PROPERTY_DEFAULT_PAGEFIT, 2);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_ANNOTATION, Boolean.FALSE);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_FIT, Boolean.FALSE);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_ROTATE, Boolean.FALSE);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_TOOL, Boolean.FALSE);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_UPANE, Boolean.FALSE);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_SEARCH, Boolean.FALSE);

            SwingViewBuilder factory = new SwingViewBuilder(controller, properties);

            // add interactive mouse link annotation support via callback
            controller.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(controller.getDocumentViewController()));
            javax.swing.JPanel viewerComponentPanel = factory.buildViewerPanel();
            jTabbedPane2.addTab("Plan", viewerComponentPanel);

            jLabel28.setText("Agregar Plan Nutricional");

            btn_add_plan_nutricional.setText("Agregar");
            btn_add_plan_nutricional.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_add_plan_nutricionalActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panel_crear_perfil_nutricionalLayout = new javax.swing.GroupLayout(panel_crear_perfil_nutricional);
            panel_crear_perfil_nutricional.setLayout(panel_crear_perfil_nutricionalLayout);
            panel_crear_perfil_nutricionalLayout.setHorizontalGroup(
                panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 783, Short.MAX_VALUE)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addComponent(jLDatosPersonales2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLNombre2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBListFood, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_add_plan_nutricional)
                                .addGap(0, 99, Short.MAX_VALUE)))
                        .addContainerGap()))
            );
            panel_crear_perfil_nutricionalLayout.setVerticalGroup(
                panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 579, Short.MAX_VALUE)
                .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addComponent(jLDatosPersonales2)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLNombre2)
                                .addComponent(jCBListFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28)
                                .addComponent(btn_add_plan_nutricional)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

            jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBackgroundVista.PNG"))); // NOI18N

            javax.swing.GroupLayout panel_nutricionLayout = new javax.swing.GroupLayout(panel_nutricion);
            panel_nutricion.setLayout(panel_nutricionLayout);
            panel_nutricionLayout.setHorizontalGroup(
                panel_nutricionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_nutricionLayout.createSequentialGroup()
                    .addGap(0, 77, Short.MAX_VALUE)
                    .addComponent(panel_crear_perfil_nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 84, Short.MAX_VALUE))
                .addGroup(panel_nutricionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_nutricionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel51)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );
            panel_nutricionLayout.setVerticalGroup(
                panel_nutricionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_nutricionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_crear_perfil_nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(panel_nutricionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_nutricionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel51)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );

            panel_datos4.setViewportView(panel_nutricion);

            panel_asignar_perfil.setVisible(false);

            text_cliente_nutricion.setEditable(false);
            text_cliente_nutricion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    text_cliente_nutricionActionPerformed(evt);
                }
            });

            btn_Asigna_Nutricion.setText("Asignar Perfil");
            btn_Asigna_Nutricion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_Asigna_NutricionActionPerformed(evt);
                }
            });

            jLabel62.setText("Cliente:");

            jLabel18.setText("Perfil");

            jCBListFood2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
            listarArchivos(jCBListFood2);
            jCBListFood.setSelectedIndex(-1);
            jCBListFood2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCBListFood2ActionPerformed(evt);
                }
            });

            jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBackgroundVista.PNG"))); // NOI18N

            javax.swing.GroupLayout panel_asignar_perfilLayout = new javax.swing.GroupLayout(panel_asignar_perfil);
            panel_asignar_perfil.setLayout(panel_asignar_perfilLayout);
            panel_asignar_perfilLayout.setHorizontalGroup(
                panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                    .addContainerGap(311, Short.MAX_VALUE)
                    .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                            .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBListFood2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_cliente_nutricion, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btn_Asigna_Nutricion))
                    .addContainerGap(306, Short.MAX_VALUE))
                .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignar_perfilLayout.createSequentialGroup()
                        .addContainerGap(118, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addContainerGap()))
            );
            panel_asignar_perfilLayout.setVerticalGroup(
                panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62)
                        .addComponent(text_cliente_nutricion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jCBListFood2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addComponent(btn_Asigna_Nutricion)
                    .addContainerGap(273, Short.MAX_VALUE))
                .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout panel_registro_nutricionalLayout = new javax.swing.GroupLayout(panel_registro_nutricional);
            panel_registro_nutricional.setLayout(panel_registro_nutricionalLayout);
            panel_registro_nutricionalLayout.setHorizontalGroup(
                panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                    .addComponent(panel_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel_datos4)
                    .addContainerGap())
                .addGroup(panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(panel_asignar_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            panel_registro_nutricionalLayout.setVerticalGroup(
                panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                    .addComponent(panel_datos4, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(panel_asignar_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(493, Short.MAX_VALUE)))
            );

            jTabbedPane1.addTab("Nutrición", new javax.swing.ImageIcon(getClass().getResource("/Imagen/AgregarPN.png")), panel_registro_nutricional); // NOI18N

            jScrollPane5.getVerticalScrollBar().setUnitIncrement(20);

            jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));

            jLabel76.setText("Nombre:");

            jLabel77.setText("Apellidos:");

            label_fecha_seguimiento1.setText("Fecha:");

            dateChooserCobro.setCalendarPreferredSize(new java.awt.Dimension(300, 180));
            dateChooserCobro.setNothingAllowed(false);
            dateChooserCobro.setLocale(Locale.forLanguageTag("es-CR"));
            dateChooserCobro.setCurrentNavigateIndex(0);

            jLabel63.setText("Monto:");

            monto.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    montoActionPerformed(evt);
                }
            });
            monto.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    montoKeyTyped(evt);
                }
            });

            boton_pagar_cobro.setText("Pagar");
            boton_pagar_cobro.setToolTipText("Realizar el Pago");
            boton_pagar_cobro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
            boton_pagar_cobro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boton_pagar_cobroActionPerformed(evt);
                }
            });

            jLabel31.setBackground(new java.awt.Color(255, 255, 255));
            jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel31.setForeground(new java.awt.Color(153, 0, 0));
            jLabel31.setText("Cobro de mensualidad");
            jLabel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));

            jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel78.setText("Búsqueda del cliente");
            jLabel78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

            jLabel27.setText("Detalle:");

            jLabel44.setText("Cedula:");

            btn_buscar_cliente_cobro.setText("Buscar Cliente");
            btn_buscar_cliente_cobro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_buscar_cliente_cobroActionPerformed(evt);
                }
            });

            text_nombre_cobro.setEditable(false);

            text_apellidos_cobro.setEditable(false);

            text_cedula_cobro.setEditable(false);

            jLabel98.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel98.setText("₡");

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });

            jLabel99.setText("Mes. (es)");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap(207, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel44)
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel77))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(text_apellidos_cobro, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addComponent(text_nombre_cobro, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(text_cedula_cobro, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_fecha_seguimiento1)
                                        .addComponent(jLabel27))
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel63)
                                    .addGap(21, 21, 21)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateChooserCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(detalle1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel98)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel99)))
                            .addGap(32, 32, 32)
                            .addComponent(boton_pagar_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel31))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_buscar_cliente_cobro)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dateChooserCobro, monto});

            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel31)
                    .addGap(15, 15, 15)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78)
                        .addComponent(btn_buscar_cliente_cobro))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel44)
                                .addComponent(text_cedula_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel76)
                                .addComponent(text_nombre_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel98)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel99))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel77)
                                .addComponent(text_apellidos_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateChooserCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_fecha_seguimiento1))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel63)
                                        .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(detalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(boton_pagar_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap())
            );

            jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));

            jScrollPane15.getVerticalScrollBar().setUnitIncrement(20);

            jTable10.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                    "Cliente", "Ultimo pago", "Días que han pasado desde el último pago"
                }
            ));
            jScrollPane15.setViewportView(jTable10);

            jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel79.setForeground(new java.awt.Color(153, 0, 0));
            jLabel79.setText("Información de cobros");
            jLabel79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));

            jLabel80.setText("Proyectar");

            jcombo_projec_cobros.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] {
                    "Clientes morosos", "Cancelan en los próximos 7 días",
                    "Clientes que están al día"
                }));
                jcombo_projec_cobros.addItemListener(new java.awt.event.ItemListener() {
                    public void itemStateChanged(java.awt.event.ItemEvent evt) {
                        jcombo_projec_cobrosItemStateChanged(evt);
                    }
                });
                jcombo_projec_cobros.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jcombo_projec_cobrosMouseClicked(evt);
                    }
                });
                jcombo_projec_cobros.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jcombo_projec_cobrosActionPerformed(evt);
                    }
                });

                jbutton_enviar_correo.setVisible(false);
                jbutton_enviar_correo.setText("Enviar correo a clientes");
                jbutton_enviar_correo.setToolTipText("");
                jbutton_enviar_correo.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jbutton_enviar_correoActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel80)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcombo_projec_cobros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jbutton_enviar_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                );
                jPanel6Layout.setVerticalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel79)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(jcombo_projec_cobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbutton_enviar_correo)
                        .addGap(21, 21, 21))
                );

                jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 102)));

                jScrollPane3.getVerticalScrollBar().setUnitIncrement(20);

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                    },
                    new String [] {
                        "Fecha", "Monto", "Detalle"
                    }
                ));
                jScrollPane3.setViewportView(jTable1);

                jButton1.setVisible(false);
                jButton1.setText("Listar Pagos");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

                jLabel41.setText("Cedula");

                text_cedula_seguimiento.setEditable(false);
                text_cedula_pago.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        text_cedula_pagoActionPerformed(evt);
                    }
                });

                text_nombre_seguimiento.setEditable(false);

                jLabel42.setText("Nombre");

                text_apellidos_seguimiento.setEditable(false);

                jLabel43.setText("Apellidos");

                btn_buscar_cliente_pago.setText("Buscar Cliente");
                btn_buscar_cliente_pago.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_buscar_cliente_pagoActionPerformed(evt);
                    }
                });

                jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                jLabel46.setText("Lista de pagos de un Cliente: ");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_cedula_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_nombre_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_apellidos_pago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(264, 264, 264))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel46)
                                .addGap(29, 29, 29)
                                .addComponent(btn_buscar_cliente_pago)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar_cliente_pago)
                            .addComponent(jLabel46))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(text_nombre_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(text_cedula_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43)
                            .addComponent(text_apellidos_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                );

                jScrollPane5.setViewportView(jPanel1);

                javax.swing.GroupLayout panel_control_pagosLayout = new javax.swing.GroupLayout(panel_control_pagos);
                panel_control_pagos.setLayout(panel_control_pagosLayout);
                panel_control_pagosLayout.setHorizontalGroup(
                    panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                );
                panel_control_pagosLayout.setVerticalGroup(
                    panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_control_pagosLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 312, Short.MAX_VALUE))
                );

                jTabbedPane1.addTab("Pagos", new javax.swing.ImageIcon(getClass().getResource("/Imagen/cobro.png")), panel_control_pagos); // NOI18N

                panel_datos_seg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(5, 100, 152), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));

                jLabel1.setText("Brazo derecho");

                jLabel2.setText("Brazo Izquierdo");

                jLabel3.setText("Antebrazo Derecho");

                jLabel4.setText("Antebrazo Izquierdo");

                jLabel5.setText("Pecho");

                jLabel6.setText("Espalda");

                jLabel7.setText("Cadera");

                jLabel8.setText("Cintura");

                jLabel9.setText("Glúteos");

                peso.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        pesoKeyTyped(evt);
                    }
                });

                jLabel10.setText("Pierna Derecha");

                imc.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        imcKeyTyped(evt);
                    }
                });

                grasa.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        grasaKeyTyped(evt);
                    }
                });

                pecho.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        pechoKeyTyped(evt);
                    }
                });

                espalda.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        espaldaKeyTyped(evt);
                    }
                });

                cadera.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        caderaKeyTyped(evt);
                    }
                });

                gluteos.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        gluteosKeyTyped(evt);
                    }
                });

                cintura.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        cinturaKeyTyped(evt);
                    }
                });

                jLabel11.setText("Pierna Izquierda");

                jLabel12.setText("Pantorrilla Izquierda");

                jLabel13.setText("Pantorrilla derecha");

                jLabel14.setText("Peso");

                jLabel15.setText("Grasa");

                jLabel16.setText("IMC");

                pantorrilla_derecha.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        pantorrilla_derechaKeyTyped(evt);
                    }
                });

                pierna_derecha.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        pierna_derechaKeyTyped(evt);
                    }
                });

                pantorrilla_izquierda.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        pantorrilla_izquierdaKeyTyped(evt);
                    }
                });

                pierna_izquierda.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        pierna_izquierdaKeyTyped(evt);
                    }
                });

                brazo_derecho.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        brazo_derechoKeyTyped(evt);
                    }
                });

                brazo_izquierdo.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        brazo_izquierdoKeyTyped(evt);
                    }
                });

                antebrazo_derecho.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        antebrazo_derechoKeyTyped(evt);
                    }
                });

                antebrazo_izquierdo.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        antebrazo_izquierdoKeyTyped(evt);
                    }
                });

                jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel54.setText("Kgs");

                jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel55.setText("cms");

                jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel56.setText("cms");

                jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel57.setText("cms");

                jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel58.setText("cms");

                jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel59.setText("cms");

                jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel60.setText("cms");

                jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel64.setText("cms");

                jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel65.setText("cms");

                jLabel66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel66.setText("cms");

                jLabel67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel67.setText("cms");

                jLabel68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel68.setText("cms");

                jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel69.setText("cms");

                jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel70.setText("cms");

                jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel92.setText("%");

                javax.swing.GroupLayout panel_datos_segLayout = new javax.swing.GroupLayout(panel_datos_seg);
                panel_datos_seg.setLayout(panel_datos_segLayout);
                panel_datos_segLayout.setHorizontalGroup(
                    panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(27, 27, 27)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peso)
                            .addComponent(imc, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(grasa)
                            .addComponent(pecho)
                            .addComponent(espalda)
                            .addComponent(cadera, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cintura))
                        .addGap(3, 3, 3)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel92)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addGap(59, 59, 59)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pierna_izquierda)
                            .addComponent(pierna_derecha)
                            .addComponent(pantorrilla_izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(pantorrilla_derecha)
                            .addComponent(brazo_derecho, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(brazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(antebrazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(antebrazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                panel_datos_segLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {antebrazo_derecho, antebrazo_izquierdo, brazo_derecho, brazo_izquierdo, pantorrilla_derecha, pantorrilla_izquierda, pierna_derecha, pierna_izquierda});

                panel_datos_segLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadera, cintura, espalda, gluteos, grasa, imc, pecho, peso});

                panel_datos_segLayout.setVerticalGroup(
                    panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(pierna_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel54)
                                .addComponent(jLabel60))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(pierna_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(grasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel92))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel55)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_datos_segLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel13))
                                .addGroup(panel_datos_segLayout.createSequentialGroup()
                                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pantorrilla_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel65))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pantorrilla_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel66)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(brazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(brazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68)))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel56))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel57))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(antebrazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel69))
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(antebrazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel70)))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59))))
                        .addContainerGap(25, Short.MAX_VALUE))
                );

                boton_añadir_seguimiento.setText("Añadir Seguimiento");
                boton_añadir_seguimiento.setToolTipText("haga click para añadir un nuevo seguimiento");
                boton_añadir_seguimiento.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        boton_añadir_seguimientoActionPerformed(evt);
                    }
                });

                jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)));

                label_fecha_seguimiento.setText("Fecha");

                text_nombre_seguimiento.setEditable(false);

                jLabel29.setText("Apellidos:");

                text_apellidos_seguimiento.setEditable(false);

                btn_busca_cliente_seg.setText("Buscar Cliente");
                btn_busca_cliente_seg.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_busca_cliente_segActionPerformed(evt);
                    }
                });

                combo_fecha_seguimiento.setCalendarPreferredSize(new java.awt.Dimension(300, 180));
                combo_fecha_seguimiento.setNothingAllowed(false);
                combo_fecha_seguimiento.setLocale(Locale.forLanguageTag("es-CR"));
                combo_fecha_seguimiento.setCurrentNavigateIndex(0);

                jLabel26.setText("Nombre:");

                text_cedula_seguimiento.setEditable(false);
                text_cedula_seguimiento.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        text_cedula_seguimientoActionPerformed(evt);
                    }
                });

                jLabel25.setText("Cedula:");

                label_cliente_seguimiento.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                label_cliente_seguimiento.setForeground(new java.awt.Color(0, 0, 153));
                label_cliente_seguimiento.setText("Cliente");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label_fecha_seguimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_fecha_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(510, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_cedula_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_nombre_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(label_cliente_seguimiento)
                                        .addGap(31, 31, 31)
                                        .addComponent(btn_busca_cliente_seg)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_apellidos_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                );
                jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_cliente_seguimiento)
                            .addComponent(btn_busca_cliente_seg))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_nombre_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(text_cedula_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel29)
                            .addComponent(text_apellidos_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_fecha_seguimiento)
                            .addComponent(combo_fecha_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout panel_seguimientosLayout = new javax.swing.GroupLayout(panel_seguimientos);
                panel_seguimientos.setLayout(panel_seguimientosLayout);
                panel_seguimientosLayout.setHorizontalGroup(
                    panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_seguimientosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_añadir_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_seguimientosLayout.createSequentialGroup()
                        .addContainerGap(159, Short.MAX_VALUE)
                        .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_datos_seg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(162, Short.MAX_VALUE))
                );
                panel_seguimientosLayout.setVerticalGroup(
                    panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_seguimientosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_añadir_seguimiento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jTabbedPane1.addTab("Seguimientos", new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon_1.jpg")), panel_seguimientos); // NOI18N

                jScrollPane2.getVerticalScrollBar().setUnitIncrement(20);
                jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                jScrollPane2.setAutoscrolls(true);

                panel_busqueda_cliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

                panel_parametros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(102, 102, 0)));

                jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel71.setForeground(new java.awt.Color(102, 102, 0));
                jLabel71.setText("Búsqueda del cliente ");

                btn_busca_cliente_bp.setText("Buscar Cliente");
                btn_busca_cliente_bp.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_busca_cliente_bpActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout panel_parametrosLayout = new javax.swing.GroupLayout(panel_parametros);
                panel_parametros.setLayout(panel_parametrosLayout);
                panel_parametrosLayout.setHorizontalGroup(
                    panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_parametrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_parametrosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_busca_cliente_bp))
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(619, Short.MAX_VALUE))
                );
                panel_parametrosLayout.setVerticalGroup(
                    panel_parametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_parametrosLayout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_busca_cliente_bp)
                        .addContainerGap())
                );

                panel_muestra_datos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

                lb_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/login_icon_user.png"))); // NOI18N

                lb_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                lb_nombre.setText("Nombre:");

                lb_apellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                lb_apellidos.setText("Apellidos:");

                lb_cedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                lb_cedula.setText("Cedula:");

                javax.swing.GroupLayout panel_muestra_datosLayout = new javax.swing.GroupLayout(panel_muestra_datos);
                panel_muestra_datos.setLayout(panel_muestra_datosLayout);
                panel_muestra_datosLayout.setHorizontalGroup(
                    panel_muestra_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_muestra_datosLayout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panel_muestra_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(48, Short.MAX_VALUE))
                );
                panel_muestra_datosLayout.setVerticalGroup(
                    panel_muestra_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_muestra_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_muestra_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_muestra_datosLayout.createSequentialGroup()
                                .addComponent(lb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                );

                javax.swing.GroupLayout panel_busqueda_clienteLayout = new javax.swing.GroupLayout(panel_busqueda_cliente);
                panel_busqueda_cliente.setLayout(panel_busqueda_clienteLayout);
                panel_busqueda_clienteLayout.setHorizontalGroup(
                    panel_busqueda_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_busqueda_clienteLayout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addGroup(panel_busqueda_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_parametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_muestra_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(67, Short.MAX_VALUE))
                );
                panel_busqueda_clienteLayout.setVerticalGroup(
                    panel_busqueda_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_busqueda_clienteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panel_parametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_muestra_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                );

                panel_proyeccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 0), 1, true));

                jp_chart.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));

                javax.swing.GroupLayout jp_chartLayout = new javax.swing.GroupLayout(jp_chart);
                jp_chart.setLayout(jp_chartLayout);
                jp_chartLayout.setHorizontalGroup(
                    jp_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 876, Short.MAX_VALUE)
                );
                jp_chartLayout.setVerticalGroup(
                    jp_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 228, Short.MAX_VALUE)
                );

                jButton7.setText("Exportar gráfico");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton7ActionPerformed(evt);
                    }
                });

                jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel72.setForeground(new java.awt.Color(204, 0, 51));
                jLabel72.setText(" Proyección de los cambios en medidas físicas y corporales del cliente");
                jLabel72.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

                jLabel73.setText("Atributo a proyectar del cliente: ");

                jcb_proyec.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] {
                        "Piernas",
                        "Brazos",
                        "Pantorrillas",
                        "Antebrazos",
                        "Cintura",
                        "Gluteos",
                        "Cadera",
                        "Espalda",
                        "Pecho",
                        "Grasa",
                        "Peso",
                        "IMC"
                    }));
                    jcb_proyec.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jcb_proyecActionPerformed(evt);
                        }
                    });

                    javax.swing.GroupLayout panel_proyeccionLayout = new javax.swing.GroupLayout(panel_proyeccion);
                    panel_proyeccion.setLayout(panel_proyeccionLayout);
                    panel_proyeccionLayout.setHorizontalGroup(
                        panel_proyeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_proyeccionLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcb_proyec, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_proyeccionLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp_chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel_proyeccionLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel_proyeccionLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel72)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel_proyeccionLayout.setVerticalGroup(
                        panel_proyeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_proyeccionLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel72)
                            .addGap(24, 24, 24)
                            .addGroup(panel_proyeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel73)
                                .addComponent(jcb_proyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jp_chart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton7)
                            .addContainerGap())
                    );

                    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                    jPanel8.setLayout(jPanel8Layout);
                    jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addContainerGap(125, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(panel_proyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel_busqueda_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(143, Short.MAX_VALUE))
                    );

                    jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panel_busqueda_cliente, panel_proyeccion});

                    jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel_busqueda_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panel_proyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                    );

                    jScrollPane2.setViewportView(jPanel8);

                    javax.swing.GroupLayout panel_busquedaLayout = new javax.swing.GroupLayout(panel_busqueda);
                    panel_busqueda.setLayout(panel_busquedaLayout);
                    panel_busquedaLayout.setHorizontalGroup(
                        panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                    );
                    panel_busquedaLayout.setVerticalGroup(
                        panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_busquedaLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 312, Short.MAX_VALUE))
                    );

                    jTabbedPane1.addTab("Búsqueda y Proyección", new javax.swing.ImageIcon(getClass().getResource("/Imagen/proyeccion.png")), panel_busqueda); // NOI18N

                    jMenu1.setText("Sesion");

                    jMenuItem1.setText("Cerrar Sesion");
                    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jMenuItem1ActionPerformed(evt);
                        }
                    });
                    jMenu1.add(jMenuItem1);

                    jMenuBar1.add(jMenu1);

                    setJMenuBar(jMenuBar1);

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, Short.MAX_VALUE)
                    );
                    layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    );

                    pack();
                }// </editor-fold>//GEN-END:initComponents


    private void jbRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarClienteActionPerformed
        jBAddCliente.setText("Agregar Cliente");
        this.limpiarCamposRegistro();
        if (!panel_reg_fisico.isVisible()) {
            desactivar_Cliente.setVisible(false);
            desactivar_Cliente.validate();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
            jLFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/login_icon_user.png")));
            panel_datos.setVisible(true);
            panel_datos.validate();
            panel_datos.paintComponents(panel_datos.getGraphics());
            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            panel_reg_fisico.setVisible(true);
            panel_reg_fisico.validate();
            panel_reg_fisico.paintComponents(panel_reg_fisico.getGraphics());
        } else {
            panel_reg_fisico.repaint();
        }
    }//GEN-LAST:event_jbRegistrarClienteActionPerformed

    private void jbEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarClienteActionPerformed
        jBAddCliente.setText("Modificar Cliente");
        this.limpiarCamposRegistro();
        seleccionaCliente();
        if (clienteSelected != null) {
            String editarCedula = clienteSelected.getId_cliente();
            if (!panel_reg_fisico.isVisible()) {
                desactivar_Cliente.setVisible(false);
                desactivar_Cliente.validate();
                desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
                panel_datos.setVisible(true);
                panel_datos.validate();
                panel_datos.paintComponents(panel_datos.getGraphics());
                if (!editarCedula.equals("")) {
                    cargarDatosCliente(editarCedula);
                    panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    panel_reg_fisico.setVisible(true);
                    panel_reg_fisico.validate();
                    panel_reg_fisico.paintComponents(panel_reg_fisico.getGraphics());
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no valido");
                }
            } else {
                if (!editarCedula.equals("")) {
                    cargarDatosCliente(editarCedula);
                    panel_reg_fisico.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no valido");
                }
            }
        }
    }//GEN-LAST:event_jbEditarClienteActionPerformed

    private void jbDesactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesactivarClienteActionPerformed
        seleccionaCliente();
        if (clienteSelected != null) {
            text_cliente_desactivar.setText(clienteSelected.getId_cliente() + " " + clienteSelected.getNombre() + " " + clienteSelected.getApellidos());
            if (!desactivar_Cliente.isVisible()) {
                panel_datos.setVisible(false);
                panel_fisico.setVisible(false);
                panel_fisico.validate();
                panel_fisico.paintComponents(panel_fisico.getGraphics());
                desactivar_Cliente.setVisible(true);
                desactivar_Cliente.validate();
                desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
            } else {
                desactivar_Cliente.repaint();
            }
        }
    }//GEN-LAST:event_jbDesactivarClienteActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jBAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddClienteActionPerformed
        if (valida_datos_personales() || valida_datos_salud()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos!\nO seleccionar todas las opciones");
        } else {
            try {
                File f = new File(pathFotos);
                String nl = photoLocation + cedula.getText() + ".jpg";
                Files.move(Paths.get(pathFotos), Paths.get(nl), REPLACE_EXISTING);
                pathFotos = "";
            } catch (Exception e) {
                System.err.println("Error en move de file.");
            }
            Cliente cli = new Cliente(cedula.getText(), nombre.getText(), apellidos.getText(), direccion.getText(),
                    email.getText(), nacimiento.getText(), cb_sexo.getSelectedIndex(), telefono.getText());
            //if(jBAddCliente.getText().equals("Editar Cliente")) cli.setId_cliente(clienteSelected.getId_cliente());
            if (clienteSelected != null && !clienteSelected.getId_cliente().equals(cedula.getText())) {
                control.getDao().deleteCliente(clienteSelected.getId_cliente());
            }

            control.getDao().setCliente(cli);

            SaludCliente sc = new SaludCliente(combo_lesion_osea.getSelectedIndex(), osea_desc.getText(),
                    combo_lesion_musc.getSelectedIndex(), muscular_desc.getText(),
                    combo_enfer_cardio.getSelectedIndex(), cardio_desc.getText(),
                    combo_asfixia.getSelectedIndex(), combo_asmatico.getSelectedIndex(),
                    combo_hipertenso.getSelectedIndex(), combo_diabetico.getSelectedIndex(),
                    combo_fumador.getSelectedIndex(), combo_epileptico.getSelectedIndex(),
                    combo_embarazo.getSelectedIndex(), combo_anemia.getSelectedIndex(),
                    combo_mareos.getSelectedIndex(), combo_desmayos.getSelectedIndex(),
                    combo_nauseas.getSelectedIndex(), combo_dif_respirar.getSelectedIndex(),
                    combo_practica_act_deport.getSelectedIndex(), combo_gimnasio.getSelectedIndex(),
                    textarea_otro_padecimiento.getText(), cli.getId_cliente()
            );
            control.getDao().setSaludCliente(sc);
            this.limpiarCamposRegistro();
            if (jBAddCliente.getText().equals("Agregar Cliente")) {
                JOptionPane.showMessageDialog(null, "Usuario creado e ingresado");
                RegistroFisicoCliente rf = new RegistroFisicoCliente(control, cli);
                rf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ha sido editado");
            }
        }
    }//GEN-LAST:event_jBAddClienteActionPerformed

    private void cargarTablas(Rutina r) {
        List<EjerciciosRutina> piernas = control.getDao().getSizeParte(r.getId(), "Piernas");
        cargaTabla(tablePiernas, piernas);

        List<EjerciciosRutina> pantorrillas = control.getDao().getSizeParte(r.getId(), "Pantorillas");
        cargaTabla(tablePantorrilla, pantorrillas);

        List<EjerciciosRutina> biceps = control.getDao().getSizeParte(r.getId(), "Biceps");
        cargaTabla(tableBiceps1, biceps);

        List<EjerciciosRutina> tricep = control.getDao().getSizeParte(r.getId(), "Triceps");
        cargaTabla(tableTriceps, tricep);

        List<EjerciciosRutina> antebrazo = control.getDao().getSizeParte(r.getId(), "Antebrazo");
        cargaTabla(tableAntebraso, antebrazo);

        List<EjerciciosRutina> hombro = control.getDao().getSizeParte(r.getId(), "Hombros");
        cargaTabla(tableHombros, hombro);

        List<EjerciciosRutina> pecho_c = control.getDao().getSizeParte(r.getId(), "Pecho");
        cargaTabla(tablePecho, pecho_c);

        List<EjerciciosRutina> espalda_c = control.getDao().getSizeParte(r.getId(), "Espalda");
        cargaTabla(tableEspalda, espalda_c);

        List<EjerciciosRutina> trapecio = control.getDao().getSizeParte(r.getId(), "Trapecio");
        cargaTabla(tableTrapecio, trapecio);
    }

    private void cargaTabla(JTable t, List<EjerciciosRutina> er) {
        String[] headTabla = {"Ejercicio", "Serie", "Repeticion", "Peso", "Codigo"};
        Object[][] o = new Object[er.size()][5];
        for (int i = 0; i < er.size(); i++) {
            o[i][0] = er.get(i).getEjercicio().equals("null") ? null : er.get(i).getEjercicio();
            o[i][1] = er.get(i).getSerie().equals("null") ? null : er.get(i).getSerie();
            o[i][2] = er.get(i).getRepeticion().equals("null") ? null : er.get(i).getRepeticion();
            o[i][3] = er.get(i).getPeso().equals("null") ? null : er.get(i).getPeso();
            o[i][4] = er.get(i).getId();
        }
        t.setModel(new DefaultTableModel(o, headTabla) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        }
        );
        t.getColumnModel().getColumn(4).setMinWidth(0);
        t.getColumnModel().getColumn(4).setMaxWidth(0);
        t.getColumnModel().getColumn(4).setWidth(0);
    }

    private void jBAsignarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignarRutinaActionPerformed
        seleccionaCliente();
        if (clienteSelected != null) {
            try {
                cargaCombo(combo_rutinas_creadas, control.getDao().todoRutina(), true);
                text_cliente_rutina.setText(clienteSelected.getId_cliente() + " " + clienteSelected.getNombre() + " " + clienteSelected.getApellidos());
                if (!panel_asignar_rutina.isVisible()) {
                    panel_registro_rutinas.setVisible(false);
                    panel_asignar_rutina.setVisible(true);
                    panel_asignar_rutina.validate();
                    panel_asignar_rutina.paintComponents(panel_asignar_rutina.getGraphics());
                    panel_asignar_rutina.repaint();
                    bt_Print.setVisible(false);
                    panel_datos1.setVisible(false);
                } else {
                    panel_asignar_rutina.repaint();
                    panel_asignar_rutina.paintComponents(panel_asignar_rutina.getGraphics());
                }
            } catch (SQLException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jBAsignarRutinaActionPerformed

    private void jBCrearRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearRutinaActionPerformed
        limpiaTablas();
        setColumnWidth();
        text_nombre_rutina.setText(null);
        jBCreateRutina1.setText("Crear");
        jBEditarRutina.setVisible(false);
        panel_datos1.setVisible(true);
        panel_asignar_rutina.setVisible(false);
        bt_Print.setVisible(true);
        panel_crear_rutina.setVisible(true);
        panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
    }//GEN-LAST:event_jBCrearRutinaActionPerformed

    private void asigna_rutina_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asigna_rutina_clienteActionPerformed
        ClienteRutina cr = new ClienteRutina(clienteSelected.getId_cliente(), combo_rutinas_creadas.getSelectedIndex() + 1);
        control.getDao().setClienteRutina(cr);
        clienteSelected = null;
        text_cliente_rutina.setText(null);
        combo_rutinas_creadas.setSelectedIndex(-1);
    }//GEN-LAST:event_asigna_rutina_clienteActionPerformed

    private void combo_rutinas_creadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_rutinas_creadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_rutinas_creadasActionPerformed

    private void btn_perfiles_NutricionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfiles_NutricionalesActionPerformed
        panel_asignar_perfil.setVisible(false);
        jTabbedPane2.setVisible(true);
        panel_crear_perfil_nutricional.paintComponents(panel_crear_perfil_nutricional.getGraphics());
        panel_crear_perfil_nutricional.setVisible(true);
        panel_datos4.setVisible(true);

    }//GEN-LAST:event_btn_perfiles_NutricionalesActionPerformed

    private void btn_asignar_pNutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_pNutricionalActionPerformed
        seleccionaCliente();
        if (clienteSelected != null) {
            text_cliente_nutricion.setText(clienteSelected.getId_cliente() + " " + clienteSelected.getNombre() + " " + clienteSelected.getApellidos());
            panel_crear_perfil_nutricional.setVisible(false);
            panel_datos4.setVisible(false);
            panel_asignar_perfil.setVisible(true);
            panel_asignar_perfil.paintComponents(panel_asignar_perfil.getGraphics());
        }
    }//GEN-LAST:event_btn_asignar_pNutricionalActionPerformed

    private void text_cliente_nutricionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cliente_nutricionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cliente_nutricionActionPerformed

    private void btn_Asigna_NutricionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Asigna_NutricionActionPerformed
        // TODO add your handling code here:
        Cliente c = clienteSelected;
        if (c != null) {
            Nutricion n = new Nutricion(jCBListFood2.getSelectedItem().toString(), c);
            this.control.getDao().setNutricionCliente(n);
            JOptionPane.showMessageDialog(null, "Al Usuario: " + c.getNombre() + " " + c.getApellidos() + "\n Se le ha asignado la rutina: " + jCBListFood2.getSelectedItem().toString(),
                    "Alert", JOptionPane.INFORMATION_MESSAGE);
            text_cliente_nutricion.setText(null);
            jCBListFood2.setSelectedIndex(-1);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no existente!");
        }
    }//GEN-LAST:event_btn_Asigna_NutricionActionPerformed


    private void jCBListFood2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBListFood2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBListFood2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        control.useChooser(Chart.getJChart());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void nacimientoOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_nacimientoOnCommit
        try {
            if (nacimiento.getText() != null || nacimiento.getText() != "") {
                calcEdad();
            }
        } catch (Exception e) {
            System.out.println("Error de conversion de fecha Nacimiento: '" + nacimiento.getText() + "'");
        }
    }//GEN-LAST:event_nacimientoOnCommit

    private void calcEdad() {
        try {
            if (nacimiento.getText() != null || nacimiento.getText() != "") {
                String dateStr = nacimiento.getText();
                DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                Date fechaNac = (Date) formatter.parse(dateStr);

                Calendar fecha = Calendar.getInstance();
                Calendar fechaActual = Calendar.getInstance();
                fecha.setTime(fechaNac);
                int año = fechaActual.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
                int mes = fechaActual.get(Calendar.MONTH) - fecha.get(Calendar.MONTH);
                int dia = fechaActual.get(Calendar.DATE) - fecha.get(Calendar.DATE);
                if (mes < 0 || (mes == 0 && dia < 0)) {
                    año--;
                }
                edad.setEditable(true);
                edad.setText("" + año);

                System.out.println(año);
                edad.setEditable(false);
            }
        } catch (Exception e) {
            System.out.println("Error de conversion de fecha Nacimiento: '" + nacimiento.getText() + "'");

        }
    }

    private void jLFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFotoMouseClicked
        try {
            fotoChooser = new JFileChooser();
            fotoChooser.showOpenDialog(null);
            File archivo = fotoChooser.getSelectedFile();
            pathFotos = archivo.getAbsolutePath();
            ImageIcon imagen = new ImageIcon(pathFotos);
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLFoto.getWidth(), jLFoto.getHeight(), Image.SCALE_DEFAULT));
            jLFoto.setIcon(icono);
            this.repaint();
        } catch (Exception e) {
            System.out.println("Error en la subida de fotografia.");
        }
    }//GEN-LAST:event_jLFotoMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed

    }//GEN-LAST:event_apellidosActionPerformed

    private void boton_pagar_cobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pagar_cobroActionPerformed
        if (clienteSelected != null) {
            if (monto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se ha digitado un monto para facturar.\n\nSe Digite el monto a cancelar.\n", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Pago pago = new Pago(dateChooserCobro.getText(), Double.parseDouble(monto.getText()), detalle1.getText(), clienteSelected);
                control.getDao().setPago(pago);
                JOptionPane.showMessageDialog(null, "Pago efectuado de forma exitosa.");
                clearCamposCobro();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario No Seleccionado.\n\nSe debe Seleccionar un Usuario.\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_pagar_cobroActionPerformed

    private void boton_añadir_seguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_añadir_seguimientoActionPerformed
        if (clienteSelected != null) {
            Seguimiento seg = new Seguimiento(Double.parseDouble(peso.getText()), Double.parseDouble(imc.getText()),
                    combo_fecha_seguimiento.getText(), Double.parseDouble(grasa.getText()),
                    Double.parseDouble(pecho.getText()), Double.parseDouble(espalda.getText()),
                    Double.parseDouble(cadera.getText()), Double.parseDouble(gluteos.getText()),
                    Double.parseDouble(cintura.getText()), Double.parseDouble(pierna_izquierda.getText()),
                    Double.parseDouble(pierna_derecha.getText()), Double.parseDouble(pantorrilla_izquierda.getText()),
                    Double.parseDouble(pantorrilla_derecha.getText()), Double.parseDouble(brazo_izquierdo.getText()),
                    Double.parseDouble(brazo_derecho.getText()), Double.parseDouble(antebrazo_derecho.getText()),
                    Double.parseDouble(antebrazo_izquierdo.getText()), clienteSelected);
            control.getDao().setSeguimiento(seg);//añade el seguimiento en la base de datos
            JOptionPane.showMessageDialog(null, "Seguimiento añadido correctamente.");
            clearCamposSeguimiento();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario No Seleccionado.\n\nSe debe Seleccionar un Usuario.\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_añadir_seguimientoActionPerformed

    private void jBDesactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesactivarClienteActionPerformed
        if (clienteSelected != null) {
            String cedCliente = clienteSelected.getId_cliente();
            if (!cedCliente.isEmpty()) {
                int codigoCliente = JOptionPane.showConfirmDialog(this, "Esta seguro que desea \neliinar a este cliente?", "Eliminar Cliente", JOptionPane.OK_CANCEL_OPTION);
                if (codigoCliente == JOptionPane.OK_OPTION) {
                    control.getDao().deleteCliente(cedCliente);
                    text_cliente_desactivar.setText(null);
                    clienteSelected = null;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no valido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBDesactivarClienteActionPerformed

    private void jcombo_projec_cobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo_projec_cobrosActionPerformed
        if (jcombo_projec_cobros.getSelectedIndex() == 0) {
            jbutton_enviar_correo.setVisible(true);
        } else if (jcombo_projec_cobros.getSelectedIndex() == 1) {
            jbutton_enviar_correo.setVisible(true);
        } else {
            jbutton_enviar_correo.setVisible(false);
        }
        jTable10.removeAll();
        DefaultTableModel model = (DefaultTableModel) jTable10.getModel();
        while (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        List<Cliente> list = control.getDao().
                getClientesSegunPagos(jcombo_projec_cobros.getSelectedItem().toString());
        list.stream().forEach(
                a -> model.addRow(new Object[]{
                    a.getNombre() + " " + a.getApellidos(),//nombre y apellidos
                    a.getPagos().stream().reduce((current, previous) -> previous).get().getFecha(),
                    //  ultima fecha de pago 
                    ChronoUnit.DAYS.between(
                            DAO.fromStringToDate(a.getPagos().stream().
                                    reduce((current, previous) -> previous).get().getFecha()),
                            LocalDate.now()
                    ) //dias que han pasado entre hoy y el ultimo pago
                }));

    }//GEN-LAST:event_jcombo_projec_cobrosActionPerformed

    private void jbutton_enviar_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_enviar_correoActionPerformed
        switch (jcombo_projec_cobros.getSelectedItem().toString()) {
            case "Clientes morosos":
                control.getDao().getClientesSegunPagos(jcombo_projec_cobros.getSelectedItem().toString())
                        .stream().forEach(a -> control.sendEmail(a.getEmail(),
                                        "Aviso de cobro por morosidad gimnasio Power Gym",
                                        "Estimado cliente: " + a.getNombre() + " " + a.getApellidos()
                                        + "le informamos que usted está moroso con la cancelación mensual del gimnasio"));
                break;
            case "Cancelan en los próximos 7 días":
                control.getDao().getClientesSegunPagos(jcombo_projec_cobros.getSelectedItem().toString())
                        .stream().forEach(a -> control.sendEmail(a.getEmail(),
                                        "Aviso de cobro gimnasio Power Gym",
                                        "Estimado cliente: " + a.getNombre() + " " + a.getApellidos()
                                        + "le informamos que usted debe cancelar su mensualidad en los próximos 7 días," + "/n"
                                        + " gracias por ser parte de Power Gym! "));
                break;
            case "Clientes que están al día":
                jbutton_enviar_correo.setVisible(false);
                break;
            default:
                jbutton_enviar_correo.setVisible(false);
                break;
        }
    }//GEN-LAST:event_jbutton_enviar_correoActionPerformed

    private void jBCreateRutina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreateRutina1ActionPerformed
        String nom = text_nombre_rutina.getText();
        if (nom.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha asignado un nombre a la rutina.\n Escriba un numbre para su rutina.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String msj = "agregado";
            Rutina r = new Rutina(0, nom);
            if (jBCreateRutina1.getText().equals("Modificar")) {
                r.setId(rutinaSelected.getId());
                msj = "modificado";
            }
            control.getDao().setRutina(r);
            creaER(r);
            limpiaTablas();
            text_nombre_rutina.setText(null);
            JOptionPane.showMessageDialog(this, "Se ha " + msj + " la rutina con exito.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBCreateRutina1ActionPerformed

    private void creaER(Rutina r) {
        insertaEjercicios(tablePiernas, "Piernas", r);
        insertaEjercicios(tablePantorrilla, "Pantorillas", r);
        insertaEjercicios(tableBiceps1, "Biceps", r);
        insertaEjercicios(tableTriceps, "Triceps", r);
        insertaEjercicios(tableAntebraso, "Antebrazo", r);
        insertaEjercicios(tableHombros, "Hombros", r);
        insertaEjercicios(tablePecho, "Pecho", r);
        insertaEjercicios(tableEspalda, "Espalda", r);
        insertaEjercicios(tableTrapecio, "Trapecio", r);
    }

    private void insertaEjercicios(JTable t, String parte, Rutina r) {
        for (int i = 0; i < t.getRowCount(); i++) {
            String ejercicio = (String) t.getValueAt(i, 0);
            String serie = String.valueOf(t.getValueAt(i, 1));
            String repeticion = String.valueOf(t.getValueAt(i, 2));
            String peso_Ejercicio = String.valueOf(t.getValueAt(i, 3));
            EjerciciosRutina er = new EjerciciosRutina(parte, ejercicio, serie, repeticion, peso_Ejercicio, r);
            if (jBCreateRutina1.getText().equals("Modificar")) {
                if (t.getValueAt(i, 4) != null) {
                    er.setId((int) t.getValueAt(i, 4));
                }
            }
            control.getDao().setEjerciciosRutina(er);
        }
    }

    private void bt_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PrintActionPerformed
        if (text_nombre_rutina.getText() != null || text_nombre_rutina.getText() != "") {
            String fileName = "C:\\PGS\\Rutina\\" + text_nombre_rutina.getText() + ".pdf";
            printToPDF(fileName);
            verPDFFrame(fileName);
        } else {
            JOptionPane.showMessageDialog(this, "No hay rutina Seleccionada.\n\nSe debe ingresar el nombre de la Rutina o Carga esta.\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_PrintActionPerformed

    private void printToPDF(String fileName) {
        try {
            Document d = new Document();
            PdfWriter writer = PdfWriter.getInstance(d, new FileOutputStream(
                    fileName));
            d.open();

            PdfPTable tabletmp = new PdfPTable(1);
            tabletmp.getDefaultCell().setBorder(Rectangle.NO_BORDER);
            tabletmp.setWidthPercentage(82);

            tabletmp.addCell("Nombre:__________________________________   " + rutinaSelected.getNombre());

            tabletmp.addCell("\nPiernas");
            tabletmp.addCell(getImageFromPanel(writer, tablePiernas.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tablePiernas));
            tabletmp.addCell("\n");

            tabletmp.addCell("Pantorillas");
            tabletmp.addCell(getImageFromPanel(writer, tablePantorrilla.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tablePantorrilla));
            tabletmp.addCell("\n");

            tabletmp.addCell("Biceps");
            tabletmp.addCell(getImageFromPanel(writer, tableBiceps1.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tableBiceps1));
            tabletmp.addCell("\n");

            tabletmp.addCell("Triceps");
            tabletmp.addCell(getImageFromPanel(writer, tableTriceps.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tableTriceps));
            tabletmp.addCell("\n");

            tabletmp.addCell("Antebraso");
            tabletmp.addCell(getImageFromPanel(writer, tableAntebraso.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tableAntebraso));
            tabletmp.addCell("\n");

            tabletmp.addCell("Hombros");
            tabletmp.addCell(getImageFromPanel(writer, tableHombros.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tableHombros));
            tabletmp.addCell("\n");
            
            tabletmp.addCell("Pecho");
            tabletmp.addCell(getImageFromPanel(writer, tablePecho.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tablePecho));
            tabletmp.addCell("\n");

            tabletmp.addCell("Espalda");
            tabletmp.addCell(getImageFromPanel(writer, tableEspalda.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tableEspalda));
            tabletmp.addCell("\n");
            
            tabletmp.addCell("Trapecio");
            tabletmp.addCell(getImageFromPanel(writer, tableTrapecio.getTableHeader()));
            tabletmp.addCell(getImageFromPanel(writer, tableTrapecio));
                        
            d.add(tabletmp);
            
            d.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static com.itextpdf.text.Image getImageFromPanel(PdfWriter writer, Component component) throws BadElementException {
        com.itextpdf.text.Image iTextImage = null;
        try {
            BufferedImage image = new BufferedImage(component.getWidth(),
                    component.getHeight(), BufferedImage.TYPE_INT_ARGB);
            component.paint(image.getGraphics());
            iTextImage = com.itextpdf.text.Image.getInstance(writer, image, 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return iTextImage;
    }


    private void btn_add_plan_nutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_plan_nutricionalActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileFilter() {
            public String getDescription() {
                return "PDF Documents (*.pdf)";
            }

            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".pdf");
                }
            }
        });
        fileChooser.setDialogTitle("Specify a file to save");
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        File fileToSave = fileChooser.getSelectedFile();
        if (userSelection == 0) {
            if (fileToSave.getName().toLowerCase().endsWith(".pdf")) {

                System.out.println("Save as file: " + fileToSave.getAbsolutePath());
                try {
                    copyFile(fileToSave.getAbsolutePath(), "C:\\PGS\\nutricion\\" + fileToSave.getName());

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No es un archivo .PDF", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_add_plan_nutricionalActionPerformed

    public void copyFile(String origen, String destino) throws IOException {
        Path FROM = Paths.get(origen);
        Path TO = Paths.get(destino);
        File f = new File(TO.toAbsolutePath().toString());
        //sobreescribir el fichero de destino, si existe, y copiar
        // los atributos, incluyendo los permisos rwx
        CopyOption[] options = new CopyOption[]{
            StandardCopyOption.REPLACE_EXISTING,
            StandardCopyOption.COPY_ATTRIBUTES
        };
        if (f.isFile()) {
            int res = JOptionPane.showConfirmDialog(null, "Desea sobreescribir el archivo?", "Sobreescribir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == 0) {
                Files.copy(FROM, TO, options);
                jCBListFood.addItem(f.getName());
                JOptionPane.showMessageDialog(null, "Archivo Sobreescrito con Exito", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            Files.copy(FROM, TO, options);
            jCBListFood.addItem(f.getName());
            JOptionPane.showMessageDialog(null, "Archivo Copiado con Exito", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jCBListFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBListFoodActionPerformed
        // TODO add your handling code here:
        int aux2 = jCBListFood.getSelectedIndex();
        if (aux2 != -1) {
            filePath = "C:\\PGS\\nutricion\\" + jCBListFood.getSelectedItem();
            controller.openDocument(filePath);
        } else {
            filePath = "";
        }
    }//GEN-LAST:event_jCBListFoodActionPerformed

    private void cb_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sexoActionPerformed
        // TODO add your handling code here:
        int indx = cb_sexo.getSelectedIndex();
        if (indx == 1) {
            combo_embarazo.setSelectedIndex(-1);
            combo_embarazo.disable();
        } else if (indx == 0) {
            combo_embarazo.enable();
        }
    }//GEN-LAST:event_cb_sexoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente c = clienteSelected;
        if (clienteSelected != null) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (model.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            control.getDao().getPagos(c.getId_cliente()).forEach(a
                    -> model.addRow(new Object[]{a.getFecha(), String.valueOf(a.getMonto()), a.getDetalle()}
                    )
            );
        } else {
            JOptionPane.showMessageDialog(this, "Usuario No Seleccionado.\n\nSe debe Seleccionar un Usuario.\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcb_proyecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_proyecActionPerformed
        Cliente c = clienteSelected;
        if (c != null) {
            HashMap<String, Double> h
                    = control.getDao().getFechasYValores(c,
                            jcb_proyec.getSelectedItem().toString());
            if (h != null) {
                String n = c.getNombre();
                ChartPanel ch = Chart.getChartPanel(jcb_proyec.getSelectedItem().toString(),
                        control.getDao().getTipo_unidad(), h,
                        n.indexOf(' ') != -1 ? n.substring(0, n.indexOf(' ')) : n);
                ch.setSize(jp_chart.getSize());
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jp_chart.removeAll();
                        jp_chart.revalidate(); // This removes the old chart
                        jp_chart.setLayout(new BorderLayout());
                        jp_chart.add(ch);
                        jp_chart.repaint();
                    }
                }
                );
            } else {
                JOptionPane.showMessageDialog(this, "Solo existe un seguimiento para este Cliente, no se puede hacer una proyeccion de sus medidas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario No Seleccionado.\n\nSe debe Seleccionar un Usuario.\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcb_proyecActionPerformed

    private void btn_buscar_cliente_cobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_cliente_cobroActionPerformed
        // TODO add your handling code here:
        seleccionaCliente();
        if (clienteSelected != null) {
            text_cedula_cobro.setText(clienteSelected.getId_cliente());
            text_nombre_cobro.setText(clienteSelected.getNombre());
            text_apellidos_cobro.setText(clienteSelected.getApellidos());
        }
    }//GEN-LAST:event_btn_buscar_cliente_cobroActionPerformed

    private void text_cedula_seguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cedula_seguimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cedula_seguimientoActionPerformed

    private void text_cedula_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cedula_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cedula_pagoActionPerformed

    private void btn_buscar_cliente_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_cliente_pagoActionPerformed
        // TODO add your handling code here:
        seleccionaCliente();
        if (clienteSelected != null) {
            text_cedula_pago.setText(clienteSelected.getId_cliente());
            text_nombre_pago.setText(clienteSelected.getNombre());
            text_apellidos_pago.setText(clienteSelected.getApellidos());
            jButton1.doClick();
        }
    }//GEN-LAST:event_btn_buscar_cliente_pagoActionPerformed

    private void btn_busca_cliente_segActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busca_cliente_segActionPerformed
        // TODO add your handling code here:
        seleccionaCliente();
        if (clienteSelected != null) {
            text_cedula_seguimiento.setText(clienteSelected.getId_cliente());
            text_nombre_seguimiento.setText(clienteSelected.getNombre());
            text_apellidos_seguimiento.setText(clienteSelected.getApellidos());
        }
    }//GEN-LAST:event_btn_busca_cliente_segActionPerformed

    private void btn_busca_cliente_bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busca_cliente_bpActionPerformed
        // TODO add your handling code here:
        lb_cedula.setText("Cedula:");
        lb_nombre.setText("Nombre:");
        lb_apellidos.setText("Apellidos:");
        seleccionaCliente();
        if (clienteSelected != null) {
            lb_cedula.setText(lb_cedula.getText() + " " + clienteSelected.getId_cliente());
            lb_nombre.setText(lb_nombre.getText() + " " + clienteSelected.getNombre());
            lb_apellidos.setText(lb_apellidos.getText() + " " + clienteSelected.getApellidos());
            cargarFoto(lb_foto, clienteSelected.getId_cliente());
        }
    }//GEN-LAST:event_btn_busca_cliente_bpActionPerformed

    private void text_cliente_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cliente_rutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cliente_rutinaActionPerformed

    private void text_cliente_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cliente_desactivarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cliente_desactivarActionPerformed

    private void jcombo_projec_cobrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcombo_projec_cobrosItemStateChanged

    }//GEN-LAST:event_jcombo_projec_cobrosItemStateChanged

    private void jcombo_projec_cobrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcombo_projec_cobrosMouseClicked

    }//GEN-LAST:event_jcombo_projec_cobrosMouseClicked

    private void jBVerRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerRutinaActionPerformed
        // TODO add your handling code here:
        seleccionaRutina();
        if (rutinaSelected != null) {

            text_nombre_rutina.setText(rutinaSelected.getNombre());
            jBCreateRutina1.setVisible(false);
            cargarTablas(rutinaSelected);
            setColumnWidth();
            permiteEditar(false);
            jBEditarRutina.setVisible(true);
            panel_datos1.setVisible(true);
            panel_asignar_rutina.setVisible(false);
            panel_crear_rutina.setVisible(true);
            bt_Print.setVisible(true);
            panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
        }
    }//GEN-LAST:event_jBVerRutinaActionPerformed

    private void permiteEditar(boolean cond) {
        text_nombre_rutina.setEditable(cond);
        tablePiernas.setEnabled(cond);
        tablePantorrilla.setEnabled(cond);
        tableBiceps1.setEnabled(cond);
        tableAntebraso.setEnabled(cond);
        tableHombros.setEnabled(cond);
        tableEspalda.setEnabled(cond);
        tablePecho.setEnabled(cond);
        tableTriceps.setEnabled(cond);
        tableTrapecio.setEnabled(cond);
    }

    private void verPDFFrame(String filePath) {

        // build a component controller
        SwingController c = new SwingController();
        c.setIsEmbeddedComponent(true);

        PropertiesManager prop = new PropertiesManager(
                System.getProperties(),
                ResourceBundle.getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));

        prop.set(PropertiesManager.PROPERTY_DEFAULT_ZOOM_LEVEL, "1.25");
        prop.setBoolean(PropertiesManager.PROPERTY_VIEWPREF_FITWINDOW, Boolean.TRUE);
        prop.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_ANNOTATION, Boolean.FALSE);
        prop.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_FIT, Boolean.FALSE);
        prop.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_ROTATE, Boolean.FALSE);
        prop.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_TOOL, Boolean.FALSE);
        prop.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_UPANE, Boolean.FALSE);
        prop.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITY_SEARCH, Boolean.FALSE);

        SwingViewBuilder fac = new SwingViewBuilder(c, prop);

        // add interactive mouse link annotation support via callback
        c.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(c.getDocumentViewController()));
        javax.swing.JPanel viewerComponentPanel = fac.buildViewerPanel();
        JFrame applicationFrame = new JFrame();

        applicationFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        applicationFrame.getContentPane().add(viewerComponentPanel);
        // Now that the GUI is all in place, we can try openning a PDF
        c.setPageFitMode(DocumentViewController.PAGE_FIT_WINDOW_WIDTH, false);
        c.openDocument(filePath);
        // show the component
        applicationFrame.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        applicationFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        applicationFrame.setSize(screenSize);
        applicationFrame.setLocationRelativeTo(null);
        applicationFrame.setResizable(false);
        applicationFrame.setVisible(true);

    }

    private void combo_diabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_diabeticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_diabeticoActionPerformed

    private void combo_lesion_oseaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_lesion_oseaActionPerformed
        // TODO add your handling code here:
        if (combo_lesion_osea.getSelectedIndex() == 1) {
            osea_desc.setEnabled(false);
        } else {
            osea_desc.setEnabled(true);
        }
    }//GEN-LAST:event_combo_lesion_oseaActionPerformed

    private void combo_embarazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_embarazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_embarazoActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        validaLetras(evt);
    }//GEN-LAST:event_nombreKeyTyped

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed

    }//GEN-LAST:event_nombreKeyPressed

    private void apellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosKeyPressed

    private void apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosKeyTyped
        validaLetras(evt);
    }//GEN-LAST:event_apellidosKeyTyped

    private void montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_montoKeyTyped

    private void pesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pesoKeyTyped

    private void imcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imcKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_imcKeyTyped

    private void grasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grasaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_grasaKeyTyped

    private void pechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pechoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pechoKeyTyped

    private void espaldaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_espaldaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_espaldaKeyTyped

    private void caderaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caderaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_caderaKeyTyped

    private void gluteosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gluteosKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_gluteosKeyTyped

    private void cinturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinturaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_cinturaKeyTyped

    private void pierna_izquierdaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pierna_izquierdaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pierna_izquierdaKeyTyped

    private void pierna_derechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pierna_derechaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pierna_derechaKeyTyped

    private void pantorrilla_izquierdaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantorrilla_izquierdaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pantorrilla_izquierdaKeyTyped

    private void pantorrilla_derechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantorrilla_derechaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pantorrilla_derechaKeyTyped

    private void brazo_derechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brazo_derechoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_brazo_derechoKeyTyped

    private void brazo_izquierdoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brazo_izquierdoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_brazo_izquierdoKeyTyped

    private void antebrazo_derechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antebrazo_derechoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_antebrazo_derechoKeyTyped

    private void antebrazo_izquierdoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antebrazo_izquierdoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_antebrazo_izquierdoKeyTyped

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        validarCorreo();
    }//GEN-LAST:event_emailFocusLost

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        validaCedula(evt);
    }//GEN-LAST:event_cedulaKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        validaTelefono(evt);
    }//GEN-LAST:event_telefonoKeyTyped

    private void jBEditarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarRutinaActionPerformed
        permiteEditar(true);
        JOptionPane.showMessageDialog(this, "Ahora puede modificar la rutina.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        jBCreateRutina1.setText("Modificar");
        jBCreateRutina1.setVisible(true);
    }//GEN-LAST:event_jBEditarRutinaActionPerformed

    private void combo_lesion_muscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_lesion_muscActionPerformed
        // TODO add your handling code here:
        if (combo_lesion_musc.getSelectedIndex() == 1) {
            muscular_desc.setEnabled(false);
        } else {
            muscular_desc.setEnabled(true);
        }
    }//GEN-LAST:event_combo_lesion_muscActionPerformed

    private void combo_enfer_cardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_enfer_cardioActionPerformed
        // TODO add your handling code here:
        if (combo_enfer_cardio.getSelectedIndex() == 1) {
            cardio_desc.setEnabled(false);
        } else {
            cardio_desc.setEnabled(true);
        }
    }//GEN-LAST:event_combo_enfer_cardioActionPerformed

    private void nacimientoOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_nacimientoOnSelectionChange
        // TODO add your handling code here:
    }//GEN-LAST:event_nacimientoOnSelectionChange

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(this, "Esta seguro que desea cerrar la sesion de: \n" + control.getA().getUserid() + "", "Cerrar sesion?", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            PGS.mostrarInterfaz();
            this.setVisible(false);
            this.dispose();
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void seleccionaCliente() {
        clienteSelected = null;
        List<Cliente> cli;
        try {
            cli = control.getDao().todoClientes();
            cargaCombo(combo_busqueda, cli, false);
            int codigoCliente = JOptionPane.showConfirmDialog(this, panel_busquedas, "Consultar Cliente", JOptionPane.OK_CANCEL_OPTION);
            if (codigoCliente == JOptionPane.OK_OPTION && !combo_busqueda.getSelectedItem().equals("")) {
                clienteSelected = control.getDao().getCliente("Cedula", cli.get(combo_busqueda.getSelectedIndex()).getId_cliente());
            } else if (clienteSelected == null && codigoCliente != JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Error \nNo hay datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            cli.clear();
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void seleccionaRutina() {
        rutinaSelected = null;
        List<Rutina> rut;
        try {
            rut = control.getDao().todoRutina();
            if (rut != null) {
                lb_user.setText("Seleccionar una rutina");
                cargaCombo(combo_busqueda, rut, true);
                int codigoRutina = JOptionPane.showConfirmDialog(this, panel_busquedas, "Consultar Rutina", JOptionPane.OK_CANCEL_OPTION);
                if (codigoRutina == JOptionPane.OK_OPTION && !combo_busqueda.getSelectedItem().equals("")) {
                    rutinaSelected = control.getDao().getRutina(rut.get(combo_busqueda.getSelectedIndex()).getId());
                } else if (clienteSelected == null && codigoRutina != JOptionPane.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(this, "Error \nNo hay datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
                rut.clear();
            } else {
                JOptionPane.showMessageDialog(this, "Error \nNo hay Rutinas Existentes.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarArchivos(javax.swing.JComboBox c) {
        File[] files = new File("C:\\PGS\\nutricion").listFiles();
        for (File file : files) {
            if (file.isFile()) {
                c.addItem(file.getName());
            }
        }
    }

    public static void look() {
        try {//com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
    }

    private void buildPopupMenus() {
        JMenuItem item1 = new JMenuItem("Añadir fila al final");
        JMenuItem item2 = new JMenuItem("Quitar fila al final");

        MouseListener ml = new MouseListener() {
            @Override
            public void mousePressed(MouseEvent ev) {
                if (ev.isPopupTrigger()) {
                    replace = (JTable) ev.getComponent();
                    popupMenu.show(ev.getComponent(), ev.getX(), ev.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent ev) {
                if (ev.isPopupTrigger()) {
                    replace = (JTable) ev.getComponent();
                    popupMenu.show(ev.getComponent(), ev.getX(), ev.getY());
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {

            }
        };

        tableAntebraso.addMouseListener(ml);
        tableBiceps1.addMouseListener(ml);
        tableEspalda.addMouseListener(ml);
        tableHombros.addMouseListener(ml);
        tablePantorrilla.addMouseListener(ml);
        tablePecho.addMouseListener(ml);
        tablePiernas.addMouseListener(ml);
        tableTrapecio.addMouseListener(ml);
        tableTriceps.addMouseListener(ml);

        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //System.out.println("item1 click");
                ((DefaultTableModel) replace.getModel()).addRow(new Object[]{"", "", "", ""});
            }
        });
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //System.out.println("item2 click");

                ((DefaultTableModel) replace.getModel()).removeRow(((DefaultTableModel) replace.getModel()).getRowCount() - 1);
            }
        });
        popupMenu.add(item1);
        popupMenu.add(item2);

    }

    private void cargaCombo(javax.swing.JComboBox x, List o, boolean rutina) {
        if (!o.isEmpty()) {
            Object[] mod = new Object[o.size()];
            if (rutina) {
                for (int i = 0; i < o.size(); i++) {
                    String tr = ((Rutina) o.get(i)).getTipo_rutina() == 0 ? "General" : "Personalizada";
                    mod[i] = (((Rutina) o.get(i)).getNombre());
                }
            } else {
                for (int i = 0; i < o.size(); i++) {
                    mod[i] = ("" + ((Cliente) o.get(i)).getId_cliente() + " " + ((Cliente) o.get(i)).getNombre() + " " + ((Cliente) o.get(i)).getApellidos());
                }
            }
            x.setModel(new DefaultComboBoxModel(mod));
        }

    }

    private void cargarDatosCliente(String editarCedula) {
        Cliente c = this.control.getDao().getCliente("Cedula", editarCedula);
        SaludCliente sc = this.control.getDao().getSaludCliente(editarCedula);
        if (c != null && sc != null) {
            try {
                nombre.setText(c.getNombre());
                apellidos.setText(c.getApellidos());
                cedula.setText(c.getId_cliente());
                telefono.setText(c.getTelefono());
                direccion.setText(c.getDireccion());
                email.setText(c.getEmail());

                Date d = new SimpleDateFormat("dd/MM/yyyy").parse(c.getFechaNacimiento());
                Calendar calaux = Calendar.getInstance();
                calaux.setTime(d);

                nacimiento.setSelectedDate(calaux);
                calcEdad();

                System.out.println(calaux.getTime().toString());
                nacimiento.setCurrent(calaux);//no setea el campo

                cb_sexo.setSelectedIndex(c.getSexo());
                telefono.setText(c.getTelefono());

                combo_lesion_osea.setSelectedIndex(sc.getLesion_osea());
                osea_desc.setText(sc.getDesc_lesion_osea());
                combo_lesion_musc.setSelectedIndex(sc.getLesion_muscular());
                muscular_desc.setText(sc.getDesc_lesion_muscular());
                combo_enfer_cardio.setSelectedIndex(sc.getEnfermedad_cardiovascular());
                cardio_desc.setText(sc.getDesc_enfermedad_cardiovascular());
                combo_asfixia.setSelectedIndex(sc.getAsfixia_por_ejercicio());
                combo_asmatico.setSelectedIndex(sc.getAsmatico());
                combo_hipertenso.setSelectedIndex(sc.getHipertenso());
                combo_diabetico.setSelectedIndex(sc.getDiabetico());
                combo_fumador.setSelectedIndex(sc.getFumador());
                combo_epileptico.setSelectedIndex(sc.getEpileptico());
                combo_embarazo.setSelectedIndex(sc.getEmbarazo());
                combo_anemia.setSelectedIndex(sc.getAnemia());
                combo_mareos.setSelectedIndex(sc.getMareos());
                combo_desmayos.setSelectedIndex(sc.getDesmayo());
                combo_nauseas.setSelectedIndex(sc.getNauseas());
                combo_dif_respirar.setSelectedIndex(sc.getDificul_respirar());
                combo_practica_act_deport.setSelectedIndex(sc.getPract_act_deportiva());
                combo_gimnasio.setSelectedIndex(sc.getEstuvo_otro_gym());
                textarea_otro_padecimiento.setText(sc.getOtro_padecimiento());

                try {
                    cargarFoto(jLFoto, c.getId_cliente());
                } catch (Exception e) {
                    System.err.println("Error al cargar imagen.");
                    jLFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/login_icon_user.png")));
                }
            } catch (ParseException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no existente!");
        }
    }

    private void cargarFoto(JLabel ph, String ced) {
        String location = photoLocation + ced + ".jpg";
        File f = new File(location);
        if (f.exists()) {
            String p = f.getAbsolutePath();
            ImageIcon imagen = new ImageIcon(p);
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ph.getWidth(), ph.getHeight(), Image.SCALE_DEFAULT));
            ph.setIcon(icono);
            this.repaint();
        } else {
            ph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/login_icon_user.png")));
        }
    }

    private void limpiarCamposRegistro() {
        nombre.setText("");
        apellidos.setText("");
        cedula.setText("");
        edad.setText("");
        telefono.setText("");
        email.setText("");
        direccion.setText("");
        cb_sexo.setSelectedIndex(-1);
        nacimiento.setCurrent(null);
        combo_lesion_musc.setSelectedIndex(0);

        combo_lesion_osea.setSelectedIndex(-1);
        osea_desc.setText("");
        combo_lesion_musc.setSelectedIndex(-1);
        muscular_desc.setText("");
        combo_enfer_cardio.setSelectedIndex(-1);
        cardio_desc.setText("");
        combo_asfixia.setSelectedIndex(-1);
        combo_asmatico.setSelectedIndex(-1);
        combo_hipertenso.setSelectedIndex(-1);
        combo_diabetico.setSelectedIndex(-1);
        combo_fumador.setSelectedIndex(-1);
        combo_epileptico.setSelectedIndex(-1);
        combo_embarazo.setSelectedIndex(-1);
        combo_anemia.setSelectedIndex(-1);
        combo_mareos.setSelectedIndex(-1);
        combo_desmayos.setSelectedIndex(-1);
        combo_nauseas.setSelectedIndex(-1);
        combo_dif_respirar.setSelectedIndex(-1);
        combo_practica_act_deport.setSelectedIndex(-1);
        combo_gimnasio.setSelectedIndex(-1);
        textarea_otro_padecimiento.setText("");
        jLFoto.setIcon(null);
        this.panel_fisico.repaint();
    }

    private void clearCamposCobro() {
        text_cedula_cobro.setText(null);
        text_nombre_cobro.setText(null);
        text_apellidos_cobro.setText(null);
        dateChooserCobro.setCurrent(null);
        monto.setText("");
        detalle1.setText("");
        clienteSelected = null;
    }

    private void limpiaTablas() {
        tablePiernas.setModel(setModelo("pi"));
        tablePantorrilla.setModel(setModelo("pa"));
        tableAntebraso.setModel(setModelo("an"));
        tableBiceps1.setModel(setModelo("bi"));
        tableEspalda.setModel(setModelo("es"));
        tableHombros.setModel(setModelo("hom"));
        tablePecho.setModel(setModelo("pe"));
        tableTrapecio.setModel(setModelo("tra"));
        tableTriceps.setModel(setModelo("tri"));
    }

    private void setColumnWidth() {
        tablePiernas.getColumnModel().getColumn(0).setPreferredWidth(250);
        tablePantorrilla.getColumnModel().getColumn(0).setPreferredWidth(250);
        tableAntebraso.getColumnModel().getColumn(0).setPreferredWidth(250);
        tableBiceps1.getColumnModel().getColumn(0).setPreferredWidth(250);
        tableEspalda.getColumnModel().getColumn(0).setPreferredWidth(250);
        tableHombros.getColumnModel().getColumn(0).setPreferredWidth(250);
        tablePecho.getColumnModel().getColumn(0).setPreferredWidth(250);
        tableTrapecio.getColumnModel().getColumn(0).setPreferredWidth(250);
        tableTriceps.getColumnModel().getColumn(0).setPreferredWidth(250);
    }

    private javax.swing.table.DefaultTableModel setModelo(String id) {
        Object[][] o = {};
        String[] head = {"Ejercicio", "Serie", "Repeticion", "Peso"};
        if (id.equals("pi")) {
            o = new Object[][]{
                {"Extension de piernas", null, null, null},
                {"Sentadillas", null, null, null},
                {"Hat Squat", null, null, null},
                {"Flexion de Piernas", null, null, null},
                {"Buenos dias barra", null, null, null},
                {"Sentadillas por delante", null, null, null},
                {"Desplante", null, null, null},
                {"Abductores", null, null, null}
            };
        } else if (id.equals("pa")) {
            o = new Object[][]{
                {"Elevacion de Talones", null, null, null},
                {"Pantorillas de Sentado", null, null, null},
                {"Pantorillas en Maquina Press", null, null, null},
                {"Pantorilla con Mancuerna", null, null, null}
            };
        } else if (id.equals("bi")) {
            o = new Object[][]{
                {"Curl con barra", null, null, null},
                {"Curl con Mancuerna", null, null, null},
                {"Curl Scott", null, null, null},
                {"Curl Scott Mancuerna", null, null, null},
                {"Curl Concentrado", null, null, null},
                {"Curl Estilo 21", null, null, null},
                {"Curl con Cable", null, null, null}
            };
        } else if (id.equals("tri")) {
            o = new Object[][]{
                {"Flexion con Barra", null, null, null},
                {"Flexion con Mancuerna", null, null, null},
                {"Flexion estilo Copa", null, null, null},
                {"Press francés con barra", null, null, null},
                {"Patada Tricep", null, null, null},
                {"Polea Tricep", null, null, null}
            };
        } else if (id.equals("an")) {
            o = new Object[][]{
                {"Curl de Muñeca con Barra", null, null, null},
                {"Curl Dorsal con Barra", null, null, null},
                {"Curl de Muñecas por detras con barra", null, null, null},
                {"Rollos", null, null, null}
            };
        } else if (id.equals("hom")) {
            o = new Object[][]{
                {"Press militar por delante", null, null, null},
                {"Press militar por detras", null, null, null},
                {"Press militar barra", null, null, null},
                {"Press militar estilo Arnold", null, null, null},
                {"Laterales con mancuernas", null, null, null},
                {"Lateral inclinados", null, null, null},
                {"Lateral a una mano con mancuerna", null, null, null},
                {"Mancuernas al frente", null, null, null},
                {"Barra al frente", null, null, null},
                {"Mancuernas atras", null, null, null}
            };
        } else if (id.equals("pe")) {
            o = new Object[][]{
                {"Press de banca", null, null, null},
                {"Press inclinado con barra", null, null, null},
                {"Press declinado con barra", null, null, null},
                {"Press declinado con mancuernas", null, null, null},
                {"Voladoras", null, null, null},
                {"Voladoras Inclinadas", null, null, null},
                {"Pull Over con Barra", null, null, null},
                {"Pull Over con mancuernas", null, null, null},
                {"Fondos Disco", null, null, null}
            };
        } else if (id.equals("es")) {
            o = new Object[][]{
                {"Polea por detrás", null, null, null},
                {"Polea por delante", null, null, null},
                {"Remo sentado con cable", null, null, null},
                {"Remo Fijo", null, null, null},
                {"Remo con barra fija", null, null, null},
                {"Buenos dias con barra", null, null, null},
                {"Remo con mancuernas", null, null, null},
                {"Barra fija", null, null, null},
                {"Rotaciones Olimpicas", null, null, null}
            };
        } else if (id.equals("tra")) {
            o = new Object[][]{
                {"Robin", null, null, null},
                {"Encogimientos barra por delante", null, null, null},
                {"Encogimientos con mancuernas", null, null, null},
                {"Encogimientos barra por detrás", null, null, null}
            };
        } else {
            JOptionPane.showMessageDialog(this, "Error al intentar crear el modelo");
        }

        return (new javax.swing.table.DefaultTableModel(o, head) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    private boolean valida_datos_personales() {
        return cedula.getText().isEmpty() || nombre.getText().isEmpty() || apellidos.getText().isEmpty()
                || direccion.getText().isEmpty() || email.getText().isEmpty() || nacimiento.getText().isEmpty()
                || cb_sexo.getSelectedIndex() == -1 || telefono.getText().isEmpty();
    }

    private boolean valida_datos_salud() {
        return combo_lesion_osea.getSelectedIndex() == 0 || combo_lesion_musc.getSelectedIndex() == 0 || combo_enfer_cardio.getSelectedIndex() == 0
                || combo_asfixia.getSelectedIndex() == 0 || combo_anemia.getSelectedIndex() == 0 || combo_asmatico.getSelectedIndex() == 0
                || combo_hipertenso.getSelectedIndex() == 0 || combo_diabetico.getSelectedIndex() == 0 || combo_fumador.getSelectedIndex() == 0
                || combo_epileptico.getSelectedIndex() == 0 || combo_mareos.getSelectedIndex() == 0 || combo_desmayos.getSelectedIndex() == 0
                || combo_nauseas.getSelectedIndex() == 0 || combo_dif_respirar.getSelectedIndex() == 0 || (combo_embarazo.getSelectedIndex() == -1 && cb_sexo.getSelectedIndex() == 0)
                || combo_gimnasio.getSelectedIndex() == 0 || combo_practica_act_deport.getSelectedIndex() == 0;

    }

    private void validaLetras(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != (char) java.awt.event.KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    private void validaNumeros(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) java.awt.event.KeyEvent.VK_COMMA) && (car != (char) java.awt.event.KeyEvent.VK_PERIOD)) {
            evt.consume();
        }
    }

    private void validaCedula(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car < '0' || car > '9')) {
            evt.consume();
        }
    }

    private void validaTelefono(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if (telefono.getText().length() >= 8) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }

    private void validarCorreo() {
        try {
            Pattern pattern = Pattern.compile(PATTERN_EMAIL);
            Matcher matcher = pattern.matcher(email.getText());
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "Error en el formato del correo\n\nEl formato debe ser: email@dominio.ext\n\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el formato del correo\n\nEl formato debe ser: email@dominio.ext");
        }
    }

    private RegistroFisicoCliente registro_fisico;
    private Controlador control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antebrazo_derecho;
    private javax.swing.JTextField antebrazo_izquierdo;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton asigna_rutina_cliente;
    private javax.swing.JButton boton_añadir_seguimiento;
    private javax.swing.JButton boton_pagar_cobro;
    private javax.swing.JTextField brazo_derecho;
    private javax.swing.JTextField brazo_izquierdo;
    private javax.swing.JButton bt_Print;
    private javax.swing.JButton btn_Asigna_Nutricion;
    private javax.swing.JButton btn_add_plan_nutricional;
    private javax.swing.JButton btn_asignar_pNutricional;
    private javax.swing.JButton btn_busca_cliente_bp;
    private javax.swing.JButton btn_busca_cliente_seg;
    private javax.swing.JButton btn_buscar_cliente_cobro;
    private javax.swing.JButton btn_buscar_cliente_pago;
    private javax.swing.JButton btn_perfiles_Nutricionales;
    private javax.swing.JTextField cadera;
    private javax.swing.JTextField cardio_desc;
    private javax.swing.JComboBox cb_sexo;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField cintura;
    private javax.swing.JComboBox combo_anemia;
    private javax.swing.JComboBox combo_asfixia;
    private javax.swing.JComboBox combo_asmatico;
    private javax.swing.JComboBox combo_busqueda;
    private javax.swing.JComboBox combo_desmayos;
    private javax.swing.JComboBox combo_diabetico;
    private javax.swing.JComboBox combo_dif_respirar;
    private javax.swing.JComboBox combo_embarazo;
    private javax.swing.JComboBox combo_enfer_cardio;
    private javax.swing.JComboBox combo_epileptico;
    private datechooser.beans.DateChooserCombo combo_fecha_seguimiento;
    private javax.swing.JComboBox combo_fumador;
    private javax.swing.JComboBox combo_gimnasio;
    private javax.swing.JComboBox combo_hipertenso;
    private javax.swing.JComboBox combo_lesion_musc;
    private javax.swing.JComboBox combo_lesion_osea;
    private javax.swing.JComboBox combo_mareos;
    private javax.swing.JComboBox combo_nauseas;
    private javax.swing.JComboBox combo_practica_act_deport;
    private javax.swing.JComboBox combo_rutinas_creadas;
    private datechooser.beans.DateChooserCombo dateChooserCobro;
    private javax.swing.JPanel desactivar_Cliente;
    private javax.swing.JTextField detalle1;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField email;
    private javax.swing.JTextField espalda;
    private javax.swing.JFileChooser fotoChooser;
    private javax.swing.JTextField gluteos;
    private javax.swing.JTextField grasa;
    private javax.swing.JTextField imc;
    private javax.swing.JButton jBAddCliente;
    private javax.swing.JButton jBAsignarRutina;
    private javax.swing.JButton jBCrearRutina;
    private javax.swing.JButton jBCreateRutina1;
    private javax.swing.JButton jBDesactivarCliente;
    private javax.swing.JButton jBEditarRutina;
    private javax.swing.JButton jBVerRutina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jCBListFood;
    private javax.swing.JComboBox jCBListFood2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLDatosPersonales;
    private javax.swing.JLabel jLDatosPersonales2;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLFechaNac;
    private javax.swing.JLabel jLFoto;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre2;
    private javax.swing.JLabel jLPadecimientos;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jL_bienvenido;
    private javax.swing.JLabel jL_bienvenido2;
    private javax.swing.JLabel jL_imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JButton jbDesactivarCliente;
    private javax.swing.JButton jbEditarCliente;
    private javax.swing.JButton jbRegistrarCliente;
    private javax.swing.JButton jbutton_enviar_correo;
    private javax.swing.JComboBox jcb_proyec;
    private javax.swing.JComboBox jcombo_projec_cobros;
    private javax.swing.JLabel jl_PGS;
    private javax.swing.JPanel jp_chart;
    private javax.swing.JLabel label_cliente_seguimiento;
    private javax.swing.JLabel label_fecha_seguimiento;
    private javax.swing.JLabel label_fecha_seguimiento1;
    private javax.swing.JLabel lb_apellidos;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_user;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField muscular_desc;
    private datechooser.beans.DateChooserCombo nacimiento;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField osea_desc;
    private javax.swing.JPanel panel_asignar_perfil;
    private javax.swing.JPanel panel_asignar_rutina;
    private javax.swing.JPanel panel_busqueda;
    private javax.swing.JPanel panel_busqueda_cliente;
    private javax.swing.JPanel panel_busquedas;
    private javax.swing.JPanel panel_control_pagos;
    private javax.swing.JPanel panel_crear_perfil_nutricional;
    private javax.swing.JPanel panel_crear_rutina;
    private javax.swing.JScrollPane panel_datos;
    private javax.swing.JScrollPane panel_datos1;
    private javax.swing.JScrollPane panel_datos4;
    private javax.swing.JPanel panel_datos_seg;
    private javax.swing.JPanel panel_fisico;
    private javax.swing.JPanel panel_imp_rutinas;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_menu1;
    private javax.swing.JPanel panel_menu2;
    private javax.swing.JPanel panel_muestra_datos;
    private javax.swing.JPanel panel_nutricion;
    private javax.swing.JPanel panel_parametros;
    private javax.swing.JPanel panel_proyeccion;
    private javax.swing.JPanel panel_reg_fisico;
    private javax.swing.JPanel panel_registro_cliente;
    private javax.swing.JPanel panel_registro_nutricional;
    private javax.swing.JPanel panel_registro_rutinas;
    private javax.swing.JPanel panel_seguimientos;
    private javax.swing.JTextField pantorrilla_derecha;
    private javax.swing.JTextField pantorrilla_izquierda;
    private javax.swing.JTextField pecho;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField pierna_derecha;
    private javax.swing.JTextField pierna_izquierda;
    private javax.swing.JTable tableAntebraso;
    private javax.swing.JTable tableBiceps1;
    private javax.swing.JTable tableEspalda;
    private javax.swing.JTable tableHombros;
    private javax.swing.JTable tablePantorrilla;
    private javax.swing.JTable tablePecho;
    private javax.swing.JTable tablePiernas;
    private javax.swing.JTable tableTrapecio;
    private javax.swing.JTable tableTriceps;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField text_apellidos_cobro;
    private javax.swing.JTextField text_apellidos_pago;
    private javax.swing.JTextField text_apellidos_seguimiento;
    private javax.swing.JTextField text_cedula_cobro;
    private javax.swing.JTextField text_cedula_pago;
    private javax.swing.JTextField text_cedula_seguimiento;
    private javax.swing.JTextField text_cliente_desactivar;
    private javax.swing.JTextField text_cliente_nutricion;
    private javax.swing.JTextField text_cliente_rutina;
    private javax.swing.JTextField text_nombre_cobro;
    private javax.swing.JTextField text_nombre_pago;
    private javax.swing.JTextPane text_nombre_rutina;
    private javax.swing.JTextField text_nombre_seguimiento;
    private javax.swing.JTextArea textarea_otro_padecimiento;
    // End of variables declaration//GEN-END:variables
    private JPopupMenu popupMenu;
    private JTable replace;
    private String pathFotos;
    final private String photoLocation;
    private String filePath = "";
    private SwingController controller = new SwingController();
    private PropertiesManager properties = new PropertiesManager(
            System.getProperties(),
            ResourceBundle.getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));

    private SwingViewBuilder factory = new SwingViewBuilder(controller, properties);
    private Cliente clienteSelected;
    private Rutina rutinaSelected;
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private void clearCamposSeguimiento() {
        peso.setText("");
        imc.setText("");
        combo_fecha_seguimiento.setText("");
        grasa.setText("");
        pecho.setText("");
        espalda.setText("");
        cadera.setText("");
        gluteos.setText("");
        cintura.setText("");
        pierna_izquierda.setText("");
        pierna_derecha.setText("");
        pantorrilla_izquierda.setText("");
        pantorrilla_derecha.setText("");
        brazo_izquierdo.setText("");
        brazo_derecho.setText("");
        antebrazo_derecho.setText("");
        antebrazo_izquierdo.setText("");
    }
}
