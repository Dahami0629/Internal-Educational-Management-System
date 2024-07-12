package EmployeeManagement;

import DataBaseCode.databaseConnection;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.sql.*;

public class DisplayTeachers extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public DisplayTeachers() {
        super("Teachers");
        initComponents();
        conn = databaseConnection.connection();
        showRecord();
        searchById();
        
        
        SearchByAll.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterRecords();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterRecords();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterRecords();
            }
        });
    }

    public void filterRecords() {
     try 
        {
            String searchQuery = SearchByAll.getText().toLowerCase();
            String sql = "SELECT * FROM teacher WHERE "
                         + "LOWER(id) LIKE '%" + searchQuery + "%' OR "
                         + "LOWER(name) LIKE '%" + searchQuery + "%' OR "
                         + "LOWER(subject) LIKE '%" + searchQuery + "%' OR "
                         + "LOWER(mail) LIKE '%" + searchQuery + "%' OR "
                         + "LOWER(phone) LIKE '%" + searchQuery + "%' OR "
                         + "LOWER(address) LIKE '%" + searchQuery + "%' OR "
                         + "LOWER(student_fee) LIKE '%" + searchQuery + "%'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Teachertable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
 }

    
    public void searchById(){
        try
            {
                stmt = conn.createStatement();
                String sql = "SELECT * FROM teacher";
                ResultSet res = stmt.executeQuery(sql);
                while(res.next())
                {
                    TIDSelect.add(res.getString("id"));
                }

            }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }   
    }
    
    public void showRecord(){
        
        try
            {
                stmt = conn.createStatement();
                String sql = "SELECT * FROM teacher";
                ResultSet res = stmt.executeQuery(sql);
                Teachertable.setModel(DbUtils.resultSetToTableModel(res));

            }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Teachertable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        TIDSelect = new java.awt.Choice();
        updateTeacherDetails = new javax.swing.JButton();
        TIDSearch = new javax.swing.JButton();
        PrintTeacherDetails = new javax.swing.JButton();
        backdisplayteacher = new javax.swing.JButton();
        SearchByAll = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ExportCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1100, 100));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Management");

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1100, 550));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Display Teachers");

        Teachertable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Teachertable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Teachertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "NIC", "Phone", "Gmail", "Address", "Student fee"
            }
        ));
        Teachertable.setShowGrid(true);
        jScrollPane1.setViewportView(Teachertable);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search by Teacher ID");
        jLabel4.setToolTipText("");
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TIDSelect.setBackground(new java.awt.Color(255, 255, 204));
        TIDSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        updateTeacherDetails.setBackground(new java.awt.Color(102, 102, 255));
        updateTeacherDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateTeacherDetails.setForeground(new java.awt.Color(255, 255, 255));
        updateTeacherDetails.setText("Update");
        updateTeacherDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        updateTeacherDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTeacherDetailsActionPerformed(evt);
            }
        });

        TIDSearch.setBackground(new java.awt.Color(0, 102, 102));
        TIDSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TIDSearch.setForeground(new java.awt.Color(255, 255, 255));
        TIDSearch.setText("Search");
        TIDSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        TIDSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDSearchActionPerformed(evt);
            }
        });

        PrintTeacherDetails.setBackground(new java.awt.Color(236, 180, 68));
        PrintTeacherDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PrintTeacherDetails.setForeground(new java.awt.Color(255, 255, 255));
        PrintTeacherDetails.setText("Print");
        PrintTeacherDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        PrintTeacherDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTeacherDetailsActionPerformed(evt);
            }
        });

        backdisplayteacher.setBackground(new java.awt.Color(0, 102, 102));
        backdisplayteacher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backdisplayteacher.setForeground(new java.awt.Color(255, 255, 255));
        backdisplayteacher.setText("Back");
        backdisplayteacher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        backdisplayteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backdisplayteacherActionPerformed(evt);
            }
        });

        SearchByAll.setBackground(new java.awt.Color(255, 255, 204));
        SearchByAll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchByAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByAllActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filter");

        ExportCSV.setBackground(new java.awt.Color(255, 255, 204));
        ExportCSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExportCSV.setText("Print CSV");
        ExportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backdisplayteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PrintTeacherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateTeacherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(TIDSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchByAll)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(425, 425, 425))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TIDSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchByAll, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintTeacherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTeacherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backdisplayteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 1100, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateTeacherDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTeacherDetailsActionPerformed
        setVisible(false);
        UpdateTeachers object = new UpdateTeachers(TIDSelect.getSelectedItem());
        object.setVisible(true);
    }//GEN-LAST:event_updateTeacherDetailsActionPerformed

    private void TIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDSearchActionPerformed
        try
            {
                stmt = conn.createStatement();
                String sql = "SELECT * FROM teacher WHERE id = '"+TIDSelect.getSelectedItem()+"'";
                rs = stmt.executeQuery(sql);
                Teachertable.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_TIDSearchActionPerformed

    private void PrintTeacherDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTeacherDetailsActionPerformed
        try 
            {
                Teachertable.print();
            } catch (PrinterException ex) 
                {
                    Logger.getLogger(DisplayTeachers.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_PrintTeacherDetailsActionPerformed

    private void backdisplayteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backdisplayteacherActionPerformed
        setVisible(false);
        Employee_Dashboard object = new Employee_Dashboard();
        object.setVisible(true);
    }//GEN-LAST:event_backdisplayteacherActionPerformed

    private void SearchByAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByAllActionPerformed
        
    }//GEN-LAST:event_SearchByAllActionPerformed

    private void ExportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportCSVActionPerformed
        try {
            
            String downloadsPath = System.getProperty("user.home") + "/Downloads";
            
            File directory = new File(downloadsPath + "/Employee_Management");
            
            if (!directory.exists()) {
                directory.mkdirs(); 
            }
            
            FileWriter fw = new FileWriter(directory.getPath() + "/teacher_data.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < Teachertable.getRowCount(); i++) {
                for (int j = 0; j < Teachertable.getColumnCount(); j++) {
                    
                    bw.write(Teachertable.getValueAt(i, j).toString() + ",");
                }
                
                bw.newLine();
            }
            
            bw.close();
            
            JOptionPane.showMessageDialog(null, "Data exported successfully!");
        } catch (IOException ex) {
            
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
            java.util.logging.Logger.getLogger(DisplayTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayTeachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportCSV;
    private javax.swing.JButton PrintTeacherDetails;
    private javax.swing.JTextField SearchByAll;
    private javax.swing.JButton TIDSearch;
    private java.awt.Choice TIDSelect;
    private javax.swing.JTable Teachertable;
    private javax.swing.JButton backdisplayteacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateTeacherDetails;
    // End of variables declaration//GEN-END:variables
}
