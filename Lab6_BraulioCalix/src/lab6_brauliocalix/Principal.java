/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_brauliocalix;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    static Scanner lea = new Scanner(System.in);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreaCrimi = new javax.swing.JDialog();
        cri_nom = new javax.swing.JTextField();
        cri_id = new javax.swing.JTextField();
        cri_celda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cri_edad = new javax.swing.JSpinner();
        CrearCrim = new javax.swing.JButton();
        sentencia = new javax.swing.JSpinner();
        menu_criminal = new javax.swing.JPopupMenu();
        modificar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        listardelitos = new javax.swing.JMenuItem();
        agrega_delito = new javax.swing.JMenuItem();
        menu_delito = new javax.swing.JPopupMenu();
        modidelito = new javax.swing.JMenuItem();
        elimideli = new javax.swing.JMenuItem();
        creardelito = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        deli_desc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        deli_nivel = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        deli_culp = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        deli_tipo = new javax.swing.JComboBox<>();
        creadelitos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_delitos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_crimi = new javax.swing.JList<>();
        creacri = new javax.swing.JButton();
        expe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        actualizar_lista = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("nombre");

        jLabel7.setText("id");

        jLabel8.setText("edad");

        jLabel9.setText("años por cumplir");

        jLabel10.setText("celda");

        cri_edad.setModel(new javax.swing.SpinnerNumberModel(19, 19, 60, 1));

        CrearCrim.setText("crear criminal");
        CrearCrim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearCrimMouseClicked(evt);
            }
        });

        sentencia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        javax.swing.GroupLayout CreaCrimiLayout = new javax.swing.GroupLayout(CreaCrimi.getContentPane());
        CreaCrimi.getContentPane().setLayout(CreaCrimiLayout);
        CreaCrimiLayout.setHorizontalGroup(
            CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreaCrimiLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sentencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearCrim)
                    .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cri_nom, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(cri_id)
                        .addComponent(cri_celda))
                    .addComponent(cri_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        CreaCrimiLayout.setVerticalGroup(
            CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreaCrimiLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cri_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cri_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cri_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cri_celda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(CreaCrimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(sentencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(CrearCrim)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        modificar.setText("modificar");
        menu_criminal.add(modificar);

        eliminar.setText("eliminar");
        menu_criminal.add(eliminar);

        listardelitos.setText("listar delitos");
        listardelitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listardelitosActionPerformed(evt);
            }
        });
        menu_criminal.add(listardelitos);

        agrega_delito.setText("agregar delito");
        agrega_delito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrega_delitoActionPerformed(evt);
            }
        });
        menu_criminal.add(agrega_delito);

        modidelito.setText("modificar");
        menu_delito.add(modidelito);

        elimideli.setText("eliminar delito");
        menu_delito.add(elimideli);

        jLabel11.setText("crear delitos");

        jLabel12.setText("descripcion");

        jLabel13.setText("tipo");

        deli_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "leve", "grave", "moderada" }));

        jLabel14.setText("culpable");

        deli_culp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));

        jLabel15.setText("delito");

        deli_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "asesinato", "violacion", "robo", "trafico", "secuestro" }));

        creadelitos.setText("crear delito");
        creadelitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creadelitosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout creardelitoLayout = new javax.swing.GroupLayout(creardelito.getContentPane());
        creardelito.getContentPane().setLayout(creardelitoLayout);
        creardelitoLayout.setHorizontalGroup(
            creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creardelitoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(221, 221, 221))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creardelitoLayout.createSequentialGroup()
                .addGroup(creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creardelitoLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deli_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deli_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deli_culp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(creardelitoLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(deli_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(82, 82, 82))
            .addGroup(creardelitoLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(creadelitos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        creardelitoLayout.setVerticalGroup(
            creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creardelitoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(creardelitoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addComponent(deli_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(deli_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(deli_culp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(creardelitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(deli_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(creadelitos)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista_delitos.setModel(new DefaultListModel());
        lista_delitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_delitosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista_delitos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 130, 209));

        lista_crimi.setModel(new DefaultListModel());
        lista_crimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_crimiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista_crimi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 150, 209));

        creacri.setText("crear criminal");
        creacri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creacriMouseClicked(evt);
            }
        });
        getContentPane().add(creacri, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        expe.setText("Expediente");
        expe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expeMouseClicked(evt);
            }
        });
        getContentPane().add(expe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("lista de delitos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 110, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("lista de criminales");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 110, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("para lista los delitos debe ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("usaur el pop menu en la lista criminales");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        actualizar_lista.setText("Actualizar lista de criminales");
        actualizar_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_listaMouseClicked(evt);
            }
        });
        getContentPane().add(actualizar_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jButton1.setText("guardar todo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6_brauliocalix/celdas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 585, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creacriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creacriMouseClicked
        CreaCrimi.setModal(true);
        CreaCrimi.pack();
        CreaCrimi.setVisible(true);
    }//GEN-LAST:event_creacriMouseClicked

    private void CrearCrimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCrimMouseClicked
        //AdminCriminales ad = new AdminCriminales("./Criminales.txt");
        ad.cargarCriminales();
        try {
            String celda = cri_celda.getText();
            String nombre = cri_nom.getText();
            String id = cri_id.getText();
            int edad = (int) cri_edad.getValue();
            String anios = sentencia.getValue().toString();
            crimi.add(new Criminales(nombre, edad, id, celda, anios, new ArrayList<>()));
            //ad.setArchivo(new File("./Criminales.txt"));
            //ad.setCriminal(new Criminales(nombre, edad, id, celda, anios));
            //ad.getListaCri().get(0).getDelitos().add(new asesinato());
            System.out.println("escri");
            System.out.println("tamano" + ad.getListaCri().size());
            //ad.escribircriminales();
            System.out.println("be");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(CreaCrimi, "no se pudo crear el criminal");
            e.printStackTrace();
        }
        ad.cargarCriminales();
        DefaultListModel modelo = (DefaultListModel) lista_crimi.getModel();
        for (int i = 0; i < crimi.size(); i++) {
            modelo.addElement(crimi.get(i).toString());
        }
        
        cri_celda.setText("");
        cri_nom.setText("");
        cri_id.setText("");
        sentencia.setValue(1);
        cri_edad.setValue(19);
        CreaCrimi.dispose();
    }//GEN-LAST:event_CrearCrimMouseClicked

    private void lista_crimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_crimiMouseClicked
        // TODO add your handling code here:
        if (lista_crimi.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                menu_criminal.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_lista_crimiMouseClicked

    private void lista_delitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_delitosMouseClicked
        // TODO add your handling code here:
        if (lista_delitos.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                menu_delito.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_lista_delitosMouseClicked

    private void actualizar_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_listaMouseClicked
        // AdminCriminales ad = new AdminCriminales("./Criminales.txt");
        ad.cargarCriminales();
        for (int i = 0; i < ad.getListaCri().size(); i++) {
            System.out.println(ad.getListaCri().get(i));
        }
        crimi.addAll(ad.getListaCri());
        DefaultListModel modelo = (DefaultListModel) lista_crimi.getModel();
        for (int i = 0; i < crimi.size(); i++) {
            modelo.addElement(crimi.get(i).toString());
        }
    }//GEN-LAST:event_actualizar_listaMouseClicked

    private void expeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expeMouseClicked
        //AdminCriminales ad = new AdminCriminales("./Criminales.txt");
        ad.cargarCriminales();
        int pos;
        if (lista_crimi.getSelectedIndex() >= 0) {
            pos = lista_crimi.getSelectedIndex();
            ad.expediente(ad.getListaCri().get(pos));
            JOptionPane.showMessageDialog(this, "revise el txt de expediente");
        } else {
            JOptionPane.showMessageDialog(this, "no ha seleccionado ningun criminal de la lista de criminales");
        }
    }//GEN-LAST:event_expeMouseClicked

    private void creadelitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creadelitosMouseClicked
        // TODO add your handling code here:
        // AdminCriminales ad = new AdminCriminales("./Criminales.txt");
        ad.cargarCriminales();
        
        String desc = deli_desc.getText();
        String tipo = (String) deli_nivel.getSelectedItem();
        String culpa = (String) deli_culp.getSelectedItem();
        String delito = (String) deli_tipo.getSelectedItem();
        int posicion = lista_crimi.getSelectedIndex();
        System.out.println(posicion);
        System.out.println(posicion);
        System.out.println("");
        JOptionPane.showMessageDialog(creardelito, "por motivo de confidencialidad debe llenar los demas datos en la consola");
        if (delito.equals("asesinato")) {
            System.out.println("ingrese el arma: ");
            String arma = lea.next();
            System.out.println("ingrese la cantidad de victimas");
            String vict = lea.next();
            //ad.cargarCriminales();
            //ad.getListaCri().get(posicion).getDelitos().add(new asesinato(arma, vict, desc, tipo, culpa));
            crimi.get(posicion).getDelitos().add(new asesinato(arma, vict, desc, tipo, culpa));
        }
        if (delito.equals("violacion")) {
            System.out.println("ingrese la edad de la victima");
            String edadvic = lea.next();
            //ad.cargarCriminales();
            //ad.getListaCri().get(posicion).getDelitos().add(new violacion(edadvic, desc, tipo, culpa));
            crimi.get(posicion).getDelitos().add(new violacion(edadvic, desc, tipo, culpa));
        }
        if (delito.equals("robo")) {
            System.out.println("ingrese el producto que se robo");
            String cosa = lea.next();
            System.out.println("ingrese el vallor del producto robado");
            String precio = lea.next();
            //ad.cargarCriminales();
            //(String nombre_objeto, String valor, String descri, String tipo, String culpable) {
            //ad.getListaCri().get(posicion).getDelitos().add(new robo(cosa, precio, desc, tipo, culpa));
            crimi.get(posicion).getDelitos().add(new robo(cosa, precio, desc, tipo, culpa));
        }
        if (delito.equals("trafico")) {
            System.out.println("ingrese la droga que traficaba");
            String droga = lea.next();
            System.out.println("ingrese el peso de la droga");
            String peso = lea.next();
            //ad.cargarCriminales();
            //(String nombre_objeto, String valor, String descri, String tipo, String culpable) {
            //ad.getListaCri().get(posicion).getDelitos().add(new trafico(droga, peso, desc, tipo, culpa));
            crimi.get(posicion).getDelitos().add(new trafico(droga, peso, desc, tipo, culpa));
        }
        if (delito.equals("secuestro")) {
            System.out.println("ingrese los dias que duro es secuestro");
            String dias = lea.next();
            System.out.println("ingrese la edad de la victima");
            String violado = lea.next();
            //ad.cargarCriminales();
            //(String nombre_objeto, String valor, String descri, String tipo, String culpable) {
            //ad.getListaCri().get(posicion).getDelitos().add(new secuestro(dias, desc, violado, tipo, culpa));
            crimi.get(posicion).getDelitos().add(new secuestro(dias, desc, violado, tipo, culpa));
        }
        /*try {
            ad.escribircriminales();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        JOptionPane.showMessageDialog(creardelito, "ya se agrego el delito");
        creardelito.dispose();
    }//GEN-LAST:event_creadelitosMouseClicked

    private void agrega_delitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrega_delitoActionPerformed
        // TODO add your handling code here:
        creardelito.setModal(true);
        creardelito.pack();
        creardelito.setVisible(true);
    }//GEN-LAST:event_agrega_delitoActionPerformed

    private void listardelitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listardelitosActionPerformed
        //AdminCriminales ad = new AdminCriminales("./Criminales.txt");
        int pos = lista_crimi.getSelectedIndex();
        ad.cargarCriminales();
        DefaultListModel modelo = (DefaultListModel) lista_delitos.getModel();
       /* for (int i = 0; i < ad.getListaCri().get(pos).getDelitos().size(); i++) {
            modelo.addElement(ad.getListaCri().get(pos).getDelitos().get(i).toString());
        }*/
        for (int i = 0; i < crimi.get(pos).getDelitos().size(); i++) {
            modelo.addElement(crimi.get(pos).getDelitos().get(i).toString());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_listardelitosActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ad.setListaCri(crimi);
        try {
            ad.escribircriminales();
            // TODO add your handling code here:
        } catch (IOException ex) {
            //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CreaCrimi;
    private javax.swing.JButton CrearCrim;
    private javax.swing.JButton actualizar_lista;
    private javax.swing.JMenuItem agrega_delito;
    private javax.swing.JButton creacri;
    private javax.swing.JButton creadelitos;
    private javax.swing.JDialog creardelito;
    private javax.swing.JTextField cri_celda;
    private javax.swing.JSpinner cri_edad;
    private javax.swing.JTextField cri_id;
    private javax.swing.JTextField cri_nom;
    private javax.swing.JComboBox<String> deli_culp;
    private javax.swing.JTextField deli_desc;
    private javax.swing.JComboBox<String> deli_nivel;
    private javax.swing.JComboBox<String> deli_tipo;
    private javax.swing.JMenuItem elimideli;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton expe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista_crimi;
    private javax.swing.JList<String> lista_delitos;
    private javax.swing.JMenuItem listardelitos;
    private javax.swing.JPopupMenu menu_criminal;
    private javax.swing.JPopupMenu menu_delito;
    private javax.swing.JMenuItem modidelito;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JSpinner sentencia;
    // End of variables declaration//GEN-END:variables
ArrayList<Criminales> crimi = new ArrayList();
    AdminCriminales ad = new AdminCriminales("./Criminales.txt");
}
