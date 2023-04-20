package com.xxx.module.vo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.xxx.api.controller.PeopleController;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleExcelTest {

    public List<PeopleExcel> getData() {
        List<PeopleExcel> peopleExcelArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            PeopleExcel peopleExcel = new PeopleExcel();
            peopleExcel.setEmail("safasfas.com");
            peopleExcel.setPhone("102121421");
            peopleExcelArrayList.add(peopleExcel);
        }
        return peopleExcelArrayList;
    }

    @Test
    public void testeasyExce() {
        EasyExcel.write("test.xlsx", PeopleController.class).sheet().doWrite(getData());
    }

    @Test
    public void testReadExcel() {
        List<PeopleExcel> list = new ArrayList<>();
        EasyExcel.read("test" + ExcelTypeEnum.XLSX.getValue(), PeopleExcel.class, new AnalysisEventListener() {
            @Override
            public void invoke(Object data, AnalysisContext analysisContext) {
                list.add((PeopleExcel) data);
            }
            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("读取完成");
            }
        }).sheet().doRead();
        list.forEach(System.out::println);
    }


}