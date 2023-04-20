package enums;

import com.xxx.customer.HuhEnum;
import com.xxx.customer.InfoEnum;
import org.junit.jupiter.api.Test;

/**
 * @author Xiexingxie
 * @date 2023/3/14 下午 07:33
 */


public class CustomerEnumTest {

    @Test
    public void cutomer() {
        
        String ok = "OK";
        String no = "NO";
        
        switch (HuhEnum.YES){
            case No:
                System.out.println("no");
            case YES:
                System.out.println("yes");
        }
        
    }
    
}
