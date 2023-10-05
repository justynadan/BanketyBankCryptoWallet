package com.example.BanketyBankCryptoWallet;

public class CurrencyDTO {



    private String currencyID;
    private String currencyName;
    private double exchangeRate1GBP;


    public String getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(String currencyID) {
        this.currencyID = currencyID;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getExchangeRate1GBP() {
        return exchangeRate1GBP;
    }

    public void setExchangeRate1GBP(double exchangeRate1GBP) {
        this.exchangeRate1GBP = exchangeRate1GBP;
    }
}
