/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ireport;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class Informe {

    public static void main(String[] args) throws SQLException {
        String informeOrigen = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoBBDD1\\Proyecto-Final-Interfaces-master\\src\\main\\java\\ireport\\Informe.jasper";
        String informeDestino = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoBBDD1\\Proyecto-Final-Interfaces-master\\src\\main\\java\\ireport\\Informe.pdf";

        try {
            Conexion conn = new Conexion();

            Map parametro = new HashMap();
            parametro.put("TotalVentas", "");
            JasperPrint jasperPrint = JasperFillManager.fillReport(informeOrigen, parametro, conn.Conexion());

            JasperExportManager.exportReportToHtmlFile(jasperPrint, informeDestino);

            JasperViewer.viewReport(jasperPrint);

        } catch (JRException e) {
            System.err.println(e.getMessage());
        }

    }
}