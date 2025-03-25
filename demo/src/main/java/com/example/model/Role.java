package com.example.model;

import java.sql.Timestamp;

public class Role {
    private Long ID;
    private String Code;
    private Timestamp created_at;
    private Timestamp updated_at;

    public String getCode() {
        return Code;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long id) {
        ID = id;
    }

    public void setCode(String code) {
        Code = code;
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
