package com.example.project.trader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trader {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String account_no;
    private double balance;

    public Trader() {
    }

    public Trader(String name, String account_no, double balance)
    {
        this.name = name;
        this.account_no = account_no;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
