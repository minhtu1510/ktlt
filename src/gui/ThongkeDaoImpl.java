/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ThongkeDaoImpl implements ThongkeDao {
   
    @Override
    public ArrayList<SoluongBean> getListSoluog() {
        Connection cons=DAO.getDAO();
        String sql="SELECT chucvu,COUNT(*) as soluong FROM ttktlt.ds_sinhvien GROUP BY chucvu";
        ArrayList <SoluongBean> ds;
        ds = new ArrayList<SoluongBean>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SoluongBean SoluongBean = new SoluongBean();
                SoluongBean.setChucvu(rs.getString("chucvu"));
                SoluongBean.setSoluong(rs.getInt("soluong"));
                ds.add(SoluongBean);
            }
            ps.close();
            cons.close();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }
    @Override
    public ArrayList<LuongBean> getListLuong() {
        Connection cons = DAO.getDAO();
        String sql = "SELECT chucvu, mucluong FROM ttktlt.ds_sinhvien ";
       ArrayList <LuongBean> ds;
        ds = new ArrayList<LuongBean>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LuongBean luongBean = new LuongBean();
                luongBean.setChucvu(rs.getString("chucvu"));
                luongBean.setLuong(rs.getString("mucluong"));
                ds.add(luongBean);
            }
            ps.close();
            cons.close();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

  
    }



  
