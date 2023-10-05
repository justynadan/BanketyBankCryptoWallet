package com.example.BanketyBankCryptoWallet;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BalanceRowMapper implements RowMapper<BalanceDTO> {

    @Override
    public BalanceDTO mapRow (ResultSet rs, int rowNum) throws SQLException {
            BalanceDTO balance = new BalanceDTO();
            balance.setCurrencyID(rs.getString("CurrencyID"));
            balance.setCurrencyBalance(rs.getDouble("CurrencyBalance"));
            return balance;
        }

    }

