package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Xiexingxie
 * @date 2023/3/10 下午 11:05
 */


public class SpringAnnotationTest {

    public static void main(String[] args) {
        // 1、创建容器。（基于注解的创建方式）
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("config");
        // 2、根据bean的id获取对象
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        jdbcTemplate.update("insert into usertable(user_id,user_name,user_age) values (?,?,?)",null,"我是JDBC添加的数据hhh",12);
    }
    
}
