package SalaryManagement;

import DataBaseCode.databaseConnection;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AddTeacherSalary extends javax.swing.JFrame {
    Connection conn = null;
    Statement stmt = null;   
    ResultSet rs = null;

    public AddTeacherSalary() {
        super("AddTeacherSalary");
        initComponents();
        conn = databaseConnection.connection();
        searchByTId();
        ChangeTName();
        SetTName();
    }
    public void ChangeTName(){
           ATSTeacherID.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    try{
                        stmt = conn.createStatement();
                        String sql = "SELECT *  FROM teacher WHERE id = '"+ATSTeacherID.getSelectedItem()+"'";
                        rs = stmt.executeQuery(sql);

                        while(rs.next()){
                        ATSName.setText(rs.getString("name"));
                        ATSFees.setText(rs.getString("student_fee"));
                        
                        }
                    }catch(SQLException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
       }
    
       public void SetTName(){
        try{
            stmt = conn.createStatement();
            String sql = "SELECT *  FROM teacher WHERE id = '"+ATSTeacherID.getSelectedItem()+"'";
            rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                ATSName.setText(rs.getString("name"));
                ATSFees.setText(rs.getString("student_fee"));               
            }  
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void searchByTId(){
        try{
            stmt = conn.createStatement();
            String sql = "SELECT * FROM teacher";
            ResultSet res = stmt.executeQuery(sql);
            
            while(res.next())
                {
                    ATSTeacherID.add(res.getString("id"));
                }
            
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
        ATSBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ATSGrade = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        ATSName = new javax.swing.JLabel();
        ATSSave = new javax.swing.JButton();
        ATSTeacherID = new java.awt.Choice();
        jLabel14 = new javax.swing.JLabel();
        ATSSelectMonth = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ATSSubmit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ATSTotalStudents = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paids = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        notpaids = new javax.swing.JLabel();
        PaidAmountTotal = new javax.swing.JLabel();
        ATSFees = new javax.swing.JLabel();
        ATSMonthlySalary = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ATSMonthlyINSProfit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 650));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salary");

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sector");

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Higher Education Institute");

        ATSBack.setBackground(new java.awt.Color(0, 102, 102));
        ATSBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ATSBack.setForeground(new java.awt.Color(255, 255, 255));
        ATSBack.setText("Back");
        ATSBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ATSBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATSBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Management");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Teachers' Salary");
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(ATSBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(ATSBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 650);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 650));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 250));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setText("Teacher's Name");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Teacher's Information");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setText("Grade");

        ATSGrade.setBackground(new java.awt.Color(204, 255, 204));
        ATSGrade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "13" }));
        ATSGrade.setPreferredSize(new java.awt.Dimension(70, 30));
        ATSGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATSGradeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setText("Teacher's ID");

        ATSName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ATSSave.setBackground(new java.awt.Color(0, 102, 102));
        ATSSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ATSSave.setForeground(new java.awt.Color(255, 255, 255));
        ATSSave.setText("Save");
        ATSSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATSSaveActionPerformed(evt);
            }
        });

        ATSTeacherID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSTeacherID.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setText("Select Month");

        ATSSelectMonth.setBackground(new java.awt.Color(204, 255, 204));
        ATSSelectMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSSelectMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        ATSSelectMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATSSelectMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ATSSelectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ATSSave, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ATSTeacherID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ATSGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ATSName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ATSGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ATSTeacherID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ATSName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ATSSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ATSSelectMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 400));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Student Fee");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Calculate Monthly Salary");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Monthly Salary");

        ATSSubmit.setBackground(new java.awt.Color(0, 102, 102));
        ATSSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ATSSubmit.setForeground(new java.awt.Color(255, 255, 255));
        ATSSubmit.setText("Submit");
        ATSSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ATSSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATSSubmitActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setText("Total Students");

        ATSTotalStudents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSTotalStudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ATSTotalStudents.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Paid Students");
        jLabel5.setPreferredSize(new java.awt.Dimension(130, 30));

        paids.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        paids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paids.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setText("Not Paid Students");
        jLabel6.setPreferredSize(new java.awt.Dimension(140, 30));

        notpaids.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        notpaids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notpaids.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PaidAmountTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PaidAmountTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PaidAmountTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ATSFees.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSFees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ATSFees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ATSMonthlySalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSMonthlySalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ATSMonthlySalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setText("Total Amount");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel15.setText("Institute Fees");

        ATSMonthlyINSProfit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ATSMonthlyINSProfit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ATSMonthlyINSProfit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(ATSFees, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(notpaids, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(ATSTotalStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(paids, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(PaidAmountTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ATSMonthlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ATSMonthlyINSProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(269, 269, 269))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(ATSSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ATSFees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ATSTotalStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paids, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notpaids, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaidAmountTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ATSMonthlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ATSMonthlyINSProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ATSSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(300, 0, 800, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ATSBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATSBackActionPerformed
        setVisible(false);
        TeachersSalary object = new TeachersSalary();
        object.setVisible(true);
       
    }//GEN-LAST:event_ATSBackActionPerformed

    private void ATSSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATSSubmitActionPerformed
        if(ATSGrade.getSelectedItem() == "12")
            {
                try{
                 stmt = conn.createStatement();

                 String atsTotalStudentsStr = ATSTotalStudents.getText();
                     if (atsTotalStudentsStr.isEmpty()) {
                         JOptionPane.showMessageDialog(null, "Select Teacher ID,Month and then click save button.");
                         return; // Exit the method if the field is empty
                     }
                     int atsTotalStudents = Integer.parseInt(atsTotalStudentsStr);

                 String atsID = ATSTeacherID.getSelectedItem();
                 String atsMonth = (String) ATSSelectMonth.getSelectedItem();
                 int atsPaidStudents = Integer.parseInt(paids.getText());
                 int atsNotPaidStudents = Integer.parseInt(notpaids.getText());

                 double sFee = 0.0;
                     try {
                         sFee = Double.parseDouble(ATSFees.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Student fee must be a valid number.");
                         return; // Exit the method if fee is not valid
                     }

                 double sFee1 = 0.0;
                     try {
                         sFee1 = Double.parseDouble(PaidAmountTotal.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Total fee must be a valid number.");
                         return; // Exit the method if fee is not valid
                     }

                 double sFee2 = 0.0;
                     try {
                         sFee2 = Double.parseDouble(ATSMonthlySalary.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Salary must be a valid number.");
                         return; 
                     }

                 double sFee3 = 0.0;
                     try {
                         sFee3 = Double.parseDouble(ATSMonthlyINSProfit.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Profit must be a valid number.");
                         return; 
                     }

                     String sql10 = "SELECT * from g12_teacher_salary WHERE tid = '"+atsID+"' AND month = '"+atsMonth+"' ";
                     ResultSet res = stmt.executeQuery(sql10);

                     if(res.next())
                             {
                                 JOptionPane.showMessageDialog(this, "Payment records already exist.");
                             }
                     else
                             {
                                 String sql = "INSERT INTO g12_teacher_salary(tid, month, student_fee, total_students, paid_students, notpaid_students, total_fees, monthly_salary, institute_fee) values('"+atsID+"','"+atsMonth+"','"+sFee+"','"+atsTotalStudents+"','"+atsPaidStudents+"','"+atsNotPaidStudents+"','"+sFee1+"','"+sFee2+"','"+sFee3+"')";
                                 stmt.executeUpdate(sql);
                                 JOptionPane.showMessageDialog(null,"Payment record successfully inserted.");
                             } 
             }catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(null,e);
                 }
            }
        else
            {
                try{
                 stmt = conn.createStatement();

                 String atsTotalStudentsStr = ATSTotalStudents.getText();
                     if (atsTotalStudentsStr.isEmpty()) {
                         JOptionPane.showMessageDialog(null, "Select Teacher ID,Month and then click save button.");
                         return; 
                     }
                     int atsTotalStudents = Integer.parseInt(atsTotalStudentsStr);

                 String atsID = ATSTeacherID.getSelectedItem();
                 String atsMonth = (String) ATSSelectMonth.getSelectedItem();
                 int atsPaidStudents = Integer.parseInt(paids.getText());
                 int atsNotPaidStudents = Integer.parseInt(notpaids.getText());

                 double sFee = 0.0;
                     try {
                         sFee = Double.parseDouble(ATSFees.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Student fee must be a valid number.");
                         return; 
                     }

                 double sFee1 = 0.0;
                     try {
                         sFee1 = Double.parseDouble(PaidAmountTotal.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Total fee must be a valid number.");
                         return; 
                     }

                 double sFee2 = 0.0;
                     try {
                         sFee2 = Double.parseDouble(ATSMonthlySalary.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Salary must be a valid number.");
                         return; 
                     }

                 double sFee3 = 0.0;
                     try {
                         sFee3 = Double.parseDouble(ATSMonthlyINSProfit.getText());
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(null, "Profit must be a valid number.");
                         return; 
                     }

                     String sql10 = "SELECT * from g13_teacher_salary WHERE tid = '"+atsID+"' AND month = '"+atsMonth+"' ";
                     ResultSet res = stmt.executeQuery(sql10);

                     if(res.next())
                             {
                                 JOptionPane.showMessageDialog(this, "Payment records already exist.");
                             }
                     else
                             {
                                 String sql = "INSERT INTO g13_teacher_salary(tid, month, student_fee, total_students, paid_students, notpaid_students, total_fees, monthly_salary, institute_fee) values('"+atsID+"','"+atsMonth+"','"+sFee+"','"+atsTotalStudents+"','"+atsPaidStudents+"','"+atsNotPaidStudents+"','"+sFee1+"','"+sFee2+"','"+sFee3+"')";
                                 stmt.executeUpdate(sql);
                                 JOptionPane.showMessageDialog(null,"Payment record successfully inserted.");
                             } 
             }catch(Exception e)
                 {
                     JOptionPane.showMessageDialog(null,e);
                 }
            }
        
        
    }//GEN-LAST:event_ATSSubmitActionPerformed

    private void ATSSelectMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATSSelectMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ATSSelectMonthActionPerformed

    private void ATSGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATSGradeActionPerformed

    }//GEN-LAST:event_ATSGradeActionPerformed

    private void ATSSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATSSaveActionPerformed
        if(ATSGrade.getSelectedItem() == "12")
            {
                //Calculate Total Students
                try{
                   stmt = conn.createStatement();
                   String atsID = ATSTeacherID.getSelectedItem();
                   String atsMonth = (String) ATSSelectMonth.getSelectedItem();

                   String sql = "SELECT COUNT(*) FROM g12_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth +"'";
                   rs = stmt.executeQuery(sql);

                   if(rs.next())
                                {  
                                    int count = rs.getInt(1);
                                    ATSTotalStudents.setText(String.valueOf(count));

                                }
                            else
                                {
                                    JOptionPane.showMessageDialog(null,"Record Not found");
                                }

               }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }

                //Calculate Total Paid Students
               try{
                   stmt = conn.createStatement();
                   String atsID = ATSTeacherID.getSelectedItem();
                   String atsMonth = (String) ATSSelectMonth.getSelectedItem();


                  String sql = "SELECT COUNT(*) FROM g12_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth + "' AND payment = 'Paid'";
                   rs = stmt.executeQuery(sql);

                   if(rs.next())
                                {  
                                    int count = rs.getInt(1);
                                    paids.setText(String.valueOf(count));

                                }
                            else
                                {
                                    JOptionPane.showMessageDialog(null,"Record Not found");
                                }

               }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }

               //Calculate Total Not Paid Students
               try{
                   stmt = conn.createStatement();
                   String atsID = ATSTeacherID.getSelectedItem();
                   String atsMonth = (String) ATSSelectMonth.getSelectedItem();

                   String sql = "SELECT COUNT(*) FROM g12_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth + "' AND payment = 'Not paid'";
                   rs = stmt.executeQuery(sql);

                   if(rs.next())
                                {  
                                    int count = rs.getInt(1);
                                    notpaids.setText(String.valueOf(count));

                                }
                            else
                                {
                                    JOptionPane.showMessageDialog(null,"Record Not found");
                                }

               }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }

               //Calculate Total Student fees and teacjer salary
               try {
                    stmt = conn.createStatement();
                    String atsID = (String) ATSTeacherID.getSelectedItem();
                    String atsMonth = (String) ATSSelectMonth.getSelectedItem();

                    // Construct the SQL query to get the sum of fees
                    String sql = "SELECT SUM(fees) FROM g12_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth + "' AND payment = 'Paid'";
                    rs = stmt.executeQuery(sql);

                    if (rs.next()) {  
                        double sumFees = rs.getDouble(1); // Assuming fees column is of type double
                        PaidAmountTotal.setText( String.valueOf(sumFees)); // Display fees with "Rs" symbol
                        double teacherPayment = sumFees * 0.75; // Calculate 75% of the total fees
                        ATSMonthlySalary.setText( String.valueOf(teacherPayment)); // Display 75% of fees with "Rs" symbol
                        
                        double institutePayment = sumFees * 0.25; // Calculate 25% of the total fees
                        ATSMonthlyINSProfit.setText(String.valueOf(institutePayment)); // Display 25% of fees with "Rs" symbol
                    } else {
                        JOptionPane.showMessageDialog(null, "Record Not found");
                    }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        else
            {
                //Calculate Total Students
                try{
                   stmt = conn.createStatement();
                   String atsID = ATSTeacherID.getSelectedItem();
                   String atsMonth = (String) ATSSelectMonth.getSelectedItem();

                   String sql = "SELECT COUNT(*) FROM g13_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth +"'";
                   rs = stmt.executeQuery(sql);

                   if(rs.next())
                                {  
                                    int count = rs.getInt(1);
                                    ATSTotalStudents.setText(String.valueOf(count));

                                }
                            else
                                {
                                    JOptionPane.showMessageDialog(null,"Record Not found");
                                }

               }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }

                //Calculate Total Paid Students
               try{
                   stmt = conn.createStatement();
                   String atsID = ATSTeacherID.getSelectedItem();
                   String atsMonth = (String) ATSSelectMonth.getSelectedItem();


                  String sql = "SELECT COUNT(*) FROM g13_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth + "' AND payment = 'Paid'";
                   rs = stmt.executeQuery(sql);

                   if(rs.next())
                                {  
                                    int count = rs.getInt(1);
                                    paids.setText(String.valueOf(count));

                                }
                            else
                                {
                                    JOptionPane.showMessageDialog(null,"Record Not found");
                                }

               }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }

               //Calculate Total Not Paid Students
               try{
                   stmt = conn.createStatement();
                   String atsID = ATSTeacherID.getSelectedItem();
                   String atsMonth = (String) ATSSelectMonth.getSelectedItem();

                   String sql = "SELECT COUNT(*) FROM g13_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth + "' AND payment = 'Not paid'";
                   rs = stmt.executeQuery(sql);

                   if(rs.next())
                                {  
                                    int count = rs.getInt(1);
                                    notpaids.setText(String.valueOf(count));

                                }
                            else
                                {
                                    JOptionPane.showMessageDialog(null,"Record Not found");
                                }

               }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }

               //Calculate Total Student fees and teacjer salary
               try {
                    stmt = conn.createStatement();
                    String atsID = (String) ATSTeacherID.getSelectedItem();
                    String atsMonth = (String) ATSSelectMonth.getSelectedItem();

                    // Construct the SQL query to get the sum of fees
                    String sql = "SELECT SUM(fees) FROM g13_enrollment WHERE tid = '" + atsID + "' AND month = '" + atsMonth + "' AND payment = 'Paid'";
                    rs = stmt.executeQuery(sql);

                    if (rs.next()) {  
                        double sumFees = rs.getDouble(1); // Assuming fees column is of type double
                        PaidAmountTotal.setText( String.valueOf(sumFees)); // Display fees with "Rs" symbol
                        double teacherPayment = sumFees * 0.75; // Calculate 75% of the total fees
                        ATSMonthlySalary.setText( String.valueOf(teacherPayment)); // Display 75% of fees with "Rs" symbol
                        
                        double institutePayment = sumFees * 0.25; // Calculate 25% of the total fees
                        ATSMonthlyINSProfit.setText(String.valueOf(institutePayment)); // Display 25% of fees with "Rs" symbol
                    } else {
                        JOptionPane.showMessageDialog(null, "Record Not found");
                    }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
    }//GEN-LAST:event_ATSSaveActionPerformed
                                        

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
            java.util.logging.Logger.getLogger(AddTeacherSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeacherSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeacherSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeacherSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacherSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATSBack;
    private javax.swing.JLabel ATSFees;
    private javax.swing.JComboBox<String> ATSGrade;
    private javax.swing.JLabel ATSMonthlyINSProfit;
    private javax.swing.JLabel ATSMonthlySalary;
    private javax.swing.JLabel ATSName;
    private javax.swing.JButton ATSSave;
    private javax.swing.JComboBox<String> ATSSelectMonth;
    private javax.swing.JButton ATSSubmit;
    private java.awt.Choice ATSTeacherID;
    private javax.swing.JLabel ATSTotalStudents;
    private javax.swing.JLabel PaidAmountTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel notpaids;
    private javax.swing.JLabel paids;
    // End of variables declaration//GEN-END:variables
}
