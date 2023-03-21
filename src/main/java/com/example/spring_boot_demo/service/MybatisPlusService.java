package com.example.spring_boot_demo.service;

import com.example.spring_boot_demo.model.DoneHistory;

import java.util.List; /**
 * 公司信息业务接口
 *
 * @Author chenjiaming
 * @create 2022-9-20 17:18:02
 */
public interface MybatisPlusService {


    void insert(DoneHistory doneHistory);

    void inserts(List<DoneHistory> doneHistory);
}
