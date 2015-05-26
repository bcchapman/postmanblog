package com.credera.postman;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, QueryDslPredicateExecutor<Transaction> {
}
