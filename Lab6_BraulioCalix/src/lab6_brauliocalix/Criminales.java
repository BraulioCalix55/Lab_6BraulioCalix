/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_brauliocalix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Criminales {
    private String nombre;
    private int edad;
    private String ID;
    private String N_celda;
    private String años;
    private ArrayList <delitos> delitos;

    public Criminales() {
    }

    public Criminales(String nombre, int edad, String ID, String N_celda, String años, ArrayList<delitos> delitos) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.N_celda = N_celda;
        this.años = años;
        this.delitos = delitos;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getN_celda() {
        return N_celda;
    }

    public void setN_celda(String N_celda) {
        this.N_celda = N_celda;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public ArrayList<delitos> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<delitos> delitos) {
        this.delitos = delitos;
    }

    @Override
    public String toString() {
        return "Criminales{" + "nombre=" + nombre + ", edad=" + edad + ", ID=" + ID + ", N_celda=" + N_celda + ", anios=" + años + ", delitos=" + delitos + '}';
    }

    
}
