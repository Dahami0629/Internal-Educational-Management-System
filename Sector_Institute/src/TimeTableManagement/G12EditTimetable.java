package TimeTableManagement;

import DataBaseCode.databaseConnection;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class G12EditTimetable extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public G12EditTimetable() {
        super("Editg12Timetable");
        initComponents();
        conn = databaseConnection.connection();
        searchById();
        SetTimeID();
        ChangeTimeID();
    }
    
    public void ChangeTimeID(){
           g12EditId.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    try{
                        stmt = conn.createStatement();
                        String sql = "SELECT *  FROM g12_timetable WHERE tid = '"+g12EditId.getSelectedItem()+"'";
                        rs = stmt.executeQuery(sql);
                        
                        g12TimeID.removeAll();
                        
                        while(rs.next()){
                        g12TName.setText(rs.getString("teacher"));
                        g12TimeID.add(rs.getString("id"));
                        }
                    }catch(SQLException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
       }
    
    public void SetTimeID(){
        try{
            stmt = conn.createStatement();
            String sql = "SELECT *  FROM g12_timetable WHERE tid = '"+g12EditId.getSelectedItem()+"'";
            rs = stmt.executeQuery(sql);
            
            g12TimeID.removeAll();
            
            while(rs.next())
            {
                g12TName.setText(rs.getString("teacher"));                
                g12TimeID.add(rs.getString("id"));
            }  
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void searchById(){
           try{
               stmt=conn.createStatement();
               String sql = "select* FROM teacher";
               ResultSet res = stmt.executeQuery(sql);
               
               while(res.next())
                    {
                        g12EditId.add(res.getString("id"));
                    }
           }catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
    }    
    
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        g12back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        g12Search = new javax.swing.JTabbedPane();
        searchpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        G12Search = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        g12TName = new javax.swing.JLabel();
        g12EditId = new java.awt.Choice();
        g12TimeID = new java.awt.Choice();
        jLabel13 = new javax.swing.JLabel();
        detailspanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        g12EditSubject = new javax.swing.JTextField();
        g12Update = new javax.swing.JButton();
        g12Delete = new javax.swing.JButton();
        g12EditSTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        g12EditDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        g12EditETime = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        g12EditTeacher = new javax.swing.JTextField();
        SelectNewDate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        g12EditHall = new javax.swing.JComboBox<>();
        g12ViewHall = new javax.swing.JTextField();

        timePicker1.setForeground(new java.awt.Color(0, 102, 102));
        timePicker1.setDisplayText(g12EditSTime);

        timePicker2.setForeground(new java.awt.Color(0, 102, 102));
        timePicker2.setDisplayText(g12EditETime);

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
        jLabel2.setText("TimeTable");

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sector");

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Higher Education Institute");

        g12back.setBackground(new java.awt.Color(0, 102, 102));
        g12back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g12back.setForeground(new java.awt.Color(255, 255, 255));
        g12back.setText("Back");
        g12back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        g12back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12backActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Management");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Grade 12 Timetable");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(g12back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(g12back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 650);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 650));

        g12Search.setBackground(new java.awt.Color(0, 102, 102));
        g12Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        g12Search.setForeground(new java.awt.Color(255, 255, 255));
        g12Search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        g12Search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        g12Search.setPreferredSize(new java.awt.Dimension(450, 370));

        searchpanel.setBackground(new java.awt.Color(255, 255, 204));
        searchpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchpanel.setPreferredSize(new java.awt.Dimension(550, 340));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Teacher ID");

        G12Search.setBackground(new java.awt.Color(0, 102, 102));
        G12Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        G12Search.setForeground(new java.awt.Color(255, 255, 255));
        G12Search.setText("Search");
        G12Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        G12Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G12SearchActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setText("Name");

        g12TName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        g12TName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        g12EditId.setBackground(new java.awt.Color(204, 255, 255));
        g12EditId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        g12TimeID.setBackground(new java.awt.Color(204, 255, 255));
        g12TimeID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setText("ID");

        javax.swing.GroupLayout searchpanelLayout = new javax.swing.GroupLayout(searchpanel);
        searchpanel.setLayout(searchpanelLayout);
        searchpanelLayout.setHorizontalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(G12Search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchpanelLayout.createSequentialGroup()
                        .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(g12EditId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g12TName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g12TimeID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        searchpanelLayout.setVerticalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(searchpanelLayout.createSequentialGroup()
                        .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g12EditId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g12TName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g12TimeID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(G12Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        g12Search.addTab("Search", searchpanel);

        detailspanel.setBackground(new java.awt.Color(255, 255, 204));
        detailspanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        detailspanel.setPreferredSize(new java.awt.Dimension(550, 340));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setText("Subject");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setText("Hall");

        g12EditSubject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        g12EditSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12EditSubjectActionPerformed(evt);
            }
        });

        g12Update.setBackground(new java.awt.Color(0, 102, 102));
        g12Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g12Update.setForeground(new java.awt.Color(255, 255, 255));
        g12Update.setText("Update");
        g12Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g12Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12UpdateActionPerformed(evt);
            }
        });

        g12Delete.setBackground(new java.awt.Color(255, 0, 0));
        g12Delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g12Delete.setForeground(new java.awt.Color(255, 255, 255));
        g12Delete.setText("Delete");
        g12Delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g12Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12DeleteActionPerformed(evt);
            }
        });

        g12EditSTime.setMinimumSize(new java.awt.Dimension(64, 26));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Start Time");

        g12EditDate.setMinimumSize(new java.awt.Dimension(64, 26));
        g12EditDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12EditDateActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setText("Teacher");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setText("End Time");

        g12EditETime.setMinimumSize(new java.awt.Dimension(64, 26));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel15.setText("Old Date");

        g12EditTeacher.setMinimumSize(new java.awt.Dimension(64, 26));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("AddTime");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("Add Time");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setText("New Date");

        g12EditHall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g12EditHall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hall 1", "Hall 2", "Hall 3", "Hall 4", "Hall 5", "Hall 6" }));
        g12EditHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12EditHallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailspanelLayout = new javax.swing.GroupLayout(detailspanel);
        detailspanel.setLayout(detailspanelLayout);
        detailspanelLayout.setHorizontalGroup(
            detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailspanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g12EditTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12EditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailspanelLayout.createSequentialGroup()
                        .addComponent(g12EditDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectNewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(detailspanelLayout.createSequentialGroup()
                            .addComponent(g12Update, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(178, 178, 178)
                            .addComponent(g12Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailspanelLayout.createSequentialGroup()
                            .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(g12EditSTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(g12EditETime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(g12ViewHall, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(g12EditHall, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(124, 124, 124))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        detailspanelLayout.setVerticalGroup(
            detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailspanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12EditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g12EditTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(g12EditDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SelectNewDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(g12EditSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(g12EditETime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12EditHall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12ViewHall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g12Update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        g12Search.addTab(" Details", detailspanel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(g12Search, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(g12Search, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
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

    private void g12backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12backActionPerformed
                setVisible(false);
                TimeTableCategory object = new TimeTableCategory();
                object.setVisible(true);
        
    }//GEN-LAST:event_g12backActionPerformed

    private void G12SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G12SearchActionPerformed
        try {
            
            stmt = conn.createStatement();
            String id = g12TimeID.getSelectedItem();
            String tid = g12EditId.getSelectedItem();
            String sql = "SELECT * FROM g12_timetable WHERE (id,tid) = ('"+id+"','"+tid+"')";
            rs = stmt.executeQuery(sql);

            if (rs.next()) 
                {               
                    g12EditTeacher.setText(rs.getString("teacher"));                
                    g12EditSubject.setText(rs.getString("subject"));
                    g12EditDate.setText(rs.getString("day"));
                    g12EditSTime.setText(rs.getString("start_time")); 
                    g12EditETime.setText(rs.getString("end_time"));
                    g12ViewHall.setText(rs.getString("hall"));

                    int nextTabIndex = g12Search.getSelectedIndex() +1;

                    g12Search.setSelectedIndex(nextTabIndex);           
                } 
            else 
                {
                    JOptionPane.showMessageDialog(null, "Record Not found");
                }
        } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
      
    }//GEN-LAST:event_G12SearchActionPerformed

    private void g12DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12DeleteActionPerformed
        try{
            stmt = conn.createStatement();
            String tid = g12TimeID.getSelectedItem();
            String sql = "DELETE FROM g12_timetable WHERE id = '"+tid+"'";
            stmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null,"Data is successfully deleted.");

            setVisible(false);
            DisplayG12Timetable object = new DisplayG12Timetable();
            object.setVisible(true);

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_g12DeleteActionPerformed

    private void g12UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12UpdateActionPerformed
        try{
            stmt = conn.createStatement();
            String id = (g12TimeID.getSelectedItem());
            String subject = g12EditSubject.getText();
            String teacher = g12EditTeacher.getText();        
            String date = ((JTextField) SelectNewDate.getDateEditor().getUiComponent()).getText();
            String StartTime = g12EditSTime.getText();
            String EndTime = g12EditETime.getText();            
            String hall = (String)g12EditHall.getSelectedItem();

            if(date.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "All fields are required.");
                }
            else
                {
                    String sql = "UPDATE g12_timetable SET subject = '"+subject+"', teacher = '"+teacher+"', day = '"+date+"',start_time = '"+StartTime+"',end_time = '"+EndTime+"' , hall = '"+hall+"' WHERE id = '"+id+"' ";

                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Data is successfully updated.");

                    setVisible(false);
                    DisplayG12Timetable object = new DisplayG12Timetable();
                    object.setVisible(true);
                }
               
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_g12UpdateActionPerformed

    private void g12EditSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12EditSubjectActionPerformed

    }//GEN-LAST:event_g12EditSubjectActionPerformed

    private void g12EditDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12EditDateActionPerformed
        
    }//GEN-LAST:event_g12EditDateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        timePicker1.showPopup(this, 42, 185);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        timePicker2.showPopup(this, 42, 185);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void g12EditHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12EditHallActionPerformed
        
    }//GEN-LAST:event_g12EditHallActionPerformed

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
            java.util.logging.Logger.getLogger(G12EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G12EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G12EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G12EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G12EditTimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton G12Search;
    private com.toedter.calendar.JDateChooser SelectNewDate;
    private javax.swing.JPanel detailspanel;
    private javax.swing.JButton g12Delete;
    private javax.swing.JTextField g12EditDate;
    private javax.swing.JTextField g12EditETime;
    private javax.swing.JComboBox<String> g12EditHall;
    private java.awt.Choice g12EditId;
    private javax.swing.JTextField g12EditSTime;
    private javax.swing.JTextField g12EditSubject;
    private javax.swing.JTextField g12EditTeacher;
    private javax.swing.JTabbedPane g12Search;
    private javax.swing.JLabel g12TName;
    private java.awt.Choice g12TimeID;
    private javax.swing.JButton g12Update;
    private javax.swing.JTextField g12ViewHall;
    private javax.swing.JButton g12back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel searchpanel;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    // End of variables declaration//GEN-END:variables
}
