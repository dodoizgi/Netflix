/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.lang.NullPointerException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Faruk
 */
public class sign extends javax.swing.JFrame {
//    Operation op=new Operation();
    Connection con = null;
    Statement sta = null;
    PreparedStatement psta= null;
    PreparedStatement psta2= null;
    ResultSet rs=null;
    ResultSet rs2=null;
    /**
     * Creates new form sign
     */
    public sign() {
        
         String url= "jdbc:sqlite:data.sqlite";
        
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            System.out.println("Veri tabanına bağlandı");        
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver Çalışmadı :/");
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection çalışamadı :/");
        }
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        Choose();
        
        
        Border netflix_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.red);
        netflix_title.setBorder(netflix_title_border);
        
        Border glob_label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jPanel1.setBorder(glob_label_border);
        
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        min_label.setBorder(label_border);
        close_label.setBorder(label_border);
        
        
        
    }
    
    private void Choose(){
//         String url= "jdbc:sqlite:data.sqlite";
//        
//        try {
//            Class.forName("org.sqlite.JDBC");
//            con = DriverManager.getConnection(url);
//            System.out.println("Veri tabanına bağlandı");        
//             
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Driver Çalışmadı :/");
//        } catch (SQLException ex) {
//            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Connection çalışamadı :/");
//        }
        
        
        try{
            String sql="select * from tur ";
            psta=con.prepareStatement(sql);
            rs=psta.executeQuery();
            
            while(rs.next()){
                ComboItem tur = new ComboItem( rs.getInt("id") , rs.getString("ad"));
                tur_box.addItem(tur);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            String sql="select * from tur ";
            psta=con.prepareStatement(sql);
            rs=psta.executeQuery();
            
            while(rs.next()){
                ComboItem tur = new ComboItem( rs.getInt("id") , rs.getString("ad"));
                tur_box1.addItem(tur);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            String sql="select * from tur ";
            psta=con.prepareStatement(sql);
            rs=psta.executeQuery();
            
            while(rs.next()){
                ComboItem tur = new ComboItem( rs.getInt("id") , rs.getString("ad"));
                tur_box2.addItem(tur);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        error_message = new javax.swing.JLabel();
        kayitli_buton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        close_label = new javax.swing.JLabel();
        netflix_title = new javax.swing.JLabel();
        min_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ad_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        datechoose = new com.toedter.calendar.JDateChooser();
        kayit_buton1 = new javax.swing.JButton();
        tur_box = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tur_box1 = new javax.swing.JComboBox<>();
        tur_box2 = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(117, 5, 5));

        error_message.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        error_message.setForeground(new java.awt.Color(204, 0, 0));

        kayitli_buton.setForeground(new java.awt.Color(0, 84, 140));
        kayitli_buton.setText("Zaten bir hesabınız varsa, Giriş Yap!");
        kayitli_buton.setToolTipText("");
        kayitli_buton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kayitli_butonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kayitli_butonMouseExited(evt);
            }
        });
        kayitli_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitli_butonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(61, 55, 55));

        close_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        close_label.setText(" X ");
        close_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_labelMouseExited(evt);
            }
        });

        netflix_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        netflix_title.setForeground(new java.awt.Color(255, 255, 255));
        netflix_title.setText(" Netflix Kayıt Sayfası ");

        min_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        min_label.setText(" - ");
        min_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                min_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                min_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                min_labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(netflix_title)
                .addGap(55, 55, 55)
                .addComponent(min_label)
                .addGap(2, 2, 2)
                .addComponent(close_label)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netflix_title, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_label)
                    .addComponent(min_label))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adı :");

        ad_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail ID :");

        email_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Şifre :");

        password_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Doğum Tarihi :");

        datechoose.setDateFormatString("dd-MMM-yyyy");

        kayit_buton1.setBackground(new java.awt.Color(0, 84, 140));
        kayit_buton1.setForeground(new java.awt.Color(255, 255, 255));
        kayit_buton1.setText("Kayıt Ol");
        kayit_buton1.setToolTipText("");
        kayit_buton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kayit_buton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kayit_buton1MouseExited(evt);
            }
        });
        kayit_buton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_buton1ActionPerformed(evt);
            }
        });

        tur_box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tur_boxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Beğendiğiniz Türleri Giriniz");

        tur_box1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tur_box1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        tur_box2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tur_box2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        tur_box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tur_box2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(error_message, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(datechoose, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(22, 22, 22)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kayitli_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(kayit_buton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tur_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(tur_box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tur_box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(datechoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(tur_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(tur_box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(tur_box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayit_buton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitli_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(error_message, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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

    private void kayitli_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitli_butonActionPerformed
        
        
        
        AdminPanel kayit=new AdminPanel();
        kayit.setLocationRelativeTo(null);
        setVisible(false);
        kayit.setVisible(true);

    }//GEN-LAST:event_kayitli_butonActionPerformed

    private void close_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_labelMouseClicked

    private void close_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        close_label.setBorder(label_border);
        close_label.setForeground(Color.white);
    }//GEN-LAST:event_close_labelMouseEntered

    private void close_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        close_label.setBorder(label_border);
        close_label.setForeground(Color.black);
    }//GEN-LAST:event_close_labelMouseExited

    private void min_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_labelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_min_labelMouseClicked

    private void min_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_labelMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        min_label.setBorder(label_border);
        min_label.setForeground(Color.white);
    }//GEN-LAST:event_min_labelMouseEntered

    private void min_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_labelMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        min_label.setBorder(label_border);
        min_label.setForeground(Color.black);
    }//GEN-LAST:event_min_labelMouseExited

    private void kayitli_butonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayitli_butonMouseEntered
       
    }//GEN-LAST:event_kayitli_butonMouseEntered

    private void kayitli_butonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayitli_butonMouseExited
       
    }//GEN-LAST:event_kayitli_butonMouseExited

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void kayit_buton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayit_buton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_buton1MouseEntered

    private void kayit_buton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayit_buton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_buton1MouseExited

    private void kayit_buton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_buton1ActionPerformed
     
        
        
        
        
        try{
            
          String sql2="select id from kullanici where email = ?";
          
          psta2=con.prepareStatement(sql2);
          psta2.setString(1, email_field.getText());
          rs2 = psta2.executeQuery();
          if(rs2.next()){
              System.out.println("Hata");
          }else{
            
            ComboItem tur1 = (ComboItem) tur_box.getSelectedItem();
            ComboItem tur2 = (ComboItem) tur_box1.getSelectedItem();
            ComboItem tur3 = (ComboItem) tur_box2.getSelectedItem();

            String sql="Insert into kullanici (adi,email,password,birthday,tur1,tur2,tur3) values(?,?,?,?,?,?,?)";

            psta=con.prepareStatement(sql);
            psta.setString(1, ad_field.getText());
            psta.setString(2, email_field.getText());
            psta.setString(3, password_field.getText());
            psta.setString(4, ((JTextField)datechoose.getDateEditor().getUiComponent()).getText());
            psta.setInt(5, tur1.getValue());
            psta.setInt(6, tur2.getValue());
            psta.setInt(7, tur3.getValue());

            psta.execute();

            JOptionPane.showMessageDialog(null, "Kaydedildi");
            rs.close();
            psta.close();
            dispose();
            AdminPanel yeniKayit=new AdminPanel();
            yeniKayit.setLocationRelativeTo(null);
            yeniKayit.setVisible(true);
          }
          
      }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_kayit_buton1ActionPerformed

    private void tur_boxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tur_boxPopupMenuWillBecomeInvisible
//         String url= "jdbc:sqlite:data.sqlite";
//        
//        try {
//            Class.forName("org.sqlite.JDBC");
//            con = DriverManager.getConnection(url);
//            System.out.println("Veri tabanına bağlandı");        
//             
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Driver Çalışmadı :/");
//        } catch (SQLException ex) {
//            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Connection çalışamadı :/");
//        }
        
        ComboItem tmp = (ComboItem) tur_box.getSelectedItem();
        System.out.println(tmp.getValue()); 
        
       // String tmp=(String)tur_box.getSelectedItem();
        /*String sql="select * from tur where adi=?";
        
        try{
            psta=con.prepareStatement(sql);
            psta.setString(1, tmp);         
            rs=psta.executeQuery();
            if(rs.next()){
              String add1=rs.getString("adi");
              
                    
                
            }
        }
        catch(Exception e){
            System.out.println(e);
            
        }*/
    }//GEN-LAST:event_tur_boxPopupMenuWillBecomeInvisible

    private void tur_box1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tur_box1PopupMenuWillBecomeInvisible
       /* String tmp=(String)tur_box1.getSelectedItem();
        String sql="select * from tur where ad=?";
        
        try{
            psta=con.prepareStatement(sql);
            psta.setString(1, tmp);         
            rs=psta.executeQuery();
            if(rs.next()){
              String add1=rs.getString("ad");
              
                    
                
            }
        }
        catch(Exception e){
            System.out.println(e);
            
        }*/
    }//GEN-LAST:event_tur_box1PopupMenuWillBecomeInvisible

    private void tur_box2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tur_box2PopupMenuWillBecomeInvisible
        /*String tmp=(String)tur_box2.getSelectedItem();
        String sql="select * from tur where ad=?";
        
        try{
            psta=con.prepareStatement(sql);
            psta.setString(1, tmp);         
            rs=psta.executeQuery();
            if(rs.next()){
              String add1=rs.getString("ad");
              
                    
                
            }
        }
        catch(Exception e){
            System.out.println(e);
            
        }*/
    }//GEN-LAST:event_tur_box2PopupMenuWillBecomeInvisible

    private void tur_box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tur_box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tur_box2ActionPerformed

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
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        UtilDateModel model = new UtilDateModel();
//        JDatePanelImpl datePanel = new JDatePanelImpl(model);
//        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
//        
//        frame1.add(datePicker);
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_field;
    private javax.swing.JLabel close_label;
    private com.toedter.calendar.JDateChooser datechoose;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel error_message;
    private javax.swing.JComboBox<String> jComboBox1;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JButton kayit_buton1;
    private javax.swing.JButton kayitli_buton;
    private javax.swing.JLabel min_label;
    private javax.swing.JLabel netflix_title;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JComboBox<ComboItem> tur_box;
    private javax.swing.JComboBox<ComboItem> tur_box1;
    private javax.swing.JComboBox<ComboItem> tur_box2;
    // End of variables declaration//GEN-END:variables
}
