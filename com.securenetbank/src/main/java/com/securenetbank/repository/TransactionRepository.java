package com.securenetbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.securenetbank.model.Transaction;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByFromAccountOrToAccount(String fromAccount, String toAccount);
}
