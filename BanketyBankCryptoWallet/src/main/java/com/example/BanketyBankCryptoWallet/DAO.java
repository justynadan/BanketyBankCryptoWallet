package com.example.BanketyBankCryptoWallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<CurrencyDTO> getCurrencyList() {
        String sql = "SELECT * from Currency";
        List<CurrencyDTO> currency = jdbcTemplate.query(sql, new CurrencyRowMapper());
        return currency;
    }
}


