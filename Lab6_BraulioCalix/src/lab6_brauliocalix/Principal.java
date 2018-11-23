/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_brauliocalix;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

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
        listardelitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listardelitosMouseClicked(evt);
            }
        });
        menu_criminal.add(listardelitos);

        agrega_delito.setText("agregar delito");
        menu_criminal.add(agrega_delito);

        modidelito.setText("modificar");
        menu_delito.add(modidelito);

        elimideli.setText("eliminar delito");
        menu_delito.add(elimideli);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        try {
            String celda = cri_celda.getText();
            String nombre = cri_nom.getText();
            String id = cri_id.getText();
            int edad = (int) cri_edad.getValue();
            String anios = sentencia.getValue().toString();
            crimi.add(new Criminales(nombre, edad, id, celda, anios));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(CreaCrimi, "no se pudo crear el criminal");
            e.printStackTrace();
        }
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
        ruta = "./Criminales.txt";
        ad.cargarCriminales();
        DefaultListModel modelo = (DefaultListModel) lista_crimi.getModel();
        for (int i = 0; i < ad.getListaCri().size(); i++) {
            modelo.addElement(ad.getListaCri().get(i).toString());
        }
    }//GEN-LAST:event_actualizar_listaMouseClicked

    private void listardelitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listardelitosMouseClicked
        lista_crimi.getSelectedIndex();
        ad.cargarCriminales();
        DefaultListModel modelo = (DefaultListModel) lista_delitos.getModel();
        for (int i = 0; i < ad.getListaCri().size(); i++) {
            modelo.addElement(ad.getListaCri().get(i).toString());
        }
    }//GEN-LAST:event_listardelitosMouseClicked

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
    private javax.swing.JTextField cri_celda;
    private javax.swing.JSpinner cri_edad;
    private javax.swing.JTextField cri_id;
    private javax.swing.JTextField cri_nom;
    private javax.swing.JMenuItem elimideli;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton expe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    String ruta;
    AdminCriminales ad = new AdminCriminales(ruta);
}
