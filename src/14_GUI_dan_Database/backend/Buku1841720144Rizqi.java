/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author mwpras
 */
public class Buku1841720144Rizqi {
    private int idbuku;
    private Kategori1841720144Rizqi kategori = new Kategori1841720144Rizqi();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori1841720144Rizqi getKategori() {
        return kategori;
    }

    public void setKategori(Kategori1841720144Rizqi kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku1841720144Rizqi() {
    
    }
    
    public Buku1841720144Rizqi(Kategori1841720144Rizqi kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku1841720144Rizqi getById(int id) {
        Buku1841720144Rizqi buku = new Buku1841720144Rizqi();
        ResultSet rs = DBHelper1841720144Rizqi.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.idbuku = '" + id + "'");
        try {
            while(rs.next()) {
                buku = new Buku1841720144Rizqi();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720144Rizqi> getAll() {
        ArrayList<Buku1841720144Rizqi> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720144Rizqi.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()) {
                Buku1841720144Rizqi buku = new Buku1841720144Rizqi();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720144Rizqi> search(String keyword) {
        ArrayList<Buku1841720144Rizqi> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720144Rizqi.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.judul LIKE '%" + keyword + "%'"
                                                    + " OR b.penerbit LIKE '%" + keyword + "%'"
                                                    + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while(rs.next()) {
                Buku1841720144Rizqi buku = new Buku1841720144Rizqi();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void save() {
        if(getById(idbuku).getIdbuku() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + "'" + this.judul + "', "
                        + "'" + this.getKategori().getIdKategori() + "', "
                        + "'" + this.penulis + "', "
                        + "'" + this.penerbit + "'"
                        + ")";
            this.idbuku = DBHelper1841720144Rizqi.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE buku SET"
                        + " judul = '" + this.judul + "', "
                        + " idkategori = '" + this.getKategori().getIdKategori() + "', "
                        + " penulis = '" + this.penulis + "', "
                        + " penerbit = '" + this.penerbit + "' "
                        + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper1841720144Rizqi.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720144Rizqi.executeQuery(SQL);
    }
}
