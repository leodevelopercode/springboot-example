package com.xxx.repository;

import com.xxx.dto.UserDto;
import com.xxx.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Xiexingxie
 * @date 2023/3/5 上午 11:01
 */


public class UserRepositoryTest {
    
    
    private UserRepository userRepository;
    
    @Test
    public void testUserCount() {
        userRepository.findAll().stream()
                .filter(user -> user.getUser_name().equals("谢兴鑫"))
                .map(user -> new UserDto(
                        user.getUser_name(),
                        user.getName(), 
                        user.getPosition(), 
                        user.getIs_admin()))
                .collect(Collectors.toList())
                .forEach(userDto -> System.out.println(userDto));
    }

    @Test
    public void springFramework() {
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println("version = " + version + "springboot" + version1);
    }

    /**
     *@Disabled: 该测试用例将不会运行 
     *@DisplayName: 测试用例方法描述
     */
    @Test
    @Disabled
    @DisplayName("测试assertEquals方法！")
    public void shouldShowSimpleAssertion() {
        /**
         * assertEquals: 方法
         * expected: 预期值
         * actual: 实际结果
         * 
         */
        Assertions.assertEquals(1,1);
    }

    /**
     * assertAll(): 确保所有的断言都会被执行
     */
    @Test
    public void AssertionAssertAll() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Assertions.assertAll(
                ()-> Assertions.assertEquals(1,list.get(0)),
                () -> Assertions.assertEquals(2,list.get(1)),
                () -> Assertions.assertEquals(3,list.get(2)),
                () -> Assertions.assertEquals(4,list.get(3)));
    }


}
