/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
 import java.sql.Connection; 
 import java.sql.DriverManager; 
 import java.sql.PreparedStatement; 
 import java.sql.SQLException; 
 import javax.swing.JOptionPane;

public class Savedata extends javax.swing.JFrame {

    /**
     * Creates new form Savedata
     */
    public Savedata() {
        initComponents();
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
        LBLNAME = new javax.swing.JLabel();
        LBLTELEPHONE = new javax.swing.JLabel();
        LBLHP = new javax.swing.JLabel();
        LBLALAMAT = new javax.swing.JLabel();
        LBLPRODI = new javax.swing.JLabel();
        BTNSAVE = new javax.swing.JButton();
        TXTNAME = new javax.swing.JTextField();
        TXTHP = new javax.swing.JTextField();
        TXTTELEPHONE = new javax.swing.JTextField();
        TXTADDRESS = new javax.swing.JTextField();
        TXTPRODY = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        LBLNAME.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLNAME.setForeground(new java.awt.Color(255, 255, 255));
        LBLNAME.setText("Nama");

        LBLTELEPHONE.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLTELEPHONE.setForeground(new java.awt.Color(255, 255, 255));
        LBLTELEPHONE.setText("Telepon");

        LBLHP.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLHP.setForeground(new java.awt.Color(255, 255, 255));
        LBLHP.setText("HP");

        LBLALAMAT.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLALAMAT.setForeground(new java.awt.Color(255, 255, 255));
        LBLALAMAT.setText("Alamat");

        LBLPRODI.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLPRODI.setForeground(new java.awt.Color(255, 255, 255));
        LBLPRODI.setText("Prodi");

        BTNSAVE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNSAVE.setText("Simpan");
        BTNSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSAVEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LBLTELEPHONE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LBLHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LBLNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LBLALAMAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LBLPRODI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTHP, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTTELEPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTPRODY, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(BTNSAVE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLNAME)
                    .addComponent(TXTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLTELEPHONE)
                    .addComponent(TXTTELEPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLHP)
                    .addComponent(TXTHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLPRODI)
                    .addComponent(TXTPRODY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BTNSAVE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSAVEActionPerformed
        // TODO add your handling code here:
         String user="root";         
         String pswd ="";         
         String host="localhost";         
         String db="db_datasenin";         
         String url=""; 
         
           try {             
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;             
            Connection conn=DriverManager.getConnection(url); 
            PreparedStatement pStatement = conn.prepareStatement("INSERT INTO tb_datasenin(Nama,Telepon,Handphone,Alamat,Prodi)" + "VALUES (?,?,?,?,?)");
            
             pStatement.setString(1, TXTNAME.getText());             
             pStatement.setString(2, TXTTELEPHONE.getText()); 
             pStatement.setString(3, TXTHP.getText());             
             pStatement.setString(4, TXTADDRESS.getText()); 
             pStatement.setString(5, TXTPRODY.getText());             
             
             if (pStatement.executeUpdate()>0)                 
                 JOptionPane.showMessageDialog(this,                    
                   "Penambahan sukses", "Informasi",                    
                   JOptionPane.INFORMATION_MESSAGE);             
             else                 
                 JOptionPane.showMessageDialog(this,                    
                   "Penambahan gagal", "Informasi",                    
                   JOptionPane.INFORMATION_MESSAGE); 
 
            pStatement.close();             
            conn.close(); 
 
            TXTNAME.setText("");             
            TXTTELEPHONE.setText("");             
            TXTHP.setText("");             
            TXTADDRESS.setText("");         
            TXTPRODY.setText("");   
            
           }        
           catch(ClassNotFoundException e) {             
               System.out.println("jdbc.Driver tidak ditemukan");        
         } 
 
           catch (SQLException e){             
               System.out.println("koneksi gagal " + e.toString()); 
      }
             
    }//GEN-LAST:event_BTNSAVEActionPerformed

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
            java.util.logging.Logger.getLogger(Savedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Savedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Savedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Savedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Savedata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNSAVE;
    private javax.swing.JLabel LBLALAMAT;
    private javax.swing.JLabel LBLHP;
    private javax.swing.JLabel LBLNAME;
    private javax.swing.JLabel LBLPRODI;
    private javax.swing.JLabel LBLTELEPHONE;
    private javax.swing.JTextField TXTADDRESS;
    private javax.swing.JTextField TXTHP;
    private javax.swing.JTextField TXTNAME;
    private javax.swing.JTextField TXTPRODY;
    private javax.swing.JTextField TXTTELEPHONE;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
