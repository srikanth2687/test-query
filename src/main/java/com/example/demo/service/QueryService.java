package com.example.demo.service;

import com.example.demo.dao.QueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryService {

    @Autowired
    private QueryDao queryDao;

    public void executeQuery(){
        String query="select * from Account";
        queryDao.executeQuery(query);
    }
}
