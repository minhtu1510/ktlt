/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class nhanviencontroller {
    private JButton btnnop;
    private JTextField jtfmanhanvien;
    private JTextField jtfhoten;
    private JTextField jtftentk;
    private JTextField jtfmk;
    private JTextField jtfmucluong;
    private JTextField jtfchucvu;
    private JTextField jtfns;
    private JRadioButton jtfnam;
    private JRadioButton jtfnu;
    private JLabel jlbmsg;
    private userservice userservice;


    public nhanviencontroller(JButton btnnop, JTextField jtfmanhanvien, JTextField jtfhoten, JTextField jtftentk, JTextField jtfmk, JTextField jtfmucluong, JTextField jtfchucvu, JTextField jtfns, JRadioButton jtfnam, JRadioButton jtfnu, JLabel jlbmsg) {
        this.btnnop = btnnop;
        this.jtfmanhanvien = jtfmanhanvien;
        this.jtfhoten = jtfhoten;
        this.jtftentk = jtftentk;
        this.jtfmk = jtfmk;
        this.jtfmucluong = jtfmucluong;
        this.jtfchucvu = jtfchucvu;
        this.jtfns = jtfns;
        this.jtfnam = jtfnam;
        this.jtfnu = jtfnu;
        this.jlbmsg = jlbmsg;
    }
    


    

    
    public void setView(user user){
          jtfmanhanvien.setText(user.getId());
          jtfhoten.setText(user.getName());
          jtftentk.setText(user.getUsername());
          jtfmk.setText(user.getPassword());
          jtfmucluong.setText(user.getMucluong());
          jtfchucvu.setText(user.getChucvu());
          jtfns.setText(user.getNs());
          if(user.getGt()=="Nam"){
              jtfnam.setSelected(true);
          }
          else {
              jtfnu.setSelected(true);
          }
          setEvent();
    }
    public void setEvent(){
        btnnop.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                user user=new user();
              if(jtfhoten.getText().length()==0||jtftentk.getText().length()==0||jtfmk.getText().length()==0
                      ||jtfmucluong.getText().length()==0||jtfchucvu.getText().length()==0||jtfns.getText().length()==0)
                  jlbmsg.setText("Vui lòng nhập dữ liệu bắt buộc");
                  else{
                       user.setId(jtfmanhanvien.getText().trim());
                       user.setName(jtfhoten.getText().trim());
                       user.setUsername(jtftentk.getText());
                       user.setPassword(jtfmk.getText());
                       user.setMucluong(jtfmucluong.getText());
                       user.setChucvu(jtfchucvu.getText());
                       user.setNs(jtfns.getText());
                       if(jtfnam.isSelected())
                       user.setGt("Nam");
                       else user.setGt("Nữ");
                          
              if(show()==true){
                  userservice.adduser(user);
                  jlbmsg.setText("Cập nhật thành công !!!");
                           try {
                               new inJPanel().setVisible(true);
                           } catch (SQLException ex) {
                               Logger.getLogger(nhanviencontroller.class.getName()).log(Level.SEVERE, null, ex);
                           }
              }}
             }
            @Override
            public void mouseEntered(MouseEvent e){
                btnnop.setBackground(new Color(0,200,83));
                
            }
            @Override 
            public void mouseExited(MouseEvent e){
                btnnop.setBackground(new Color(100,221,23));
            }
        });
    }
    private boolean show(){
        int dialogResult=JOptionPane.showConfirmDialog(null, "Bạn muốn cập nhật dữ liệu không ?", "Thong báo", JOptionPane.YES_NO_OPTION);
        return dialogResult == JOptionPane.YES_OPTION;
                }
}
