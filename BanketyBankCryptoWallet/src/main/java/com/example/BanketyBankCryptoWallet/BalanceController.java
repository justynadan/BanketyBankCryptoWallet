package com.example.BanketyBankCryptoWallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class BalanceController {

    private DAO dao;

    @Autowired
    public void setDao(DAO dao) {
        this.dao = dao;
    }

//   end point to get all info from Balance table
    @RequestMapping("/allBalance")
    public List<BalanceDTO> getBalance() {
        return this.dao.getBalanceList();
    }

//    end point to get single currency info(ID and balance) by currency ID
    @RequestMapping("/currencyBalance")
    public BalanceDTO getBalance(@RequestParam String CurrencyID) {
        return this.dao.getBalance(CurrencyID);
    }
}
