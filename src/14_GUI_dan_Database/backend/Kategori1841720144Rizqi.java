/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
import backend.*;

/**
 *
 * @author User
 */
public class Kategori1841720144Rizqi {
    private int idKategori;
    private String nama;
    private String keterangan;

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720144Rizqi() {
    }

    public Kategori1841720144Rizqi(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public Kategori1841720144Rizqi getById(int id) {
        Kategori1841720144Rizqi kat = new Kategori1841720144Rizqi();
        ResultSet rs = DBHelper1841720144Rizqi.selectQuery("SELECT * FROM kategori " + " WHERE idKategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720144Rizqi();
                kat.setIdKategori(rs.getInt("idKategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720144Rizqi> getAll() {
        ArrayList<Kategori1841720144Rizqi> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720144Rizqi.selectQuery("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720144Rizqi kat = new Kategori1841720144Rizqi();
                kat.setIdKategori(rs.getInt("idKategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }

    public ArrayList<Kategori1841720144Rizqi> search(String keyword) {
        ArrayList<Kategori1841720144Rizqi> ListKategori = new ArrayList();

        String sql = "Select * from kategori where " + " nama like '%" + keyword + "%' " + " or keterangan like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720144Rizqi.selectQuery(sql);

        try {
            while (rs.next()) {
                Kategori1841720144Rizqi kat = new Kategori1841720144Rizqi();
                kat.setIdKategori(rs.getInt("idKategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }
    
    public void save(){
        if(getById(idKategori).getIdKategori() == 0){
            String SQL = "Insert into kategori (nama,keterangan) values(" 
                    + " '" +this.nama + "', "
                    + " '"+this.keterangan+"' "
                    + " )";
                    this.idKategori = DBHelper1841720144Rizqi.insertQueryGetId(SQL);
        }else{
            String SQL = "Update kategori set"
                   + " nama = '" +this.nama +"', "
                   + " keterangan = '"+this.keterangan+"' "
                   +"Where idKategori = '"+this.idKategori+"'";
            DBHelper1841720144Rizqi.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM kategori WHERE idKategori = '"+this.idKategori+"'";
        DBHelper1841720144Rizqi.executeQuery(SQL);
    }
    
    @Override
    public String toString() {
        return nama;
    }
}
