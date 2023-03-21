package com.example.spring_boot_demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import lombok.Data;

@Data
public class BaseModle {

    @TableId(type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    @Column
    private Integer id;

    @Column(name = "create_time",comment = "创建时间")
    private String createTime;

    @Column(name = "updaet_time",comment = "修改时间")
    private String updaetTime;


}
