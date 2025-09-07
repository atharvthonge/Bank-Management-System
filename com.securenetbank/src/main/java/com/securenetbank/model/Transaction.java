package com.securenetbank.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // required by JPA
    private String fromAccount;
    private String fromName;
    private String toAccount;
    private String toName;
    private double amount;
    private LocalDateTime date;

    public Transaction(String fromAccount, String fromName, String toAccount, String toName, double amount, LocalDateTime date) {
        this.fromAccount = fromAccount;
        this.fromName = fromName;
        
        this.toAccount = toAccount;
        this.toName = toName;
        this.amount = amount;
        this.date = date;
    }
    
    public Transaction() {}
    
    public void setId(Long id) { this.id = id; }
    public void setFromAccount(String fromAccount) { this.fromAccount = fromAccount; }
    public void setFromName(String fromName) { this.fromName = fromName; }
    public void setToAccount(String toAccount) { this.toAccount = toAccount; }
    public void setToName(String toName) { this.toName = toName; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDate(LocalDateTime date) { this.date = date; }


	public Long getId() { return id; }

    public String getFromAccount() { return fromAccount; }
    public String getFromName() { return fromName; }
    public String getToAccount() { return toAccount; }
    public String getToName() { return toName; }
    public double getAmount() { return amount; }
    public LocalDateTime getDate() { return date; }
}
