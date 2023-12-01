/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ThongkeServiceImpl implements ThongkeService {
    private ThongkeDaoImpl thongkeDao= new ThongkeDaoImpl();

    public ThongkeServiceImpl() {
        
    }
    @Override
    public ArrayList<SoluongBean> getListsoluong() {
         
        return thongkeDao.getListSoluog();
    }

    @Override
    public ArrayList<LuongBean> getListluong() {
         return thongkeDao.getListLuong();
    }
    
}
