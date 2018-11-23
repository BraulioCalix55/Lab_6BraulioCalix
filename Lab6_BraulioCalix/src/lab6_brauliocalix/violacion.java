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
public class violacion extends delitos{
    private String edad_vic;

    public violacion() {
    }

    public violacion(String edad_vic, String descri, String tipo, String culpable) {
        super(descri, tipo, culpable);
        this.edad_vic = edad_vic;
    }

    public String getEdad_vic() {
        return edad_vic;
    }

    public void setEdad_vic(String edad_vic) {
        this.edad_vic = edad_vic;
    }

    @Override
    public String toString() {
        return "violacion "+super.getDescri()+" " +super.getTipo()+" "+super.getCulpable()+" "+edad_vic ;
        //return "secuestro: " + super.getDescri()+" " +super.getTipo()+" "+super.getCulpable()+
    }
    
}
