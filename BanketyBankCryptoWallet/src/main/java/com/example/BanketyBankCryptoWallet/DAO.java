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

    public CurrencyDTO getExchangeRate(String CurrencyID) {
        String sql = "SELECT * FROM Currency WHERE CurrencyID = ?";
        CurrencyDTO rate = jdbcTemplate.queryForObject(sql, new Object[]{CurrencyID}, new CurrencyRowMapper());
        return rate;
    }

    public List<BalanceDTO> getBalanceList() {
        String sql = "SELECT * from Balance";
        List<BalanceDTO> balance = jdbcTemplate.query(sql, new BalanceRowMapper());
        return balance;
    }

    public BalanceDTO getBalance(String CurrencyID) {
        String sql = "SELECT * FROM Balance WHERE CurrencyID = ?";
        BalanceDTO balance = jdbcTemplate.queryForObject(sql, new Object[]{CurrencyID}, new BalanceRowMapper());
        return balance;
    }

    public CombinedDTO getCombinedData(String CurrencyID) {
        String sql = "SELECT * FROM Currency inner join Balance on Currency.CurrencyID = Balance.CurrencyID WHERE Currency.CurrencyID = ? ";

        CombinedDTO output = jdbcTemplate.queryForObject(sql, new CombinedRowMapper(), CurrencyID);

        return output;
    }
}


