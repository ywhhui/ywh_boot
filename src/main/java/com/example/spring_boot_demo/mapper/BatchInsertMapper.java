package com.example.spring_boot_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BatchInsertMapper<T> extends BaseMapper<T>{

    Integer insertBatchSomeColumn (Collection<T> list);

}
