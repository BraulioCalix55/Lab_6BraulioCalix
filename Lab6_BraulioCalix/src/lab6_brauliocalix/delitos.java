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
public class delitos {

    private String descri;
    private String tipo;
    private String culpable;

    public delitos() {
    }

    public delitos(String descri, String tipo, String culpable) {
        this.descri = descri;
        this.tipo = tipo;
        this.culpable = culpable;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    @Override
    public String toString() {
        return "culpable=" + culpable + '}';
    }

}
