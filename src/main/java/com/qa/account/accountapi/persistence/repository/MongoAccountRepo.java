package com.qa.account.accountapi.persistence.repository;

import com.qa.account.accountapi.persistence.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoAccountRepo extends MongoRepository<Account, Long>{
}
