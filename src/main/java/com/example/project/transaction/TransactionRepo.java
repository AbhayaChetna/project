package com.example.project.transaction;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepo extends CrudRepository<Transaction, Long> {
    List<Transaction> findAll();
}
