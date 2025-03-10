package com.example.model;

import java.sql.Timestamp;

public class Category {
    private int LSPID;
    private String LoaiSP;
    private Timestamp created_at;
    private Timestamp updated_at;

    public int getLSPID() {
        return LSPID;
    }

    public void setLSPID(int lSPID) {
        LSPID = lSPID;
    }

    public String getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        LoaiSP = loaiSP;
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
