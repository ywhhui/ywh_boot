package com.example.spring_boot_demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.spring_boot_demo.mapper.DoneHistoryMapper;
import com.example.spring_boot_demo.model.DoneHistory;
import com.example.spring_boot_demo.service.MybatisPlusService;
import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 注意点总结
 * 1.需要注意单表的性能 索引问题
 * 2.需要注意单表的批量操作 并发时候要考虑
 * 3.需要注意 @Transactional 事务控制 每个表操作 都要保证原子性
 */
@Service
@Transactional
public class MybatisPlusServiceImpl implements MybatisPlusService {

    private static final Logger logger = LoggerFactory.getLogger(MybatisPlusServiceImpl.class);

    @Autowired
    private DoneHistoryMapper doneHistoryMapper;

    @Override
    public void insert(DoneHistory doneHistory) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        String accout = doneHistory.getAccout();
        logger.info("insert doneHistory:{},accout:{}", JSON.toJSONString(doneHistory),accout);

        doneHistoryMapper.insert(doneHistory);
        stopwatch.stop();
        logger.info("耗时CostTime:{}",stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }

    @Override
    public void inserts(List<DoneHistory> doneHistorys) {
        logger.info("inserts doneHistorys:{}}", doneHistorys);
        doneHistoryMapper.insertBatchSomeColumn(doneHistorys);
    }
}
