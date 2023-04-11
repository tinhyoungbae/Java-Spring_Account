package com.example.tinhh.Service;

import com.example.tinhh.Model.Account;
import com.example.tinhh.Model.Response;
import com.example.tinhh.Repo.InterfaceAccount;
import com.example.tinhh.Status.Status;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface iServiceAccount {
    public ResponseEntity<Response> getAccount();
    public ResponseEntity<Response> addAccount(Account account);
    public ResponseEntity<Response> deleteAnAccount(int idAccount);

    public ResponseEntity<Response> getAnAccount(int idAccount);

    public ResponseEntity<Response> updateAnAccount(Account account);
}
