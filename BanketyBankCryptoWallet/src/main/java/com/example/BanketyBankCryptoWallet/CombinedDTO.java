package com.example.BanketyBankCryptoWallet;

import java.util.Currency;

public class CombinedDTO {


    public void setCurrencyDTO(CurrencyDTO currencyDTO) {
        this.currencyDTO = currencyDTO;
    }

    public void setBalanceDTO(BalanceDTO balanceDTO) {
        this.balanceDTO = balanceDTO;
    }

    public CurrencyDTO getCurrencyDTO() {
        return currencyDTO;
    }

    private CurrencyDTO currencyDTO;

    public BalanceDTO getBalanceDTO() {
        return balanceDTO;
    }

    private BalanceDTO balanceDTO;

    public CombinedDTO(CurrencyDTO currencyDTO, BalanceDTO balanceDTO) {
        this.currencyDTO = currencyDTO;
        this.balanceDTO = balanceDTO;
    }

}
