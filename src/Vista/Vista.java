package Vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import Controlador.Controlador;
import Modelo.Cliente;
import Modelo.Pago;
import Modelo.SaludCliente;
import Modelo.Seguimiento;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    public Vista(Controlador c) {
        this.control = c;
        popupMenu = new JPopupMenu();
        initComponents();
        buildPopupMenus();
        Image icon = new ImageIcon(getClass().getResource("/Imagen/pgs-logo.png")).getImage();
        setIconImage(icon);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(screenSize);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotoChooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jl_PGS = new javax.swing.JLabel();
        jL_imagen = new javax.swing.JLabel();
        jL_bienvenido = new javax.swing.JLabel();
        panel_registro_cliente = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        jbRegistrarCliente = new javax.swing.JButton();
        jbDesactivarCliente = new javax.swing.JButton();
        jbEditarCliente = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        panel_datos = new javax.swing.JScrollPane();
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
        sexo = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
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
        desactivar_Cliente = new javax.swing.JPanel();
        cedCliente = new javax.swing.JTextField();
        jBDesactivarCliente = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        panel_registro_rutinas = new javax.swing.JPanel();
        panel_menu1 = new javax.swing.JPanel();
        jBEditarRutina = new javax.swing.JButton();
        jBAsignarRutina = new javax.swing.JButton();
        jBCrearRutina = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        panel_datos1 = new javax.swing.JScrollPane();
        panel_crear_rutina = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextPane1 = new javax.swing.JTextPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jBCreateRutina = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePiernas = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        tableTrapecio = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        tablePantorrilla = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        tableAntebraso = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        tableBiceps1 = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        jScrollPane25 = new javax.swing.JScrollPane();
        tableTriceps = new javax.swing.JTable();
        jScrollPane26 = new javax.swing.JScrollPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        tableHombros = new javax.swing.JTable();
        jScrollPane28 = new javax.swing.JScrollPane();
        jScrollPane29 = new javax.swing.JScrollPane();
        tablePecho = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        tableEspalda = new javax.swing.JTable();
        panel_asignar_rutina = new javax.swing.JPanel();
        cedCliente1 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        panel_registro_nutricional = new javax.swing.JPanel();
        panel_menu2 = new javax.swing.JPanel();
        btn_crear_perfil_Nutricional = new javax.swing.JButton();
        btn_asignar_pNutricional = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        panel_datos4 = new javax.swing.JScrollPane();
        panel_crear_perfil_nutricional = new javax.swing.JPanel();
        jTFNombre2 = new javax.swing.JTextField();
        jLNombre2 = new javax.swing.JLabel();
        jLDatosPersonales2 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        panel_asignar_perfil = new javax.swing.JPanel();
        cedCliente2 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        panel_control_pagos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        combo_filtro_cobro = new javax.swing.JComboBox();
        jLabel77 = new javax.swing.JLabel();
        combo_cobro_valor = new javax.swing.JComboBox();
        label_fecha_seguimiento1 = new javax.swing.JLabel();
        dateChooserCobro = new datechooser.beans.DateChooserCombo();
        jLabel63 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        boton_cancelar_cobro = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        panel_seguimientos = new javax.swing.JPanel();
        label_cliente_seguimiento = new javax.swing.JLabel();
        combo_filtro_seguimiento_valor = new javax.swing.JComboBox();
        label_fecha_seguimiento = new javax.swing.JLabel();
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
        combo_fecha_seguimiento = new datechooser.beans.DateChooserCombo();
        combo_busqueda_seguimiento = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        boton_añadir_seguimiento = new javax.swing.JButton();
        panel_busqueda = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jta_info_busqueda_cliente = new javax.swing.JTextArea();
        combo_filtro_cliente2 = new javax.swing.JComboBox();
        combo_nombre_cliente_seguimiento1 = new javax.swing.JComboBox();
        jb_salvar_en_archivo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        combo_filtro_cliente3 = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        combo_nombre_cliente_seguimiento2 = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jcb_proyec = new javax.swing.JComboBox();
        jp_chart = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        pane_otros = new javax.swing.JPanel();

        fotoChooser.setControlButtonsAreShown(false);
        fotoChooser.setCurrentDirectory(new java.io.File("C:\\"));
            fotoChooser.setDialogTitle("Escoger Fotografia");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Power Gym System");

            jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
            jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jTabbedPane1.setPreferredSize(new java.awt.Dimension(783, 399));

            jl_PGS.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
            jl_PGS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jl_PGS.setText("Power Gym System");

            jL_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBienvenida.png"))); // NOI18N

            jL_bienvenido.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
            jL_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL_bienvenido.setText("Bienvenido");

            javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
            panel_inicio.setLayout(panel_inicioLayout);
            panel_inicioLayout.setHorizontalGroup(
                panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_inicioLayout.createSequentialGroup()
                    .addContainerGap(175, Short.MAX_VALUE)
                    .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jL_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_PGS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(174, Short.MAX_VALUE))
            );
            panel_inicioLayout.setVerticalGroup(
                panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_inicioLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jl_PGS)
                    .addGap(31, 31, 31)
                    .addComponent(jL_bienvenido)
                    .addGap(44, 44, 44)
                    .addComponent(jL_imagen)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Inicio", panel_inicio);

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
            jbEditarCliente.setText("Editar Datos Cliente");
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
            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            panel_datos.setPreferredSize(new java.awt.Dimension(972, 600));

            panel_reg_fisico.setVisible(false);

            jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));

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

            combo_embarazo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NA", "SI", "NO"}));

            combo_lesion_osea.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ","NO","SI"}));
            combo_lesion_osea.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_lesion_oseaActionPerformed(evt);
                }
            });

            combo_lesion_musc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "NO", "SI"}));

            combo_enfer_cardio.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "NO", "SI"}));

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
                    .addContainerGap(143, Short.MAX_VALUE)
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
                    .addContainerGap(144, Short.MAX_VALUE))
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
                            .addContainerGap()
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

            jLMail.setText("E-Mail:");

            nombre.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nombreActionPerformed(evt);
                }
            });

            edad.setEditable(false);
            edad.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    edadActionPerformed(evt);
                }
            });

            telefono.setInheritsPopupMenu(true);

            jLNombre.setText("Nombre:");

            jLFechaNac.setText("Fecha de Nacimiento:");

            jLDireccion.setText("Dirección:");

            jLEdad.setText("Edad:");

            jLTel.setText("Teléfono:");

            email.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    emailActionPerformed(evt);
                }
            });

            jLDatosPersonales.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLDatosPersonales.setText("Datos Personales");

            nacimiento.setCalendarPreferredSize(new java.awt.Dimension(300, 180));
            nacimiento.setFormat(2);
            try {
                nacimiento.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
            } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
                e1.printStackTrace();
            }
            nacimiento.setLocale(Locale.forLanguageTag("es-CR")
            );
            nacimiento.setCurrentNavigateIndex(0);
            nacimiento.addCommitListener(new datechooser.events.CommitListener() {
                public void onCommit(datechooser.events.CommitEvent evt) {
                    nacimientoOnCommit(evt);
                }
            });

            jLApellidos.setText("Apellidos:");

            jLSexo.setText("Sexo:");

            sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"  ","Femenino", "Masculino" }));

            jLabel38.setText("Cedula");

            apellidos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    apellidosActionPerformed(evt);
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
                    .addGap(148, 148, 148)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLMail)
                        .addComponent(jLTel)
                        .addComponent(jLDireccion)
                        .addComponent(jLSexo))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
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
                                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLSexo))))
                    .addGap(24, 24, 24))
            );

            jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

            jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(153, 153, 0)));

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
            jLFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLFoto.setText("Click");
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
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35)
                            .addGap(117, 117, 117))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(79, Short.MAX_VALUE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_gimnasio, combo_practica_act_deport});

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
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jBAddCliente)
                    .addGap(12, 12, 12))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addGap(18, 18, 18)
                    .addComponent(jLFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46))
            );

            jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_gimnasio, combo_practica_act_deport});

            javax.swing.GroupLayout panel_reg_fisicoLayout = new javax.swing.GroupLayout(panel_reg_fisico);
            panel_reg_fisico.setLayout(panel_reg_fisicoLayout);
            panel_reg_fisicoLayout.setHorizontalGroup(
                panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_reg_fisicoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel_reg_fisicoLayout.setVerticalGroup(
                panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_reg_fisicoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE))
            );

            panel_datos.setViewportView(panel_reg_fisico);

            desactivar_Cliente.setVisible(false);

            cedCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cedClienteActionPerformed(evt);
                }
            });

            jBDesactivarCliente.setText("Desactivar Cliente");
            jBDesactivarCliente.setMultiClickThreshhold(1L);
            jBDesactivarCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBDesactivarClienteActionPerformed(evt);
                }
            });

            jLabel51.setText("Cedula del Cliente:");

            javax.swing.GroupLayout desactivar_ClienteLayout = new javax.swing.GroupLayout(desactivar_Cliente);
            desactivar_Cliente.setLayout(desactivar_ClienteLayout);
            desactivar_ClienteLayout.setHorizontalGroup(
                desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel51)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cedCliente)
                    .addContainerGap())
                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jBDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE))
            );
            desactivar_ClienteLayout.setVerticalGroup(
                desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addGroup(desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel51)
                        .addComponent(cedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jBDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42))
            );

            javax.swing.GroupLayout panel_registro_clienteLayout = new javax.swing.GroupLayout(panel_registro_cliente);
            panel_registro_cliente.setLayout(panel_registro_clienteLayout);
            panel_registro_clienteLayout.setHorizontalGroup(
                panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                    .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_clienteLayout.createSequentialGroup()
                        .addContainerGap(316, Short.MAX_VALUE)
                        .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(317, Short.MAX_VALUE)))
            );
            panel_registro_clienteLayout.setVerticalGroup(
                panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_clienteLayout.createSequentialGroup()
                        .addContainerGap(183, Short.MAX_VALUE)
                        .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(708, Short.MAX_VALUE)))
            );

            jTabbedPane1.addTab("Registro del Cliente", panel_registro_cliente);

            panel_registro_rutinas.setVisible(false);

            panel_menu1.setBackground(new java.awt.Color(255, 255, 255));

            jBEditarRutina.setBackground(new java.awt.Color(255, 255, 255));
            jBEditarRutina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jBEditarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
            jBEditarRutina.setText("Editar Rutina");
            jBEditarRutina.setBorder(null);
            jBEditarRutina.setBorderPainted(false);
            jBEditarRutina.setContentAreaFilled(false);
            jBEditarRutina.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBEditarRutinaActionPerformed(evt);
                }
            });

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

            jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/left_panel.png"))); // NOI18N

            javax.swing.GroupLayout panel_menu1Layout = new javax.swing.GroupLayout(panel_menu1);
            panel_menu1.setLayout(panel_menu1Layout);
            panel_menu1Layout.setHorizontalGroup(
                panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menu1Layout.createSequentialGroup()
                    .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBCrearRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEditarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBAsignarRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 84, Short.MAX_VALUE))
                .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu1Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );
            panel_menu1Layout.setVerticalGroup(
                panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_menu1Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jBCrearRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(jBAsignarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addComponent(jBEditarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu1Layout.createSequentialGroup()
                        .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap()))
            );

            panel_datos1.setBorder(null);
            panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            panel_datos1.setAutoscrolls(true);
            panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            panel_crear_rutina.setVisible(false);
            panel_crear_rutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

            jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel28.setText("Piernas");

            jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel29.setText("Pantorillas");

            jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel42.setText("Biceps");

            jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel43.setText("Triceps");

            jLabel44.setText("Nombre de la Rutina:");

            jLabel45.setText("Codigo de la Rutina:");

            jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jTextPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel46.setText("Antebrazo");

            jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel47.setText("Hombros");

            jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel48.setText("Pecho");

            jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel49.setText("Espalda");

            jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel50.setText("Trapecios");

            jBCreateRutina.setText("Crear Rutina");
            jBCreateRutina.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBCreateRutinaActionPerformed(evt);
                }
            });

            jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tablePiernas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Extension de piernas", null, null, null},
                    {"Sentadillas", null, null, null},
                    {"Hat Squat", null, null, null},
                    {"Flexion de Piernas", null, null, null},
                    {"Buenos dias barra", null, null, null},
                    {"Sentadillas por delante", null, null, null},
                    {"Desplante", null, null, null},
                    {"Abductores", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane3.setViewportView(tablePiernas);

            jScrollPane16.setViewportView(jScrollPane3);

            jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tableTrapecio.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Robin", null, null, null},
                    {"Encogimientos barra por delante", null, null, null},
                    {"Encogimientos con mancuernas", null, null, null},
                    {"Encogimientos barra por detrás", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane18.setViewportView(tableTrapecio);

            jScrollPane17.setViewportView(jScrollPane18);

            jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tablePantorrilla.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Elevacion de Talones", null, null, null},
                    {"Pantorillas de Sentado", null, null, null},
                    {"Pantorillas en Maquina Press", null, null, null},
                    {"Pantorilla con Mancuerna", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane14.setViewportView(tablePantorrilla);

            jScrollPane19.setViewportView(jScrollPane14);

            jScrollPane21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tableAntebraso.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Curl de Muñeca con Barra", null, null, null},
                    {"Curl Dorsal con Barra", null, null, null},
                    {"Curl de Muñecas por detras con barra", null, null, null},
                    {"Rollos", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane21.setViewportView(tableAntebraso);

            jScrollPane20.setViewportView(jScrollPane21);

            jScrollPane23.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tableBiceps1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Curl con barra", null, null, null},
                    {"Curl con Mancuerna", null, null, null},
                    {"Curl Scott", null, null, null},
                    {"Curl Scott Mancuerna", null, null, null},
                    {"Curl Concentrado", null, null, null},
                    {"Curl Estilo 21", null, null, null},
                    {"Curl con Cable", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane23.setViewportView(tableBiceps1);

            jScrollPane22.setViewportView(jScrollPane23);

            jScrollPane25.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tableTriceps.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Flexion con Barra", null, null, null},
                    {"Flexion con Mancuerna", null, null, null},
                    {"Flexion estilo Copa", null, null, null},
                    {"Press francés con barra", null, null, null},
                    {"Patada Tricep", null, null, null},
                    {"Polea Tricep", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane25.setViewportView(tableTriceps);

            jScrollPane24.setViewportView(jScrollPane25);

            jScrollPane27.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tableHombros.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
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
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane27.setViewportView(tableHombros);

            jScrollPane26.setViewportView(jScrollPane27);

            jScrollPane29.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tablePecho.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Press de banca", null, null, null},
                    {"Press inclinado con barra", null, null, null},
                    {"Press declinado con barra", null, null, null},
                    {"Press declinado con mancuernas", null, null, null},
                    {"Voladoras", null, null, null},
                    {"Voladoras Inclinadas", null, null, null},
                    {"Pull Over con Barra", null, null, null},
                    {"Pull Over con mancuernas", null, null, null},
                    {"Fondos Disco", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane29.setViewportView(tablePecho);

            jScrollPane28.setViewportView(jScrollPane29);

            jScrollPane31.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            tableEspalda.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Polea por detrás", null, null, null},
                    {"Polea por delante", null, null, null},
                    {"Remo sentado con cable", null, null, null},
                    {"Remo Fijo", null, null, null},
                    {"Remo con barra fija", null, null, null},
                    {"Buenos dias con barra", null, null, null},
                    {"Remo con mancuernas", null, null, null},
                    {"Barra fija", null, null, null},
                    {"Rotaciones Olimpicas", null, null, null}
                },
                new String [] {
                    "Ejercicio", "Serie", "Repeticion", "Peso"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane31.setViewportView(tableEspalda);

            jScrollPane30.setViewportView(jScrollPane31);

            javax.swing.GroupLayout panel_crear_rutinaLayout = new javax.swing.GroupLayout(panel_crear_rutina);
            panel_crear_rutina.setLayout(panel_crear_rutinaLayout);
            panel_crear_rutinaLayout.setHorizontalGroup(
                panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)
                        .addComponent(jLabel28)
                        .addComponent(jLabel42)
                        .addComponent(jLabel43)
                        .addComponent(jLabel46)
                        .addComponent(jLabel47)
                        .addComponent(jLabel50)
                        .addComponent(jLabel49)
                        .addComponent(jLabel48)
                        .addComponent(jBCreateRutina)
                        .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_crear_rutinaLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_crear_rutinaLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 171, Short.MAX_VALUE))
            );
            panel_crear_rutinaLayout.setVerticalGroup(
                panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel44)
                        .addComponent(jTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel45)
                        .addComponent(jTextPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel28)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel29)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(jLabel42)
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel43)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel46)
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel47)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel48)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jLabel49)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addComponent(jLabel50)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCreateRutina)
                    .addGap(49, 49, 49))
            );

            panel_datos1.setViewportView(panel_crear_rutina);

            panel_asignar_rutina.setVisible(false);

            cedCliente1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cedCliente1ActionPerformed(evt);
                }
            });

            jButton12.setText("Asignar Rutina");
            jButton12.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton12ActionPerformed(evt);
                }
            });

            jLabel61.setText("Cedula del Cliente:");

            jLabel17.setText("Rutina:");

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rutina 1", "Rutina 2", "Rutina 3", "Rutina 4" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panel_asignar_rutinaLayout = new javax.swing.GroupLayout(panel_asignar_rutina);
            panel_asignar_rutina.setLayout(panel_asignar_rutinaLayout);
            panel_asignar_rutinaLayout.setHorizontalGroup(
                panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel61)
                        .addComponent(jLabel17))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton12)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cedCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(28, Short.MAX_VALUE))
            );
            panel_asignar_rutinaLayout.setVerticalGroup(
                panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                    .addContainerGap(70, Short.MAX_VALUE)
                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61)
                        .addComponent(cedCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addComponent(jButton12)
                    .addContainerGap(70, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout panel_registro_rutinasLayout = new javax.swing.GroupLayout(panel_registro_rutinas);
            panel_registro_rutinas.setLayout(panel_registro_rutinasLayout);
            panel_registro_rutinasLayout.setHorizontalGroup(
                panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                    .addComponent(panel_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(674, 674, 674))
                .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_rutinasLayout.createSequentialGroup()
                        .addContainerGap(108, Short.MAX_VALUE)
                        .addComponent(panel_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(524, 524, 524)))
                .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_rutinasLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(panel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                        .addContainerGap()))
            );
            panel_registro_rutinasLayout.setVerticalGroup(
                panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, Short.MAX_VALUE)
                .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registro_rutinasLayout.createSequentialGroup()
                        .addContainerGap(63, Short.MAX_VALUE)
                        .addComponent(panel_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(720, 720, 720)))
                .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(360, Short.MAX_VALUE)))
            );

            jTabbedPane1.addTab("Registro de Rutinas", panel_registro_rutinas);

            panel_menu2.setBackground(new java.awt.Color(255, 255, 255));

            btn_crear_perfil_Nutricional.setBackground(new java.awt.Color(255, 255, 255));
            btn_crear_perfil_Nutricional.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            btn_crear_perfil_Nutricional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
            btn_crear_perfil_Nutricional.setText("Crear Perfil Nutricional");
            btn_crear_perfil_Nutricional.setBorderPainted(false);
            btn_crear_perfil_Nutricional.setContentAreaFilled(false);
            btn_crear_perfil_Nutricional.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_crear_perfil_NutricionalActionPerformed(evt);
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
                        .addComponent(btn_crear_perfil_Nutricional, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btn_crear_perfil_Nutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_asignar_pNutricional)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_menu2Layout.createSequentialGroup()
                        .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                        .addContainerGap()))
            );

            panel_datos4.setBorder(null);
            panel_datos4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            panel_datos4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

            panel_crear_perfil_nutricional.setVisible(false);

            jTFNombre2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTFNombre2ActionPerformed(evt);
                }
            });

            jLNombre2.setText("Nombre del Perfi:");

            jLDatosPersonales2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLDatosPersonales2.setText("Perfil Nutricional");

            jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel53.setText("Datos del Cliente");

            jLabel54.setText("Peso:");

            jTextField22.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField22ActionPerformed(evt);
                }
            });

            jLabel55.setText("Kgs.");

            jLabel56.setText("Altura:");

            jLabel57.setText("mts.");

            jLabel58.setText("% de Cal de Carbohidratos.");

            jLabel59.setText("%");

            jLabel60.setText("% de Cal de Proteinas.");

            jLabel64.setText("%");

            jLabel65.setText("% de Cal de Grasas.");

            jLabel66.setText("%");

            jButton11.setText("Crear Perfil Nutricional");
            jButton11.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton11ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panel_crear_perfil_nutricionalLayout = new javax.swing.GroupLayout(panel_crear_perfil_nutricional);
            panel_crear_perfil_nutricional.setLayout(panel_crear_perfil_nutricionalLayout);
            panel_crear_perfil_nutricionalLayout.setHorizontalGroup(
                panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                .addComponent(jLDatosPersonales2)
                                .addGap(218, 218, 218))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addComponent(jLNombre2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addComponent(jLabel54)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel55))
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel57))
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                            .addComponent(jLabel65)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                            .addComponent(jLabel58)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                            .addComponent(jLabel60)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel59)
                                        .addComponent(jLabel64)
                                        .addComponent(jLabel66)))
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel53))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel_crear_perfil_nutricionalLayout.setVerticalGroup(
                panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLDatosPersonales2)
                    .addGap(38, 38, 38)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLNombre2)
                        .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addComponent(jLabel53)
                    .addGap(31, 31, 31)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55)
                        .addComponent(jLabel54))
                    .addGap(17, 17, 17)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56)
                        .addComponent(jLabel57))
                    .addGap(35, 35, 35)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel65)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel66))
                    .addGap(65, 65, 65)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(353, Short.MAX_VALUE))
            );

            jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

            panel_datos4.setViewportView(panel_crear_perfil_nutricional);

            panel_asignar_perfil.setVisible(false);

            cedCliente2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cedCliente2ActionPerformed(evt);
                }
            });

            jButton13.setText("Asignar Perfil");
            jButton13.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton13ActionPerformed(evt);
                }
            });

            jLabel62.setText("Cedula del Cliente:");

            jLabel18.setText("Rutina:");

            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perfil 1", "Perfil 2", "Perfil 3", "Perfil 4" }));
            jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panel_asignar_perfilLayout = new javax.swing.GroupLayout(panel_asignar_perfil);
            panel_asignar_perfil.setLayout(panel_asignar_perfilLayout);
            panel_asignar_perfilLayout.setHorizontalGroup(
                panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel62)
                        .addComponent(jLabel18))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cedCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton13)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(75, Short.MAX_VALUE))
            );
            panel_asignar_perfilLayout.setVerticalGroup(
                panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62)
                        .addComponent(cedCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addComponent(jButton13)
                    .addContainerGap(74, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout panel_registro_nutricionalLayout = new javax.swing.GroupLayout(panel_registro_nutricional);
            panel_registro_nutricional.setLayout(panel_registro_nutricionalLayout);
            panel_registro_nutricionalLayout.setHorizontalGroup(
                panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                    .addComponent(panel_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(panel_datos4))
                .addGroup(panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(panel_asignar_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            panel_registro_nutricionalLayout.setVerticalGroup(
                panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, Short.MAX_VALUE)
                .addComponent(panel_datos4, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(panel_asignar_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(552, Short.MAX_VALUE)))
            );

            jTabbedPane1.addTab("Registro Nutricional", panel_registro_nutricional);

            jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));

            jLabel76.setText("Parámetro:");

            combo_filtro_cobro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
            combo_filtro_cobro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_filtro_cobroActionPerformed(evt);
                }
            });
            combo_filtro_cobro.addActionListener(
                e -> combo_cobro_valor.setModel(
                    new DefaultComboBoxModel(
                        control.getDao().RecuperaAtributosCliente(
                            combo_filtro_cobro.getSelectedItem().toString()))
                )
            );

            jLabel77.setText("Valor:");

            combo_cobro_valor.setModel(
                new DefaultComboBoxModel(
                    new String[]{"valor de búsqueda no seleccionado"})
            );
            combo_cobro_valor.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    combo_cobro_valorActionPerformed(evt);
                }
            });

            label_fecha_seguimiento1.setText("Fecha");

            jLabel63.setText("Monto:");

            monto.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    montoActionPerformed(evt);
                }
            });

            boton_cancelar_cobro.setText("Cancelar");
            boton_cancelar_cobro.setToolTipText("cancelar monto");
            boton_cancelar_cobro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
            boton_cancelar_cobro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boton_cancelar_cobroActionPerformed(evt);
                }
            });

            jLabel31.setBackground(new java.awt.Color(255, 255, 255));
            jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel31.setForeground(new java.awt.Color(153, 0, 0));
            jLabel31.setText("Cobro de mensualidad");
            jLabel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));

            jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
            jLabel78.setText("Búsqueda del cliente");
            jLabel78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel77)
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(combo_cobro_valor, 0, 320, Short.MAX_VALUE)
                                .addComponent(combo_filtro_cobro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(45, 45, 45)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel63)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(label_fecha_seguimiento1)
                                    .addGap(32, 32, 32)
                                    .addComponent(dateChooserCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(35, 35, 35)
                            .addComponent(boton_cancelar_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel31)
                    .addGap(29, 29, 29)
                    .addComponent(jLabel78)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateChooserCobro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combo_filtro_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76)
                                    .addComponent(label_fecha_seguimiento1)))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel77)
                                .addComponent(combo_cobro_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel63)
                                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(boton_cancelar_cobro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(68, 68, 68))
            );

            jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));

            jTable10.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane15.setViewportView(jTable10);

            jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            jLabel79.setForeground(new java.awt.Color(153, 0, 0));
            jLabel79.setText("Información de cobros");
            jLabel79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));

            jLabel80.setText("Proyectar");

            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] {
                    "Clientes morosos", "Cancelan durante la semana",
                    "Clientes que están al día"
                }));

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
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
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
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(49, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(483, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout panel_control_pagosLayout = new javax.swing.GroupLayout(panel_control_pagos);
                panel_control_pagos.setLayout(panel_control_pagosLayout);
                panel_control_pagosLayout.setHorizontalGroup(
                    panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panel_control_pagosLayout.setVerticalGroup(
                    panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                jTabbedPane1.addTab("Control de Pagos", panel_control_pagos);

                label_cliente_seguimiento.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                label_cliente_seguimiento.setForeground(new java.awt.Color(0, 0, 153));
                label_cliente_seguimiento.setText("Cliente");

                combo_filtro_seguimiento_valor.setModel(
                    new DefaultComboBoxModel(
                        new String[]{""})
                );

                label_fecha_seguimiento.setText("Fecha");

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

                jLabel10.setText("Pierna Derecha");

                jLabel11.setText("Pierna Izquierda");

                jLabel12.setText("Pantorrilla Izquierda");

                jLabel13.setText("Pantorrilla derecha");

                jLabel14.setText("Peso");

                jLabel15.setText("Grasa");

                jLabel16.setText("IMC");

                javax.swing.GroupLayout panel_datos_segLayout = new javax.swing.GroupLayout(panel_datos_seg);
                panel_datos_seg.setLayout(panel_datos_segLayout);
                panel_datos_segLayout.setHorizontalGroup(
                    panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cadera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(cintura, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)))
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(imc, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                            .addComponent(peso)
                                            .addComponent(grasa)
                                            .addComponent(pecho)
                                            .addComponent(espalda)))
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(28, 28, 28)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pierna_derecha)
                                            .addComponent(pantorrilla_izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(pierna_izquierda)))
                                    .addComponent(jLabel1)
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(26, 26, 26)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(antebrazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(antebrazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(brazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(pantorrilla_derecha, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(brazo_derecho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))
                                .addContainerGap(47, Short.MAX_VALUE))))
                );
                panel_datos_segLayout.setVerticalGroup(
                    panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(pierna_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel10)
                                    .addComponent(pierna_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(grasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_datos_segLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel13))
                                .addGroup(panel_datos_segLayout.createSequentialGroup()
                                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pantorrilla_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pantorrilla_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(brazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(brazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(antebrazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(antebrazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(25, Short.MAX_VALUE))
                );

                combo_busqueda_seguimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
                combo_busqueda_seguimiento.addActionListener(
                    e -> combo_filtro_seguimiento_valor.setModel(
                        new DefaultComboBoxModel(
                            control.getDao().RecuperaAtributosCliente(
                                combo_busqueda_seguimiento.getSelectedItem().toString()))
                    )
                );

                jLabel25.setText("Búsqueda");

                jLabel26.setText("Valor");

                boton_añadir_seguimiento.setText("Añadir Seguimiento");
                boton_añadir_seguimiento.setToolTipText("haga click para añadir un nuevo seguimiento");
                boton_añadir_seguimiento.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        boton_añadir_seguimientoActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout panel_seguimientosLayout = new javax.swing.GroupLayout(panel_seguimientos);
                panel_seguimientos.setLayout(panel_seguimientosLayout);
                panel_seguimientosLayout.setHorizontalGroup(
                    panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_seguimientosLayout.createSequentialGroup()
                        .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_seguimientosLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_cliente_seguimiento)
                                    .addGroup(panel_seguimientosLayout.createSequentialGroup()
                                        .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26)
                                            .addComponent(label_fecha_seguimiento))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(combo_filtro_seguimiento_valor, 0, 178, Short.MAX_VALUE)
                                            .addComponent(combo_fecha_seguimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                            .addComponent(combo_busqueda_seguimiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(panel_seguimientosLayout.createSequentialGroup()
                                .addContainerGap(82, Short.MAX_VALUE)
                                .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_seguimientosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_añadir_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panel_seguimientosLayout.setVerticalGroup(
                    panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_seguimientosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_cliente_seguimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(combo_busqueda_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(combo_filtro_seguimiento_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_fecha_seguimiento)
                            .addComponent(combo_fecha_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(boton_añadir_seguimiento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jTabbedPane1.addTab("Seguimientos", panel_seguimientos);

                jLabel67.setText("Nombre del cliente");

                jLabel68.setText("Valor");

                jta_info_busqueda_cliente.setColumns(20);
                jta_info_busqueda_cliente.setRows(5);
                jScrollPane13.setViewportView(jta_info_busqueda_cliente);

                combo_filtro_cliente2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
                combo_filtro_cliente2.addActionListener(
                    e -> combo_nombre_cliente_seguimiento1.setModel(
                        new DefaultComboBoxModel(
                            control.getDao().RecuperaAtributosCliente(
                                combo_filtro_cliente2.getSelectedItem().toString()))
                    )
                );

                combo_nombre_cliente_seguimiento1.setModel(
                    new DefaultComboBoxModel(
                        new String[]{"valor de busqueda no seleccionado"})
                );
                combo_nombre_cliente_seguimiento1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        combo_nombre_cliente_seguimiento1ActionPerformed(evt);
                    }
                });

                jb_salvar_en_archivo.setText("Guardar en archivo");
                jb_salvar_en_archivo.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_salvar_en_archivoActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_nombre_cliente_seguimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_filtro_cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salvar_en_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_filtro_cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(combo_nombre_cliente_seguimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jb_salvar_en_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout panel_busquedaLayout = new javax.swing.GroupLayout(panel_busqueda);
                panel_busqueda.setLayout(panel_busquedaLayout);
                panel_busquedaLayout.setHorizontalGroup(
                    panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_busquedaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                );
                panel_busquedaLayout.setVerticalGroup(
                    panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_busquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jTabbedPane1.addTab("Búsqueda de clientes", panel_busqueda);

                jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(102, 102, 0)));

                jLabel69.setText("Parámetro:");

                jLabel70.setText("Valor:");

                combo_filtro_cliente3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
                combo_filtro_cliente3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        combo_filtro_cliente3ActionPerformed(evt);
                    }
                });
                combo_filtro_cliente3.addActionListener(
                    e -> combo_nombre_cliente_seguimiento2.setModel(
                        new DefaultComboBoxModel(
                            control.getDao().RecuperaAtributosCliente(
                                combo_filtro_cliente3.getSelectedItem().toString()))
                    )
                );

                jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel71.setForeground(new java.awt.Color(102, 102, 0));
                jLabel71.setText("Búsqueda del cliente ");

                combo_nombre_cliente_seguimiento2.setModel(
                    new DefaultComboBoxModel(
                        new String[]{"valor de búsqueda no seleccionado"})
                );
                combo_nombre_cliente_seguimiento2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        combo_nombre_cliente_seguimiento2ActionPerformed(evt);
                    }
                });

                jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel72.setForeground(new java.awt.Color(204, 0, 51));
                jLabel72.setText(" Proyección de los cambios en medidas físicas y corporales del cliente");
                jLabel72.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

                jLabel73.setText("Atributo a proyectar del cliente ");

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

                    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                    jPanel7.setLayout(jPanel7Layout);
                    jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(combo_filtro_cliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel70)
                                    .addGap(18, 18, 18)
                                    .addComponent(combo_nombre_cliente_seguimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel73)
                                    .addGap(45, 45, 45)
                                    .addComponent(jcb_proyec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel69)
                                .addComponent(combo_filtro_cliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel70)
                                .addComponent(combo_nombre_cliente_seguimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel72)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcb_proyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel73))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    jp_chart.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));

                    javax.swing.GroupLayout jp_chartLayout = new javax.swing.GroupLayout(jp_chart);
                    jp_chart.setLayout(jp_chartLayout);
                    jp_chartLayout.setHorizontalGroup(
                        jp_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
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

                    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                    jPanel3.setLayout(jPanel3Layout);
                    jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jp_chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(72, 72, 72))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jp_chart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7)
                            .addGap(443, 443, 443))
                    );

                    jTabbedPane1.addTab("Proyección", jPanel3);

                    javax.swing.GroupLayout pane_otrosLayout = new javax.swing.GroupLayout(pane_otros);
                    pane_otros.setLayout(pane_otrosLayout);
                    pane_otrosLayout.setHorizontalGroup(
                        pane_otrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                    );
                    pane_otrosLayout.setVerticalGroup(
                        pane_otrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                    );

                    jTabbedPane1.addTab("Otros", pane_otros);

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                    );
                    layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    );

                    pack();
                }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarClienteActionPerformed
        jBAddCliente.setText("Agregar Cliente");
        this.limpiarCamposRegistro();
        panel_datos.setVisible(true);
        if (!panel_reg_fisico.isVisible()) {
            desactivar_Cliente.setVisible(false);
            desactivar_Cliente.validate();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            panel_reg_fisico.setVisible(true);
            panel_reg_fisico.validate();
            panel_reg_fisico.paintComponents(panel_reg_fisico.getGraphics());
        } else {
            panel_reg_fisico.repaint();
        }
    }//GEN-LAST:event_jbRegistrarClienteActionPerformed

    private void jbEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarClienteActionPerformed
        jBAddCliente.setText("Editar Cliente");
        this.limpiarCamposRegistro();
        panel_datos.setVisible(true);
        String editarCedula = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente a editar: \n", "Cedula de Cliente", JOptionPane.QUESTION_MESSAGE);
        if (!panel_reg_fisico.isVisible()) {
            desactivar_Cliente.setVisible(false);
            desactivar_Cliente.validate();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
            if (editarCedula != null) {
                if (!editarCedula.equals("")) {
                    cargarDatosCliente(editarCedula);
                    panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
                    panel_reg_fisico.setVisible(true);
                    panel_reg_fisico.validate();
                    panel_reg_fisico.paintComponents(panel_reg_fisico.getGraphics());
                } else {
                    JOptionPane.showMessageDialog(null, "Debe digitar un usuario valido");
                }
            }
        } else {
            if (editarCedula != null) {
                if (!editarCedula.equals("")) {
                    cargarDatosCliente(editarCedula);
                    panel_reg_fisico.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe digitar un usuario valido");
                }
            }
        }
    }//GEN-LAST:event_jbEditarClienteActionPerformed

    private void jbDesactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesactivarClienteActionPerformed
        if (!desactivar_Cliente.isVisible()) {
            panel_reg_fisico.setVisible(false);
            panel_reg_fisico.validate();
            panel_reg_fisico.paintComponents(panel_reg_fisico.getGraphics());
            panel_datos.setVisible(false);
//            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
//            panel_datos.validate();
//            panel_datos.paintComponents(panel_datos.getGraphics());
            desactivar_Cliente.setVisible(true);
            desactivar_Cliente.validate();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
        } else {
            desactivar_Cliente.repaint();
        }
    }//GEN-LAST:event_jbDesactivarClienteActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jBAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddClienteActionPerformed

        if (valida_datos_personales() || valida_datos_salud()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos!\nO seleccionar todas las opciones");
        } else {
            Cliente cli = new Cliente(cedula.getText(), nombre.getText(), apellidos.getText(), direccion.getText(),
                    email.getText(), nacimiento.getText(), sexo.getSelectedIndex(), telefono.getText());
            control.getDao().setCliente(cli);//mete el cliente en la base de datos

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

    private void combo_nombre_cliente_seguimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nombre_cliente_seguimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_nombre_cliente_seguimiento1ActionPerformed

    private void jb_salvar_en_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvar_en_archivoActionPerformed
        String name = "";
        control.getDao().getCliente(
                combo_filtro_cliente2.getSelectedItem().toString(),
                combo_nombre_cliente_seguimiento1.getSelectedItem().toString());

        FileWriter fw;
        try {
            fw = new FileWriter(new File(name + ".txt"));
            fw.write(control.getDao().getCliente(
                    combo_filtro_cliente2.getSelectedItem().toString(),
                    combo_nombre_cliente_seguimiento1.getSelectedItem().toString()).toString());
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jb_salvar_en_archivoActionPerformed

    private void jBEditarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarRutinaActionPerformed
        panel_asignar_rutina.setVisible(false);
        panel_crear_rutina.setVisible(true);
        panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
    }//GEN-LAST:event_jBEditarRutinaActionPerformed

    private void jBAsignarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignarRutinaActionPerformed
        if (!panel_asignar_rutina.isVisible()) {

            panel_crear_rutina.setVisible(false);
            panel_asignar_rutina.setVisible(true);
            panel_asignar_rutina.validate();
            panel_asignar_rutina.paintComponents(panel_asignar_rutina.getGraphics());
            panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        } else {
            panel_asignar_rutina.repaint();
            panel_asignar_rutina.paintComponents(panel_asignar_rutina.getGraphics());
        }
    }//GEN-LAST:event_jBAsignarRutinaActionPerformed

    private void jBCrearRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearRutinaActionPerformed
        panel_asignar_rutina.setVisible(false);
        panel_crear_rutina.setVisible(true);
        panel_datos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
    }//GEN-LAST:event_jBCrearRutinaActionPerformed

    private void cedCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedCliente1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btn_crear_perfil_NutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_perfil_NutricionalActionPerformed
        panel_asignar_perfil.setVisible(false);
        panel_crear_perfil_nutricional.setVisible(true);
        panel_datos4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel_crear_perfil_nutricional.paintComponents(panel_crear_perfil_nutricional.getGraphics());
    }//GEN-LAST:event_btn_crear_perfil_NutricionalActionPerformed

    private void btn_asignar_pNutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_pNutricionalActionPerformed
        panel_crear_perfil_nutricional.setVisible(false);
        panel_asignar_perfil.setVisible(true);
        panel_asignar_perfil.paintComponents(panel_asignar_perfil.getGraphics());
    }//GEN-LAST:event_btn_asignar_pNutricionalActionPerformed

    private void jTFNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombre2ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cedCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedCliente2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void combo_filtro_cliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtro_cliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_filtro_cliente3ActionPerformed

    private void combo_nombre_cliente_seguimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nombre_cliente_seguimiento2ActionPerformed

    }//GEN-LAST:event_combo_nombre_cliente_seguimiento2ActionPerformed

    private void jcb_proyecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_proyecActionPerformed
//        System.out.println(jcb_proyec.getSelectedItem().toString());
//        Cliente c = control.getDao().getCliente(
//                combo_filtro_cliente3.getSelectedItem().toString(),
//                combo_nombre_cliente_seguimiento2.getSelectedItem().toString());
//        System.out.println(c.toString());
//
//        HashMap<String, Double> h
//                = control.getDao().getFechasYValores(c,
//                        jcb_proyec.getSelectedItem().toString());
//        String n = c.getNombre();
//        ChartPanel ch = Chart.getChartPanel(jcb_proyec.getSelectedItem().toString(),
//                control.getDao().getTipo_unidad(), h,
//                n.indexOf(' ') != -1 ? n.substring(0, n.indexOf(' ')) : n);
//        ch.setSize(jp_chart.getSize());
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                jp_chart.removeAll();
//                jp_chart.revalidate(); // This removes the old chart
//                jp_chart.setLayout(new BorderLayout());
//                jp_chart.add(ch);
//                jp_chart.repaint();
//            }
//        }
//        );
    }//GEN-LAST:event_jcb_proyecActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        control.useChooser(Chart.getJChart());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void combo_filtro_cobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtro_cobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_filtro_cobroActionPerformed

    private void combo_cobro_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cobro_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_cobro_valorActionPerformed

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void nacimientoOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_nacimientoOnCommit

        try {
            calcEdad();
        } catch (Exception e) {
            System.out.println("Error de conversion de fecha Nacimiento: " + nacimiento.getText());
        }
    }//GEN-LAST:event_nacimientoOnCommit

    private void calcEdad() {
        try {
            String dateStr = nacimiento.getText();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
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
        } catch (Exception e) {
            System.out.println("Error de conversion de fecha Nacimiento: " + nacimiento.getText());

        }
    }

    private void jLFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFotoMouseClicked
        try {
            fotoChooser = new JFileChooser();
            fotoChooser.showOpenDialog(null);
            File archivo = fotoChooser.getSelectedFile();
            String pathArchivo = archivo.getAbsolutePath();
            ImageIcon imagen = new ImageIcon(pathArchivo);
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLFoto.getWidth(), jLFoto.getHeight(), Image.SCALE_DEFAULT));
            jLFoto.setIcon(icono);
            this.repaint();
        } catch (Exception e) {
            System.out.println("Error en la subida de fotografia.");
        }
    }//GEN-LAST:event_jLFotoMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void combo_lesion_oseaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_lesion_oseaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_lesion_oseaActionPerformed

    private void combo_diabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_diabeticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_diabeticoActionPerformed

    private void jBCreateRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreateRutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCreateRutinaActionPerformed

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void boton_cancelar_cobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelar_cobroActionPerformed
        Cliente cliente = control.getDao().getCliente(combo_filtro_cobro.getSelectedItem().toString(),
                combo_cobro_valor.getSelectedItem().toString());
        Pago pago = new Pago(dateChooserCobro.getText(), Double.parseDouble(monto.getText()), cliente);
        control.getDao().setPago(pago);
    }//GEN-LAST:event_boton_cancelar_cobroActionPerformed

    private void boton_añadir_seguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_añadir_seguimientoActionPerformed
        Cliente cliente = control.getDao().getCliente(combo_busqueda_seguimiento.getSelectedItem().toString(),
                combo_filtro_seguimiento_valor.getSelectedItem().toString());

        Seguimiento seg = new Seguimiento(Double.parseDouble(peso.getText()), Double.parseDouble(imc.getText()),
                combo_fecha_seguimiento.getText(), Double.parseDouble(grasa.getText()),
                Double.parseDouble(pecho.getText()), Double.parseDouble(espalda.getText()),
                Double.parseDouble(cadera.getText()), Double.parseDouble(gluteos.getText()),
                Double.parseDouble(cintura.getText()), Double.parseDouble(pierna_izquierda.getText()),
                Double.parseDouble(pierna_derecha.getText()), Double.parseDouble(pantorrilla_izquierda.getText()),
                Double.parseDouble(pantorrilla_derecha.getText()), Double.parseDouble(brazo_izquierdo.getText()),
                Double.parseDouble(brazo_derecho.getText()), Double.parseDouble(antebrazo_derecho.getText()),
                Double.parseDouble(antebrazo_izquierdo.getText()), cliente);
        control.getDao().setSeguimiento(seg);//añade el seguimiento en la base de datos
    }//GEN-LAST:event_boton_añadir_seguimientoActionPerformed

    private void jBDesactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesactivarClienteActionPerformed
        if (!cedCliente.getText().isEmpty()) {
            if (control.getDao().getCliente("Cedula", cedCliente.getText()) != null) {
                control.getDao().deleteCliente(cedCliente.getText());
                JOptionPane.showMessageDialog(null, "Usuario Desactivado con exito!");
                cedCliente.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe.");
                cedCliente.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe digitar un usuario valido.");
        }
    }//GEN-LAST:event_jBDesactivarClienteActionPerformed

    private void cedClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedClienteActionPerformed

    public static void look() {
        try {//com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
    }

    private RegistroFisicoCliente registro_fisico;
    private Controlador control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antebrazo_derecho;
    private javax.swing.JTextField antebrazo_izquierdo;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton boton_añadir_seguimiento;
    private javax.swing.JButton boton_cancelar_cobro;
    private javax.swing.JTextField brazo_derecho;
    private javax.swing.JTextField brazo_izquierdo;
    private javax.swing.JButton btn_asignar_pNutricional;
    private javax.swing.JButton btn_crear_perfil_Nutricional;
    private javax.swing.JTextField cadera;
    private javax.swing.JTextField cardio_desc;
    private javax.swing.JTextField cedCliente;
    private javax.swing.JTextField cedCliente1;
    private javax.swing.JTextField cedCliente2;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField cintura;
    private javax.swing.JComboBox combo_anemia;
    private javax.swing.JComboBox combo_asfixia;
    private javax.swing.JComboBox combo_asmatico;
    private javax.swing.JComboBox combo_busqueda_seguimiento;
    private javax.swing.JComboBox combo_cobro_valor;
    private javax.swing.JComboBox combo_desmayos;
    private javax.swing.JComboBox combo_diabetico;
    private javax.swing.JComboBox combo_dif_respirar;
    private javax.swing.JComboBox combo_embarazo;
    private javax.swing.JComboBox combo_enfer_cardio;
    private javax.swing.JComboBox combo_epileptico;
    private datechooser.beans.DateChooserCombo combo_fecha_seguimiento;
    private javax.swing.JComboBox combo_filtro_cliente2;
    private javax.swing.JComboBox combo_filtro_cliente3;
    private javax.swing.JComboBox combo_filtro_cobro;
    private javax.swing.JComboBox combo_filtro_seguimiento_valor;
    private javax.swing.JComboBox combo_fumador;
    private javax.swing.JComboBox combo_gimnasio;
    private javax.swing.JComboBox combo_hipertenso;
    private javax.swing.JComboBox combo_lesion_musc;
    private javax.swing.JComboBox combo_lesion_osea;
    private javax.swing.JComboBox combo_mareos;
    private javax.swing.JComboBox combo_nauseas;
    private javax.swing.JComboBox combo_nombre_cliente_seguimiento1;
    private javax.swing.JComboBox combo_nombre_cliente_seguimiento2;
    private javax.swing.JComboBox combo_practica_act_deport;
    private datechooser.beans.DateChooserCombo dateChooserCobro;
    private javax.swing.JPanel desactivar_Cliente;
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
    private javax.swing.JButton jBCreateRutina;
    private javax.swing.JButton jBDesactivarCliente;
    private javax.swing.JButton jBEditarRutina;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton jbDesactivarCliente;
    private javax.swing.JButton jbEditarCliente;
    private javax.swing.JButton jbRegistrarCliente;
    private javax.swing.JButton jb_salvar_en_archivo;
    private javax.swing.JComboBox jcb_proyec;
    private javax.swing.JLabel jl_PGS;
    private javax.swing.JPanel jp_chart;
    private javax.swing.JTextArea jta_info_busqueda_cliente;
    private javax.swing.JLabel label_cliente_seguimiento;
    private javax.swing.JLabel label_fecha_seguimiento;
    private javax.swing.JLabel label_fecha_seguimiento1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField muscular_desc;
    private datechooser.beans.DateChooserCombo nacimiento;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField osea_desc;
    private javax.swing.JPanel pane_otros;
    private javax.swing.JPanel panel_asignar_perfil;
    private javax.swing.JPanel panel_asignar_rutina;
    private javax.swing.JPanel panel_busqueda;
    private javax.swing.JPanel panel_control_pagos;
    private javax.swing.JPanel panel_crear_perfil_nutricional;
    private javax.swing.JPanel panel_crear_rutina;
    private javax.swing.JScrollPane panel_datos;
    private javax.swing.JScrollPane panel_datos1;
    private javax.swing.JScrollPane panel_datos4;
    private javax.swing.JPanel panel_datos_seg;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_menu1;
    private javax.swing.JPanel panel_menu2;
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
    private javax.swing.JComboBox sexo;
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
    private javax.swing.JTextArea textarea_otro_padecimiento;
    // End of variables declaration//GEN-END:variables

    private JPopupMenu popupMenu;
    private JTable replace;

    private void buildPopupMenus() {
        JMenuItem item1 = new JMenuItem("AÃ±adir fila al final");
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
                System.out.println("Exited!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered!");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
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

                System.out.println("item1 click");
                ((DefaultTableModel) replace.getModel()).addRow(new Object[]{"", "", "", ""});
            }
        });
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("item2 click");

                ((DefaultTableModel) replace.getModel()).removeRow(((DefaultTableModel) replace.getModel()).getRowCount() - 1);
            }
        });
        popupMenu.add(item1);
        popupMenu.add(item2);

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

                sexo.setSelectedIndex(c.getSexo());
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
            } catch (ParseException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no existente!");
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
        sexo.setSelectedIndex(0);
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

        this.panel_reg_fisico.repaint();
    }

    private boolean valida_datos_personales() {
        return cedula.getText().isEmpty() || nombre.getText().isEmpty() || apellidos.getText().isEmpty()
                || direccion.getText().isEmpty() || email.getText().isEmpty() || nacimiento.getText().isEmpty()
                || sexo.getSelectedIndex() == 0 || telefono.getText().isEmpty();
    }

    private boolean valida_datos_salud() {
        return combo_lesion_osea.getSelectedIndex() == 0 || combo_lesion_musc.getSelectedIndex() == 0 || combo_enfer_cardio.getSelectedIndex() == 0
                || combo_asfixia.getSelectedIndex() == 0 || combo_anemia.getSelectedIndex() == 0 || combo_asmatico.getSelectedIndex() == 0
                || combo_hipertenso.getSelectedIndex() == 0 || combo_diabetico.getSelectedIndex() == 0 || combo_fumador.getSelectedIndex() == 0
                || combo_epileptico.getSelectedIndex() == 0 || combo_mareos.getSelectedIndex() == 0 || combo_desmayos.getSelectedIndex() == 0
                || combo_nauseas.getSelectedIndex() == 0 || combo_dif_respirar.getSelectedIndex() == 0 || combo_embarazo.getSelectedIndex() == 0
                || combo_gimnasio.getSelectedIndex() == 0 || combo_practica_act_deport.getSelectedIndex() == 0;

    }

    private boolean notNull(Object o) {
        return o != null;
    }

}
