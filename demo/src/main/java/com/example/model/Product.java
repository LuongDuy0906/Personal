package com.example.model;

public class Product extends Abstract<Product> {
    private String tenSP;
    private String moTa;
    private int soLuong;
    private Long IDLSP;
    private int IDKM;
    private int gia;
    private int giaKM;
    private String code;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getGiaKM() {
        return giaKM;
    }

    public void setGiaKM(int giaKM) {
        this.giaKM = giaKM;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}