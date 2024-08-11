package GUI;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 

public class DBReadGUI extends javax.swing.JFrame {

    /**
     * Creates new form Readdata
     */
    public DBReadGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DBReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBReadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

       private Object[][] getData(){ 
 
        String user="root";         
        String pswd ="";         
        String host="localhost";         
        String db="db_datasenin";
        String url=""; 
 
        Object[][] data1= null; 
 
        try {             
            Class.forName("com.mysql.jdbc.Driver"); 
 
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user +                   
            "&password="+ pswd;             
            Connection conn=DriverManager.getConnection(url); 
 
            Statement st = conn.createStatement();             
            ResultSet rs = st.executeQuery("SELECT * FROM tb_datasenin"); 
 
            rs.last();             
            int rowCount= rs.getRow();             
            rs.beforeFirst(); 
 
            data1= new Object[rowCount][4];             
            int no=-1;             
            while (rs.next()) {                 
            no=no+1;                 
            data1[no][0]=rs.getString("Nama");                 
            data1[no][1]=rs.getString("Alamat");                 
            data1[no][2]=rs.getString("Telepon");                 
            data1[no][3]=rs.getString("Handphone");           
            } 
 
          st.close();           
          conn.close(); 
 
            } 
 
            catch(ClassNotFoundException e) {             
                System.out.println("jdbc.Driver tidak ditemukan");        
            } 
 
            catch (SQLException e){             
                System.out.println("koneksi gagal " + e.toString()); 
 
            } 
 
            return data1;     
           } 
 
           private void tampilTabel() { 
 
           String[] columnNames = {"Nama", "Alamat", "Telepon", "Handphone"}; 
 
           JTable table = new JTable(getData(), columnNames);                  
           jScrollPane1.setViewportView(table);     
           } 

}
