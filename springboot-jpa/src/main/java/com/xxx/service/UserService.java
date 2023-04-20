package com.xxx.service;

import com.xxx.model.User;
import com.xxx.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xiexingxie
 * @date 2023/4/9 下午 04:38
 */

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public List<User> findAll(){

        List<User> all = userRepository.findAll();
        all.stream().filter(user -> user.getUser_id() > 1)
                .limit(1)
                .forEach(user -> System.out.println(user.getUser_id()));

        return null;
    }
    
}
