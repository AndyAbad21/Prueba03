/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 * 
 * @author Andy Abad
 */
public class Candidato 
{
    private String nombre;
    private int edad;
    private String pais;
    private String identificacion;

    public Candidato(String nombre, int edad, String pais, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", edad=" + edad + ", pais=" + pais + ", identificacion=" + identificacion + '}';
    }

    
    
}
