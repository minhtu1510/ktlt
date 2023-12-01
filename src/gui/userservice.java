/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author ASUS
 */
public class userservice {
    private userdao userdao;
    public userservice(){
        userdao=new userdao();
    }
    public ArrayList<user> getusers() throws SQLException{
        return userdao.getusers();
    }
    public void adduser(user user){
        userdao.addUser(user);
    } 
    public ArrayList<user> selectionsort(String kind) throws SQLException{
                                                                                                            ArrayList<user> ds=userdao.getusers();
        int n=ds.size();
                for(int i=0;i<n-1;i++ ){
                int min_pos = i;
                for (int j = i + 1; j < n; j++){
                if(kind=="Họ và tên"){
                    if (ds.get(j).getName().compareTo(ds.get(min_pos).getName())<0)
                    min_pos = j;
                }
                else if(kind=="Mã nhân viên"){
                    if (ds.get(j).getId().compareTo(ds.get(min_pos).getId())<0)
                    min_pos = j;
                }
                else if(kind=="Ngày sinh"){
                    if (ds.get(j).getNs().compareTo(ds.get(min_pos).getNs())<0)
                    min_pos = j;
                }
                else if(kind=="Mức lương"){
                    if (Double.parseDouble(ds.get(j).getMucluong())<Double.parseDouble(ds.get(min_pos).getMucluong()))
                    min_pos = j;
                }}
                Collections.swap(ds, i, min_pos);}
                return ds;
                    
    
}
    public ArrayList<user> insertionsort(String kind) throws SQLException{
        ArrayList<user> ds=userdao.getusers();
        int n=ds.size();
        for(int i=1;i<n;i++){
            int pos=i-1;
            user key=ds.get(i);
            if(kind=="Họ và tên"){
            while(pos>=0 && ds.get(pos).getName().compareTo(key.getName())>0){
                ds.set(pos+1, ds.get(pos));
                pos--;
            }}
            else if(kind=="Mã nhân viên"){
            while(pos>=0 && ds.get(pos).getId().compareTo(key.getId())>0){
                ds.set(pos+1, ds.get(pos));
                pos--;
            }}
            else if(kind=="Ngày sinh"){
            while(pos>=0 && ds.get(pos).getNs().compareTo(key.getNs())>0){
                ds.set(pos+1, ds.get(pos));
                pos--;
            }}
            else if(kind=="Mức lương"){
            while(pos>=0 && Double.parseDouble(ds.get(pos).getMucluong())>Double.parseDouble(key.getMucluong())){
                ds.set(pos+1, ds.get(pos));
                pos--;
            }}
            ds.set(pos+1, key);
        }
        return ds;
    }
    public static int partition(ArrayList<user> ds,int l,int r,String kind){
        user pivot=ds.get(r);
        int i=l-1;
        if(kind=="Họ và tên"){
        for(int j=l;j<r;j++){
            if(ds.get(j).getName().compareTo(pivot.getName())<0){
                i++;
                
            Collections.swap(ds, i, j);
            }}}
        else if(kind=="Mã nhân viên"){
        for(int j=l;j<r;j++){
            if(ds.get(j).getId().compareTo(pivot.getId())<0){
                i++;
                
            Collections.swap(ds, i, j);
            }}}
        else if(kind=="Mã nhân viên"){
        for(int j=l;j<r;j++){
            if(ds.get(j).getId().compareTo(pivot.getId())<0){
                i++;
                
            Collections.swap(ds, i, j);
            }}}
        else if(kind=="Chức vụ"){
        for(int j=l;j<r;j++){
            if(ds.get(j).getChucvu().compareTo(pivot.getChucvu())<0){
                i++;
                
            Collections.swap(ds, i, j);
            }}}
        else if(kind=="Mức lương"){
        for(int j=l;j<r;j++){
            if(Double.parseDouble(ds.get(j).getMucluong())>Double.parseDouble(pivot.getMucluong())){
                i++;
                
            Collections.swap(ds, i, j);
            }}}
            Collections.swap(ds, i+1, r);
            return i+1;
    }
    public ArrayList<user> quicksort(ArrayList<user> ds,int l,int r,String kind) throws SQLException{
        if(l<r){
          int p=partition(ds,l,r,kind);
      
      quicksort(ds,l,p-1,kind);
      quicksort(ds,p+1,r,kind);
     
        }
     return ds;
}
    public ArrayList<user> quicksort1(String kind) throws SQLException{
        ArrayList<user> ds=userdao.getusers();
        quicksort(ds,0,ds.size()-1,kind);
        return ds;
    }
    public void merge(ArrayList<user> ds,int l,int m,int r,String kind) throws SQLException{
        
        int n1=m-l+1;
        int n2=r-m;
        ArrayList<user> right=new ArrayList<user>(ds.subList(m+1, r+1));
        ArrayList<user> left=new ArrayList<user>(ds.subList(l, m+1));
        int i=0,j=0,cnt=l;
        if(kind=="Họ và tên"){
        while(i<n1&&j<n2){
            if(left.get(i).getName().compareTo(right.get(j).getName())<0){
                ds.set(cnt, left.get(i));
                i++;
            }
            else{
                ds.set(cnt,right.get(j));
                        j++;
            }
            cnt++;
        }
        while(i<n1){
            ds.set(cnt,left.get(i));
            i++;
            cnt++;
        }
        while(j<n2){
            ds.set(cnt, right.get(j));
            j++;
            cnt++;
        }}
        if(kind=="Mã nhân viên"){
        while(i<n1&&j<n2){
            if(left.get(i).getId().compareTo(right.get(j).getId())<0){
                ds.set(cnt, left.get(i));
                i++;
            }
            else{
                ds.set(cnt,right.get(j));
                        j++;
            }
            cnt++;
        }
        while(i<n1){
            ds.set(cnt,left.get(i));
            i++;
            cnt++;
        }
        while(j<n2){
            ds.set(cnt, right.get(j));
            j++;
            cnt++;
        }}
        if(kind=="Ngày sinh"){
        while(i<n1&&j<n2){
            if(left.get(i).getNs().compareTo(right.get(j).getNs())<0){
                ds.set(cnt, left.get(i));
                i++;
            }
            else{
                ds.set(cnt,right.get(j));
                        j++;
            }
            cnt++;
        }
        while(i<n1){
            ds.set(cnt,left.get(i));
            i++;
            cnt++;
        }
        while(j<n2){
            ds.set(cnt, right.get(j));
            j++;
            cnt++;
        }}
        if(kind=="Mức lương"){
        while(i<n1&&j<n2){
            if(Double.parseDouble(ds.get(i).getMucluong())<Double.parseDouble(ds.get(j).getMucluong())){
                ds.set(cnt, left.get(i));
                i++;
            }
            else{
                ds.set(cnt,right.get(j));
                        j++;
            }
            cnt++;
        }
        while(i<n1){
            ds.set(cnt,left.get(i));
            i++;
            cnt++;
        }
        while(j<n2){
            ds.set(cnt, right.get(j));
            j++;
            cnt++;
        }}
    }
    public void mergesort(ArrayList<user> ds,int l,int r,String kind) throws SQLException{
        if(l<r){
            int m=(l+r)/2;
            mergesort(ds,l,m,kind);
            mergesort(ds,m+1,r,kind);
            merge(ds,l,m,r,kind);
        }
    }
    public ArrayList<user> mergesort1(String kind) throws SQLException{
        ArrayList<user> ds=userdao.getusers();
        int n=ds.size();
        mergesort(ds,0,n-1,kind);
        return ds;
    }
    public ArrayList<user> tuantu(String kind,String key) throws SQLException{
        ArrayList<user> ds=userdao.getusers();
        ArrayList<user> kq = new ArrayList<user>();
        int n=ds.size();
        for(int i=0;i<n;i++){
            if(kind=="Mã nhân viên"){
                if(key.equals(ds.get(i).getId())){
                    kq.add(ds.get(i));
                    break;
                }
                
            }
             if(kind=="Chức vụ"){
                if(key.equals(ds.get(i).getChucvu())){
                    kq.add(ds.get(i));
                }
                
        }
              if(kind=="Họ và tên"){
                if(key.equals(ds.get(i).getName())){
                    kq.add(ds.get(i));
                    
                }
    }
               if(kind=="Ngày sinh"){
                if(key.equals(ds.get(i).getNs())){
                    kq.add(ds.get(i));
                    
                }
    }
                if(kind=="Mức lương"){
                if(key.equals(ds.get(i).getMucluong())){
                    kq.add(ds.get(i));
                    
                }
    }
}
        return kq;
    }
    public ArrayList<user> nhiphan(String kind,String key) throws SQLException{
        ArrayList<user> ds=userdao.getusers();
        ArrayList<user> kq=null;
        
        int n=ds.size();
        int l=0,r=n-1;
        
        
            if(kind=="Chức vụ"){
            while(l<=r){
            int m=(l+r)/2;
            if(ds.get(m).getChucvu().contains(key)){
                kq.add(ds.get(m));
            }
            else if(ds.get(m).getChucvu().compareTo(key) < 0){
                l=m+1;
            }
            else {
                r=m-1;
            }
        }
            }
        
           
            else if(kind=="Họ và tên"){
            while(l<=r){
            int m=(l+r)/2;
            if(ds.get(m).getName().contains(key)){
                kq.add(ds.get(m));
            }
            else if(ds.get(m).getName().compareTo(key) < 0){
                l=m+1;
            }
            else {
                r=m-1;
            }
        }
            }
              
              else if(kind=="Mã nhân viên"){
            while(l<=r){
            int m=(l+r)/2;
            if(ds.get(m).getId().contains(key)){
                kq.add(ds.get(m));
            }
            else if(ds.get(m).getId().compareTo(key) < 0){
                l=m+1;
            }
            else {
                r=m-1;
            }
        }
               }
            else if(kind=="Ngày sinh"){
             while(l<=r){
            int m=(l+r)/2;          
            if(ds.get(m).getNs().contains(key)){
                kq.add(ds.get(m));
            }
            else if(ds.get(m).getNs().compareTo(key) < 0){
                l=m+1;
            }
            else {
                r=m-1;
            }
        }}
           else if(kind=="Mức lương"){
            while(l<=r){
            int m=(l+r)/2;               
            if(Double.parseDouble(ds.get(m).getMucluong())==Double.parseDouble(key)){
                kq.add(ds.get(m));
            }
            else if(Double.parseDouble(ds.get(m).getMucluong())<Double.parseDouble(key)){
                l=m+1;
            }
            else {
                r=m-1;
            }
        }
                       
        }
        return kq;
        
    }
    public ArrayList<user> timkiemnhiphan(String s, String a) throws SQLException, ClassNotFoundException{
ArrayList<user> list =new ArrayList<user>();
        list =  quicksort1(s);
ArrayList<user> u = new ArrayList<user>();
int n = list.size();
int l = 0, r = n-1;
    if(s.equals("Mã nhân viên")){
            while(l <= r){
                int m = (l + r)/2;
                if(list.get(m).getId().contains(a)){
                    u.add(list.get(m));
                    int left=m-1;
                    int right=m+1;
                    while(left>=0&&list.get(left).getId().contains(a)){
                        
                        u.add(list.get(left));
                        left--;
                    }
                    while(right<=n-1&&list.get(right).getId().contains(a)){
                        u.add(list.get(right));
                        right++;
                    }
                    break;
                }else if(list.get(m).getId().compareTo(a) < 0){
                    l = m + 1;
                }else{
                    r = m-1;
                }
            }
    
        }else if(s.equals("Họ và tên")){
            while(l <= r){
                int m = (l + r)/2;
                if(list.get(m).getName().equals(a)){
                    u.add(list.get(m));
                    int left=m-1;
                    int right=m+1;
                    while(left>=0&&list.get(left).getName().contains(a)){
                        
                        u.add(list.get(left));
                        left--;
                    }
                    while(right<=n-1&&list.get(right).getName().contains(a)){
                        u.add(list.get(right));
                        right++;
                    }
                    break;
                }else if(list.get(m).getName().compareTo(a) < 0){
                    l = m + 1;
                }else{
                    r = m-1;
                }
            }
                
        }else if(s.equals("Ngày sinh")){
             while(l <= r){
                int m = (l + r)/2;
                if(list.get(m).getNs().contains(a)){
                    u.add(list.get(m));
                    int left=m-1;
                    int right=m+1;
                    while(left>=0&&list.get(left).getNs().contains(a)){
                        
                        u.add(list.get(left));
                        left--;
                    }
                    while(right<=n-1&&list.get(right).getNs().contains(a)){
                        u.add(list.get(right));
                        right++;
                    }
                    break;
                }else if(list.get(m).getNs().compareTo(a) < 0){
                    l = m + 1;
                }else{
                    r = m-1;
                }
            }
            
        }else if(s.equals("Chức vụ")){
           while(l <= r){
                int m = (l + r)/2;
                if(list.get(m).getChucvu().contains(a)){
                    u.add(list.get(m));
                    int left=m-1;
                    int right=m+1;
                    while(left>=0&&list.get(left).getChucvu().contains(a)){
                        
                        u.add(list.get(left));
                        left--;
                    }
                    while(right<=n-1&&list.get(right).getChucvu().contains(a)){
                        u.add(list.get(right));
                        right++;
                    }
                    break;
                }else if(list.get(m).getChucvu().compareTo(a) < 0){
                    l = m + 1;
                }else{
                    r = m-1;
                }
            }  
               
        }else{
             while(l <= r){
                int m = (l + r)/2;
                if(Double.parseDouble(list.get(m).getMucluong())==Double.parseDouble(a)){
                    u.add(list.get(m));
                    int left=m-1;
                    int right=m+1;
                    while(left>=0&&Double.parseDouble(list.get(left).getMucluong())==Double.parseDouble(a)){
                        
                        u.add(list.get(left));
                        left--;
                    }
                    while(right<=n-1&&Double.parseDouble(list.get(right).getMucluong())==Double.parseDouble(a)){
                        u.add(list.get(right));
                        right++;
                    }
                    break;
                }else if(Double.parseDouble(list.get(m).getMucluong())<Double.parseDouble(a)){
                    l = m + 1;
                }else{
                    r = m-1;
                }
            }
        }
        
        return u;
}
    
    
    
}