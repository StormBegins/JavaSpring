package com.tjs.persons.controller;


import com.tjs.persons.dao.SsmBookMapper;
import com.tjs.persons.entity.SsmBook;
import com.tjs.persons.server.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class Book {

    @Autowired
    private ServerConfig serverConfig;

    @Autowired
    private SsmBookMapper ssmBookMapper;
    @GetMapping
    public List<SsmBook> getBook(){
        return serverConfig.getAll();
    }
   /* public List<SsmBook> getBook(){
        return ssmBookMapper.selectAll();
    }*/
}
