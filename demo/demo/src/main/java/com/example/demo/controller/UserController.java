package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.AcountRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Trade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AcountRepository acountRepository;

    @Autowired
    private Trade trade;

    @GetMapping("user/{id}")
    @Operation(summary = "Find User By ID")
    public ResponseEntity<?> userById(@Parameter(description = "id of user to be searched") @PathVariable(name = "id") String id){
        Optional<User> userOptional = userRepository.findById(id);
        User user = new User();
        if(userOptional.isPresent()){
             user = userOptional.get();
        }
        else {
            throw new NotFoundException("User with id = " + id + " not found");
        }
        return  ResponseEntity.ok(user);
    }

    @GetMapping("account/{id}")
    @Operation(summary = "Find Account By ID")
    public ResponseEntity<?> accountById(@Parameter(description = "id of account to be searched") @PathVariable(name = "id") String id){
        Optional<Account> accountOptional = acountRepository.findById(id);
        Account account = new Account();
        if(accountOptional.isPresent()){
            account = accountOptional.get();
        }
        else {
            throw new NotFoundException("Account with id = " + id + " not found");
        }
        return  ResponseEntity.ok(account);
    }

    @Operation(summary = "Find Account By UserId")
    @GetMapping("accountByUserId/{id}")
    public ResponseEntity<?> accountByUserId(@Parameter(description = "id_user of account to be searched") @PathVariable(name = "id") String id){
        Optional<User> userOptional = userRepository.findById(id);
        User user = new User();
        if(userOptional.isPresent()){
            user = userOptional.get();
        }
        else {
            throw new NotFoundException("Account with id = " + id + " not found");
        }
        List<Account> accountList = acountRepository.findAllByUser(user);
        return  ResponseEntity.ok(accountList);
    }

    

}
