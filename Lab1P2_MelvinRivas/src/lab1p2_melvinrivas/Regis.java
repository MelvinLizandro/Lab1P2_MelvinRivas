/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1p2_melvinrivas;

import java.util.Date;

/**
 *
 * @author l3306
 */
class Regis {

    String nombre;
    String apellido;
    Date fecha;
    String correo;
    String contraseña;

    public Regis(String nombre, String apellido, Date fecha, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Regis{" + "nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }

}
