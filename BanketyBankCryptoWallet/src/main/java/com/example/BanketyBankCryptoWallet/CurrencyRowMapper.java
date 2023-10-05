package com.example.BanketyBankCryptoWallet;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyRowMapper implements RowMapper<CurrencyDTO> {
    @Override
    public CurrencyDTO mapRow (ResultSet rs, int rowNum) throws SQLException {
        CurrencyDTO currency = new CurrencyDTO();
        currency.setCurrencyID(rs.getString("CurrencyID"));
        currency.setCurrencyName(rs.getString("CurrencyName"));
        currency.setExchangeRate1GBP(rs.getDouble("ExchangeRate1GBP"));
        return currency;
    }

}



