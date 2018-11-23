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
public class trafico extends delitos{
    private String droga;
    private String peso;

    public trafico() {
    }

    public trafico(String droga, String peso, String descri, String tipo, String culpable) {
        super(descri, tipo, culpable);
        this.droga = droga;
        this.peso = peso;
    }

    public String getDroga() {
        return droga;
    }

    public void setDroga(String droga) {
        this.droga = droga;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "trafico{" + "droga=" + droga + ", peso=" + peso + '}';
    }
    
}
