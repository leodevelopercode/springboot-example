package com.xxx.config;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.springframework.stereotype.Component;

/**
 * @author Xiexingxie
 * @date 2023/3/1 下午 07:25
 */
@Component
public class ChatConverter implements Converter<Character> {
    @Override
    public Class<?> supportJavaTypeKey() {
        return Character.class;
    }
    @Override
    public WriteCellData<?> convertToExcelData(Character value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return new WriteCellData<Character>(String.valueOf(value));
    }
}


