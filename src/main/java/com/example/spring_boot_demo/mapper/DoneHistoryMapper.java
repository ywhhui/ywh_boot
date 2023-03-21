package com.example.spring_boot_demo.mapper;

import com.example.spring_boot_demo.model.DoneHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DoneHistoryMapper extends BatchInsertMapper<DoneHistory> {

}
