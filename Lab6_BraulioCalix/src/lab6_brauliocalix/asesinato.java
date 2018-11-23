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
public class asesinato extends delitos {

    private String arma;
    private String n_victima;

    public asesinato() {
    }

    public asesinato(String arma, String n_victima, String descri, String tipo, String culpable) {
        super(descri, tipo, culpable);
        this.arma = arma;
        this.n_victima = n_victima;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getN_victima() {
        return n_victima;
    }

    public void setN_victima(String n_victima) {
        this.n_victima = n_victima;
    }

    @Override
    public String toString() {
        return "asesinato: " + super.getDescri() + " " + super.getTipo() + " " + super.getCulpable() + " " + arma + " " + n_victima;
    }

}
