package com.example.spring_boot_demo.model;

import lombok.Data;

@Data
public class ToDoMsg {


    private Long id;

    private String accout;

    private String actType;

    private String msgType;

    private String msgTitle;


}
