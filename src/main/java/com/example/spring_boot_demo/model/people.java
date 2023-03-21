package com.example.spring_boot_demo.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.Data;

@Table(name = "people")
@Data
public class people extends BaseModle {

    @Column(comment = "姓名")
    private String name;

    @Column
    private String sex;
}
