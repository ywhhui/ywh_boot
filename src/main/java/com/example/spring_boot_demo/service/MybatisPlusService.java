package com.example.spring_boot_demo.service;

import com.example.spring_boot_demo.model.DoneHistory;

import java.util.List;

/**
 *
 */
public interface MybatisPlusService {


    void insert(DoneHistory doneHistory);

    void inserts(List<DoneHistory> doneHistory);
}
