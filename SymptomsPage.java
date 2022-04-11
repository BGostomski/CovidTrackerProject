/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tracker;

import java.sql.Connection;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author baile
 */
public class SymptomsPage extends javax.swing.JFrame {
    Connection con;
    
    /**
     * Creates new form SymptomsPage
     */
    String uName;
    public SymptomsPage() {
    }
    public SymptomsPage(String userName)
    {
        initComponents();
        this.uName=userName;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cough = new javax.swing.JCheckBox();
        fever = new javax.swing.JCheckBox();
        shortness = new javax.swing.JCheckBox();
        throat = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        nausea = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        noSymptoms = new javax.swing.JCheckBox();
        startDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cough.setText("Cough");

        fever.setText("Fever");

        shortness.setText("Shortness of Breath");

        throat.setText("Sore Throat");

        jLabel1.setText("Symptoms");

        nausea.setText("Nausea");

        jLabel2.setText("Start Date:");

        noSymptoms.setText("No Symptoms");

        startDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fever)
                            .addComponent(cough))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shortness)
                            .addComponent(nausea))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(throat))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1)
                    .addComponent(noSymptoms))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cough)
                    .addComponent(shortness)
                    .addComponent(throat))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fever)
                            .addComponent(nausea)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noSymptoms)
                            .addComponent(jButton1))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String test = uName;
            
            con = Connections.getConnection();
            Date date = new Date();
            java.sql.Date sqldate;
            sqldate = new java.sql.Date(date.getTime());
            
            String sqlQuery = "UPDATE userinfo SET cough=?, shortness=?,throat=?, fever=?, nausea=?, symptonDate=?, submission=? where userName='"+uName+"' ";
            //String sqlQuery = "UPDATE userinfo set cough='"+value1+"', shortness='"+value2+"', throat='"+value3+"', fever='"+value4+"', nausea='"+value5+"', startDate='"+startDate+"', submission='"+sqldate+"' where username='"+test+"' ";
            PreparedStatement pst = con.prepareStatement(sqlQuery);
            pst.setBoolean(1, false);
            if(cough.isSelected())
            {
                System.out.print("test");
                pst.setBoolean(1, true);
                pst.setString(6, ((JTextField)startDate.getDateEditor().getUiComponent()).getText());
            }
            pst.setBoolean(2, false);
            if(shortness.isSelected())
            {
                pst.setBoolean(2, true);
            }
            pst.setBoolean(3, false);
            if(throat.isSelected())
            {
                pst.setBoolean(3, true);
            }
            pst.setBoolean(4, false);
            if(fever.isSelected())
            {
                pst.setBoolean(4, true);
            }
            pst.setBoolean(5, false);
            if(nausea.isSelected())
            {
                pst.setBoolean(5, true);
            }
            pst.setString(6, ((JTextField)startDate.getDateEditor().getUiComponent()).getText());
            if(noSymptoms.isSelected()){
                pst.setNull(6, Types.NULL);
            }
            //pst.setNull(6, Types.NULL);
            //pst.setString(6, ((JTextField)startDate.getDateEditor().getUiComponent()).getText());
            pst.setDate(7, sqldate);
            
            System.out.println(pst);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registration Successful");
            
            con.close();
            
            dispose();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SymptomsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SymptomsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SymptomsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SymptomsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SymptomsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cough;
    private javax.swing.JCheckBox fever;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox nausea;
    private javax.swing.JCheckBox noSymptoms;
    private javax.swing.JCheckBox shortness;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JCheckBox throat;
    // End of variables declaration//GEN-END:variables
}
