package com.example.BanketyBankCryptoWallet;

public class BalanceDTO {

    private String currencyID;
    private Double currencyBalance;

    public String getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    public Double getCurrencyBalance() {
        return currencyBalance;
    }

    public void setCurrencyBalance(Double currencyBalance) {
        this.currencyBalance = currencyBalance;
    }
}
