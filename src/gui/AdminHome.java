/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;
import academic.*;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import user.*;
/**
 *
 * @author vathanak
 */
public class AdminHome extends javax.swing.JPanel {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
        initComponents();
        Student.loadAllStudent();
        Teacher.loadAllTeacher();
        Course.listCourses.clear();
        Course.syncCourse();
        CourseInstance.syncCourseInstance();
        addRowsToTables();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        ClassData = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        allUser = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        AllTeacher = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        allStu = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        dataClass = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));

        allUser.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        allUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "DOB", "Address", "Email", "Phone", "Gender", "national_id", "Other"
            }
        ));
        allUser.setRowHeight(45);
        jScrollPane2.setViewportView(allUser);

        ClassData.addTab("All", jScrollPane2);

        AllTeacher.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        AllTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "DOB", "Address", "Email", "Phone", "Gender", "national_id", "Other"
            }
        ));
        AllTeacher.setRowHeight(45);
        jScrollPane5.setViewportView(AllTeacher);

        ClassData.addTab("Teacher", jScrollPane5);

        allStu.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        allStu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "DOB", "Address", "Email", "Phone", "Gender", "national_id", "Other"
            }
        ));
        allStu.setRowHeight(45);
        jScrollPane6.setViewportView(allStu);

        ClassData.addTab("Student", jScrollPane6);

        courseTable.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Short Name", "title", "fee", "level", "discription"
            }
        ));
        courseTable.setRowHeight(45);
        jScrollPane1.setViewportView(courseTable);

        ClassData.addTab("Course", jScrollPane1);

        dataClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Teacher", "Date", "Time"
            }
        ));
        dataClass.setRowHeight(45);
        jScrollPane3.setViewportView(dataClass);

        ClassData.addTab("Class", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClassData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClassData, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllTeacher;
    private javax.swing.JTabbedPane ClassData;
    private javax.swing.JTable allStu;
    private javax.swing.JTable allUser;
    private javax.swing.JTable courseTable;
    private javax.swing.JTable dataClass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables
    public void addRowsToTables() {
        // Get Table Models
        DefaultTableModel teacherModel = (DefaultTableModel) AllTeacher.getModel();
        DefaultTableModel studentModel = (DefaultTableModel) allStu.getModel();
        DefaultTableModel userModel = (DefaultTableModel) allUser.getModel();
        DefaultTableModel courseModel = (DefaultTableModel) courseTable.getModel();
        DefaultTableModel calssModel = (DefaultTableModel) dataClass.getModel();
        for(CourseInstance cin:CourseInstance.listCourseInstace.values()){
            calssModel.addRow(cin.toObjectArray());
        }
        for(Course c:Course.listCourses.values()){
            courseModel.addRow(c.toObjectArray());
        }
        
        // Add Rows to Teacher Table
        for (User rowData : User.listUser.values()) {
            if(rowData instanceof Student){
                Student stu = (Student)rowData;
                studentModel.addRow(stu.toObjectArray());
                userModel.addRow(stu.toObjectArray());
            }else if(rowData instanceof Teacher){
                Teacher tch = (Teacher)rowData;
                teacherModel.addRow(tch.toObjectArray());
                userModel.addRow(tch.toObjectArray());
            }
        }
    }
}
