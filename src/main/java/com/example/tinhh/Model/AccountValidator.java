package com.example.tinhh.Model;

import io.micrometer.common.util.StringUtils;

import java.util.Optional;

public class AccountValidator {
    public boolean isValid(Account account) {
        return Optional.ofNullable(account)
                .filter(a -> !StringUtils.isEmpty(a.getNameAccount()))
                .isPresent();
    }
}
