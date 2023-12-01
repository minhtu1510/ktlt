/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.toy.anagrams.lib.WordLibrary;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author ASUS
 */
public class chuyenmanhinh {
    private JPanel jpnRoot;
    
    private String kindSelected="";
    private ArrayList<DanhmucBean> listDanhMuc;
    public  chuyenmanhinh(JPanel jpnRoot){
        this.jpnRoot=jpnRoot;
    }

  

    public void setView(JPanel jpnItem,JLabel jlbItem){
        jpnItem.setBackground(new Color(76,175,80));
        jlbItem.setBackground(new Color(76,175,80));
     
        
        
    }

    public JPanel getJpnRoot() {
        return jpnRoot;
    }

    /**
     *
     * @param listDanhMuc
     */
    public void setEvent(ArrayList<DanhmucBean> listDanhMuc){
       this.listDanhMuc=listDanhMuc;
       for(DanhmucBean item:listDanhMuc){
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
       }
        
    }
    class LabelEvent implements MouseListener {
    private JPanel node;
    private String kind;
    private JPanel jpnItem;
    private JLabel jlbItem;
    public LabelEvent(String kind, JPanel jpn, JLabel jlb) {
        this.kind=kind;
        this.jpnItem=jpn;
        this.jlbItem=jlb;
    }
 @Override
      public void mouseClicked(MouseEvent e) {
            if(kind.equalsIgnoreCase("THÊM NHÂN VIÊN")){
                    new add().setVisible(true);}
            else if(kind.equalsIgnoreCase("IN DANH SÁCH")){
                try {
                    node=new inJPanel();
                } catch (SQLException ex) {
                    Logger.getLogger(chuyenmanhinh.class.getName()).log(Level.SEVERE, null, ex);
                }}
            else if(kind.equalsIgnoreCase("THỐNG KÊ")){
                        node=new thongkeJPanel();
                        }
                // more
            else if(kind.equalsIgnoreCase("SẮP XẾP")){
                try {
                    node=new sxJPanel();
                } catch (SQLException ex) {
                    Logger.getLogger(chuyenmanhinh.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
            else if(kind.equalsIgnoreCase("TÌM KIẾM")){
                node=new timkiemJPanel();
            }
            else if(kind.equalsIgnoreCase("THOÁT")){
                System.exit(0);
            }
              
           
           jpnRoot.removeAll();
           jpnRoot.setLayout(new BorderLayout());
           jpnRoot.add(node);
           jpnRoot.validate();
           jpnRoot.repaint();
           setChangeBackground(kind);
          
      }

      @Override
      public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(96, 100, 191));
           jlbItem.setBackground(new Color(96, 100, 191));
      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {
          jpnItem.setBackground(new Color(96, 100, 191));
          jlbItem.setBackground(new Color(96, 100, 191));
      }

      @Override
      public void mouseExited(MouseEvent e) {
          if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
          }
      }

}
    private void setChangeBackground(String Kind){
        for(DanhmucBean item:listDanhMuc ){
            if(item.getKind().equalsIgnoreCase(Kind)){
                item.getJpn().setBackground(new Color(96,100,191));
                item.getJlb().setBackground(new Color(96,100,191));
                
            }
            else {
                item.getJpn().setBackground(new Color(76,175,80));
                item.getJlb().setBackground(new Color(76,175,80));
            }
        }
    }
}
