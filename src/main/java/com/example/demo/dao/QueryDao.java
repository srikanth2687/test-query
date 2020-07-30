package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class QueryDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void executeQuery(String query){
        jdbcTemplate.query(query,resultSet -> {
            int columnCount = resultSet.getMetaData().getColumnCount();
            for(int i=1;i<=columnCount;i++){
                System.out.println(resultSet.getString(i));
            }
        });
    }

}
