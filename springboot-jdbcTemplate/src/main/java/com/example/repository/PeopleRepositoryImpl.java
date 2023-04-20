package com.example.repository;


import com.example.model.entity.People;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Xiexingxie
 * @date 2023/3/12 下午 10:10
 */

@Service
public class PeopleRepositoryImpl implements PeopleRepository {
    
    private final JdbcTemplate jdbcTemplate;

    public PeopleRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public  List<People> selPeopleById() {
        String sql = "select * from people limit 0,20";
//        jdbcTemplate.batchUpdate()batchUpdate
        List<People> query = jdbcTemplate.query(sql, rowMapper());
        return query;
    }
    
    private RowMapper<People> rowMapper(){
        return new RowMapper<People>() {
            @Override
            public People mapRow(ResultSet rs, int rowNum) throws SQLException {
                People people = new People();
                people.setUser_id(rs.getInt("userId"));
                people.setUser_name(rs.getString("userName"));
                people.setPassword(rs.getString("password"));
                people.setName(rs.getString("name"));
                people.setDepartment_id(rs.getInt("departmentId"));
                people.setPosition(rs.getString("position"));
                people.setEmail(rs.getString("email"));
                people.setPhone(rs.getString("phone"));
                people.setIs_admin(rs.getString("isAdmin"));
                return people;
            }
        };
    }
}
