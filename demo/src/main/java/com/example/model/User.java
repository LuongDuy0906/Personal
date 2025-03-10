package com.example.model;

import java.sql.Timestamp;

public class User {
    private String TenND;
    private String MatKhau;
    private int VaiTro;
    private String Ten;
    private String DiaChi;
    private String SDT;
    private Timestamp created_at;
    private Timestamp updated_at;

    public String getTenND() {
        return TenND;
    }

    public void setTenND(String tenND) {
        TenND = tenND;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public int getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(int vaiTro) {
        VaiTro = vaiTro;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String sDT) {
        SDT = sDT;
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
