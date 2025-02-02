/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.formdev.flatlaf.FlatLightLaf;
import datos.GuardarBitacora;
import dominio.ProcesosRepetidos;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login_LD;

/**
 *
 * @author Herbert Leonel Dominguez Chavez
 */
public class Hoteleria_MDI extends javax.swing.JFrame {

    private Mnt_Servicios form_Mant_Servicios;
    private Mnt_Pisos form_Mant_Pisos;
    private Mnt_Horarios form_Mant_Horarios;
    private Mnt_Habitaciones form_Mant_Habitaciones;
    private Mnt_Huespedes form_Mant_Huespedes;
    private Mnt_Menu form_Mant_Menu;
    private Mnt_Tarifas form_Mant_Tarifas;
    private Prcs_AsignacionServicios form_Prcs_AsignacionServicios;
    private Prcs_Reservacion form_Prcs_Reservacion;
    private Prcs_DetalleReservacion form_Prcs_ReservacionDetalle;
    private Prcs_AsignacionGobernanta form_Prcs_AsignacionGobernanta;
    private Prcs_AsignacionLimpieza form_Prcs_AsignacionLimpieza;
    private Prcs_RegistroObjetoPerdido form_Objeto_perdido;
    private Prcs_EntregaObjetoPerdido form_E_Objeto_perdido;
    private Prcs_ConsultaLimpieza form_ConsultaLimpieza;
    private Prcs_SupervisionLimpieza form_SupervisionLimpieza;
    private Prcs_OrdenDeRestaurante form_OrdenDeRestaurante;
    private Prcs_Check_In form_Prcs_CheckIn;
    private Prcs_Check_Out form_Prcs_CheckOut;
    private Prcs_ServiciosExtras form_Prcs_ServiciosExtras;
    private Prcs_DetalleRestaurante form_DetalleRestaurante;
    private Prcs_cocinaRestaurante form_Prcs_cocina_Restaurante;
    private Prcs_IngredienteMenu form_IngredienteMenu;
    private Prcs_Viaje form_Viaje;

    ProcesosRepetidos prcs_repetidos = new ProcesosRepetidos();
    public static JLabel Jl_logo = new JLabel();
    GuardarBitacora bitacora = new GuardarBitacora();

    /**
     * Creates new form Hoteleria_MDI
     */
    public Hoteleria_MDI() {
        initComponents();

        this.setTitle("Usuario: " + "[" + Login_LD.usuario + "]" + " \t" + "FECHA: [" + prcs_repetidos.getFecha() + "]");
        GenerarPermisos generarPermisos = new GenerarPermisos();
        var usuario = Login_LD.usuario;
        var modulo = "Hotelero";
        generarPermisos.getPermisos(modulo, usuario);

        Diseño();
    }

    public void Diseño() {
        Jdp_contenedor.setBackground(new Color(228, 68, 68));
        prcs_repetidos.Cursor(Mnb_menu);
        ImageIcon icono = new ImageIcon("src/main/java/assets/hotel.png");
        this.setIconImage(icono.getImage());
        logo();
        Jdp_contenedor.add(Jl_logo);
    }

    public void logo() {
        ImageIcon icon = new ImageIcon("src/main/java/assets/logo_hotel.png");
        Jl_logo.setSize(300, 300);
        if (icon != null) {
            Jl_logo.setIcon(icon);
        } else {
            //No existe imagen.
        }
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = Jl_logo.getSize();
        Jl_logo.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jdp_contenedor = new javax.swing.JDesktopPane();
        Mnb_menu = new javax.swing.JMenuBar();
        Sbm_archivos = new javax.swing.JMenu();
        Sbm_catalogo = new javax.swing.JMenu();
        Mnu_mantenimientos = new javax.swing.JMenu();
        MnI_servicios = new javax.swing.JMenuItem();
        MnI_piso = new javax.swing.JMenuItem();
        MnI_horario = new javax.swing.JMenuItem();
        MnI_huespedes = new javax.swing.JMenuItem();
        MnI_habitaciones = new javax.swing.JMenuItem();
        MnI_menu = new javax.swing.JMenuItem();
        MnI_tarifas = new javax.swing.JMenuItem();
        Sbm_procesos = new javax.swing.JMenu();
        MnI_asingacionServiciosHabitacion = new javax.swing.JMenuItem();
        MnI_serviciosExtras = new javax.swing.JMenuItem();
        MnI_reservacion = new javax.swing.JMenuItem();
        MnI_reservacionDetalle = new javax.swing.JMenuItem();
        MnI_Gobernanta = new javax.swing.JMenuItem();
        MnI_Limpieza = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MnI_ConsultaLimpieza = new javax.swing.JMenuItem();
        MnI_SupervisiónLimpieza = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MnI_Ingrediente = new javax.swing.JMenuItem();
        MnI_InicioOrden = new javax.swing.JMenuItem();
        MnI_EfectuarOrden = new javax.swing.JMenuItem();
        MnI_Cocina = new javax.swing.JMenuItem();
        MnI_RegistroObjetoPerdido = new javax.swing.JMenuItem();
        MnI_ObjetosPerdidosE = new javax.swing.JMenuItem();
        MnI_CheckIn = new javax.swing.JMenuItem();
        MnI_CheckOut = new javax.swing.JMenuItem();
        MnI_Viaje = new javax.swing.JMenuItem();
        Sbm_herramientas = new javax.swing.JMenu();
        Sbm_ayuda = new javax.swing.JMenu();
        Btn_cerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout Jdp_contenedorLayout = new javax.swing.GroupLayout(Jdp_contenedor);
        Jdp_contenedor.setLayout(Jdp_contenedorLayout);
        Jdp_contenedorLayout.setHorizontalGroup(
            Jdp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        Jdp_contenedorLayout.setVerticalGroup(
            Jdp_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );

        Sbm_archivos.setText("Archivos");
        Sbm_archivos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_archivos);

        Sbm_catalogo.setText("Catalogo");
        Sbm_catalogo.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        Mnu_mantenimientos.setText("Mantenimientos");

        MnI_servicios.setText("Mant. Servicios");
        MnI_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_serviciosActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_servicios);

        MnI_piso.setText("Mant. Pisos");
        MnI_piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_pisoActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_piso);

        MnI_horario.setText("Mant. Horarios");
        MnI_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_horarioActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_horario);

        MnI_huespedes.setText("Mant. Huespedes");
        MnI_huespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_huespedesActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_huespedes);

        MnI_habitaciones.setText("Mant. Habitaciones");
        MnI_habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_habitacionesActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_habitaciones);

        MnI_menu.setText("Mant. Menu");
        MnI_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_menuActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_menu);

        MnI_tarifas.setText("Mant. Tarifas");
        MnI_tarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_tarifasActionPerformed(evt);
            }
        });
        Mnu_mantenimientos.add(MnI_tarifas);

        Sbm_catalogo.add(Mnu_mantenimientos);

        Mnb_menu.add(Sbm_catalogo);

        Sbm_procesos.setText("Procesos");
        Sbm_procesos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        Mnu_procesos.setText("Procesos");

        MnI_asingacionServiciosHabitacion.setText("Prcs. Asignación de Servicios a Habitacion");
        MnI_asingacionServiciosHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_asingacionServiciosHabitacionActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_asingacionServiciosHabitacion);

        MnI_serviciosExtras.setText("Prcs. Servicios Extras");
        MnI_serviciosExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_serviciosExtrasActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_serviciosExtras);

        MnI_reservacion.setText("Prcs. Reservación");
        MnI_reservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_reservacionActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_reservacion);

        MnI_reservacionDetalle.setText("Prcs. Reservación Detalle");
        MnI_reservacionDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_reservacionDetalleActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_reservacionDetalle);

        MnI_Gobernanta.setText("Prcs. Asignación Gobernanta");
        MnI_Gobernanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_GobernantaActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_Gobernanta);

        MnI_Limpieza.setText("Prcs. Asignación Limpieza");
        MnI_Limpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_LimpiezaActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_Limpieza);

        jMenu1.setText("Consulta y Supervisión de Limpieza");

        MnI_ConsultaLimpieza.setText("Prcs. Consulta Limpieza");
        MnI_ConsultaLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_ConsultaLimpiezaActionPerformed(evt);
            }
        });
        jMenu1.add(MnI_ConsultaLimpieza);

        MnI_SupervisiónLimpieza.setText("Prcs. Supervisión Limpieza");
        MnI_SupervisiónLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_SupervisiónLimpiezaActionPerformed(evt);
            }
        });
        jMenu1.add(MnI_SupervisiónLimpieza);

        Mnu_procesos.add(jMenu1);

        jMenu2.setText("Restaurante");

        MnI_Ingrediente.setText("Prcs. Asignar Ingrediente");
        MnI_Ingrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_IngredienteActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_Ingrediente);

        MnI_InicioOrden.setText("Prcs. Iniciar Orden");
        MnI_InicioOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_InicioOrdenActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_InicioOrden);

        MnI_EfectuarOrden.setText("Prcs. Efectuar Orden");
        MnI_EfectuarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_EfectuarOrdenActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_EfectuarOrden);

        MnI_Cocina.setText("Prcs. Cocina");
        MnI_Cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_CocinaActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_Cocina);

        Mnu_procesos.add(jMenu2);

        MnI_RegistroObjetoPerdido.setText("Prcs. Objetos Perdidos");
        MnI_RegistroObjetoPerdido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_RegistroObjetoPerdidoActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_RegistroObjetoPerdido);

        MnI_ObjetosPerdidosE.setText("Prcs. Entrega Objetos Perdidos");
        MnI_ObjetosPerdidosE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_ObjetosPerdidosEActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_ObjetosPerdidosE);

        MnI_CheckIn.setText("Prcs. Check In");
        MnI_CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_CheckInActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_CheckIn);

        MnI_CheckOut.setText("Prcs. Check Out");
        MnI_CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_CheckOutActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_CheckOut);

        MnI_Viaje.setText("Prcs. Viaje");
        MnI_Viaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_ViajeActionPerformed(evt);
            }
        });
        Mnu_procesos.add(MnI_Viaje);

        Sbm_procesos.add(Mnu_procesos);

        Mnb_menu.add(Sbm_procesos);

        Sbm_herramientas.setText("Herramientas");
        Sbm_herramientas.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_herramientas);

        Sbm_ayuda.setText("Ayuda");
        Sbm_ayuda.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Sbm_ayuda);

        Btn_cerrarSesion.setText("Cerrar Sesión");
        Btn_cerrarSesion.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Mnb_menu.add(Btn_cerrarSesion);

        setJMenuBar(Mnb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdp_contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdp_contenedor)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        logo();
    }//GEN-LAST:event_formComponentResized

    private void MnI_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_serviciosActionPerformed
        form_Mant_Servicios = new Mnt_Servicios();

        Jdp_contenedor.add(form_Mant_Servicios);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Servicios.getSize();
        form_Mant_Servicios.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Servicios.setVisible(true);
        form_Mant_Servicios.toFront();
        bitacora.GuardarEnBitacora("log", "2005");
    }//GEN-LAST:event_MnI_serviciosActionPerformed

    private void MnI_pisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_pisoActionPerformed
        form_Mant_Pisos = new Mnt_Pisos();

        Jdp_contenedor.add(form_Mant_Pisos);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Pisos.getSize();
        form_Mant_Pisos.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Pisos.setVisible(true);
        form_Mant_Pisos.toFront();
        bitacora.GuardarEnBitacora("log", "2004");
    }//GEN-LAST:event_MnI_pisoActionPerformed

    private void MnI_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_horarioActionPerformed
        form_Mant_Horarios = new Mnt_Horarios();

        Jdp_contenedor.add(form_Mant_Horarios);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Horarios.getSize();
        form_Mant_Horarios.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Horarios.setVisible(true);
        form_Mant_Horarios.toFront();
        bitacora.GuardarEnBitacora("log", "2002");
    }//GEN-LAST:event_MnI_horarioActionPerformed

    private void MnI_huespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_huespedesActionPerformed
        // TODO add your handling code here:
        form_Mant_Huespedes = new Mnt_Huespedes();

        Jdp_contenedor.add(form_Mant_Huespedes);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Huespedes.getSize();
        form_Mant_Huespedes.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Huespedes.setVisible(true);
        form_Mant_Huespedes.toFront();
        bitacora.GuardarEnBitacora("log", "2003");
    }//GEN-LAST:event_MnI_huespedesActionPerformed

    private void MnI_habitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_habitacionesActionPerformed
        // TODO add your handling code here:
        form_Mant_Habitaciones = new Mnt_Habitaciones();

        Jdp_contenedor.add(form_Mant_Habitaciones);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Habitaciones.getSize();
        form_Mant_Habitaciones.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Habitaciones.setVisible(true);
        form_Mant_Habitaciones.toFront();
        bitacora.GuardarEnBitacora("log", "2001");
    }//GEN-LAST:event_MnI_habitacionesActionPerformed

    private void MnI_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_menuActionPerformed
        // TODO add your handling code here:
        form_Mant_Menu = new Mnt_Menu();

        Jdp_contenedor.add(form_Mant_Menu);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Menu.getSize();
        form_Mant_Menu.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Menu.setVisible(true);
        form_Mant_Menu.toFront();
        bitacora.GuardarEnBitacora("log", "2006");
    }//GEN-LAST:event_MnI_menuActionPerformed

    private void MnI_tarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_tarifasActionPerformed
        // TODO add your handling code here:
        form_Mant_Tarifas = new Mnt_Tarifas();

        Jdp_contenedor.add(form_Mant_Tarifas);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Mant_Tarifas.getSize();
        form_Mant_Tarifas.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Mant_Tarifas.setVisible(true);
        form_Mant_Tarifas.toFront();
        bitacora.GuardarEnBitacora("log", "2007");
    }//GEN-LAST:event_MnI_tarifasActionPerformed

    private void MnI_asingacionServiciosHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_asingacionServiciosHabitacionActionPerformed
        // TODO add your handling code here:
        form_Prcs_AsignacionServicios = new Prcs_AsignacionServicios();

        Jdp_contenedor.add(form_Prcs_AsignacionServicios);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_AsignacionServicios.getSize();
        form_Prcs_AsignacionServicios.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_AsignacionServicios.setVisible(true);
        form_Prcs_AsignacionServicios.toFront();
        bitacora.GuardarEnBitacora("log", "2201");
    }//GEN-LAST:event_MnI_asingacionServiciosHabitacionActionPerformed

    private void MnI_reservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_reservacionActionPerformed
        form_Prcs_Reservacion = new Prcs_Reservacion();

        Jdp_contenedor.add(form_Prcs_Reservacion);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_Reservacion.getSize();
        form_Prcs_Reservacion.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_Reservacion.setVisible(true);
        form_Prcs_Reservacion.toFront();
    }//GEN-LAST:event_MnI_reservacionActionPerformed

    private void MnI_GobernantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_GobernantaActionPerformed
        form_Prcs_AsignacionGobernanta = new Prcs_AsignacionGobernanta();

        Jdp_contenedor.add(form_Prcs_AsignacionGobernanta);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_AsignacionGobernanta.getSize();
        form_Prcs_AsignacionGobernanta.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_AsignacionGobernanta.setVisible(true);
        form_Prcs_AsignacionGobernanta.toFront();
    }//GEN-LAST:event_MnI_GobernantaActionPerformed

    private void MnI_RegistroObjetoPerdidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_RegistroObjetoPerdidoActionPerformed
        // TODO add your handling code here:
        form_Objeto_perdido = new Prcs_RegistroObjetoPerdido();

        Jdp_contenedor.add(form_Objeto_perdido);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Objeto_perdido.getSize();
        form_Objeto_perdido.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Objeto_perdido.setVisible(true);
        form_Objeto_perdido.toFront();
        bitacora.GuardarEnBitacora("log", "2202");
    }//GEN-LAST:event_MnI_RegistroObjetoPerdidoActionPerformed

    private void MnI_LimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_LimpiezaActionPerformed
        form_Prcs_AsignacionLimpieza = new Prcs_AsignacionLimpieza();

        Jdp_contenedor.add(form_Prcs_AsignacionLimpieza);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_AsignacionLimpieza.getSize();
        form_Prcs_AsignacionLimpieza.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_AsignacionLimpieza.setVisible(true);
        form_Prcs_AsignacionLimpieza.toFront();
    }//GEN-LAST:event_MnI_LimpiezaActionPerformed

    private void MnI_ConsultaLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_ConsultaLimpiezaActionPerformed
        form_ConsultaLimpieza = new Prcs_ConsultaLimpieza();

        Jdp_contenedor.add(form_ConsultaLimpieza);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_ConsultaLimpieza.getSize();
        form_ConsultaLimpieza.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_ConsultaLimpieza.setVisible(true);
        form_ConsultaLimpieza.toFront();
    }//GEN-LAST:event_MnI_ConsultaLimpiezaActionPerformed

    private void MnI_SupervisiónLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_SupervisiónLimpiezaActionPerformed
        form_SupervisionLimpieza = new Prcs_SupervisionLimpieza();

        Jdp_contenedor.add(form_SupervisionLimpieza);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_SupervisionLimpieza.getSize();
        form_SupervisionLimpieza.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_SupervisionLimpieza.setVisible(true);
        form_SupervisionLimpieza.toFront();
    }//GEN-LAST:event_MnI_SupervisiónLimpiezaActionPerformed

    private void MnI_ObjetosPerdidosEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_ObjetosPerdidosEActionPerformed
        // TODO add your handling code here:
        form_E_Objeto_perdido = new Prcs_EntregaObjetoPerdido();

        Jdp_contenedor.add(form_E_Objeto_perdido);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_E_Objeto_perdido.getSize();
        form_E_Objeto_perdido.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_E_Objeto_perdido.setVisible(true);
        form_E_Objeto_perdido.toFront();
        bitacora.GuardarEnBitacora("log", "2203");
    }//GEN-LAST:event_MnI_ObjetosPerdidosEActionPerformed

    private void MnI_reservacionDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_reservacionDetalleActionPerformed
        // TODO add your handling code here:
        form_Prcs_ReservacionDetalle = new Prcs_DetalleReservacion();

        Jdp_contenedor.add(form_Prcs_ReservacionDetalle);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_ReservacionDetalle.getSize();
        form_Prcs_ReservacionDetalle.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_ReservacionDetalle.setVisible(true);
        form_Prcs_ReservacionDetalle.toFront();
        
        bitacora.GuardarEnBitacora("log", "2003");
    }//GEN-LAST:event_MnI_reservacionDetalleActionPerformed

    private void MnI_InicioOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_InicioOrdenActionPerformed
        form_OrdenDeRestaurante = new Prcs_OrdenDeRestaurante();

        Jdp_contenedor.add(form_OrdenDeRestaurante);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_OrdenDeRestaurante.getSize();
        form_OrdenDeRestaurante.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_OrdenDeRestaurante.setVisible(true);
        form_OrdenDeRestaurante.toFront();
    }//GEN-LAST:event_MnI_InicioOrdenActionPerformed

    private void MnI_CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_CheckOutActionPerformed
        // TODO add your handling code here:
        form_Prcs_CheckOut = new Prcs_Check_Out();

        Jdp_contenedor.add(form_Prcs_CheckOut);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_CheckOut.getSize();
        form_Prcs_CheckOut.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_CheckOut.setVisible(true);
        form_Prcs_CheckOut.toFront();
        bitacora.GuardarEnBitacora("log", "2205");
    }//GEN-LAST:event_MnI_CheckOutActionPerformed

    private void MnI_CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_CheckInActionPerformed
        // TODO add your handling code here:
        form_Prcs_CheckIn = new Prcs_Check_In();

        Jdp_contenedor.add(form_Prcs_CheckIn);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_CheckIn.getSize();
        form_Prcs_CheckIn.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_CheckIn.setVisible(true);
        form_Prcs_CheckIn.toFront();
        bitacora.GuardarEnBitacora("log", "2204");
    }//GEN-LAST:event_MnI_CheckInActionPerformed

    private void MnI_serviciosExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_serviciosExtrasActionPerformed
        form_Prcs_ServiciosExtras = new Prcs_ServiciosExtras();
        Jdp_contenedor.add(form_Prcs_ServiciosExtras);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_ServiciosExtras.getSize();
        form_Prcs_ServiciosExtras.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_ServiciosExtras.setVisible(true);
        form_Prcs_ServiciosExtras.toFront();
        bitacora.GuardarEnBitacora("log", "2207");
    }//GEN-LAST:event_MnI_serviciosExtrasActionPerformed

    private void MnI_EfectuarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_EfectuarOrdenActionPerformed
        form_DetalleRestaurante = new Prcs_DetalleRestaurante();
        Jdp_contenedor.add(form_DetalleRestaurante);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_DetalleRestaurante.getSize();
        form_DetalleRestaurante.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_DetalleRestaurante.setVisible(true);
        form_DetalleRestaurante.toFront();
        bitacora.GuardarEnBitacora("log", "2207");
    }//GEN-LAST:event_MnI_EfectuarOrdenActionPerformed

    private void MnI_IngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_IngredienteActionPerformed
        form_IngredienteMenu = new Prcs_IngredienteMenu();
        Jdp_contenedor.add(form_IngredienteMenu);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_IngredienteMenu.getSize();
        form_IngredienteMenu.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_IngredienteMenu.setVisible(true);
        form_IngredienteMenu.toFront();
        bitacora.GuardarEnBitacora("log", "2207");
    }//GEN-LAST:event_MnI_IngredienteActionPerformed

    private void MnI_ViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_ViajeActionPerformed
        // TODO add your handling code here:
        form_Viaje = new Prcs_Viaje();
        Jdp_contenedor.add(form_Viaje);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Viaje.getSize();
        form_Viaje.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Viaje.setVisible(true);
        form_Viaje.toFront();
        bitacora.GuardarEnBitacora("log", "2222");
    }//GEN-LAST:event_MnI_ViajeActionPerformed

    private void MnI_CocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_CocinaActionPerformed
        // TODO add your handling code here:
        form_Prcs_cocina_Restaurante = new Prcs_cocinaRestaurante();
        Jdp_contenedor.add(form_Prcs_cocina_Restaurante);
        Dimension desktopSize = Jdp_contenedor.getSize();
        Dimension FrameSize = form_Prcs_cocina_Restaurante.getSize();
        form_Prcs_cocina_Restaurante.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form_Prcs_cocina_Restaurante.setVisible(true);
        form_Prcs_cocina_Restaurante.toFront();
        bitacora.GuardarEnBitacora("log", "2215");
    }//GEN-LAST:event_MnI_CocinaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoteleria_MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu Btn_cerrarSesion;
    private javax.swing.JDesktopPane Jdp_contenedor;
    public static javax.swing.JMenuItem MnI_CheckIn;
    public static javax.swing.JMenuItem MnI_CheckOut;
    public static javax.swing.JMenuItem MnI_Cocina;
    public static javax.swing.JMenuItem MnI_ConsultaLimpieza;
    public static javax.swing.JMenuItem MnI_EfectuarOrden;
    public static javax.swing.JMenuItem MnI_Gobernanta;
    public static javax.swing.JMenuItem MnI_Ingrediente;
    public static javax.swing.JMenuItem MnI_InicioOrden;
    public static javax.swing.JMenuItem MnI_Limpieza;
    public static javax.swing.JMenuItem MnI_ObjetosPerdidosE;
    public static javax.swing.JMenuItem MnI_RegistroObjetoPerdido;
    public static javax.swing.JMenuItem MnI_SupervisiónLimpieza;
    public static javax.swing.JMenuItem MnI_Viaje;
    public static javax.swing.JMenuItem MnI_asingacionServiciosHabitacion;
    public static javax.swing.JMenuItem MnI_habitaciones;
    public static javax.swing.JMenuItem MnI_horario;
    public static javax.swing.JMenuItem MnI_huespedes;
    public static javax.swing.JMenuItem MnI_menu;
    public static javax.swing.JMenuItem MnI_piso;
    public static javax.swing.JMenuItem MnI_reservacion;
    public static javax.swing.JMenuItem MnI_reservacionDetalle;
    public static javax.swing.JMenuItem MnI_servicios;
    public static javax.swing.JMenuItem MnI_serviciosExtras;
    public static javax.swing.JMenuItem MnI_tarifas;
    public static javax.swing.JMenuBar Mnb_menu;
    public static javax.swing.JMenu Mnu_mantenimientos;
    public static final javax.swing.JMenu Mnu_procesos = new javax.swing.JMenu();
    public static javax.swing.JMenu Sbm_archivos;
    public static javax.swing.JMenu Sbm_ayuda;
    public static javax.swing.JMenu Sbm_catalogo;
    public static javax.swing.JMenu Sbm_herramientas;
    public static javax.swing.JMenu Sbm_procesos;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
