package com.group.libraryapp.repository.fruit;

import java.time.LocalDate;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class FruitMySqlRepository implements FruitRepository{

    private final JdbcTemplate jdbcTemplate;

    public FruitMySqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(String name, LocalDate warehousingDate, long price) {
        String sql = "INSERT INTO fruit (name, warehousingDate, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, name, warehousingDate,price);
    }

    public void updateSoldStatus(Long id) {
        String sql = "UPDATE fruit SET isSold = true WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public long getSalesAmount(String name) {
        String salesSql = "SELECT SUM(price) FROM fruit WHERE name = ? AND isSold = true";
        return jdbcTemplate.queryForObject(salesSql, Long.class, name);
    }

    public long getNotSalesAmount(String name) {
        String notSaleSql = "SELECT SUM(price) FROM fruit WHERE name = ? AND isSold = false";
        return jdbcTemplate.queryForObject(notSaleSql, Long.class, name);
    }
}
