import java.io.*;//needed to work with textfiles
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentSearch extends javax.swing.JFrame {

    ISSStudent students[];
    public StudentSearch() {
        initComponents();
        students= new ISSStudent[100];
        //read data in from file and make 100 students
        FileReader fr;
        String n, a;
        int i;
        try {
            fr = new FileReader("studata.txt");
            BufferedReader br= new BufferedReader(fr);
            for(int x =0; x<students.length; x++){
                n=br.readLine();
                a=br.readLine();
                i=Integer.parseInt(br.readLine());
                students[x]=new ISSStudent(n,a,i);
                //txtinfo.append(students[x].toString());
            }
            br.close();
            
        } catch (Exception ex) {
            Logger.getLogger(StudentSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Default Binary Search");

        jLabel1.setText("Enter Student Id to search:");

        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnquit.setText("Quit");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        txtinfo.setEditable(false);
        txtinfo.setColumns(20);
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
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsearch)
                        .addGap(45, 45, 45)
                        .addComponent(btnclear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnquit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsearch)
                    .addComponent(btnclear)
                    .addComponent(btnquit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnquitActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        int id= Integer.parseInt(txtid.getText());
        //create a temp student
        ISSStudent temp=new ISSStudent("","",id);
        int loc=search(students,temp);
        if(loc==-1){
            txtinfo.setText("Student not found");
        }
        else{
            txtinfo.setText(students[loc].toString());
        }
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtinfo.setText("");
        txtid.setText("");
    }//GEN-LAST:event_btnclearActionPerformed
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = a.length-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
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
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextArea txtinfo;
    // End of variables declaration//GEN-END:variables
}
