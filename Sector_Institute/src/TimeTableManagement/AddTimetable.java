package TimeTableManagement;

import DataBaseCode.databaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AddTimetable extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public AddTimetable() {
        super("AddG12Timetable");
        initComponents();
        conn = databaseConnection.connection();
        searchById();
              
    }
 
    
    public void searchById(){
            try{
               stmt=conn.createStatement();
               String sql = "select id FROM teacher";
               ResultSet res = stmt.executeQuery(sql);
               
               while(res.next())
               {
                  g12selectTeacher.add(res.getString("id"));
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
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        backg12addtime = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        t12Teacher = new javax.swing.JLabel();
        g12save = new javax.swing.JButton();
        g12selectTeacher = new java.awt.Choice();
        jLabel4 = new javax.swing.JLabel();
        SelectGrade = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        t13Date = new javax.swing.JLabel();
        g13Time = new javax.swing.JLabel();
        t13Hall = new javax.swing.JLabel();
        g12selectSubject = new javax.swing.JTextField();
        t13Subject = new javax.swing.JLabel();
        subg12addtime = new javax.swing.JButton();
        g12StartTime = new javax.swing.JTextField();
        g12hall = new javax.swing.JComboBox<>();
        g12selectdate = new com.toedter.calendar.JDateChooser();
        g12selectName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddStime = new javax.swing.JButton();
        AddETime = new javax.swing.JButton();
        g12EndTime = new javax.swing.JTextField();

        timePicker1.setForeground(new java.awt.Color(0, 102, 102));
        timePicker1.setDisplayText(g12StartTime);

        timePicker2.setForeground(new java.awt.Color(0, 102, 102));
        timePicker2.setDisplayText(g12EndTime);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 650));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TimeTable");

        jLabel20.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Sector");

        jLabel21.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Higher Education Institute");

        backg12addtime.setBackground(new java.awt.Color(0, 102, 102));
        backg12addtime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backg12addtime.setForeground(new java.awt.Color(255, 255, 255));
        backg12addtime.setText("Back");
        backg12addtime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        backg12addtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backg12addtimeActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Management");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Timetable");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(backg12addtime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(backg12addtime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(0, 0, 300, 650);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 650));

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setPreferredSize(new java.awt.Dimension(580, 150));

        t12Teacher.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        t12Teacher.setText("Teacher ID");

        g12save.setBackground(new java.awt.Color(0, 102, 102));
        g12save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g12save.setForeground(new java.awt.Color(255, 255, 255));
        g12save.setText("Save");
        g12save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12saveActionPerformed(evt);
            }
        });

        g12selectTeacher.setBackground(new java.awt.Color(204, 255, 255));
        g12selectTeacher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Grade");

        SelectGrade.setBackground(new java.awt.Color(204, 255, 204));
        SelectGrade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SelectGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "13" }));
        SelectGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectGradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(g12save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t12Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g12selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(182, 182, 182))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t12Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(g12save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setPreferredSize(new java.awt.Dimension(580, 380));

        t13Date.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        t13Date.setText("Date");

        g13Time.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        g13Time.setText("Start Time");

        t13Hall.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        t13Hall.setText("Hall");

        t13Subject.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        t13Subject.setText("Subject");

        subg12addtime.setBackground(new java.awt.Color(0, 102, 102));
        subg12addtime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subg12addtime.setForeground(new java.awt.Color(255, 255, 255));
        subg12addtime.setText("Submit");
        subg12addtime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        subg12addtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subg12addtimeActionPerformed(evt);
            }
        });

        g12StartTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        g12StartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12StartTimeActionPerformed(evt);
            }
        });

        g12hall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        g12hall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hall 1", "Hall 2", "Hall 3", "Hall 4", "Hall 5", "Hall 6", " ", " " }));

        g12selectdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        g12selectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12selectNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setText("Teacher");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("End Time");

        AddStime.setBackground(new java.awt.Color(204, 255, 204));
        AddStime.setText("Add Time");
        AddStime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStimeActionPerformed(evt);
            }
        });

        AddETime.setBackground(new java.awt.Color(204, 255, 204));
        AddETime.setText("Add Time");
        AddETime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddETimeActionPerformed(evt);
            }
        });

        g12EndTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        g12EndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12EndTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(t13Date, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(g12selectdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t13Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(g12selectSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(g12selectName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(subg12addtime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(t13Hall, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(g12hall, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(g13Time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(g12StartTime, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(g12EndTime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddStime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddETime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(137, 137, 137))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g12selectName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g12selectSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t13Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t13Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12selectdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g12StartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g13Time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g12EndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddETime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t13Hall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g12hall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(subg12addtime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backg12addtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backg12addtimeActionPerformed
        setVisible(false);
        TimeTableCategory object = new TimeTableCategory();
        object.setVisible(true);
    }//GEN-LAST:event_backg12addtimeActionPerformed

    private void g12saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12saveActionPerformed
        try{
            stmt = conn.createStatement();
            String sql = "SELECT name,subject FROM teacher WHERE id = '"+g12selectTeacher.getSelectedItem()+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next())
                {
                    g12selectName.setText(rs.getString("name"));
                    g12selectSubject.setText(rs.getString("subject"));
                }
            else
                {
                    JOptionPane.showMessageDialog(null,"Record Not found");
                }

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_g12saveActionPerformed

    private void subg12addtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subg12addtimeActionPerformed
    if (SelectGrade.getSelectedItem() == "12")
        {
           try {
                stmt = conn.createStatement();
                String t12ID = (String)g12selectTeacher.getSelectedItem();
                String t12Subject = g12selectSubject.getText();
                String t12Name = g12selectName.getText();                   
                String t12Date = ((JTextField) g12selectdate.getDateEditor().getUiComponent()).getText();
                String t12StartTime = g12StartTime.getText();
                String t12EndTime = g12EndTime.getText();
                String t12hall = (String)g12hall.getSelectedItem();


                if (t12ID.isEmpty() || t12Subject.isEmpty() || t12Name.isEmpty() || t12Date.isEmpty() || t12StartTime.isEmpty() || t12EndTime.isEmpty() || t12hall.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required.");
                } else {

                    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
                    Date startTime = dateFormat.parse(t12StartTime);
                    Date endTime = dateFormat.parse(t12EndTime);


                    String query12 = "SELECT * FROM g12_timetable WHERE hall = '"+t12hall+"' AND day = '"+t12Date+"'";
                    ResultSet resultSet12 = stmt.executeQuery(query12);
                    boolean isAvailable12 = true;
                    while(resultSet12.next()) {
                        Date dbStartTime = dateFormat.parse(resultSet12.getString("start_time"));
                        Date dbEndTime = dateFormat.parse(resultSet12.getString("end_time"));

                        if ((startTime.after(dbStartTime) && startTime.before(dbEndTime)) || (endTime.after(dbStartTime) && endTime.before(dbEndTime)) || (startTime.before(dbStartTime) && endTime.after(dbEndTime))) {
                            isAvailable12 = false;
                            break;
                        }
                    }


                    String query13 = "SELECT * FROM g13_timetable WHERE hall = '"+t12hall+"' AND day = '"+t12Date+"'";
                    ResultSet resultSet13 = stmt.executeQuery(query13);
                    boolean isAvailable13 = true;
                    while(resultSet13.next()) {
                        Date dbStartTime = dateFormat.parse(resultSet13.getString("start_time"));
                        Date dbEndTime = dateFormat.parse(resultSet13.getString("end_time"));

                        if ((startTime.after(dbStartTime) && startTime.before(dbEndTime)) || (endTime.after(dbStartTime) && endTime.before(dbEndTime)) || (startTime.before(dbStartTime) && endTime.after(dbEndTime))) {
                            isAvailable13 = false;
                            break;
                        }
                    }


                    if (!isAvailable12 || !isAvailable13) {
                        JOptionPane.showMessageDialog(null, "Time slot is not available.");
                    } else {

                        String sql10 = "SELECT * from g12_timetable WHERE (day,start_time,end_time,hall) = ('"+t12Date+"','"+t12StartTime+"','"+t12EndTime+"','"+t12hall+"')";
                        ResultSet res = stmt.executeQuery(sql10);
                        if(res.next()){
                            JOptionPane.showMessageDialog(this, "Time Table already added.");
                        }else{
                            String insertQuery = "INSERT INTO g12_timetable(tid, subject, teacher, day, start_time, end_time, hall) VALUES ('"+t12ID+"', '"+t12Subject+"', '"+t12Name+"','"+t12Date+"', '"+t12StartTime+"', '"+t12EndTime+"', '"+t12hall+"')";
                        stmt.executeUpdate(insertQuery);
                        JOptionPane.showMessageDialog(null, "Data is successfully inserted.");
                        }


                    }
                }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            
        }
    else
        {
            try {
                stmt = conn.createStatement();
                String t12ID = (String)g12selectTeacher.getSelectedItem();
                String t12Subject = g12selectSubject.getText();
                String t12Name = g12selectName.getText();                   
                String t12Date = ((JTextField) g12selectdate.getDateEditor().getUiComponent()).getText();
                String t12StartTime = g12StartTime.getText();
                String t12EndTime = g12EndTime.getText();
                String t12hall = (String)g12hall.getSelectedItem();


                if (t12ID.isEmpty() || t12Subject.isEmpty() || t12Name.isEmpty() || t12Date.isEmpty() || t12StartTime.isEmpty() || t12EndTime.isEmpty() || t12hall.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required.");
                } else {

                    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
                    Date startTime = dateFormat.parse(t12StartTime);
                    Date endTime = dateFormat.parse(t12EndTime);


                    String query12 = "SELECT * FROM g12_timetable WHERE hall = '"+t12hall+"' AND day = '"+t12Date+"'";
                    ResultSet resultSet12 = stmt.executeQuery(query12);
                    boolean isAvailable12 = true;
                    while(resultSet12.next()) {
                        Date dbStartTime = dateFormat.parse(resultSet12.getString("start_time"));
                        Date dbEndTime = dateFormat.parse(resultSet12.getString("end_time"));

                        if ((startTime.after(dbStartTime) && startTime.before(dbEndTime)) || (endTime.after(dbStartTime) && endTime.before(dbEndTime)) || (startTime.before(dbStartTime) && endTime.after(dbEndTime))) {
                            isAvailable12 = false;
                            break;
                        }
                    }


                    String query13 = "SELECT * FROM g13_timetable WHERE hall = '"+t12hall+"' AND day = '"+t12Date+"'";
                    ResultSet resultSet13 = stmt.executeQuery(query13);
                    boolean isAvailable13 = true;
                    while(resultSet13.next()) {
                        Date dbStartTime = dateFormat.parse(resultSet13.getString("start_time"));
                        Date dbEndTime = dateFormat.parse(resultSet13.getString("end_time"));

                        if ((startTime.after(dbStartTime) && startTime.before(dbEndTime)) || (endTime.after(dbStartTime) && endTime.before(dbEndTime)) || (startTime.before(dbStartTime) && endTime.after(dbEndTime))) {
                            isAvailable13 = false;
                            break;
                        }
                    }


                    if (!isAvailable12 || !isAvailable13) {
                        JOptionPane.showMessageDialog(null, "Time slot is not available.");
                    } else {

                        String sql10 = "SELECT * from g13_timetable WHERE (day,start_time,end_time,hall) = ('"+t12Date+"','"+t12StartTime+"','"+t12EndTime+"','"+t12hall+"')";
                        ResultSet res = stmt.executeQuery(sql10);
                        if(res.next()){
                            JOptionPane.showMessageDialog(this, "Time Table already added.");
                        }else{
                            String insertQuery = "INSERT INTO g13_timetable(tid, subject, teacher, day, start_time, end_time, hall) VALUES ('"+t12ID+"', '"+t12Subject+"', '"+t12Name+"','"+t12Date+"', '"+t12StartTime+"', '"+t12EndTime+"', '"+t12hall+"')";
                        stmt.executeUpdate(insertQuery);
                        JOptionPane.showMessageDialog(null, "Data is successfully inserted.");
                        }

                    }
                }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        }
    }//GEN-LAST:event_subg12addtimeActionPerformed

    private void g12StartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12StartTimeActionPerformed

    }//GEN-LAST:event_g12StartTimeActionPerformed

    private void g12selectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12selectNameActionPerformed

    }//GEN-LAST:event_g12selectNameActionPerformed

    private void AddStimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStimeActionPerformed
        timePicker1.showPopup(this, 42, 185);
    }//GEN-LAST:event_AddStimeActionPerformed

    private void g12EndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12EndTimeActionPerformed
        
    }//GEN-LAST:event_g12EndTimeActionPerformed

    private void AddETimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddETimeActionPerformed
        timePicker2.showPopup(this,42, 185);
    }//GEN-LAST:event_AddETimeActionPerformed

    private void SelectGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectGradeActionPerformed

    }//GEN-LAST:event_SelectGradeActionPerformed

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
            java.util.logging.Logger.getLogger(AddTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddETime;
    private javax.swing.JButton AddStime;
    private javax.swing.JComboBox<String> SelectGrade;
    private javax.swing.JButton backg12addtime;
    private javax.swing.JTextField g12EndTime;
    private javax.swing.JTextField g12StartTime;
    private javax.swing.JComboBox<String> g12hall;
    private javax.swing.JButton g12save;
    private javax.swing.JTextField g12selectName;
    private javax.swing.JTextField g12selectSubject;
    private java.awt.Choice g12selectTeacher;
    private com.toedter.calendar.JDateChooser g12selectdate;
    private javax.swing.JLabel g13Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton subg12addtime;
    private javax.swing.JLabel t12Teacher;
    private javax.swing.JLabel t13Date;
    private javax.swing.JLabel t13Hall;
    private javax.swing.JLabel t13Subject;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    // End of variables declaration//GEN-END:variables
}
