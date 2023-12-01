/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ASUS
 */
public class user {

   private int tt;
   private int sl;

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    @Override
    public String toString() {
        return "user{" + "tt=" + tt + ", sl=" + sl + ", id=" + id + ", name=" + name + ", ns=" + ns + ", username=" + username + ", password=" + password + ", chucvu=" + chucvu + ", mucluong=" + mucluong + ", gt=" + gt + '}';
    }
    

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    private String id;
    private String name;
    private String ns;
    private String username;
    private String password;
    private String chucvu;
    private String mucluong;
    private String gt;

    public user(String id, String name, String ns, String username, String password, String chucvu, String mucluong, String gt) {
        this.id = id;
        this.name = name;
        this.ns = ns;
        this.username = username;
        this.password = password;
        this.chucvu = chucvu;
        this.mucluong = mucluong;
        this.gt = gt;
    }

 

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }
    
    public user(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getMucluong() {
        return mucluong;
    }

    public void setMucluong(String mucluong) {
        this.mucluong = mucluong;
    }
    
  

    
    
}

