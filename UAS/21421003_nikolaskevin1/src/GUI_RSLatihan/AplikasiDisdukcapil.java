/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_RSLatihan;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AplikasiDisdukcapil extends javax.swing.JFrame {
    DefaultTableModel tabmodel;
    ResultSet RsProduk=null;
    private Connection Lconnection=null;
    int baris = 0;
    /**
     * Creates new form AplikasiDisdukcapil
     */
    public AplikasiDisdukcapil() {
        initComponents();
        tampilTabel();
        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTNOKTP = new javax.swing.JTextField();
        TXTNAME = new javax.swing.JTextField();
        TXTADDRESS = new javax.swing.JTextField();
        TXTRELIGION = new javax.swing.JTextField();
        TXTSTATUS = new javax.swing.JTextField();
        BTNSAVE = new javax.swing.JButton();
        BTNUPDATE = new javax.swing.JButton();
        BTNDELETE = new javax.swing.JButton();
        BTNINSERT = new javax.swing.JButton();
        BTNCEKNAMA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi Disdukcapil");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No KTP", "Nama", "Alamat", "Agama", "Status"
            }
        ));
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No KTP");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Agama");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");

        BTNSAVE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNSAVE.setText("Save");
        BTNSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSAVEActionPerformed(evt);
            }
        });

        BTNUPDATE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNUPDATE.setText("Update");
        BTNUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUPDATEActionPerformed(evt);
            }
        });

        BTNDELETE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNDELETE.setText("Delete");
        BTNDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDELETEActionPerformed(evt);
            }
        });

        BTNINSERT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNINSERT.setText("Insert");
        BTNINSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNINSERTActionPerformed(evt);
            }
        });

        BTNCEKNAMA.setText("Cek Nama");
        BTNCEKNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCEKNAMAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNINSERT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TXTSTATUS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(TXTRELIGION, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTADDRESS, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTNOKTP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTNAME, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(BTNCEKNAMA))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTNDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BTNSAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(BTNUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTNOKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCEKNAMA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXTRELIGION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNSAVE)
                    .addComponent(BTNUPDATE)
                    .addComponent(BTNINSERT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(BTNDELETE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String db="db_rslatihan";
        String url="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;
            Connection conn=DriverManager.getConnection(url);
            PreparedStatement pStatement = conn.prepareStatement("INSERT INTO tb_rslatihan(No_KTP,Nama,Alamat,Agama,Status)" + "VALUES (?,?,?,?,?)");

            pStatement.setString(1, TXTNOKTP.getText());
            pStatement.setString(2, TXTNAME.getText());
            pStatement.setString(3, TXTADDRESS.getText());
            pStatement.setString(4, TXTRELIGION.getText());
            pStatement.setString(5, TXTSTATUS.getText());

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

            TXTNOKTP.setText("");
            TXTNAME.setText("");
            TXTADDRESS.setText("");
            TXTRELIGION.setText("");
            TXTSTATUS.setText("");

        }
        catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        }

        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }

    }//GEN-LAST:event_BTNSAVEActionPerformed

    private void BTNUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUPDATEActionPerformed
        // TODO add your handling code here:
        String noktp=TXTNOKTP.getText();
        String nama=TXTNAME.getText();
        String alamat=TXTADDRESS.getText();
        String agama=TXTRELIGION.getText();
        String status=TXTSTATUS.getText();
        
        if (noktp.isEmpty()) {
          JOptionPane.showMessageDialog(null, "no ktp tidak boleh kosong");
          TXTNOKTP.requestFocus();
        }else if (nama.isEmpty()) {
          JOptionPane.showMessageDialog(null, "nama tidak boleh kosong");
          TXTNAME.requestFocus();
        }else if (alamat.isEmpty()) {
          JOptionPane.showMessageDialog(null, "alamat tidak boleh kosong");
          TXTADDRESS.requestFocus();
        }else if (agama.isEmpty()) {
          JOptionPane.showMessageDialog(null, "agama tidak boleh kosong");
          TXTRELIGION.requestFocus();
        }else if (status.isEmpty()) {
          JOptionPane.showMessageDialog(null, "status tidak boleh kosong");
          TXTSTATUS.requestFocus();
        } else if (!(new Scanner(noktp).hasNextInt())) {
         JOptionPane.showMessageDialog(null, "no ktp tidak boleh kosong");
          TXTNOKTP.requestFocus();
        }else{  
           try{
             Connection conn=(Connection)Koneksi.koneksikeDB();
             Statement stt=conn.createStatement();
             stt.executeUpdate("UPDATE tb_rslatihan SET Nama='"+nama+"', Alamat='"+alamat+"',"+
                 "Agama='"+agama+"', Status='"+status+"', WHERE No_KTP='"+noktp+"'");
            
                bersihdata();
                tampilTabel();
                SetEditOff();
          JOptionPane.showMessageDialog
          (this,"Data berhasil diubah", "Success",                    
          JOptionPane.INFORMATION_MESSAGE);        
           } catch (SQLException e){    
          JOptionPane.showMessageDialog
          (this,"Ubah data gagal\n"+e.getMessage(), "Error",                    
          JOptionPane.INFORMATION_MESSAGE);    
           }
        }        
    }//GEN-LAST:event_BTNUPDATEActionPerformed

    private void BTNDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDELETEActionPerformed
        // TODO add your handling code here:
          try {
              PreparedStatement pStatement = null;             
              String sql ="DELETE FROM tb_rslatihan WHERE NoKTP=? ";             
              pStatement = Lconnection.prepareStatement(sql); 
            
             // pStatement.setString(1, TXTNOKTP);  
             
             int intTambah= pStatement.executeUpdate();                          
             if (intTambah>0)                 
                 JOptionPane.showMessageDialog(this,                    
                   "Edit sukses", "Informasi",                    
                   JOptionPane.INFORMATION_MESSAGE);             
             else                 
                 JOptionPane.showMessageDialog(this,                    
                   "Edit gagal", "Informasi",                    
                   JOptionPane.INFORMATION_MESSAGE); 
 
            pStatement.close();             
                   
           }        
      
           catch (SQLException e){             
               System.out.println("koneksi gagal " + e.toString()); 
      }
    }//GEN-LAST:event_BTNDELETEActionPerformed

    private void BTNINSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNINSERTActionPerformed
        // TODO add your handling code here:
        String user="root";
        String pswd ="";
        String host="localhost";
        String db="db_rslatihan";
        String url="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;
            Connection conn=DriverManager.getConnection(url);
            PreparedStatement pStatement = conn.prepareStatement("INSERT INTO tb_rslatihan(No_KTP,Nama,Alamat,Agama,Status)" + "VALUES (?,?,?,?,?)");

            pStatement.setString(1, TXTNOKTP.getText());
            pStatement.setString(2, TXTNAME.getText());
            pStatement.setString(3, TXTADDRESS.getText());
            pStatement.setString(4, TXTRELIGION.getText());
            pStatement.setString(5, TXTSTATUS.getText());

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

            TXTNOKTP.setText("");
            TXTNAME.setText("");
            TXTADDRESS.setText("");
            TXTRELIGION.setText("");
            TXTSTATUS.setText("");

        }
        catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        }

        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_BTNINSERTActionPerformed

    private void BTNCEKNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCEKNAMAActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery
            ("Select * from tb_rslatihan" + " where Nama like('%" +TXTNAME.getText() + "%')");

            if (rs.next()) {
                BTNSAVE.setEnabled(true);
                TXTNOKTP.setText(rs.getString("No_KTP"));
                TXTNAME.setText(rs.getString("Nama"));
                TXTADDRESS.setText(rs.getString("Alamat"));
                TXTRELIGION.setText(rs.getString("Agama"));
                TXTSTATUS.setText(rs.getString("Status"));
            } else {
                JOptionPane.showMessageDialog(this,"Nama: Salah", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                BTNSAVE.setEnabled(false);
                TXTNAME.setText("");
                TXTADDRESS.setText("");
                TXTNOKTP.setText("");
                TXTRELIGION.setText("");
                TXTSTATUS.setText("");
            }
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_BTNCEKNAMAActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiDisdukcapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiDisdukcapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiDisdukcapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiDisdukcapil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiDisdukcapil().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCEKNAMA;
    private javax.swing.JButton BTNDELETE;
    private javax.swing.JButton BTNINSERT;
    private javax.swing.JButton BTNSAVE;
    private javax.swing.JButton BTNUPDATE;
    private javax.swing.JTextField TXTADDRESS;
    private javax.swing.JTextField TXTNAME;
    private javax.swing.JTextField TXTNOKTP;
    private javax.swing.JTextField TXTRELIGION;
    private javax.swing.JTextField TXTSTATUS;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 
     void tblKeForm() {
     TXTNOKTP.setText(tabmodel.getValueAt(Table.getSelectedRow(),0)+"");
     TXTNAME.setText(tabmodel.getValueAt(Table.getSelectedRow(),1)+"");
     TXTADDRESS.setText(tabmodel.getValueAt(Table.getSelectedRow(),2)+"");
     TXTRELIGION.setText(tabmodel.getValueAt(Table.getSelectedRow(),3)+"");
     TXTSTATUS.setText(tabmodel.getValueAt(Table.getSelectedRow(),4)+"");
 
     BTNSAVE.setEnabled(true);
     BTNDELETE.setEnabled(true);
     BTNINSERT.setEnabled(true);
     BTNUPDATE.setEnabled(true);
    }
   
   private void SetEditoff() {
   TXTNOKTP.setEnabled(false);
   TXTNAME.setEnabled(false);
   TXTADDRESS.setEnabled(false);
   TXTRELIGION.setEnabled(false);
   TXTSTATUS.setEnabled(false);
   }
  
   private void tampilTabel() {
       try {
       Object[] judul_kolom = {"No_KTP", "Nama", "Alamat", "Agama", "Status"};    
       tabmodel = new DefaultTableModel(null,judul_kolom);
       Table.setModel(tabmodel);
       Connection conn=(Connection)Koneksi.koneksikeDB();
           Statement stt=conn.createStatement();
       tabmodel.getDataVector().removeAllElements();
       
       RsProduk=stt.executeQuery("SELECT * from tb_rslatihan");
       
       while(RsProduk.next()){
          Object[] data={
           RsProduk.getString("No_KTP"),   
           RsProduk.getString("Nama"), 
           RsProduk.getString("Alamat"), 
           RsProduk.getString("Agama"),
           RsProduk.getString("Status"), 
       };
       tabmodel.addRow(data);
   }
       
     } catch (Exception ex) {
     System.err.println(ex.getMessage());
     }
    
}

    private void bersihdata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SetEditOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
