package com.example.spring_boot_demo.model;

import com.baomidou.mybatisplus.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;

import java.time.LocalDateTime;


@TableName(value = "done_history",schema = "gmis_cusgua")
@TableComment("已办历史表")
@Data
public class DoneHistory {

    @TableId(type = IdType.AUTO)
    @IsKey
    @IsAutoIncrement
    private Long id;

    @TableField("accout")
    private String accout;

    @TableField("actType")
    private String actType;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


}
