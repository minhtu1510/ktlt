/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ASUS
 */
public class inJPanel extends javax.swing.JPanel {
    userservice userservice;
    user user;
    /**
     * Creates new form inJPanel
     */
    public inJPanel() throws SQLException {
        initComponents();
        userservice=new userservice();
        
       DefaultTableModel defaultTableModel=new DefaultTableModel();
       table.setModel(defaultTableModel);
       defaultTableModel.addColumn("TT");
       defaultTableModel.addColumn("Mã");
       defaultTableModel.addColumn("Họ và tên");
       defaultTableModel.addColumn("Ngày sinh");
       defaultTableModel.addColumn("username");
       defaultTableModel.addColumn("password");
       defaultTableModel.addColumn("Chức vụ");
       defaultTableModel.addColumn("Mức lương");
       defaultTableModel.addColumn("Giới tính");
       
       
       ArrayList<user> users=userservice.getusers();
       
       
       for(user user:users){
  
           defaultTableModel.addRow(new Object[]{user.getTt(),user.getId(),user.getName(),user.getNs(),user.getUsername(),user.getPassword(),user.getChucvu(),user.getMucluong(),user.getGt()});
           
       }
       table.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e){
               if(e.getClickCount()==1&&table.getSelectedRow()!=-1){
                   DefaultTableModel model=(DefaultTableModel) table.getModel();
                   int select=table.getSelectedRow();
                   select=table.convertRowIndexToModel(select);
                   user user=new user();
                   user.setId((String) model.getValueAt(select, 1));
                   user.setName((String) model.getValueAt(select, 2));
                   user.setUsername((String) model.getValueAt(select, 4));
                   user.setPassword((String) model.getValueAt(select, 5));
                   user.setMucluong((String) model.getValueAt(select, 7));
                   user.setChucvu((String) model.getValueAt(select, 6));
                   user.setNs((String) model.getValueAt(select, 3));
                   user.setGt((String) model.getValueAt(select, 8));
                   nhanvienjframe frame=new nhanvienjframe(user);
                   frame.setTitle("Thông tin nhân viên");
                   frame.setResizable(false);
                   frame.setLocationRelativeTo(null);
                   frame.setVisible(true);
               }
      
           }
       });
       JTableHeader tableHeader=table.getTableHeader();
       Font headerFont=tableHeader.getFont();
       tableHeader.setFont(new Font(headerFont.getName(),Font.BOLD,18+headerFont.getSize()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        quaylaijButton = new javax.swing.JButton();

        table.setAutoCreateRowSorter(true);
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setRowHeight(24);
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("DANH SÁCH NHÂN VIÊN");

        quaylaijButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        quaylaijButton.setText("Quay lại");
        quaylaijButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaylaijButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(quaylaijButton)
                .addGap(646, 646, 646)
                .addComponent(jLabel1)
                .addContainerGap(908, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(quaylaijButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void quaylaijButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaylaijButtonActionPerformed
        // TODO add your handling code here:
        new menu1().setVisible(true);
       
    }//GEN-LAST:event_quaylaijButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quaylaijButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

  
}