package InventoryControl;


import DataBaseCode.databaseConnection;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class displayInventory extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public displayInventory() {
     super("Inventory");
        initComponents();
        conn = databaseConnection.connection();
        showRecord();
    }
    
     public void showRecord(){
        
        try{
            stmt = conn.createStatement();
            String sql = "SELECT * FROM inventory";
            ResultSet res = stmt.executeQuery(sql);
            displayinventorytable.setModel(DbUtils.resultSetToTableModel(res));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayinventorytable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PrintInventoryDetails = new javax.swing.JButton();
        backdisplayInventory = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SelectMonth = new javax.swing.JComboBox<>();
        SearchInv = new javax.swing.JButton();
        ExportCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        displayinventorytable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        displayinventorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Item No", "Supplier", "Quantity", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(displayinventorytable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 1050, 160);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1100, 100));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventory Management");

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sector");

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Higher Education Institute");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(350, 350, 350))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1100, 100);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Display Inventory");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 150, 190, 29);

        PrintInventoryDetails.setBackground(new java.awt.Color(236, 180, 68));
        PrintInventoryDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PrintInventoryDetails.setForeground(new java.awt.Color(255, 255, 255));
        PrintInventoryDetails.setText("Print");
        PrintInventoryDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PrintInventoryDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintInventoryDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(PrintInventoryDetails);
        PrintInventoryDetails.setBounds(910, 490, 86, 32);

        backdisplayInventory.setBackground(new java.awt.Color(0, 102, 102));
        backdisplayInventory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backdisplayInventory.setForeground(new java.awt.Color(255, 255, 255));
        backdisplayInventory.setText("Back");
        backdisplayInventory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        backdisplayInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backdisplayInventoryActionPerformed(evt);
            }
        });
        jPanel1.add(backdisplayInventory);
        backdisplayInventory.setBounds(800, 490, 86, 32);

        jLabel3.setText("Select Month");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 200, 80, 16);

        SelectMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febraury", "March", "April", "May", "June", "August", "September", "October", "November", "December" }));
        jPanel1.add(SelectMonth);
        SelectMonth.setBounds(160, 200, 110, 22);

        SearchInv.setText("Search");
        SearchInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchInvActionPerformed(evt);
            }
        });
        jPanel1.add(SearchInv);
        SearchInv.setBounds(300, 200, 72, 23);

        ExportCSV.setBackground(new java.awt.Color(255, 255, 204));
        ExportCSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExportCSV.setText("Print CSV");
        ExportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportCSVActionPerformed(evt);
            }
        });
        jPanel1.add(ExportCSV);
        ExportCSV.setBounds(680, 490, 95, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrintInventoryDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintInventoryDetailsActionPerformed
        try {
            displayinventorytable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(displayInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintInventoryDetailsActionPerformed

    private void backdisplayInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backdisplayInventoryActionPerformed
        setVisible(false);
        InventoryCategory object = new InventoryCategory();
        object.setVisible(true);
    }//GEN-LAST:event_backdisplayInventoryActionPerformed

    private void SearchInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchInvActionPerformed
          try{
            stmt = conn.createStatement();
            
                String sql = "SELECT * FROM inventory WHERE month = '"+SelectMonth.getSelectedItem()+"' ";
                rs = stmt.executeQuery(sql);
                displayinventorytable.setModel(DbUtils.resultSetToTableModel(rs)); 
                       
        }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }  
        
    }//GEN-LAST:event_SearchInvActionPerformed

    private void ExportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportCSVActionPerformed
        try {
            // Get the path to the Downloads folder
            String downloadsPath = System.getProperty("user.home") + "/Downloads";
            // Create a File object for the directory named "Sector" in the Downloads folder
            File directory = new File(downloadsPath + "/Inventory_Management");
            // Check if the directory exists, if not, create it
            if (!directory.exists()) {
                directory.mkdirs(); // mkdirs() creates parent directories as needed
            }
            // Create a FileWriter for the file inside the "Sector" directory
            FileWriter fw = new FileWriter(directory.getPath() + "/inventory_data.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            // Loop through the table and write data to the file
            for (int i = 0; i < displayinventorytable.getRowCount(); i++) {
                for (int j = 0; j < displayinventorytable.getColumnCount(); j++) {
                    // Write cell value followed by a comma
                    bw.write(displayinventorytable.getValueAt(i, j).toString() + ",");
                }
                // Write a new line after each row
                bw.newLine();
            }
            // Close the writer
            bw.close();
            // Show success message
            JOptionPane.showMessageDialog(null, "Data exported successfully!");
        } catch (IOException ex) {
            // Show error message if an exception occurs
            JOptionPane.showMessageDialog(null, "Error exporting data: " + ex.getMessage());
        }

    }//GEN-LAST:event_ExportCSVActionPerformed

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
            java.util.logging.Logger.getLogger(displayInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportCSV;
    private javax.swing.JButton PrintInventoryDetails;
    private javax.swing.JButton SearchInv;
    private javax.swing.JComboBox<String> SelectMonth;
    private javax.swing.JButton backdisplayInventory;
    private javax.swing.JTable displayinventorytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
