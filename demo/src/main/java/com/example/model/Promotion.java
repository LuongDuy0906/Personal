package com.example.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Promotion {
    private String MoTa;
    private String LoaiKM;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private Timestamp created_at;
    private Timestamp updated_at;

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getLoaiKM() {
        return LoaiKM;
    }

    public void setLoaiKM(String loaiKM) {
        LoaiKM = loaiKM;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        NgayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        NgayKetThuc = ngayKetThuc;
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
