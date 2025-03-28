/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class PorCodigo extends javax.swing.JFrame {

    /**
     * Creates new form PorCodigo
     */
    public PorCodigo() {
        initComponents();
    }

    String buscarCodigo;
    Connection conexion;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        imprimir = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        mantenimiento = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        volver = new javax.swing.JMenuItem();
        consultas = new javax.swing.JMenu();
        PC = new javax.swing.JMenu();
        listado = new javax.swing.JMenu();
        graficos = new javax.swing.JMenuItem();
        entreCodigo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });

        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        mantenimiento.setText("Mantenimiento");
        mantenimiento.add(jSeparator1);

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        mantenimiento.add(volver);

        menu.add(mantenimiento);

        consultas.setText("Consultas");

        PC.setText("Por Codigo");

        listado.setText("Listado");

        graficos.setText("Graficos");
        graficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficosActionPerformed(evt);
            }
        });
        listado.add(graficos);

        entreCodigo.setText("Entre codigos");
        entreCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreCodigoActionPerformed(evt);
            }
        });
        listado.add(entreCodigo);

        PC.add(listado);

        consultas.add(PC);

        menu.add(consultas);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imprimir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(65, 65, 65)
                .addComponent(imprimir)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graficosActionPerformed

    private void entreCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreCodigoActionPerformed
        new EntreCodigos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_entreCodigoActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new Mantenimiento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        String codMinText = this.codigo.getText();

        if (!codMinText.isEmpty()) {
            try {
                buscarCodigo = codMinText;
                generarIReport();
                vacios();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese ambos códigos.");
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
            return;
        }

        if (codigo.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_codigoKeyTyped

    public void vacios() {
        codigo.setText("");
    }

    public void generarIReport() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "johann", "manager");
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            conexion = null;
        }

        if (!codigo.getText().isEmpty()) {
            // Recoger los valores de los códigos
            buscarCodigo = codigo.getText();

            String informeOrigen = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Proyecto-Final-Interfaces-master\\src\\main\\java\\ireportPorCodigo\\reportClientes.jasper";
            String informeDestino = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Proyecto-Final-Interfaces-master\\src\\main\\java\\ireportPorCodigo\\reportClientes.pdf";

            Map parametros = new HashMap<>();
            parametros.put("buscarCodigo", buscarCodigo);

            try {
                JasperPrint jasperPrint = JasperFillManager.fillReport(informeOrigen, parametros, conexion);
                System.out.println("GENERANDO INFORME");

                JasperExportManager.exportReportToPdfFile(jasperPrint, informeDestino);

                // Mostrar el informe
                JasperViewer.viewReport(jasperPrint, false);
            } catch (JRException ex) {
                System.err.print(ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los campos no tienen datos");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PorCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PorCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PorCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PorCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PorCodigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu PC;
    private javax.swing.JTextField codigo;
    private javax.swing.JMenu consultas;
    private javax.swing.JMenuItem entreCodigo;
    private javax.swing.JMenuItem graficos;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu listado;
    private javax.swing.JMenu mantenimiento;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem volver;
    // End of variables declaration//GEN-END:variables
}
