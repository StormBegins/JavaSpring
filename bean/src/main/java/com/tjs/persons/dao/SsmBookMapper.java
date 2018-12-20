package com.tjs.persons.dao;

import com.tjs.persons.entity.SsmBook;
import java.util.List;

public interface SsmBookMapper {
    int insert(SsmBook record);

    List<SsmBook> selectAll();
}