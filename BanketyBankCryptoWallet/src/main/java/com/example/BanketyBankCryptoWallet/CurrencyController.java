package com.example.BanketyBankCryptoWallet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CurrencyController {

    private DAO dao;

    @Autowired
    public void setDao(DAO dao) {
        this.dao = dao;
    }

    @RequestMapping("/all")
    public List<CurrencyDTO> getCurrency() {
        return this.dao.getCurrencyList();
    }
}



