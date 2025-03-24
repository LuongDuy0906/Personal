package com.example.paging;

import com.example.sort.Sorter;

public class PageRequest implements Pageble {

    private Integer page;
    private Integer maxPageItem;
    private Sorter sort;

    public PageRequest(Integer page, Integer maxPageItem, Sorter sort) {
        this.page = page;
        this.maxPageItem = maxPageItem;
        this.sort = sort;
    }

    @Override
    public Integer getPage() {
        return this.page;
    }

    @Override
    public Integer getOffset() {
        if (this.page != null) {
            return (this.page - 1) * this.maxPageItem;
        } else {
            return null;
        }
    }

    @Override
    public Integer getLimit() {
        return this.maxPageItem;
    }

    @Override
    public Sorter getSorter() {
        if (this.sort != null) {
            return this.sort;
        } else {
            return null;
        }
    }

}
