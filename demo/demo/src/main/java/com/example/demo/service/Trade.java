package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.exception.NotFoundException;
import com.example.demo.exception.TradeException;
import com.example.demo.repository.AcountRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Trade {
    @Autowired
    private AcountRepository acountRepository;


    public void transfer(String accountSendId,String accountReceiveid,long amount){
        Optional<Account> accountOptional = acountRepository.findById(accountSendId);
        Account accountSend = new Account();
        if(accountOptional.isPresent()){
            accountSend  = accountOptional.get();
        }
        else {
            throw new NotFoundException("Account with id = " + accountSendId + " not found");
        }
        Account accountReceive = new Account();
        if(accountOptional.isPresent()){
            accountReceive = accountOptional.get();
        }
        else {
            throw new NotFoundException("Account with id = " + accountReceiveid + " not found");
        }

        long monneyAccountSend = accountSend.getBalance();
        long monneyAccountRecv = accountReceive.getBalance();

        if(monneyAccountSend < 0){
            throw new TradeException("Tiền người gửi nhỏ hơn 0");
        }
        if(monneyAccountSend < amount){
            throw new TradeException("Số dư của bạn không đủ thực hiện được giao dịch");
        }
        accountSend.setBalance(monneyAccountSend - amount);
        accountReceive.setBalance(monneyAccountRecv + amount);
        acountRepository.save(accountSend);
        acountRepository.save(accountReceive);
    }
}
