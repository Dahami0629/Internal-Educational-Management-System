package TimeTableManagement;

import DataBaseCode.databaseConnection;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class G13EditTimetable extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public G13EditTimetable() {
        super("Editg13Timetable");
        initComponents();
        conn = databaseConnection.connection();
        searchById();
        ChangeTimeID();
        SetTimeID();
        
    }
    
     public void ChangeTimeID(){
           g13EditId.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    try{
                        stmt = conn.createStatement();
                        String sql = "SELECT *  FROM g13_timetable WHERE tid = '"+g13EditId.getSelectedItem()+"'";
                        rs = stmt.executeQuery(sql);
                        
                        g13TimeID.removeAll();
                        
                        while(rs.next()){
                        g13TName.setText(rs.getString("teacher"));
                        g13TimeID.add(rs.getString("id"));
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
            String sql = "SELECT *  FROM g13_timetable WHERE tid = '"+g13EditId.getSelectedItem()+"'";
            rs = stmt.executeQuery(sql);
            
            g13TimeID.removeAll();
            
            while(rs.next())
            {
                g13TName.setText(rs.getString("teacher"));                
                g13TimeID.add(rs.getString("id"));
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
                        g13EditId.add(res.getString("id"));
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
        g13back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        g13Search = new javax.swing.JTabbedPane();
        searchpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        G13Search = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        g13TName = new javax.swing.JLabel();
        g13EditId = new java.awt.Choice();
        jLabel13 = new javax.swing.JLabel();
        g13TimeID = new java.awt.Choice();
        detailspanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        g13EditTeacher = new javax.swing.JTextField();
        g13EditSubject = new javax.swing.JTextField();
        g13EditETime1 = new javax.swing.JTextField();
        g13Update = new javax.swing.JButton();
        g13Delete = new javax.swing.JButton();
        g13EditDate = new javax.swing.JTextField();
        g13EditSTime1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SelectNewDate = new com.toedter.calendar.JDateChooser();
        AddSTime = new javax.swing.JButton();
        AddETime = new javax.swing.JButton();
        g13EditHall = new javax.swing.JComboBox<>();
        g13ViewHall = new javax.swing.JTextField();

        timePicker1.setDisplayText(g13EditSTime1);

        timePicker2.setDisplayText(g13EditETime1);

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

        g13back.setBackground(new java.awt.Color(0, 102, 102));
        g13back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g13back.setForeground(new java.awt.Color(255, 255, 255));
        g13back.setText("Back");
        g13back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        g13back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13backActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Management");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Grade 13 Timetable");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(g13back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(g13back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        g13Search.setBackground(new java.awt.Color(0, 102, 102));
        g13Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        g13Search.setForeground(new java.awt.Color(255, 255, 255));
        g13Search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        g13Search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        g13Search.setPreferredSize(new java.awt.Dimension(450, 370));
        g13Search.setRequestFocusEnabled(false);

        searchpanel.setBackground(new java.awt.Color(255, 255, 204));
        searchpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchpanel.setPreferredSize(new java.awt.Dimension(550, 340));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Teacher ID");

        G13Search.setBackground(new java.awt.Color(0, 102, 102));
        G13Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        G13Search.setForeground(new java.awt.Color(255, 255, 255));
        G13Search.setText("Search");
        G13Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        G13Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G13SearchActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setText("Name");

        g13TName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        g13TName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        g13EditId.setBackground(new java.awt.Color(204, 255, 255));
        g13EditId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setText("ID");

        g13TimeID.setBackground(new java.awt.Color(204, 255, 255));
        g13TimeID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout searchpanelLayout = new javax.swing.GroupLayout(searchpanel);
        searchpanel.setLayout(searchpanelLayout);
        searchpanelLayout.setHorizontalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchpanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(G13Search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchpanelLayout.createSequentialGroup()
                        .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(g13EditId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g13TName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g13TimeID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
        );
        searchpanelLayout.setVerticalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g13EditId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g13TName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g13TimeID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(G13Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        g13Search.addTab("Search", searchpanel);

        detailspanel.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setText("Subject");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setText("Teacher");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setText("Old Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Start Time");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setText("Hall");

        g13EditSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13EditSubjectActionPerformed(evt);
            }
        });

        g13EditETime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13EditETime1ActionPerformed(evt);
            }
        });

        g13Update.setBackground(new java.awt.Color(0, 102, 102));
        g13Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g13Update.setForeground(new java.awt.Color(255, 255, 255));
        g13Update.setText("Update");
        g13Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g13Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13UpdateActionPerformed(evt);
            }
        });

        g13Delete.setBackground(new java.awt.Color(255, 0, 0));
        g13Delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g13Delete.setForeground(new java.awt.Color(255, 255, 255));
        g13Delete.setText("Delete");
        g13Delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g13Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13DeleteActionPerformed(evt);
            }
        });

        g13EditSTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13EditSTime1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setText("End Time");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel15.setText("New Date");

        AddSTime.setBackground(new java.awt.Color(204, 255, 204));
        AddSTime.setText("Add Time");
        AddSTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSTimeActionPerformed(evt);
            }
        });

        AddETime.setBackground(new java.awt.Color(204, 255, 204));
        AddETime.setText("Add Time");
        AddETime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddETimeActionPerformed(evt);
            }
        });

        g13EditHall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g13EditHall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hall 1", "Hall 2", "Hall 3", "Hall 4", "Hall 5", "Hall 6" }));

        javax.swing.GroupLayout detailspanelLayout = new javax.swing.GroupLayout(detailspanel);
        detailspanel.setLayout(detailspanelLayout);
        detailspanelLayout.setHorizontalGroup(
            detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailspanelLayout.createSequentialGroup()
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailspanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailspanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailspanelLayout.createSequentialGroup()
                        .addComponent(g13Update, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(g13Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(g13EditTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g13EditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailspanelLayout.createSequentialGroup()
                        .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g13EditETime1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g13ViewHall, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g13EditSTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g13EditDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailspanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectNewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailspanelLayout.createSequentialGroup()
                                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(g13EditHall, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddETime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailspanelLayout.setVerticalGroup(
            detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailspanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g13EditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g13EditTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g13EditDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SelectNewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g13EditSTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g13EditETime1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddETime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g13ViewHall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(g13EditHall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(detailspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailspanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(g13Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailspanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(g13Update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        g13Search.addTab(" Details", detailspanel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(g13Search, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(g13Search, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(300, 0, 800, 650);

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

    private void g13backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13backActionPerformed
        setVisible(false);
        TimeTableCategory object = new TimeTableCategory();
        object.setVisible(true);

    }//GEN-LAST:event_g13backActionPerformed

    private void G13SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G13SearchActionPerformed
        try {
            stmt = conn.createStatement();
            String id = g13TimeID.getSelectedItem();
            String tid = g13EditId.getSelectedItem();
            String sql = "SELECT * FROM g13_timetable WHERE (id,tid) = ('"+id+"','"+tid+"')";
            rs = stmt.executeQuery(sql);

            if (rs.next()) 
                {
                    g13EditTeacher.setText(rs.getString("teacher"));
                    g13EditSubject.setText(rs.getString("subject"));
                    g13EditDate.setText(rs.getString("day"));
                    g13EditSTime1.setText(rs.getString("start_time")); 
                    g13EditETime1.setText(rs.getString("end_time"));
                    g13ViewHall.setText(rs.getString("hall"));

                    int nextTabIndex = g13Search.getSelectedIndex() +1;

                    g13Search.setSelectedIndex(nextTabIndex);

            } 
            else 
                {
                    JOptionPane.showMessageDialog(null, "Record Not found");
                }
        } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_G13SearchActionPerformed

    private void g13EditSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13EditSubjectActionPerformed

    }//GEN-LAST:event_g13EditSubjectActionPerformed

    private void g13EditETime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13EditETime1ActionPerformed

    }//GEN-LAST:event_g13EditETime1ActionPerformed

    private void g13UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13UpdateActionPerformed
        try{
            stmt = conn.createStatement();
            String id = (g13TimeID.getSelectedItem());
            String subject = g13EditSubject.getText();
            String teacher = g13EditTeacher.getText();
            String date = ((JTextField) SelectNewDate.getDateEditor().getUiComponent()).getText();  
            String StartTime = g13EditSTime1.getText();
            String EndTime = g13EditETime1.getText();             
            String hall = (String)g13EditHall.getSelectedItem();
            
            if(date.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "All fields are required.");
                }
            else
                {
                    String sql = "UPDATE g13_timetable SET subject = '"+subject+"', teacher = '"+teacher+"', day = '"+date+"', start_time = '"+StartTime+"',end_time = '"+EndTime+"', hall = '"+hall+"' WHERE id = '"+id+"' ";

                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Data is successfully updated.");

                    setVisible(false);
                    DisplayG13Timetable object = new DisplayG13Timetable();
                    object.setVisible(true);
                }
            

        }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_g13UpdateActionPerformed

    private void g13DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13DeleteActionPerformed
        try{
            stmt = conn.createStatement();
            String tid = g13TimeID.getSelectedItem();
            String sql = "DELETE FROM g13_timetable WHERE id = '"+tid+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Data is successfully deleted.");

            setVisible(false);
            DisplayG13Timetable object = new DisplayG13Timetable();
            object.setVisible(true);

        }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_g13DeleteActionPerformed

    private void g13EditSTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13EditSTime1ActionPerformed
        
    }//GEN-LAST:event_g13EditSTime1ActionPerformed

    private void AddSTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSTimeActionPerformed
       timePicker1.showPopup(this, 42, 185);
    }//GEN-LAST:event_AddSTimeActionPerformed

    private void AddETimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddETimeActionPerformed
        timePicker2.showPopup(this, 42, 185);
    }//GEN-LAST:event_AddETimeActionPerformed

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
            java.util.logging.Logger.getLogger(G13EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G13EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G13EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G13EditTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G13EditTimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddETime;
    private javax.swing.JButton AddSTime;
    private javax.swing.JButton G13Search;
    private com.toedter.calendar.JDateChooser SelectNewDate;
    private javax.swing.JPanel detailspanel;
    private javax.swing.JButton g13Delete;
    private javax.swing.JTextField g13EditDate;
    private javax.swing.JTextField g13EditETime1;
    private javax.swing.JComboBox<String> g13EditHall;
    private java.awt.Choice g13EditId;
    private javax.swing.JTextField g13EditSTime1;
    private javax.swing.JTextField g13EditSubject;
    private javax.swing.JTextField g13EditTeacher;
    private javax.swing.JTabbedPane g13Search;
    private javax.swing.JLabel g13TName;
    private java.awt.Choice g13TimeID;
    private javax.swing.JButton g13Update;
    private javax.swing.JTextField g13ViewHall;
    private javax.swing.JButton g13back;
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
