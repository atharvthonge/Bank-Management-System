package com.securenetbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.securenetbank.model.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
    Account findByAccountNumber(String accountNumber);
    Account findByHolderName(String holderName);
}
