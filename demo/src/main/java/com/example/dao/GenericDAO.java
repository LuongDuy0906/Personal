package com.example.dao;

import java.util.List;

import com.example.mapper.RowMapper;

public interface GenericDAO<T> {
    @SuppressWarnings("hiding")
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);

    void update(String sql, Object... parameters);

    Integer insert(String sql, Object... parameters);
}
