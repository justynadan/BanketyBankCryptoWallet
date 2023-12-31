package com.example.BanketyBankCryptoWallet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CurrencyController {

    private DAO dao;

    @Autowired
    public void setDao(DAO dao) {
        this.dao = dao;
    }

//    end point to get all info from Currency table
    @RequestMapping("/all")
    public List<CurrencyDTO> getCurrency() {
        return this.dao.getCurrencyList();
    }


//    end point to get one currency info (currency ID, currency Name and exchange rate) by currency id
    @RequestMapping("/rate")
    public CurrencyDTO getExchangeRate(@RequestParam String CurrencyID) {
        return this.dao.getExchangeRate(CurrencyID);
    }

    @RequestMapping("/combined")

    public CombinedDTO getCombinedData(@RequestParam String CurrencyID) {
        return this.dao.getCombinedData(CurrencyID);
    }

}




