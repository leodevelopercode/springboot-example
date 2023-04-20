package com.example.service;

import com.example.module.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    
    private final JdbcTemplate jdbcTemplate;
    

    public int saveStudent(Student student) {
        String sql = "INSERT INTO t_student" +
                "(sname,sage,ssex,saccount,spassword,gid)" +
                "VALUES(?,?,?,?,?,?)";
        int inster = jdbcTemplate.update(sql, student.getSname(), student.getSage(), student.getSsex()
                , student.getSaccount(), student.getSpassword(), student.getGid());
        return inster;
    }
    
}
