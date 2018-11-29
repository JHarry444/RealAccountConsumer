package com.qa.RealAccountConsumer.persistence.repository;

import com.qa.RealAccountConsumer.persistence.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoAccountRepo extends MongoRepository<Account, Long>{
}
