package com.example.BanketyBankCryptoWallet;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CombinedRowMapper implements RowMapper<CombinedDTO> {
    @Override

    public CombinedDTO mapRow (ResultSet rs, int rowNum) throws SQLException {

        CurrencyDTO currencyDTO = new CurrencyDTO();
        BalanceDTO balanceDTO = new BalanceDTO();

        currencyDTO.setCurrencyID(rs.getString("CurrencyID"));
        currencyDTO.setCurrencyName(rs.getString("CurrencyName"));
        currencyDTO.setExchangeRate1GBP(rs.getDouble("ExchangeRate1GBP"));

        balanceDTO.setCurrencyID(rs.getString("CurrencyID"));
        balanceDTO.setCurrencyBalance(rs.getDouble("CurrencyBalance"));

        CombinedDTO combinedDTO = new CombinedDTO(currencyDTO,balanceDTO);
        return combinedDTO;
    }
}
