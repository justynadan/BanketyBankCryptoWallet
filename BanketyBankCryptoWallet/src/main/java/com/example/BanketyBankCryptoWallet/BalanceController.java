package com.example.BanketyBankCryptoWallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


// end point to UPDATE balances
    @GetMapping("/update/{CurrencyID}/{CurrencyBalance}")
    public void updateBalance(@PathVariable String CurrencyID, @PathVariable double CurrencyBalance) {
    dao.updateBalance(CurrencyID, CurrencyBalance);
    }
}
