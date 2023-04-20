package dateformat;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 06:58
 */


public class timestampFormatTest {

    /**
     * 十三位时间戳转换
     */
    @Test
    public void timeStamp() {
        long timestamp = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timestamp);
        System.out.println("format = " + format);
    }

    /**
     * 十位时间戳转换
     */
    @Test
    public void timeStamp2() {
        long tentimeStamp = (long) Math.floor(System.currentTimeMillis() / 1000);
        Date date = new Date(tentimeStamp * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println("date = " + format);

    }
    
}
