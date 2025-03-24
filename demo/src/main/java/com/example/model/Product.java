package com.example.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private long[] SPIDs;
    private Long SPID;
    private String TenSP;
    private String MoTa;
    private int SoLuong;
    private int LoaiSP;
    private int KMID;
    private int Gia;
    private int GiaKM;
    private Timestamp created_at;
    private Timestamp updated_at;
    private List<Product> listResult = new ArrayList<>();
    private Integer page;
    private Integer maxPageItem;
    private Integer totalPage;
    private Integer totalItem;
    private String sortName;
    private String sortBy;

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Integer getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getMaxPageItem() {
        return maxPageItem;
    }

    public void setMaxPageItem(Integer maxPageItem) {
        this.maxPageItem = maxPageItem;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<Product> getListResult() {
        return listResult;
    }

    public void setListResult(List<Product> listResult) {
        this.listResult = listResult;
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

    public long[] getSPIDs() {
        return SPIDs;
    }

    public void setSPIDs(long[] sPIDs) {
        SPIDs = sPIDs;
    }

    public Long getSPID() {
        return SPID;
    }

    public void setSPID(Long sPID) {
        SPID = sPID;
    }
}
