package com.example.service;

import com.example.module.People;
import com.example.module.vo.Customers;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final JdbcTemplate jdbcTemplate;

    /**
     * 分页查询
     * @return
     */
    public List<People> selAllPeopleLimit() {
        String sql = "SELECT userId,userName,password,name,departmentId,position,email,phone,isAdmin" +
                ' ' +
                "FROM people" +
                ' ' +
                "LIMIT 0,100";
        List<People> peopleList = jdbcTemplate.query(sql, (rs, rowNum) -> {
            People people = new People();
            people.setUserId(rs.getInt("userId"));
            people.setUserName(rs.getString("userName"));
            people.setPassword(rs.getString("password"));
            people.setName(rs.getString("name"));
            people.setDepartmentId(rs.getInt("departmentId"));
            people.setPosition(rs.getString("position"));
            people.setEmail(rs.getString("email"));
            people.setPhone(rs.getString("phone"));
            people.setIsAdmin(rs.getString("isAdmin"));
            return people;
        });
        return peopleList;
    }

    /**
     * 分页查询
     * @return
     */
    public List<People> selpeoplelimit() {
        String sql = "SELECT userId,userName,password,name,departmentId,position,email,phone,isAdmin" +
                ' ' +
                "FROM people" +
                ' ' +
                "LIMIT 0,200";
        List<People> streamPeopleList = jdbcTemplate.query(sql, (rs, rowNum) -> {
                    People people = new People();
                    people.setUserId(rs.getInt("userId"));
                    people.setUserName(rs.getString("userName"));
                    people.setPassword(rs.getString("password"));
                    people.setName(rs.getString("name"));
                    people.setDepartmentId(rs.getInt("departmentId"));
                    people.setPosition(rs.getString("position"));
                    people.setEmail(rs.getString("email"));
                    people.setPhone(rs.getString("phone"));
                    people.setIsAdmin(rs.getString("isAdmin"));
                    return people;
                }).stream()
                .filter(people -> people.getIsAdmin().equals("不是"))
                .collect(Collectors.toList());
        return streamPeopleList;
    }

    /**
     * 查询people的总数
     * @return
     */
    public Integer countPeople(){
        
        String sql = "SELECT count(DISTINCT userId) FROM people";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        
        return count;
    }
    
    
    public Integer batchUpdateByPeopleLeader(){

        String sql = "UPDATE people SET ";
        jdbcTemplate.batchUpdate(sql);
        
        return 0;
    }
    
    public int insertCustomer(Customers customers){
        String sql = "INSERT INTO customers" +
                "(c_id,c_name,c_address,c_city,c_zip,c_contace,c_email)" +
                "VALUES" +
                ' '+
                "(null,?,?,?,?,?,?)";
        int insert = jdbcTemplate.update(sql, customers);
        return insert;
    }

}
