/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_brauliocalix;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AdminCriminales {
    
    private ArrayList<Criminales> listaCri = new ArrayList();
    private File archivo = null;
    
    public AdminCriminales(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Criminales> getListaCri() {
        return listaCri;
    }
    
    public void setListaCri(ArrayList<Criminales> listaCri) {
        this.listaCri = listaCri;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    @Override
    public String toString() {
        return "AdminCriminales{" + "listaCri=" + listaCri + ", archivo=" + archivo + '}';
    }
    
    public void escribircriminales() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < listaCri.size(); i++) {
                bw.write(listaCri.get(i).getNombre() + ";");
                bw.write(listaCri.get(i).getEdad() + ";");
                bw.write(listaCri.get(i).getID() + ";");
                bw.write(listaCri.get(i).getN_celda() + ";");
                bw.write(listaCri.get(i).getAños() + ";");
            }
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void escribirdelitos() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < listaCri.size(); i++) {
                for (int j = 0; j < listaCri.get(i).getDelitos().size(); j++) {
                    if (listaCri.get(i).getDelitos().get(i) instanceof asesinato) {
                        bw.write("asesinato;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((asesinato) listaCri.get(i).getDelitos().get(i)).getArma() + ";");
                        bw.write(((asesinato) listaCri.get(i).getDelitos().get(i)).getN_victima() + ";");
                    }
                    if (listaCri.get(i).getDelitos().get(i) instanceof violacion) {
                        bw.write("violacion;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((violacion) listaCri.get(i).getDelitos().get(i)).getEdad_vic() + ";");
                    }
                    if (listaCri.get(i).getDelitos().get(i) instanceof robo) {
                        bw.write("robo;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((robo) listaCri.get(i).getDelitos().get(i)).getNombre_objeto() + ";");
                        bw.write(((robo) listaCri.get(i).getDelitos().get(i)).getValor() + ";");
                    }
                    if (listaCri.get(i).getDelitos().get(i) instanceof trafico) {
                        bw.write("trafico de drogas;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((trafico) listaCri.get(i).getDelitos().get(i)).getDroga() + ";");
                        bw.write(((trafico) listaCri.get(i).getDelitos().get(i)).getPeso() + ";");
                    }
                    if (listaCri.get(i).getDelitos().get(i) instanceof trafico) {
                        bw.write("secuestro;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((secuestro) listaCri.get(i).getDelitos().get(i)).getDias() + ";");
                        bw.write(((secuestro) listaCri.get(i).getDelitos().get(i)).getEdad_vic() + ";");
                    }
                }
                bw.write("/");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarCriminales() {
        Scanner sc = null;
        listaCri = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                int con = 0;
                while (sc.hasNext()) {
                    String nombre = sc.next();
                    int edad = sc.nextInt();
                    String id = sc.next();
                    String celda = sc.next();
                    String anios = sc.next();
                    ArrayList temp = new ArrayList();
                    temp.addAll(cargardelitos("./Delitos"));
                    listaCri.add(new Criminales(nombre, edad, id, celda, anios, temp));
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
    
    public void expediente(Criminales cri) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write("Nombre: " + cri.getNombre());
            bw.write("\nedad: " + cri.getEdad());
            bw.write("\nnumero de ID: " + cri.getID());
            bw.write("\nnumero de celda "+cri.getN_celda());
            bw.write("\ndelitos: ");
            for (int i = 0; i < cri.getDelitos().size(); i++) {
                bw.write(i+")"+cri.getDelitos().get(i).toString()+"\n");
            }
            bw.write("años por cumplir: "+cri.getAños());
        } catch (Exception e) {
        
        }
    }
    
    public ArrayList cargardelitos( String ruta) {
        ArrayList temp = new ArrayList();
        Scanner sc = null;
        Scanner sc2 = null;
        listaCri = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(ruta);
                sc2 = new Scanner(ruta);
                sc.useDelimiter("/");
                sc2 = sc.useDelimiter(";");
                while (sc.hasNext()) {
                    while (sc2.hasNext()) {
                        String crimen = sc2.next();
                        String desc = sc2.next();
                        String nivel = sc2.next();
                        String culpa = sc2.next();
                        
                        if (crimen.equals("asesinato")) {
                            String arma = sc2.next();
                            String vict = sc2.next();
                            temp.add(new asesinato(arma, vict, desc, nivel, culpa));
                            //(String arma, String n_victima, String descri, String tipo, String culpable) 
                        }
                        if (crimen.equals("violacion")) {
                            String edadvi = sc2.next();
                            //String edad_vic, String descri, String tipo, String culpable
                            temp.add(new violacion(edadvi, desc, nivel, culpa));
                        }
                        if (crimen.equals("robo")) {
                            String objeto = sc2.next();
                            String precio = sc2.next();
                            //String nombre_objeto, String valor, String descri, String tipo, String culpable
                            temp.add(new robo(objeto, precio, desc, nivel, culpa));
                        }
                        if (crimen.equals("trafico de drogas")) {
                            String droga = sc2.next();
                            String peso = sc2.next();
                            //String droga, String peso, String descri, String tipo, String culpable
                            temp.add(new trafico(droga, peso, desc, nivel, culpa));
                        }
                        if (crimen.equals("secuestro")) {
                            String dias = sc2.next();
                            String edad = sc2.next();
                            //String dias, String edad_vic, String descri, String tipo, String culpable
                            temp.add(new secuestro(dias, edad, desc, nivel, culpa));
                        }
                        
                    }
                }
            } catch (Exception e) {
            } finally {
                sc.close();
                sc2.close();
            }
        }
        return temp;
    }
}
