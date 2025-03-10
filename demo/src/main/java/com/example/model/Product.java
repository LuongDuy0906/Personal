package com.example.model;

import java.sql.Timestamp;

public class Product {
    private int SPID;
    private String TenSP;
    private String MoTa;
    private int SoLuong;
    private int LoaiSP;
    private int KMID;
    private int Gia;
    private int GiaKM;
    private Timestamp created_at;
    private Timestamp updated_at;

    public int getSPID() {
        return SPID;
    }

    public void setSPID(int sPID) {
        SPID = sPID;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(int loaiSP) {
        LoaiSP = loaiSP;
    }

    public int getKMID() {
        return KMID;
    }

    public void setKMID(int kMID) {
        KMID = kMID;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public int getGiaKM() {
        return GiaKM;
    }

    public void setGiaKM(int giaKM) {
        GiaKM = giaKM;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
