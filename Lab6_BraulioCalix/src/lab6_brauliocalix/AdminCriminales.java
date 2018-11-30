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

    public void setCriminal(Criminales p) {
        this.listaCri.add(p);
    }

    @Override
    public String toString() {
        return "AdminCriminales{" + "listaCri=" + listaCri + ", archivo=" + archivo + '}';
    }

    public void escribircriminales() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        //archivo= new File("/.Criminales.txt");
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < listaCri.size(); i++) {
                bw.write(listaCri.get(i).getNombre() + ";");
                bw.write(listaCri.get(i).getEdad() + ";");
                bw.write(listaCri.get(i).getID() + ";");
                bw.write(listaCri.get(i).getN_celda() + ";");
                bw.write(listaCri.get(i).getAños() + ";");
                escribirdelitos(listaCri.get(i));

            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void escribirdelitos(Criminales cri) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        archivo = new File("./Delitos.txt");
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            if (listaCri.size() > 0) {
                for (int i = 0; i < cri.getDelitos().size(); i++) {

                    if (cri.getDelitos().get(i) instanceof asesinato) {
                        bw.write("asesinato;");
                        bw.write(cri.getDelitos().get(i).getDescri() + ";");
                        bw.write(cri.getDelitos().get(i).getTipo() + ";");
                        bw.write(cri.getDelitos().get(i).getCulpable() + ";");
                        bw.write(((asesinato) cri.getDelitos().get(i)).getArma() + ";");
                        bw.write(((asesinato) cri.getDelitos().get(i)).getN_victima() + ";");
                    }
                    if (cri.getDelitos().get(i) instanceof violacion) {
                        bw.write("violacion;");
                        bw.write(cri.getDelitos().get(i).getDescri() + ";");
                        bw.write(cri.getDelitos().get(i).getTipo() + ";");
                        bw.write(cri.getDelitos().get(i).getCulpable() + ";");
                        bw.write(((violacion) cri.getDelitos().get(i)).getEdad_vic() + ";");
                    }
                    if (cri.getDelitos().get(i) instanceof robo) {
                        bw.write("robo;");
                        bw.write(cri.getDelitos().get(i).getDescri() + ";");
                        bw.write(cri.getDelitos().get(i).getTipo() + ";");
                        bw.write(cri.getDelitos().get(i).getCulpable() + ";");
                        bw.write(((robo) cri.getDelitos().get(i)).getNombre_objeto() + ";");
                        bw.write(((robo) cri.getDelitos().get(i)).getValor() + ";");
                    }
                    if (cri.getDelitos().get(i) instanceof trafico) {
                        bw.write("trafico de drogas;");
                        bw.write(cri.getDelitos().get(i).getDescri() + ";");
                        bw.write(cri.getDelitos().get(i).getTipo() + ";");
                        bw.write(cri.getDelitos().get(i).getCulpable() + ";");
                        bw.write(((trafico) cri.getDelitos().get(i)).getDroga() + ";");
                        bw.write(((trafico) cri.getDelitos().get(i)).getPeso() + ";");
                    }
                    if (cri.getDelitos().get(i) instanceof trafico) {
                        bw.write("secuestro;");
                        bw.write(cri.getDelitos().get(i).getDescri() + ";");
                        bw.write(cri.getDelitos().get(i).getTipo() + ";");
                        bw.write(cri.getDelitos().get(i).getCulpable() + ";");
                        bw.write(((secuestro) cri.getDelitos().get(i)).getDias() + ";");
                        bw.write(((secuestro) cri.getDelitos().get(i)).getEdad_vic() + ";");
                    }

                }

            }
            bw.write("/");
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarCriminales() {
        Scanner sc = null;
        listaCri = new ArrayList();
        archivo = new File("./Criminales.txt");
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
                    System.out.println("cargar");
                    ArrayList temp = new ArrayList(cargardelitos());

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
            fw = new FileWriter("./Expediente.txt", false);
            bw = new BufferedWriter(fw);
            bw.write("Nombre: " + cri.getNombre());
            bw.write("");
            bw.write("\nedad: " + cri.getEdad());
            bw.write("");
            bw.write("\nnumero de ID: " + cri.getID());
            bw.write("");
            bw.write("\nnumero de celda " + cri.getN_celda());
            bw.write("");
            bw.write("\ndelitos: ");
            for (int i = 0; i < cri.getDelitos().size(); i++) {

                bw.write(i + ")" + cri.getDelitos().get(i).toString() + "\n");
                bw.write("");
            }
            bw.write("años por cumplir: " + cri.getAños());
            bw.write("");
            bw.flush();
        } catch (Exception e) {

        }
    }

    public ArrayList cargardelitos() {
        ArrayList temp = new ArrayList();

        Scanner sc2 = null;
        Scanner sc3=null;
        System.out.println("delitos");
        listaCri = new ArrayList();
        archivo = new File("./Delitos.txt");
        if (archivo.exists()) {
            try {

                sc3 = new Scanner(archivo);
                sc3 = sc3.useDelimiter("/");
                sc2= sc3.useDelimiter(";");

                while (sc3.hasNext()) {
                    while (sc2.hasNext()) {
                       String crimen = sc2.next();
                    System.out.println("crimen" + crimen);
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
                        String nada = sc2.next();
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

                sc2.close();
            }
        }
        return temp;
    }
}
