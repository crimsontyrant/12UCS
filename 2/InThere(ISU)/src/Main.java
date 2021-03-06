
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nico5370
 */
public class Main extends javax.swing.JFrame {
    //declarations
    /*NOT EVERYTHING IS COMPLETE - as of right now only map movement and item usage works. There is no game,
    just a fully functional engine*/
    Equipment SM = new Equipment("Spooky Mask");
    SingleUse GB = new SingleUse("Bag of Garbage");
    SingleUse GJ = new SingleUse("Ghost Jar");
    DefaultListModel itemList = new DefaultListModel();
    DefaultListModel actionList = new DefaultListModel();
    public Main() {
        initComponents();
        //setting lists and images
        ImageIcon location = new ImageIcon("src/loc1.png");
        lblloc.setIcon(location);
        //1=mar10 2=dank hall 3=library 4=caf 5=gym
        ImageIcon map = new ImageIcon("src/map1.png");
        lblmap.setIcon(map);
        itemList.addElement(SM.getName());
        itemList.addElement(GB.getName());
        itemList.addElement(GJ.getName());
        lstitem.setModel(itemList);
        actionList.addElement("Put garbage in can");
        actionList.addElement("Find ghost");
        actionList.addElement("Eat ghost");
        lstaction.setModel(actionList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblloc = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblmap = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstitem = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        btnuseitem = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnm1 = new javax.swing.JButton();
        btnm2 = new javax.swing.JButton();
        btnm3 = new javax.swing.JButton();
        btnm4 = new javax.swing.JButton();
        btnm5 = new javax.swing.JButton();
        btninspect = new javax.swing.JButton();
        btntalk = new javax.swing.JButton();
        btnaction = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstaction = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IN THERE - ALPHA v0.01");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblloc, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblloc, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblmap, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblmap, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstitem.setToolTipText("");
        jScrollPane3.setViewportView(lstitem);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Inventory");

        btnuseitem.setText("Use");
        btnuseitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuseitemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnuseitem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnuseitem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnm1.setText("Mar10");
        btnm1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnm1ActionPerformed(evt);
            }
        });

        btnm2.setText("Dank Hall");
        btnm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnm2ActionPerformed(evt);
            }
        });

        btnm3.setText("Library");
        btnm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnm3ActionPerformed(evt);
            }
        });

        btnm4.setText("Cafeteria");
        btnm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnm4ActionPerformed(evt);
            }
        });

        btnm5.setText("Gymnasium");
        btnm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnm5ActionPerformed(evt);
            }
        });

        btninspect.setText("Inspect");

        btntalk.setText("Talk");

        btnaction.setText("Action");
        btnaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactionActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstaction);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnm5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btninspect, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntalk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addComponent(btnaction, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnm2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnm3)
                        .addGap(9, 9, 9)
                        .addComponent(btnm4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btninspect)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnaction)
                        .addComponent(btntalk))
                    .addComponent(btnm5))
                .addGap(23, 23, 23))
        );

        txtinfo.setColumns(20);
        txtinfo.setLineWrap(true);
        txtinfo.setRows(5);
        jScrollPane1.setViewportView(txtinfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnm1ActionPerformed
        //changes the location to loc 1
        ImageIcon map = new ImageIcon("src/map1.png");
        lblmap.setIcon(map);
        ImageIcon location = new ImageIcon("src/loc1.png");
        lblloc.setIcon(location);
    }//GEN-LAST:event_btnm1ActionPerformed

    private void btnm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnm2ActionPerformed
        //changes the location to loc 2
        ImageIcon map = new ImageIcon("src/map2.png");
        lblmap.setIcon(map);
        ImageIcon location = new ImageIcon("src/loc2.png");
        lblloc.setIcon(location);
    }//GEN-LAST:event_btnm2ActionPerformed

    private void btnm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnm3ActionPerformed
        //changes the location to loc 3
        ImageIcon map = new ImageIcon("src/map3.png");
        lblmap.setIcon(map);
        ImageIcon location = new ImageIcon("src/loc3.png");
        lblloc.setIcon(location);
    }//GEN-LAST:event_btnm3ActionPerformed

    private void btnm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnm4ActionPerformed
        //changes the location to loc 4
        ImageIcon map = new ImageIcon("src/map4.png");
        lblmap.setIcon(map);
        ImageIcon location = new ImageIcon("src/loc4.png");
        lblloc.setIcon(location);
    }//GEN-LAST:event_btnm4ActionPerformed

    private void btnm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnm5ActionPerformed
        //changes the location to loc 5
        ImageIcon map = new ImageIcon("src/map5.png");
        lblmap.setIcon(map);
        ImageIcon location = new ImageIcon("src/loc5.png");
        lblloc.setIcon(location);
    }//GEN-LAST:event_btnm5ActionPerformed

    private void btnuseitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuseitemActionPerformed
        System.out.println("" + lstitem.getSelectedValue());
        //Based on what item is focused, executes use.
        if (lstitem.getSelectedValue().equals(SM.getName())){
            SM.useItem(); //equips and unequips
            if(SM.isEquipped()){
                txtinfo.append(SM.getName() + " has been equipped." + "\n");
            }
            if(!SM.isEquipped()){
                txtinfo.append(SM.getName() + " has been unequipped." + "\n");
            }
        }
        if (lstitem.getSelectedValue().equals(GB.getName())){
            if (!GB.isUsed()){
                GB.useItem();
                txtinfo.append("You throw garbage everywhere.\nThe bag is now empty." + "\n");
            }
            else {
                txtinfo.append("The bag is empty." + "\n");
            }
        }
        if (lstitem.getSelectedValue().equals(GJ.getName())){
            if (!GJ.isUsed()){
                GJ.useItem();
                txtinfo.append("You open the jar and the ghost flies away.\nThe jar is now empty." + "\n");
            }
            else {
                txtinfo.append("The jar is empty." + "\n");
            }
        }
    }//GEN-LAST:event_btnuseitemActionPerformed

    private void btnactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactionActionPerformed
        System.out.println("" + lstaction.getSelectedValue());
    }//GEN-LAST:event_btnactionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" info=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaction;
    private javax.swing.JButton btninspect;
    private javax.swing.JButton btnm1;
    private javax.swing.JButton btnm2;
    private javax.swing.JButton btnm3;
    private javax.swing.JButton btnm4;
    private javax.swing.JButton btnm5;
    private javax.swing.JButton btntalk;
    private javax.swing.JButton btnuseitem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblloc;
    private javax.swing.JLabel lblmap;
    private javax.swing.JList lstaction;
    private javax.swing.JList lstitem;
    private javax.swing.JTextArea txtinfo;
    // End of variables declaration//GEN-END:variables
}
