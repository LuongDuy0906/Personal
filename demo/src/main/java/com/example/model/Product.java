package com.example.model;

public class Product extends Abstract<Product> {
    private String TenSP;
    private String MoTa;
    private int SoLuong;
    private Long IDLSP;
    private int IDKM;
    private int Gia;
    private int GiaKM;

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

    public Long getIDLSP() {
        return IDLSP;
    }

    public void setIDLSP(Long iDLSP) {
        IDLSP = iDLSP;
    }

    public int getIDKM() {
        return IDKM;
    }

    public void setIDKM(int iDKM) {
        IDKM = iDKM;
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
}