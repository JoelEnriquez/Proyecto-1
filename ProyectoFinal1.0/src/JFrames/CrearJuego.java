/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Main.MenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author joel
 */
public class CrearJuego extends javax.swing.JFrame {

    private int numeroColumnas;
    private int numeroFilas;
    
    public CrearJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
        ingresarInfojPanel.setVisible(true);
        //modificarTablerojPanel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajeTextoVaciojDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        textCamposClasejLabel = new javax.swing.JLabel();
        warningjLabel = new javax.swing.JLabel();
        aceptarjButton = new javax.swing.JButton();
        ingresarInfojPanel = new javax.swing.JPanel();
        textoPorcentajeHipotecajLabel = new javax.swing.JLabel();
        textoIngreseNombrejLabel = new javax.swing.JLabel();
        nombreJuegojTextField = new javax.swing.JTextField();
        textoCantidadJugadoresjLabel = new javax.swing.JLabel();
        textoDineroInicialjLabel = new javax.swing.JLabel();
        porcentajeHipotecajSpinner = new javax.swing.JSpinner();
        textoLimiteCasasjLabel = new javax.swing.JLabel();
        dineroInicialjSpinner = new javax.swing.JSpinner();
        dineroPorVueltajSpinner = new javax.swing.JSpinner();
        textoLimiteHotelesjLabel = new javax.swing.JLabel();
        textoDineroPorVueltajLabel = new javax.swing.JLabel();
        textoNumeroDadosjLabel = new javax.swing.JLabel();
        limiteCasasjSpinner = new javax.swing.JSpinner();
        limiteHotelesjSpinner = new javax.swing.JSpinner();
        noJugadoresjComboBox = new javax.swing.JComboBox<>();
        noDadosjComboBox = new javax.swing.JComboBox<>();
        crearTablerojButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();
        regresarMenuPrincipaljButton = new javax.swing.JButton();
        textoNumeroColumnasjLabel = new javax.swing.JLabel();
        noColumnasjSpinner = new javax.swing.JSpinner();
        textoNumeroFilasjLabel = new javax.swing.JLabel();
        noFilasjSpinner = new javax.swing.JSpinner();
        jLabelFondoCrearJuego = new javax.swing.JLabel();

        mensajeTextoVaciojDialog.setModal(true);
        mensajeTextoVaciojDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textCamposClasejLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textCamposClasejLabel.setForeground(new java.awt.Color(0, 0, 0));
        textCamposClasejLabel.setText("Campos requeridos incompletos!!!");
        jPanel1.add(textCamposClasejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 410, 70));

        warningjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alerta.png"))); // NOI18N
        jPanel1.add(warningjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        aceptarjButton.setText("Aceptar");
        aceptarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 201, 120, 40));

        mensajeTextoVaciojDialog.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 270));

        mensajeTextoVaciojDialog.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarInfojPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoPorcentajeHipotecajLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoPorcentajeHipotecajLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoPorcentajeHipotecajLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoPorcentajeHipotecajLabel.setText("Porcentaje de Hipoteca");
        textoPorcentajeHipotecajLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoPorcentajeHipotecajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 280, 40));

        textoIngreseNombrejLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoIngreseNombrejLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoIngreseNombrejLabel.setText("Ingrese el Nombre del Juego:");
        textoIngreseNombrejLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoIngreseNombrejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 360, 40));

        nombreJuegojTextField.setBackground(new java.awt.Color(255, 255, 211));
        nombreJuegojTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        nombreJuegojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreJuegojTextFieldActionPerformed(evt);
            }
        });
        ingresarInfojPanel.add(nombreJuegojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 290, 40));

        textoCantidadJugadoresjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoCantidadJugadoresjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoCantidadJugadoresjLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoCantidadJugadoresjLabel.setText("Cantidad de Jugadores (1-6)");
        textoCantidadJugadoresjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoCantidadJugadoresjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 360, 40));

        textoDineroInicialjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoDineroInicialjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoDineroInicialjLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoDineroInicialjLabel.setText("Dinero Inicial (Por Jugador)");
        textoDineroInicialjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoDineroInicialjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 360, 40));

        porcentajeHipotecajSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        porcentajeHipotecajSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        ingresarInfojPanel.add(porcentajeHipotecajSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 100, 40));

        textoLimiteCasasjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoLimiteCasasjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoLimiteCasasjLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoLimiteCasasjLabel.setText("Limite de Casas");
        textoLimiteCasasjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoLimiteCasasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 190, 40));

        dineroInicialjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        dineroInicialjSpinner.setModel(new javax.swing.SpinnerNumberModel(500, 1, null, 100));
        ingresarInfojPanel.add(dineroInicialjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 100, 40));

        dineroPorVueltajSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        dineroPorVueltajSpinner.setModel(new javax.swing.SpinnerNumberModel(200, 1, null, 25));
        ingresarInfojPanel.add(dineroPorVueltajSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 100, 40));

        textoLimiteHotelesjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoLimiteHotelesjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoLimiteHotelesjLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoLimiteHotelesjLabel.setText("Limite de Hoteles");
        textoLimiteHotelesjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoLimiteHotelesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 220, 40));

        textoDineroPorVueltajLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoDineroPorVueltajLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoDineroPorVueltajLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoDineroPorVueltajLabel.setText("Dinero por Vuelta");
        textoDineroPorVueltajLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoDineroPorVueltajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, 40));

        textoNumeroDadosjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoNumeroDadosjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoNumeroDadosjLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoNumeroDadosjLabel.setText("Numero de Dados");
        textoNumeroDadosjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoNumeroDadosjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 220, 40));

        limiteCasasjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        limiteCasasjSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        ingresarInfojPanel.add(limiteCasasjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 100, 40));

        limiteHotelesjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        limiteHotelesjSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        ingresarInfojPanel.add(limiteHotelesjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 100, 40));

        noJugadoresjComboBox.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        noJugadoresjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        ingresarInfojPanel.add(noJugadoresjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 100, 40));

        noDadosjComboBox.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        noDadosjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        ingresarInfojPanel.add(noDadosjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 100, 40));

        crearTablerojButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        crearTablerojButton.setText("Crear Tablero");
        crearTablerojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablerojButtonActionPerformed(evt);
            }
        });
        ingresarInfojPanel.add(crearTablerojButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 390, 60));

        savejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        savejButton.setToolTipText("Guardar");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });
        ingresarInfojPanel.add(savejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 120, 110));

        regresarMenuPrincipaljButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        regresarMenuPrincipaljButton.setToolTipText("Retornar al Menu Principal");
        regresarMenuPrincipaljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMenuPrincipaljButtonActionPerformed(evt);
            }
        });
        ingresarInfojPanel.add(regresarMenuPrincipaljButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 110));

        textoNumeroColumnasjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoNumeroColumnasjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoNumeroColumnasjLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoNumeroColumnasjLabel.setText("Numero de Columnas");
        textoNumeroColumnasjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoNumeroColumnasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 250, 40));

        noColumnasjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        noColumnasjSpinner.setModel(new javax.swing.SpinnerNumberModel(2, 2, 25, 1));
        ingresarInfojPanel.add(noColumnasjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 100, 40));

        textoNumeroFilasjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoNumeroFilasjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoNumeroFilasjLabel.setForeground(new java.awt.Color(27, 185, 146));
        textoNumeroFilasjLabel.setText("Numero de Filas");
        textoNumeroFilasjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        ingresarInfojPanel.add(textoNumeroFilasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 200, 40));

        noFilasjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        noFilasjSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 25, 1));
        ingresarInfojPanel.add(noFilasjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 100, 40));

        getContentPane().add(ingresarInfojPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 900, 490));
        //jPanelIngresarInfo.setOpaque(false);

        jLabelFondoCrearJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearMapa (1).jpg"))); // NOI18N
        getContentPane().add(jLabelFondoCrearJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreJuegojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreJuegojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreJuegojTextFieldActionPerformed

    private void regresarMenuPrincipaljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMenuPrincipaljButtonActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarMenuPrincipaljButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        if (nombreJuegojTextField.getText().isEmpty() ) {
            mensajeTextoVaciojDialog.setVisible(true);
            //JOptionPane.showMessageDialog(null, "Por favor ingrese todos los campos requeridos");
            
        }
        
        String nombreJuego = nombreJuegojTextField.getText().trim(); //Capturar el nombre y eliminar espacios en blanco sobrantes
        int numeroJugadores = Integer.parseInt(noJugadoresjComboBox.getSelectedItem().toString());
        int limiteCasas = (Integer) limiteCasasjSpinner.getValue();
        int limiteHoteles = (Integer) limiteHotelesjSpinner.getValue();
        int dineroInicialJugador = (Integer) dineroInicialjSpinner.getValue();
        int dineroPorVuelta = (Integer) dineroPorVueltajSpinner.getValue();
        int porcentajeHipoteca = (Integer) porcentajeHipotecajSpinner.getValue();
        int numeroDados = Integer.parseInt(noDadosjComboBox.getSelectedItem().toString());
        numeroColumnas = (Integer) noColumnasjSpinner.getValue();
        numeroFilas = (Integer) noFilasjSpinner.getValue();

    }//GEN-LAST:event_savejButtonActionPerformed

    
    private void crearTablerojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTablerojButtonActionPerformed
        numeroColumnas = (Integer) noColumnasjSpinner.getValue();
        numeroFilas = (Integer) noFilasjSpinner.getValue();
        
        CrearTablero crear = new CrearTablero(numeroColumnas, numeroFilas);
        
        crear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearTablerojButtonActionPerformed

    private void aceptarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarjButtonActionPerformed
        mensajeTextoVaciojDialog.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_aceptarjButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarjButton;
    private javax.swing.JButton crearTablerojButton;
    private javax.swing.JSpinner dineroInicialjSpinner;
    private javax.swing.JSpinner dineroPorVueltajSpinner;
    private javax.swing.JPanel ingresarInfojPanel;
    private javax.swing.JLabel jLabelFondoCrearJuego;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner limiteCasasjSpinner;
    private javax.swing.JSpinner limiteHotelesjSpinner;
    private javax.swing.JDialog mensajeTextoVaciojDialog;
    private javax.swing.JSpinner noColumnasjSpinner;
    private javax.swing.JComboBox<String> noDadosjComboBox;
    private javax.swing.JSpinner noFilasjSpinner;
    private javax.swing.JComboBox<String> noJugadoresjComboBox;
    private javax.swing.JTextField nombreJuegojTextField;
    private javax.swing.JSpinner porcentajeHipotecajSpinner;
    private javax.swing.JButton regresarMenuPrincipaljButton;
    private javax.swing.JButton savejButton;
    private javax.swing.JLabel textCamposClasejLabel;
    private javax.swing.JLabel textoCantidadJugadoresjLabel;
    private javax.swing.JLabel textoDineroInicialjLabel;
    private javax.swing.JLabel textoDineroPorVueltajLabel;
    private javax.swing.JLabel textoIngreseNombrejLabel;
    private javax.swing.JLabel textoLimiteCasasjLabel;
    private javax.swing.JLabel textoLimiteHotelesjLabel;
    private javax.swing.JLabel textoNumeroColumnasjLabel;
    private javax.swing.JLabel textoNumeroDadosjLabel;
    private javax.swing.JLabel textoNumeroFilasjLabel;
    private javax.swing.JLabel textoPorcentajeHipotecajLabel;
    private javax.swing.JLabel warningjLabel;
    // End of variables declaration//GEN-END:variables
}