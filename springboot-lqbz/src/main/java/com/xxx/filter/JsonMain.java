package com.xxx.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xxx.entities.PeopleInfo;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author Xiexingxie
 * @date 2023/3/14 下午 08:05
 */


public class JsonMain {

    public static void main(String[] args) throws IOException {
        String s = readJsonFile();
        System.out.println(s);
    }

    public static String readJsonFile() throws IOException {
        ClassPathResource resource = new ClassPathResource("static/format.json");
        InputStream inputStream = resource.getInputStream();
        byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
        int length = bdata.length;
        System.out.println(length);
        String data = new String(bdata, StandardCharsets.UTF_8);
        return data;
    }
}
