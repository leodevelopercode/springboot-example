package com.example.service;

import com.example.module.vo.Customers;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomersService {

    private final JdbcTemplate jdbcTemplate;
    

    /**
     * 查询c_id不低于10001的信息，并使用Stream流处理并且返回结果
     * collec
     * @return
     */
    public List<Customers> selCustomers() {
        String sql = "SELECT " +
                "c_id,c_name,c_address,c_city,c_zip,c_contact,c_email " +
                "FROM customers";
        List<Customers> collect = jdbcTemplate.query(sql, rowMapper()).stream()
                .filter(customers -> customers.getCId() > 10001)
                .collect(Collectors.toList());
        return collect;
    }

    /**
     * 添加一条数据
     * @param customers
     * @return
     */
    public int insterCustomers(Customers customers) {
        String sql = "INSERT INTO customers" +
                "(c_name,c_address,c_city,c_zip,c_contact,c_email)" +
                "VALUES (?,?,?,?,?,?);";
        int update = jdbcTemplate.update(sql,
                customers.getCName(), customers.getCAddress(),
                customers.getCCtity(),customers.getCZip(),customers.getCContact(),customers.getCEmail());
        return update;
    }

    /**
     * 字段映射
     * @return
     */
    public RowMapper<Customers> rowMapper() {
        return (rs, rowNum) -> {
            Customers customers = new Customers();
            customers.setCId(rs.getInt("c_id"));
            customers.setCName(rs.getString("c_name"));
            customers.setCAddress(rs.getString("c_address"));
            customers.setCCtity(rs.getString("c_city"));
            customers.setCZip(rs.getString("c_zip"));
            customers.setCContact(rs.getString("c_contact"));
            customers.setCEmail(rs.getString("c_email"));
            return customers;
        };
    }


}
