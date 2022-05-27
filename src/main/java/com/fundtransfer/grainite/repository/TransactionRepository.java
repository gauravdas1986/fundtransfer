package com.fundtransfer.grainite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fundtransfer.grainite.entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {}
