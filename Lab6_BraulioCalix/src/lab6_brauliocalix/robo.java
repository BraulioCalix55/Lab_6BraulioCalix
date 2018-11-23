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
public class robo extends delitos{
    private String nombre_objeto;
    private String valor;

    public robo() {
    }

    public robo(String nombre_objeto, String valor, String descri, String tipo, String culpable) {
        super(descri, tipo, culpable);
        this.nombre_objeto = nombre_objeto;
        this.valor = valor;
    }

    public String getNombre_objeto() {
        return nombre_objeto;
    }

    public void setNombre_objeto(String nombre_objeto) {
        this.nombre_objeto = nombre_objeto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "robo "+ super.getDescri()+" " +super.getTipo()+" "+super.getCulpable()+" "+nombre_objeto+" "+ valor ;
        //super.getDescri()+" " +super.getTipo()+" "+super.getCulpable()+
    }
    
}
