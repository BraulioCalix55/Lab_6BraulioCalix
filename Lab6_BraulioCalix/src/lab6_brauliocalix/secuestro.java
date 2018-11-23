/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_brauliocalix;

/**
 *
 * @author User
 */
public class secuestro extends delitos{
    private String dias;
    private String edad_vic;

    public secuestro() {
    }

    public secuestro(String dias, String edad_vic, String descri, String tipo, String culpable) {
        super(descri, tipo, culpable);
        this.dias = dias;
        this.edad_vic = edad_vic;
    }

    

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getEdad_vic() {
        return edad_vic;
    }

    public void setEdad_vic(String edad_vic) {
        this.edad_vic = edad_vic;
    }

    @Override
    public String toString() {
        return "secuestro{" + "dias=" + dias + ", edad_vic=" + edad_vic + '}';
    }
    
}
