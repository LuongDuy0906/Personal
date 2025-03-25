package com.example.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Abstract<T> {
    private long[] IDs;
    private Long ID;
    private Timestamp created_at;
    private Timestamp updated_at;
    private List<T> listResult = new ArrayList<>();
    private Integer page;
    private Integer maxPageItem;
    private Integer totalPage;
    private Integer totalItem;
    private String sortName;

    public long[] getSPIDs() {
        return IDs;
    }

    public void setSPIDs(long[] sPIDs) {
        IDs = sPIDs;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
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

    public List<T> getListResult() {
        return listResult;
    }

    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
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

    public Integer getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
    }

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

    private String sortBy;
}
