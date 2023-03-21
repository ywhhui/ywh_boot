package com.example.spring_boot_demo.controller;

import com.example.spring_boot_demo.model.DoneHistory;
import com.example.spring_boot_demo.service.MybatisPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo/ywh")
public class MybatisPlusController {


    @Autowired
    private MybatisPlusService plusService;

    @PostMapping("/insert")
    public void insert(@RequestBody DoneHistory doneHistory) throws Exception {

        plusService.insert(doneHistory);
    }

    @PostMapping("/inserts")
    public void inserts(@RequestBody List<DoneHistory> doneHistory) throws Exception {

        plusService.inserts(doneHistory);
    }
}
