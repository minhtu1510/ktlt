/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import gui.chuyenmanhinh;
import javax.swing.JLabel;
import gui.DanhmucBean;

/**
 *
 * @author ASUS
 */
public class menu1 extends javax.swing.JFrame {

    userservice userservice;

    /**
     * Creates new form menu1
     */
    public menu1() {
        initComponents();

        chuyenmanhinh controller = new chuyenmanhinh(jpnView);

        ArrayList<DanhmucBean> listDanhmuc = new ArrayList();
        listDanhmuc.add(new DanhmucBean("THÊM NHÂN VIÊN", themPanel, themLabel));
        listDanhmuc.add(new DanhmucBean("IN DANH SÁCH", inPanel, inLabel));
        listDanhmuc.add(new DanhmucBean("TÌM KIẾM", timkiemPanel, timkiemLabel));
        listDanhmuc.add(new DanhmucBean("SẮP XẾP", sxPanel, sxLabel));
        listDanhmuc.add(new DanhmucBean("THỐNG KÊ", thongkePanel, thongkeLabel));
        listDanhmuc.add(new DanhmucBean("THOÁT", thoatPanel, thoatLabel));

        controller.setView(themPanel, themLabel);
        controller.setView(inPanel, inLabel);
        controller.setView(sxPanel, sxLabel);
        controller.setView(timkiemPanel, timkiemLabel);
        controller.setView(themPanel, themLabel);
        controller.setView(thoatPanel, thoatLabel);
        controller.setView(thongkePanel, thongkeLabel);

        controller.setEvent(listDanhmuc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inPanel = new javax.swing.JPanel();
        inLabel = new javax.swing.JLabel();
        sxPanel = new javax.swing.JPanel();
        sxLabel = new javax.swing.JLabel();
        timkiemPanel = new javax.swing.JPanel();
        timkiemLabel = new javax.swing.JLabel();
        thongkePanel = new javax.swing.JPanel();
        thongkeLabel = new javax.swing.JLabel();
        thoatPanel = new javax.swing.JPanel();
        thoatLabel = new javax.swing.JLabel();
        themPanel = new javax.swing.JPanel();
        themLabel = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setFocusableWindowState(false);
        setLocationByPlatform(true);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/baseline_supervised_user_circle_white_48dp.png"))); // NOI18N
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        inPanel.setBackground(new java.awt.Color(0, 153, 0));

        inLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        inLabel.setForeground(new java.awt.Color(255, 255, 255));
        inLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/baseline_receipt_long_white_36dp.png"))); // NOI18N
        inLabel.setText("IN DANH SÁCH");

        javax.swing.GroupLayout inPanelLayout = new javax.swing.GroupLayout(inPanel);
        inPanel.setLayout(inPanelLayout);
        inPanelLayout.setHorizontalGroup(
            inPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inPanelLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(inLabel)
                .addGap(203, 203, 203))
        );
        inPanelLayout.setVerticalGroup(
            inPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inPanelLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(inLabel)
                .addGap(58, 58, 58))
        );

        sxPanel.setBackground(new java.awt.Color(0, 153, 0));

        sxLabel.setBackground(new java.awt.Color(255, 255, 255));
        sxLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        sxLabel.setForeground(new java.awt.Color(255, 255, 255));
        sxLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/baseline_view_array_white_36dp.png"))); // NOI18N
        sxLabel.setText("SẮP XẾP");

        javax.swing.GroupLayout sxPanelLayout = new javax.swing.GroupLayout(sxPanel);
        sxPanel.setLayout(sxPanelLayout);
        sxPanelLayout.setHorizontalGroup(
            sxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sxPanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(sxLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sxPanelLayout.setVerticalGroup(
            sxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sxPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(sxLabel)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        timkiemPanel.setBackground(new java.awt.Color(0, 153, 0));

        timkiemLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        timkiemLabel.setForeground(new java.awt.Color(255, 255, 255));
        timkiemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/baseline_person_search_white_36dp.png"))); // NOI18N
        timkiemLabel.setText("TÌM KIẾM");

        javax.swing.GroupLayout timkiemPanelLayout = new javax.swing.GroupLayout(timkiemPanel);
        timkiemPanel.setLayout(timkiemPanelLayout);
        timkiemPanelLayout.setHorizontalGroup(
            timkiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timkiemPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(timkiemLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timkiemPanelLayout.setVerticalGroup(
            timkiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timkiemPanelLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(timkiemLabel)
                .addGap(65, 65, 65))
        );

        thongkePanel.setBackground(new java.awt.Color(0, 153, 0));

        thongkeLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        thongkeLabel.setForeground(new java.awt.Color(255, 255, 255));
        thongkeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/baseline_auto_graph_white_48dp.png"))); // NOI18N
        thongkeLabel.setText("THỐNG KÊ");

        javax.swing.GroupLayout thongkePanelLayout = new javax.swing.GroupLayout(thongkePanel);
        thongkePanel.setLayout(thongkePanelLayout);
        thongkePanelLayout.setHorizontalGroup(
            thongkePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongkePanelLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(thongkeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thongkePanelLayout.setVerticalGroup(
            thongkePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thongkePanelLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(thongkeLabel)
                .addGap(57, 57, 57))
        );

        thoatPanel.setBackground(new java.awt.Color(0, 153, 0));

        thoatLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        thoatLabel.setForeground(new java.awt.Color(255, 255, 255));
        thoatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/baseline_logout_white_36dp.png"))); // NOI18N
        thoatLabel.setText("THOÁT");

        javax.swing.GroupLayout thoatPanelLayout = new javax.swing.GroupLayout(thoatPanel);
        thoatPanel.setLayout(thoatPanelLayout);
        thoatPanelLayout.setHorizontalGroup(
            thoatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thoatPanelLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(thoatLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thoatPanelLayout.setVerticalGroup(
            thoatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thoatPanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(thoatLabel)
                .addGap(62, 62, 62))
        );

        themPanel.setBackground(new java.awt.Color(0, 153, 0));

        themLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        themLabel.setForeground(new java.awt.Color(255, 255, 255));
        themLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/baseline_person_add_white_36dp.png"))); // NOI18N
        themLabel.setText("THÊM NHÂN VIÊN");

        javax.swing.GroupLayout themPanelLayout = new javax.swing.GroupLayout(themPanel);
        themPanel.setLayout(themPanelLayout);
        themPanelLayout.setHorizontalGroup(
            themPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, themPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(themLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        themPanelLayout.setVerticalGroup(
            themPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(themPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(themLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thongkePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timkiemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sxPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thoatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(themPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(sxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(timkiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(thongkePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(inPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(thoatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jpnView.setBackground(new java.awt.Color(204, 204, 255));
        jpnView.setToolTipText("");
        jpnView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("MÀN HÌNH CHÍNH");

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnViewLayout.createSequentialGroup()
                .addGap(699, 699, 699)
                .addComponent(jLabel1)
                .addContainerGap(1139, Short.MAX_VALUE))
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnViewLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(1349, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnView.getAccessibleContext().setAccessibleParent(jpnView);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new menu1().setVisible(true); //To change body of generated methods, choose Tools | Templates.
            }
        }  
                 
    }
    ;
               
            
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel inLabel;
    private javax.swing.JPanel inPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpnView;
    private javax.swing.JLabel sxLabel;
    private javax.swing.JPanel sxPanel;
    private javax.swing.JLabel themLabel;
    private javax.swing.JPanel themPanel;
    private javax.swing.JLabel thoatLabel;
    private javax.swing.JPanel thoatPanel;
    private javax.swing.JLabel thongkeLabel;
    private javax.swing.JPanel thongkePanel;
    private javax.swing.JLabel timkiemLabel;
    private javax.swing.JPanel timkiemPanel;
    // End of variables declaration//GEN-END:variables

}
