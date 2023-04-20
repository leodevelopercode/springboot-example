package utils;

import org.junit.jupiter.api.Test;
import org.springframework.core.SpringVersion;

/**
 * @author Xiexingxie
 * @date 2023/3/7 下午 01:13
 */


public class strHideTest {

    @Test
    public void strHide() {
        String str = "18170690581";
    }

    @Test
    public void springFramework() {
        String version = SpringVersion.getVersion();
        System.out.println("version = " + version);
    }
    
}
