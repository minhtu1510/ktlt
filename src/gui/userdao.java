/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import gui.user;

/**
 *
 * @author ASUS
 */
public class userdao {

    public userdao(){
        
        
}
     
    public ArrayList<user> getusers() throws SQLException{
        ArrayList<user> users;
        users = new ArrayList<user>(); 
        Connection con=DAO.getDAO();
        String sql="SELECT * FROM ttktlt.ds_sinhvien";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            while(res.next()){
                user sinhvien=new user();
                sinhvien.setTt(res.getInt("tt"));
                sinhvien.setId(res.getString("masv"));
                sinhvien.setName(res.getString("ten"));
                sinhvien.setNs(res.getString("ns"));
                sinhvien.setUsername(res.getString("username"));
                sinhvien.setPassword(res.getString("mk"));
                sinhvien.setChucvu(res.getString("chucvu"));
                sinhvien.setMucluong(res.getString("mucluong"));
                sinhvien.setGt(res.getString("gioitinh"));
                
                users.add(sinhvien);
                
            }
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return users;
        
                }  
    public void addUser(user user){
        Connection connection =DAO.getDAO();
        String sql="INSERT INTO ds_sinhvien(masv,ten,ns,username,mk,chucvu,mucluong,gioitinh) values(?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE ten = VALUES(ten), ns = VALUES(ns), username = VALUES(username), mk = VALUES(mk), chucvu = VALUES(chucvu), mucluong = VALUES(mucluong),gioitinh=VALUES(gioitinh);";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getId());
            preparedStatement.setString(2,user.getName());
            preparedStatement.setString(3,user.getNs());
            preparedStatement.setString(4,user.getUsername());
            preparedStatement.setString(5,user.getPassword());
            preparedStatement.setString(6,user.getChucvu());
            preparedStatement.setString(7,user.getMucluong());
            preparedStatement.setString(8,user.getGt());
            
            int res=preparedStatement.executeUpdate();
            System.out.println(res);
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        
    }
  
    
}