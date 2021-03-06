package Vista;

import Controlador.Controlador;
import Modelo.Cliente;
import Modelo.EjerciciosRutina;
import Modelo.Rutina;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.common.views.DocumentViewController;
import org.icepdf.ri.util.PropertiesManager;
import org.jfree.chart.ChartPanel;
import pgs.PGS;

public class VistaCliente extends javax.swing.JFrame {

    private Cliente c;
    private Controlador control;
    private Rutina rutinaSelected;

    public VistaCliente(Cliente c, Controlador control) {
        super("Cliente");
        this.control = control;
        this.c = c;
        photoLocation = "C:\\PGS\\photos\\";
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Imagen/pgs-logo.png")).getImage();
        setIconImage(icon);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(screenSize);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        look();
        cargarDatos();
    }

    public static void look() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
    }

    private void cargarDatos() {
        if (c != null) {
            lb_nombre.setText(c.getNombre());
            lb_cedula.setText(c.getId_cliente());
            lb_apellidos.setText(c.getApellidos());
            try {
                String location = photoLocation + c.getId_cliente() + ".jpg";
                File f = new File(location);
                if (f.exists()) {
                    String p = f.getAbsolutePath();
                    ImageIcon imagen = new ImageIcon(p);
                    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lb_foto.getWidth(), lb_foto.getHeight(), Image.SCALE_DEFAULT));
                    lb_foto.setIcon(icono);
                } else {
                    lb_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/login_icon_user.png")));
                }
            } catch (Exception e) {
                System.err.println("Error al cargar imagen.");
            }
            lb_proximo_pago.setText(getProximoPago());
            cargaPagos();
            cargarRutina();
        }
    }
    
    private void cargaPagos(){
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
    }
    
    private void cargarRutina(){
        try{
            rutinaSelected = control.getDao().getRutinaCliente(c.getId_cliente());
            if(rutinaSelected!= null){
                cargarTablas(rutinaSelected);
                permiteEditar(false);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No tiene una Rutina Asignada.\n\nComuniquese con el Administrador o Instructor a Cargo.");
            System.err.println("Cliente sin Rutina.");
        }
    }
    
    private String getProximoPago() {
        String prox = "";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        // Fecha Actual y fecha de Inscripcion del Cliente
        try {
            Date current_date = cal.getTime();
            Date inscripcion = df.parse(c.getFechaInscripcion());
            int m = (inscripcion.getDate() >= current_date.getDate()) ? current_date.getMonth() + 1 : current_date.getMonth();
            prox = inscripcion.getDate() + " de " + mes(m);
        } catch (Exception e) {
            System.out.println("Error en obtener proximo pago.");
        }
        return prox;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jL_bienvenido = new javax.swing.JLabel();
        jl_PGS = new javax.swing.JLabel();
        lb_foto = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_apellidos = new javax.swing.JLabel();
        lb_cedula = new javax.swing.JLabel();
        panel_rutina = new javax.swing.JPanel();
        panel_datos1 = new javax.swing.JScrollPane();
        panel_imp_rutinas = new javax.swing.JPanel();
        panel_crear_rutina = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jBCreateRutina1 = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        tablePiernas = new javax.swing.JTable();
        jScrollPane33 = new javax.swing.JScrollPane();
        tableTrapecio = new javax.swing.JTable();
        jScrollPane35 = new javax.swing.JScrollPane();
        tablePantorrilla = new javax.swing.JTable();
        jScrollPane37 = new javax.swing.JScrollPane();
        tableAntebraso = new javax.swing.JTable();
        jScrollPane39 = new javax.swing.JScrollPane();
        tableBiceps1 = new javax.swing.JTable();
        jScrollPane41 = new javax.swing.JScrollPane();
        tableTriceps = new javax.swing.JTable();
        jScrollPane43 = new javax.swing.JScrollPane();
        tableHombros = new javax.swing.JTable();
        jScrollPane45 = new javax.swing.JScrollPane();
        tablePecho = new javax.swing.JTable();
        jScrollPane47 = new javax.swing.JScrollPane();
        tableEspalda = new javax.swing.JTable();
        bt_Print = new javax.swing.JButton();
        panel_Nutricion = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        btn_ver_nutricion_actual = new javax.swing.JButton();
        panel_proyeccion = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jcb_proyec1 = new javax.swing.JComboBox();
        jp_chart1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        panel_cobro = new javax.swing.JPanel();
        lb_proximo_cobro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lb_proximo_pago = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(java.awt.Color.orange);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jL_bienvenido.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jL_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_bienvenido.setText("Bienvenido");

        jl_PGS.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jl_PGS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_PGS.setText("Power Gym System");

        lb_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/login_icon_user.png"))); // NOI18N

        lb_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_nombre.setText("Nombre:");

        lb_apellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_apellidos.setText("Apellidos:");

        lb_cedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_cedula.setText("Cedula:");

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_PGS)
                    .addGroup(panel_inicioLayout.createSequentialGroup()
                        .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(lb_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jl_PGS)
                .addGap(18, 18, 18)
                .addComponent(jL_bienvenido)
                .addGap(117, 117, 117)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inicioLayout.createSequentialGroup()
                        .addComponent(lb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", new javax.swing.ImageIcon(getClass().getResource("/Imagen/pgs-logo_ico.png")), panel_inicio); // NOI18N

        panel_datos1.setBorder(null);
        panel_datos1.getVerticalScrollBar().setUnitIncrement(20);
        panel_datos1.setAutoscrolls(true);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Piernas");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setText("Pantorillas");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("Biceps");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel74.setText("Triceps");

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
        jScrollPane32.setAutoscrolls(true);

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
        jScrollPane32.setViewportView(tablePiernas);

        jScrollPane33.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane33.setAutoscrolls(true);

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
        jScrollPane33.setViewportView(tableTrapecio);

        jScrollPane35.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane35.setAutoscrolls(true);

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
        jScrollPane35.setViewportView(tablePantorrilla);

        jScrollPane37.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane37.setAutoscrolls(true);

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
        jScrollPane37.setViewportView(tableAntebraso);

        jScrollPane39.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane39.setAutoscrolls(true);

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
        jScrollPane39.setViewportView(tableBiceps1);

        jScrollPane41.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane41.setAutoscrolls(true);

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
        jScrollPane41.setViewportView(tableTriceps);

        jScrollPane43.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane43.setAutoscrolls(true);

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
        jScrollPane43.setViewportView(tableHombros);

        jScrollPane45.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane45.setAutoscrolls(true);

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
        jScrollPane45.setViewportView(tablePecho);

        jScrollPane47.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane47.setAutoscrolls(true);

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
        jScrollPane47.setViewportView(tableEspalda);

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
                    .addComponent(jLabel95))
                .addGap(10, 10, 10))
        );
        panel_crear_rutinaLayout.setVerticalGroup(
            panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
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
        bt_Print.setBorder(null);
        bt_Print.setBorderPainted(false);
        bt_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_imp_rutinasLayout = new javax.swing.GroupLayout(panel_imp_rutinas);
        panel_imp_rutinas.setLayout(panel_imp_rutinasLayout);
        panel_imp_rutinasLayout.setHorizontalGroup(
            panel_imp_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_imp_rutinasLayout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(panel_crear_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        panel_imp_rutinasLayout.setVerticalGroup(
            panel_imp_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_imp_rutinasLayout.createSequentialGroup()
                .addComponent(panel_crear_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(panel_imp_rutinasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bt_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_datos1.setViewportView(panel_imp_rutinas);

        javax.swing.GroupLayout panel_rutinaLayout = new javax.swing.GroupLayout(panel_rutina);
        panel_rutina.setLayout(panel_rutinaLayout);
        panel_rutinaLayout.setHorizontalGroup(
            panel_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_rutinaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        panel_rutinaLayout.setVerticalGroup(
            panel_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Rutina actual", new javax.swing.ImageIcon(getClass().getResource("/Imagen/pesa.png")), panel_rutina); // NOI18N

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
        jTabbedPane2.addTab("Plan Actual", viewerComponentPanel);

        jLabel1.setText("Perfil Nutricional actual");

        btn_ver_nutricion_actual.setText("Ver");
        btn_ver_nutricion_actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_nutricion_actualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_NutricionLayout = new javax.swing.GroupLayout(panel_Nutricion);
        panel_Nutricion.setLayout(panel_NutricionLayout);
        panel_NutricionLayout.setHorizontalGroup(
            panel_NutricionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_NutricionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
            .addGroup(panel_NutricionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_ver_nutricion_actual)
                .addContainerGap(803, Short.MAX_VALUE))
        );
        panel_NutricionLayout.setVerticalGroup(
            panel_NutricionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_NutricionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_NutricionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_ver_nutricion_actual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Perfil Nutricional", new javax.swing.ImageIcon(getClass().getResource("/Imagen/AgregarPN.png")), panel_Nutricion); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(102, 102, 0)));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setText(" Proyección de los cambios en medidas físicas y corporales");
        jLabel77.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setText("Atributo a proyectar del cliente: ");

        jcb_proyec1.setModel(new javax.swing.DefaultComboBoxModel(
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
            jcb_proyec1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jcb_proyec1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
            jPanel8.setLayout(jPanel8Layout);
            jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel78)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_proyec1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(258, Short.MAX_VALUE))
            );
            jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel77)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78)
                        .addComponent(jcb_proyec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jp_chart1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));

            javax.swing.GroupLayout jp_chart1Layout = new javax.swing.GroupLayout(jp_chart1);
            jp_chart1.setLayout(jp_chart1Layout);
            jp_chart1Layout.setHorizontalGroup(
                jp_chart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            jp_chart1Layout.setVerticalGroup(
                jp_chart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 502, Short.MAX_VALUE)
            );

            jButton8.setText("Exportar gráfico");
            jButton8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton8ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jp_chart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jp_chart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton8)
                    .addGap(26, 26, 26))
            );

            javax.swing.GroupLayout panel_proyeccionLayout = new javax.swing.GroupLayout(panel_proyeccion);
            panel_proyeccion.setLayout(panel_proyeccionLayout);
            panel_proyeccionLayout.setHorizontalGroup(
                panel_proyeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_proyeccionLayout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(168, Short.MAX_VALUE))
            );
            panel_proyeccionLayout.setVerticalGroup(
                panel_proyeccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            jTabbedPane1.addTab("Proyección", new javax.swing.ImageIcon(getClass().getResource("/Imagen/proyeccion.png")), panel_proyeccion); // NOI18N

            lb_proximo_cobro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            lb_proximo_cobro.setForeground(new java.awt.Color(102, 0, 0));
            lb_proximo_cobro.setText("Próximo Pago :");

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(102, 0, 0));
            jLabel4.setText("Pagos efectuados: ");

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "Fecha", "Monto Cancelado", "Detalle"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, true, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane2.setViewportView(jTable1);

            lb_proximo_pago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            lb_proximo_pago.setText("....");

            javax.swing.GroupLayout panel_cobroLayout = new javax.swing.GroupLayout(panel_cobro);
            panel_cobro.setLayout(panel_cobroLayout);
            panel_cobroLayout.setHorizontalGroup(
                panel_cobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_cobroLayout.createSequentialGroup()
                    .addContainerGap(124, Short.MAX_VALUE)
                    .addGroup(panel_cobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_cobroLayout.createSequentialGroup()
                            .addComponent(lb_proximo_cobro)
                            .addGap(18, 18, 18)
                            .addComponent(lb_proximo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(176, Short.MAX_VALUE))
            );
            panel_cobroLayout.setVerticalGroup(
                panel_cobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_cobroLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(panel_cobroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_proximo_cobro)
                        .addComponent(lb_proximo_pago))
                    .addGap(43, 43, 43)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("Pagos", new javax.swing.ImageIcon(getClass().getResource("/Imagen/cobro.png")), panel_cobro); // NOI18N

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
                .addComponent(jTabbedPane1)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jcb_proyec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_proyec1ActionPerformed
//    Cliente c = control.getDao().getCliente("Cedula",id);
        HashMap<String, Double> h
                = control.getDao().getFechasYValores(c,
                        jcb_proyec1.getSelectedItem().toString());
        if( h != null){
            String n = c.getNombre();
            ChartPanel ch = Chart.getChartPanel(jcb_proyec1.getSelectedItem().toString(),
                    control.getDao().getTipo_unidad(), h,
                    n.indexOf(' ') != -1 ? n.substring(0, n.indexOf(' ')) : n);
            ch.setSize(jp_chart1.getSize());
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    jp_chart1.removeAll();
                    jp_chart1.revalidate(); // This removes the old chart
                    jp_chart1.setLayout(new BorderLayout());
                    jp_chart1.add(ch);
                    jp_chart1.repaint();
                }
            }
            );
        } else {
            JOptionPane.showMessageDialog(this, "Solo existe un seguimiento para este Cliente, no se puede hacer una proeccion de los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcb_proyec1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        control.useChooser(Chart.getJChart());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jBCreateRutina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreateRutina1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCreateRutina1ActionPerformed

    private void bt_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PrintActionPerformed
        String fileName = "C:\\PGS\\Rutina\\" + rutinaSelected.getNombre()+ ".pdf";
            printToPDF(fileName);
            verPDFFrame(fileName);
    }//GEN-LAST:event_bt_PrintActionPerformed

    private void printToPDF(String fileName) {
        try {
            Document d = new Document();
            PdfWriter writer = PdfWriter.getInstance(d, new FileOutputStream(
                    fileName));
            d.open();

            PdfPTable tabletmp = new PdfPTable(1);
            tabletmp.getDefaultCell().setBorder(Rectangle.NO_BORDER);

            tabletmp.addCell("Nombre: " + c.getNombre()+" "+c.getApellidos()+" Cedula: "+c.getId_cliente());

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
                    component.getHeight(), BufferedImage.TYPE_INT_RGB);
            component.paint(image.getGraphics());

            iTextImage = com.itextpdf.text.Image.getInstance(writer, image, 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return iTextImage;
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
    
    private void btn_ver_nutricion_actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_nutricion_actualActionPerformed
        // TODO add your handling code here:
        try {
            String plan = this.control.getDao().getNutricionCliente(c.getId_cliente()).getNombre_plan();
            if(plan != null){
                filePath = "C:\\PGS\\nutricion\\" + plan;
                controller.openDocument(filePath);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No tiene un Plan Nutricional Asignado Actualmente.");
            System.err.println("Error, no hay rutina asignada al cliente");
        }
    }//GEN-LAST:event_btn_ver_nutricion_actualActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(this, "Esta seguro que desea cerrar la sesion de: \n"+control.getCli().getNombre()+"", "Cerrar sesion?", JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                PGS.mostrarInterfaz();
                this.setVisible(false);
                this.dispose();
            }  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void permiteEditar(boolean cond) {
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
    
    final private String photoLocation;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Print;
    private javax.swing.JButton btn_ver_nutricion_actual;
    private javax.swing.JButton jBCreateRutina1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jL_bienvenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jcb_proyec1;
    private javax.swing.JLabel jl_PGS;
    private javax.swing.JPanel jp_chart1;
    private javax.swing.JLabel lb_apellidos;
    private javax.swing.JLabel lb_cedula;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_proximo_cobro;
    private javax.swing.JLabel lb_proximo_pago;
    private javax.swing.JPanel panel_Nutricion;
    private javax.swing.JPanel panel_cobro;
    private javax.swing.JPanel panel_crear_rutina;
    private javax.swing.JScrollPane panel_datos1;
    private javax.swing.JPanel panel_imp_rutinas;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_proyeccion;
    private javax.swing.JPanel panel_rutina;
    private javax.swing.JTable tableAntebraso;
    private javax.swing.JTable tableBiceps1;
    private javax.swing.JTable tableEspalda;
    private javax.swing.JTable tableHombros;
    private javax.swing.JTable tablePantorrilla;
    private javax.swing.JTable tablePecho;
    private javax.swing.JTable tablePiernas;
    private javax.swing.JTable tableTrapecio;
    private javax.swing.JTable tableTriceps;
    // End of variables declaration//GEN-END:variables

    private String mes(int m) {
        switch (m) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Nomviembre";
            case 12:
                return "Diciembre";
        }
        return "";
    }
    
        private void cargarTablas(Rutina r) {
        List<EjerciciosRutina> er = control.getDao().getEjeRutina(r.getId());

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
    

    private String filePath = "";
    private SwingController controller = new SwingController();
    private PropertiesManager properties = new PropertiesManager(
            System.getProperties(),
            ResourceBundle.getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));

    private SwingViewBuilder factory = new SwingViewBuilder(controller, properties);

}
