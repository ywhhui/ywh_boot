package com.example.spring_boot_demo.handler;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.extension.injector.methods.InsertBatchSomeColumn;

import java.util.List;

public class BatchInsertInjector extends DefaultSqlInjector {

    public List<AbstractMethod> getMethodList(Class<?> mapperClass, TableInfo tableInfo) {

        List<AbstractMethod> methodList = super.getMethodList(mapperClass, tableInfo);
        methodList.add(new InsertBatchSomeColumn(i->i.getFieldFill()!= FieldFill.UPDATE));
        return methodList;
    }
}
