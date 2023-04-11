package com.example.tinhh.Controller;

import com.example.tinhh.Model.Account;
import com.example.tinhh.Model.Response;
import com.example.tinhh.Repo.InterfaceAccount;
import com.example.tinhh.Service.ServiceAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
public class ControllerAccount {
    @Autowired
    ServiceAccount serviceAccount;
    @Autowired
    InterfaceAccount interfaceAccount;

    private List<Account> accountList = new CopyOnWriteArrayList<>();

    @DeleteMapping("/account/{idAccount}")
    public ResponseEntity<Response> deleteAnAccount(@PathVariable int idAccount) {
        return serviceAccount.deleteAnAccount(idAccount);
    }
    @GetMapping("/account/{idAccount}")
    public ResponseEntity<Response> getAnAccount(@PathVariable int idAccount){
        return serviceAccount.getAnAccount(idAccount);
    }

    @GetMapping("/account")
    public ResponseEntity<Response> getAccount(Account account){
        return serviceAccount.getAccount();
    }

    @PutMapping("/account")
    public ResponseEntity<Response> updateAnAccount(@RequestBody Account account){
        return serviceAccount.updateAnAccount(account);
    }


    @PostMapping("/account")
    public ResponseEntity<Response> addAccount(@RequestBody Account account){
        return serviceAccount.addAccount(account);
    }

}
