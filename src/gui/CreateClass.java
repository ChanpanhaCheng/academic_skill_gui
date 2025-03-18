package gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import academic.*;
import core.MySQLConnection;
import exception.*;
import user.*;

/**
 *
 * @author vathanak
 */
public class CreateClass extends javax.swing.JPanel {

    /**
     * Creates new form CreateClass
     */
    public CreateClass() {
        initComponents();
        for(Course c :Course.listCourses.values()){
            selectCourse.addItem(c.name);
        }
        for(User t :User.listUser.values()){
            if(t instanceof Teacher){
               Teacher tch = (Teacher) t;
               selectTeacher.addItem(tch.basicInfor());
            }
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        academic_group = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        academic_term = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        academic_year = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selectTeacher = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        selectCourse = new javax.swing.JComboBox<>();
        createClass = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(0, 51, 102));

        jLabel5.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Teacher");

        academic_group.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        academic_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academic_groupActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Term");

        academic_term.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        academic_term.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academic_termActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Group");

        academic_year.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        academic_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academic_yearActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year");

        jLabel6.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Course");

        createClass.setBackground(new java.awt.Color(0, 102, 102));
        createClass.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        createClass.setForeground(new java.awt.Color(255, 255, 255));
        createClass.setText("Create");
        createClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createClass, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(academic_year, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(academic_term, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(academic_group, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(37, 37, 37)
                            .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(academic_group, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(academic_term, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(academic_year, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(61, 61, 61)
                .addComponent(createClass, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void academic_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academic_groupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_academic_groupActionPerformed

    private void academic_termActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academic_termActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_academic_termActionPerformed

    private void academic_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academic_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_academic_yearActionPerformed

    private void createClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassActionPerformed
        // TODO add your handling code here:
        String yearText = this.academic_year.getText();
        String termText = this.academic_term.getText();
        String group = this.academic_group.getText();
        String tchBasicInfor = (String) this.selectTeacher.getSelectedItem();
        String tchId = tchBasicInfor.split(" ")[0]; 
        String courseSortName = (String) this.selectCourse.getSelectedItem();
        int y = 0;
        int t = 0;
        User u = User.listUser.get(tchId);
        Teacher tch = null;
        try{
            tch = (Teacher) u;
            Course curs = Course.findCourseByName(courseSortName);
            t = Integer.parseInt(termText);
            y = Integer.parseInt(yearText);
            CourseInstance newclass = new CourseInstance(curs, tch, y, t, group);
            String query = "INSERT INTO Course_instance (year, term, group_s, teacher_id, short_name) VALUES ("+y+", "+t+", '"+group+"', '"+tchId+"', '"+curs.getShortName()+"');";
            int row = MySQLConnection.executeUpdate(query);
            if(row!=0){
                System.out.println("Success");
            }
        }catch(ClassCastException c){
            System.out.println(c.getMessage());
        }catch(NumberFormatException num){
            System.err.println(num.getMessage());
            
        }
    }//GEN-LAST:event_createClassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField academic_group;
    private javax.swing.JTextField academic_term;
    private javax.swing.JTextField academic_year;
    private javax.swing.JButton createClass;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JComboBox<String> selectCourse;
    private javax.swing.JComboBox<String> selectTeacher;
    // End of variables declaration//GEN-END:variables

}
