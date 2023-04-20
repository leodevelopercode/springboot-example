package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Xiexingxie
 * @date 2023/3/10 下午 10:44
 */

/**
 * @PropertySource：读取配置文件
 * @Import：导入
 */
@PropertySource("classpath:jdbc.properties")
@Configuration
@Import(JdbcConfig.class)
public class SprinfConfiguration{
    
    
    
}
