
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;


public class NHL_GUI extends javax.swing.JFrame {
    ArrayList <Player> list;
    DefaultListModel model;
    FileReader f;
    BufferedReader br;
    StringTokenizer st;
    
    public NHL_GUI() {
        initComponents();
        list= new ArrayList();
        model= new DefaultListModel();
        try{
            f=new FileReader("nhlplayers.txt");
            br= new BufferedReader(f);
            for (int i = 0; i < 614; i++) {
                String data= br.readLine();
                st= new StringTokenizer(data, ",");
                String nm, tm, pos;
                int sal, w;
                nm=st.nextToken();
                tm=st.nextToken();
                pos=st.nextToken();
                sal= Integer.parseInt(st.nextToken());
                w= Integer.parseInt(st.nextToken());
                list.add(new Player(nm, tm, pos, sal, w));
                model.addElement(nm);
            }
            br.close();
            lstplayers.setModel(model);
            
        }catch(Exception e){}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstplayers = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnudel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuteam = new javax.swing.JMenuItem();
        mnuall = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstplayers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstplayers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstplayersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstplayers);

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        jScrollPane2.setViewportView(txtinfo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Names");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Detailed Information");

        jMenu1.setText("File");

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnudel.setText("Delete Player");
        mnudel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudelActionPerformed(evt);
            }
        });
        jMenu2.add(mnudel);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuteam.setText("By Selected Team");
        mnuteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuteamActionPerformed(evt);
            }
        });
        jMenu3.add(mnuteam);

        mnuall.setText("Show All");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        jMenu3.add(mnuall);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstplayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstplayersMouseClicked
        int item= lstplayers.getSelectedIndex();
        String s= (String)(model.getElementAt(item));
        Player temp= new Player(s,"","",0,0);
        int loc= search(list, temp);
        txtinfo.setText(list.get(loc).toString());
        
        
    }//GEN-LAST:event_lstplayersMouseClicked

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnudelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudelActionPerformed
        //which item are we looking at
        int loc = lstplayers.getSelectedIndex();
        //which name is that
        String name= String.valueOf(model.getElementAt(loc));
        Player temp= new Player(name,null,null,0,0);
        //also remove from visual list
        model.removeElementAt(loc);
        //find them in array list
        loc= search(list, temp);
        //delete them
        list.remove(loc);
    }//GEN-LAST:event_mnudelActionPerformed

    private void mnuteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuteamActionPerformed
        int item= lstplayers.getSelectedIndex();
        String s= (String)(model.getElementAt(item));
        Player temp= new Player(s,"","",0,0);
        int loc= search(list, temp);
        String team=(list.get(loc).getTeam());
        model.clear();
        for(int x=0; x<list.size(); x++){
            if(list.get(x).getTeam().equals(team)){
                model.addElement(list.get(x).getName());
                lstplayers.setModel(model);
            }
        }
    }//GEN-LAST:event_mnuteamActionPerformed

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
        model.clear();
        for(int x=0; x<list.size(); x++){
            String nam=list.get(x).getName();
            model.addElement(nam);
            lstplayers.setModel(model);
        }
    }//GEN-LAST:event_mnuallActionPerformed

    public static int search (ArrayList a, Object searchValue){
	   int left = 0;
	   int right = a.size()-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
              Object item=a.get(midpoint);
	      int result = ((Comparable)item).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
    }
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
            java.util.logging.Logger.getLogger(NHL_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NHL_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NHL_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NHL_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NHL_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstplayers;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenuItem mnudel;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuteam;
    private javax.swing.JTextArea txtinfo;
    // End of variables declaration//GEN-END:variables
}
