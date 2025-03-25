package com.example.model;

import java.sql.Timestamp;

public class User {
    private Long UserID;
    private String tenND;
    private String matKhau;
    private Long IDVT;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Role role = new Role();

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Long getIDVT() {
        return IDVT;
    }

    public void setIDVT(Long iDVT) {
        IDVT = iDVT;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
