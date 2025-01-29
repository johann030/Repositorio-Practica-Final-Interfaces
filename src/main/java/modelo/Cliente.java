/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alumno
 */
public class Cliente {

    private String codigo;
    private String nif;
    private String apellidos;
    private String nombre;
    private String domicilio;
    private String codigo_postal;
    private String localidad;
    private String telefono;
    private String movil;
    private String fax;
    private String mail;
    private float total_ventas;

    public Cliente() {
    }

    public Cliente(String codigo, String nif, String apellidos, String nombre, String domicilio,
            String CP, String localidad, float total_ventas) {
        this.codigo = codigo;
        this.nif = nif;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.codigo_postal = CP;
        this.localidad = localidad;
        this.total_ventas = total_ventas;
    }

    public Cliente(String codigo, String nif, String apellidos, String nombre, String domicilio,
            String CP, String localidad, String telefono, String movil, String fax, String mail, float total_ventas) {
        this.codigo = codigo;
        this.nif = nif;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.codigo_postal = CP;
        this.localidad = localidad;
        this.telefono = telefono;
        this.movil = movil;
        this.fax = fax;
        this.mail = mail;
        this.total_ventas = total_ventas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public float getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(float total_ventas) {
        this.total_ventas = total_ventas;
    }
}
