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
 * @author alumno
 */
public class EntreCodigosProveedores extends javax.swing.JFrame {

    /**
     * Creates new form EntreCodigos
     */
    public EntreCodigosProveedores() {
        initComponents();
    }

    String codMin;
    String codMax;
    Connection conexion;
    String url = "jdbc:mysql://localhost/tienda";
    String usuario = "johann";
    String contrasenia = "manager";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imprimir = new javax.swing.JButton();
        textoCodigo1 = new javax.swing.JLabel();
        textoCodigo2 = new javax.swing.JLabel();
        codigo1 = new javax.swing.JTextField();
        codigo2 = new javax.swing.JTextField();
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

        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        textoCodigo1.setText("1º codigo");

        textoCodigo2.setText("2º codigo");

        codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo1ActionPerformed(evt);
            }
        });
        codigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigo1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigo1KeyTyped(evt);
            }
        });

        codigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo2ActionPerformed(evt);
            }
        });
        codigo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigo2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigo2KeyTyped(evt);
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
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCodigo2)
                    .addComponent(textoCodigo1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imprimir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigo1)
                    .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigo2)
                    .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(imprimir)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo2ActionPerformed

    private void codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1ActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        String codMinText = this.codigo1.getText();
        String codMaxText = this.codigo2.getText();

        if (!codMinText.isEmpty() && !codMaxText.isEmpty()) {
            try {
                codMin = codMinText;
                codMax = codMaxText;
                generarIReport();
                vacios();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese números válidos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese ambos códigos.");
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new Mantenimiento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void graficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficosActionPerformed
        new Graficos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_graficosActionPerformed

    private void entreCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreCodigoActionPerformed
        new EntreCodigosProveedores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_entreCodigoActionPerformed

    private void codigo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1KeyPressed

    private void codigo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo2KeyPressed

    private void codigo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1KeyReleased

    private void codigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo1KeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter no es un dígito
        if (!Character.isDigit(c)) {
            evt.consume(); // Consumir el evento si no es un dígito
            return;
        }

        // Verificar si la longitud actual del texto es mayor o igual a 4
        if (codigo1.getText().length() >= 6) {
            evt.consume(); // Consumir el evento si ya hay 4 caracteres
        }
    }//GEN-LAST:event_codigo1KeyTyped

    private void codigo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
            return;
        }

        if (codigo2.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_codigo2KeyTyped

    public void vacios() {
        codigo1.setText("");
        codigo2.setText("");
    }

    public void generarIReport() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contrasenia);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            conexion = null;
        }

        if (!codigo1.getText().isEmpty() && !codigo2.getText().isEmpty()) {
            // Recoger los valores de los códigos
            codMin = codigo1.getText();
            codMax = codigo2.getText();

            String informeOrigen = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Proyecto-Final-Interfaces-master\\src\\main\\java\\ireportEntreCodigos\\reportProveedores.jasper";
            String informeDestino = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Proyecto-Final-Interfaces-master\\src\\main\\java\\ireportEntreCodigos\\reportProveedores.pdf";

            Map parametros = new HashMap<>();
            parametros.put("codMin", codMin);
            parametros.put("codMax", codMax);

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
            java.util.logging.Logger.getLogger(EntreCodigosProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntreCodigosProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntreCodigosProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntreCodigosProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntreCodigosProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu PC;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codigo2;
    private javax.swing.JMenu consultas;
    private javax.swing.JMenuItem entreCodigo;
    private javax.swing.JMenuItem graficos;
    private javax.swing.JButton imprimir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu listado;
    private javax.swing.JMenu mantenimiento;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel textoCodigo1;
    private javax.swing.JLabel textoCodigo2;
    private javax.swing.JMenuItem volver;
    // End of variables declaration//GEN-END:variables
}
