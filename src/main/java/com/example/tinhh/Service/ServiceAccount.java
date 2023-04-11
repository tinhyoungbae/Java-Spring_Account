package com.example.tinhh.Service;

import com.example.tinhh.Model.Account;
import com.example.tinhh.Model.Response;
import com.example.tinhh.Repo.InterfaceAccount;
import com.example.tinhh.Status.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceAccount implements iServiceAccount{
    @Autowired
    private InterfaceAccount interfaceAccount;
    @Override
    public ResponseEntity<Response> getAccount() {
        List<Account> optionalAccount = interfaceAccount.findAll();
        if(!optionalAccount.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Response(Status.getStatus_ok(), Status.getMessage_ok(), optionalAccount)
            );
        }else{
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                    new Response(Status.getStatus_error(), Status.getMessage_error(), "")
            );
        }
    }
    public ResponseEntity<Response> addAccount(Account account) {
        if (account != null) {
            interfaceAccount.save(account);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Response(Status.getStatus_ok(), Status.getMessage_ok(), account)
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
            new Response(Status.getStatus_error(), Status.getMessage_error(), "")
        );
    }
    public ResponseEntity<Response> deleteAnAccount(int idAccount){
        Optional<Account> accountOptional = interfaceAccount.findById(idAccount);
        //getAccount();
        if(accountOptional.isPresent()){
            interfaceAccount.delete(accountOptional.get());
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Response(Status.getStatus_ok(), Status.getMessage_ok(), getAccount().getBody().getData())
            );
        }else {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                    new Response(Status.getStatus_error(), Status.getMessage_error(), getAccount().getBody().getData())
            );
        }
    }

    public ResponseEntity<Response> getAnAccount(int idAccount){
        Optional<Account> accountOptional = interfaceAccount.findById(idAccount);
        if(accountOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Response(Status.getStatus_ok(), Status.getMessage_ok(), accountOptional.get())
            );
        }else {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                    new Response(Status.getStatus_error(), "There isn't idAccount = "+idAccount +" in database. Please try again.", "")
            );
        }
    }


    public ResponseEntity<Response> updateAnAccount(Account account){
        List<Account> accountOptional = interfaceAccount.findAll();
        if(!accountOptional.isEmpty()){
            interfaceAccount.save(account);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new Response(Status.getStatus_ok(), Status.getMessage_ok(), accountOptional)
            );
        }else {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                    new Response(Status.getStatus_error(), "Can not update Account. Please try again.", "")
            );
        }
    }
}
