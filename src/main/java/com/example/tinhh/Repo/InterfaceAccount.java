package com.example.tinhh.Repo;

import com.example.tinhh.Model.Account;
import com.example.tinhh.Model.Response;
import com.example.tinhh.Status.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InterfaceAccount extends JpaRepository<Account, Integer> {
}
