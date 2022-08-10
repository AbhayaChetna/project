package com.example.project.trader;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TraderRepo extends CrudRepository<Trader, Long> {
    List<Trader> findAll();
    List<Trader> findByName(String name);
    Trader getTraderById(Long id);
}
