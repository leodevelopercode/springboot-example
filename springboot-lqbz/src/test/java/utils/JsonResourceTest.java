package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author Xiexingxie
 * @date 2023/3/14 下午 07:51
 */


public class JsonResourceTest {

    @Test
    public void json() {
        JSONObject jsonResource = getJsonResource("static/format.json");
        System.out.println(jsonResource);
    }

    public static JSONObject getJsonResource(String filename) {
        JSONObject jsonObject = null;
        if (!filename.contains(".json")) {
            filename += ".json";
        }
        try {
            URL url = JsonResourceTest.class.getResource(filename);
            String path = url.getPath();
            File file = new File(path);
            if (file.exists()) {
                String content = FileUtils.readFileToString(file, "UTF-8");
                jsonObject = JSON.parseObject(content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return jsonObject;
    }

}
