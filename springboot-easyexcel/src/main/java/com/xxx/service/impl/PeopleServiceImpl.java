package com.xxx.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.xxx.config.ChatConverter;
import com.xxx.dao.PeopleDao;
import com.xxx.module.entities.PeopleInfo;
import com.xxx.module.vo.PeopleExcel;
import com.xxx.service.IPeopleService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Xiexingxie
 * @date 2023/2/28 下午 03:30
 */


@Service
@RequiredArgsConstructor
public class PeopleServiceImpl implements IPeopleService {

    private static final Logger log = LoggerFactory.getLogger(PeopleServiceImpl.class);
    public static final String AN_OBJECT = "谢兴鑫";
    public static final int PER_SHEET_ROW_COUNT = 50000;
    public static final Integer PER_WRITE_ROT_COUNT = 10000;
    private final PeopleDao peopleDao;


    @Override
    public List<PeopleInfo> selPeople() {
        long startTime = System.currentTimeMillis();
        val collect = peopleDao.selPeople().stream()
                .filter(peopleInfo -> peopleInfo.
                        getName().
                        equals(AN_OBJECT)
                ).collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info("PeopleServiceImpl:selPeopleStream运行的时长为:{}", endTime - startTime + "ms");
        return collect;
    }

    @Override
    public List<PeopleInfo> selAllPeople() {
        long startTime = System.currentTimeMillis();
        val peopleInfos = peopleDao.selAllPeople();
        long endTime = System.currentTimeMillis();
        log.info("PeopleServiceImpl:selAllPeopleStream运行的时长为:{}", endTime - startTime + "ms");
        return peopleInfos;
    }

    @Override
    public List<PeopleExcel> selExcelData() {
        String excelName = "peopleData" + System.currentTimeMillis() + "." + ExcelTypeEnum.XLSX;
        long startTime = System.currentTimeMillis();
        val peopleExcels = peopleDao.selExcelData();
        EasyExcel.write(excelName, PeopleExcel.class).
                registerConverter(new ChatConverter()).
                sheet("第一天").
                doWrite(peopleExcels);
        long endTime = System.currentTimeMillis();
        log.info("PeopleServiceImpl:selAllPeopleStream运行的时长为:{}", endTime - startTime + "ms");
        return peopleExcels;
    }

    @Override
    public Integer countPeople() {
        return peopleDao.countPeople();
    }


    @Override
    public void exportPeople() {
        OutputStream outputStream = null;
        try {
            //记录总数，实际需要根据查询条件进行统计即可
            Integer totalCount = peopleDao.countPeople();
            //每个sheet存放50000数据
            Integer sheetDataRows = PER_SHEET_ROW_COUNT;
            //每次写入的数据量为10000,每页查询10000
            Integer writeDataRows = PER_WRITE_ROT_COUNT;
            //计算需要的Sheet数量
            Integer sheetNum = totalCount % sheetDataRows == 0 ? (totalCount / sheetDataRows) :
                    (totalCount / sheetDataRows + 1);
            //计算一般情况下每一个sheet需要写入的次数（一般情况下不包含最后一个sheet,因为最后一个sheet不确定会写入多少条数据）
            Integer oneSheetWriteCount = sheetDataRows / writeDataRows;
            //计算最后有一个sheet需要写入的次数
            Integer lastSheetWriteCount = totalCount % sheetDataRows == 0 ? oneSheetWriteCount
                    : (totalCount % sheetDataRows % writeDataRows == 0 ? (totalCount / sheetDataRows / writeDataRows)
                    : totalCount / sheetDataRows / writeDataRows + 1);
            ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletResponse responsee = requestAttributes.getResponse();
            outputStream = responsee.getOutputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
