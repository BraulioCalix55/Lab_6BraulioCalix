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
            fw = new FileWriter(archivo, false);
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
                    }if (listaCri.get(i).getDelitos().get(i) instanceof violacion) {
                        bw.write("violacion;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((violacion) listaCri.get(i).getDelitos().get(i)).getEdad_vic() + ";");
                    }if (listaCri.get(i).getDelitos().get(i) instanceof robo) {
                        bw.write("robo;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((robo) listaCri.get(i).getDelitos().get(i)).getNombre_objeto()+ ";");
                        bw.write(((robo) listaCri.get(i).getDelitos().get(i)).getValor() + ";");
                    }if (listaCri.get(i).getDelitos().get(i) instanceof trafico) {
                        bw.write("trafico de drogas;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((trafico) listaCri.get(i).getDelitos().get(i)).getDroga()+ ";");
                        bw.write(((trafico) listaCri.get(i).getDelitos().get(i)).getPeso()+ ";");
                    }if (listaCri.get(i).getDelitos().get(i) instanceof trafico) {
                        bw.write("secuestro ;");
                        bw.write(listaCri.get(i).getDelitos().get(i).getDescri() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getTipo() + ";");
                        bw.write(listaCri.get(i).getDelitos().get(i).getCulpable() + ";");
                        bw.write(((secuestro) listaCri.get(i).getDelitos().get(i)).getDias()+ ";");
                        bw.write(((secuestro) listaCri.get(i).getDelitos().get(i)).getEdad_vic()+ ";");
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
                while (sc.hasNext()) {
                    int c, e;
                    String n;
                    boolean m;

                    c = sc.nextInt();
                    n = sc.next();
                    e = sc.nextInt();
                    listaCri.add(new Criminales(n, n, true, true, true, true, true, true));
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
}
