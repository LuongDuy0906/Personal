package com.example.model;

import java.sql.Timestamp;

public class Role {
    private Long VTID;
    private String VaiTro;
    private Timestamp created_at;
    private Timestamp updated_at;

    public String getVaiTro() {
        return VaiTro;
    }

    public Long getVTID() {
        return VTID;
    }

    public void setVTID(Long vTID) {
        VTID = vTID;
    }

    public void setVaiTro(String vaiTro) {
        VaiTro = vaiTro;
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
