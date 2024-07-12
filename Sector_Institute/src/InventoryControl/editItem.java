package InventoryControl;


import DataBaseCode.databaseConnection;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class editItem extends javax.swing.JFrame {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;

    public editItem() {
         super("Item");
         initComponents();
         conn = databaseConnection.connection();
         ChangeMonthID();
         SetMonthID();
         
    }
     public void ChangeMonthID(){
           SelectMonth.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    try{
                        stmt = conn.createStatement();
                        String sql = "SELECT *  FROM inventory WHERE month = '"+SelectMonth.getSelectedItem()+"'";
                        rs = stmt.executeQuery(sql);
                       
                        SelectId.removeAll();
                        
                        while(rs.next()){                       
                        SelectId.add(rs.getString("id"));
                        }
                    }catch(SQLException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
       }
     
     public void SetMonthID(){
        try{
            stmt = conn.createStatement();
            String sql = "SELECT *  FROM inventory WHERE month = '"+SelectMonth.getSelectedItem()+"'";
            rs = stmt.executeQuery(sql);
            
            SelectId.removeAll();
            
            while(rs.next())
            {                         
                SelectId.add(rs.getString("id"));
            }  
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
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
        BackInEdit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EditItem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Indelete = new javax.swing.JButton();
        InUpdate = new javax.swing.JButton();
        Id = new javax.swing.JLabel();
        InSearch = new javax.swing.JButton();
        Itemname = new javax.swing.JLabel();
        edItemName = new javax.swing.JTextField();
        quantity = new javax.swing.JLabel();
        EdQuantity = new javax.swing.JTextField();
        totalcost = new javax.swing.JLabel();
        EdTotalCost = new javax.swing.JTextField();
        SelectMonth = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        SelectId = new java.awt.Choice();
        jLabel4 = new javax.swing.JLabel();
        EdSupplier = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 650));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 500));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventory");

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sector");

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Higher Education Institute");

        BackInEdit.setBackground(new java.awt.Color(0, 102, 102));
        BackInEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackInEdit.setForeground(new java.awt.Color(255, 255, 255));
        BackInEdit.setText("Back");
        BackInEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        BackInEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackInEditActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Management");

        EditItem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EditItem.setForeground(new java.awt.Color(204, 255, 255));
        EditItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditItem.setText("Edit Item");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(EditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(BackInEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(150, 150, 150)
                .addComponent(EditItem)
                .addGap(175, 175, 175)
                .addComponent(BackInEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 250, 650);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(550, 500));

        Indelete.setBackground(new java.awt.Color(255, 51, 51));
        Indelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Indelete.setForeground(new java.awt.Color(255, 255, 255));
        Indelete.setText("Delete");
        Indelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Indelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndeleteActionPerformed(evt);
            }
        });

        InUpdate.setBackground(new java.awt.Color(0, 102, 102));
        InUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InUpdate.setForeground(new java.awt.Color(255, 255, 255));
        InUpdate.setText("Update");
        InUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        InUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InUpdateActionPerformed(evt);
            }
        });

        Id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Id.setText("Month");

        InSearch.setBackground(new java.awt.Color(0, 102, 102));
        InSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InSearch.setForeground(new java.awt.Color(255, 255, 255));
        InSearch.setText("Search");
        InSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        InSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InSearchActionPerformed(evt);
            }
        });

        Itemname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Itemname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Itemname.setText("Product                   ");

        edItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edItemNameActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quantity.setText("Quantity                   ");

        EdQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdQuantityActionPerformed(evt);
            }
        });

        totalcost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        totalcost.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalcost.setText("Total Cost                 ");

        EdTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdTotalCostActionPerformed(evt);
            }
        });

        SelectMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febraury", "March", "April", "May", "June", "August", "September", "October", "November", "December" }));
        SelectMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectMonthActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel1.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Supplier");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantity)
                                .addComponent(totalcost))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EdQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(EdTotalCost, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(Indelete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(EdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(edItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(14, 14, 14))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(Id)
                            .addGap(18, 18, 18)
                            .addComponent(SelectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SelectId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100))))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(InSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SelectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SelectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Id)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Itemname)
                    .addComponent(edItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity)
                    .addComponent(EdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalcost)
                    .addComponent(EdTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Indelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(370, 120, 560, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackInEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackInEditActionPerformed
         setVisible(false);
         InventoryCategory object = new InventoryCategory ();
         object.setVisible(true);
    }//GEN-LAST:event_BackInEditActionPerformed

    private void IndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndeleteActionPerformed
          try{
            stmt = conn.createStatement();
            String id = SelectId.getSelectedItem();
            String sql = "DELETE FROM inventory WHERE id = '"+id+"'";
            stmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null,"Data is successfully deleted.");

            setVisible(false);
            displayInventory object = new displayInventory();
            object.setVisible(true);

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_IndeleteActionPerformed

    private void InUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InUpdateActionPerformed
        try{
            stmt = conn.createStatement(); 
            String id = (SelectId.getSelectedItem());
            int iQuantity = Integer.parseInt(EdQuantity.getText());
            String iSupplier = EdSupplier.getText();           
               
            double iCost = 0.0;
                try 
                    {
                        iCost = Double.parseDouble(EdTotalCost.getText());
                    } catch (NumberFormatException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Cost must be a valid number.");
                        return;        
                    }
                
                if (iSupplier.isEmpty()) 
                    {
                        JOptionPane.showMessageDialog(null, "All fields are required.");
                    } 
                else{
                    String sql = "UPDATE inventory SET quantity = '"+iQuantity+"', supplier = '"+iSupplier+"', cost = '"+iCost+"' WHERE id = '"+id+"' ";

                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Data is successfully updated.");

                    setVisible(false);
                    displayInventory object = new displayInventory();
                    object.setVisible(true);
                }
         
            

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
    }//GEN-LAST:event_InUpdateActionPerformed

    private void InSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InSearchActionPerformed
        try {
            
            stmt = conn.createStatement();
            String id = SelectId.getSelectedItem();
            String sql = "SELECT * FROM inventory WHERE (id) = ('"+id+"')";
            rs = stmt.executeQuery(sql);

            if (rs.next()) 
                {               
                    edItemName.setText(rs.getString("product"));                
                    EdSupplier.setText(rs.getString("supplier"));
                    EdQuantity.setText(rs.getString("quantity"));
                    EdTotalCost.setText(rs.getString("cost"));       
                } 
            else 
                {
                    JOptionPane.showMessageDialog(null, "Record Not found");
                }
        } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }     
    }//GEN-LAST:event_InSearchActionPerformed

    private void edItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edItemNameActionPerformed

    }//GEN-LAST:event_edItemNameActionPerformed

    private void EdQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdQuantityActionPerformed

    }//GEN-LAST:event_EdQuantityActionPerformed

    private void EdTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdTotalCostActionPerformed

    }//GEN-LAST:event_EdTotalCostActionPerformed

    private void SelectMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectMonthActionPerformed

    }//GEN-LAST:event_SelectMonthActionPerformed

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
            java.util.logging.Logger.getLogger(editItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackInEdit;
    private javax.swing.JTextField EdQuantity;
    private javax.swing.JTextField EdSupplier;
    private javax.swing.JTextField EdTotalCost;
    private javax.swing.JLabel EditItem;
    private javax.swing.JLabel Id;
    private javax.swing.JButton InSearch;
    private javax.swing.JButton InUpdate;
    private javax.swing.JButton Indelete;
    private javax.swing.JLabel Itemname;
    private java.awt.Choice SelectId;
    private javax.swing.JComboBox<String> SelectMonth;
    private javax.swing.JTextField edItemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel totalcost;
    // End of variables declaration//GEN-END:variables
}
