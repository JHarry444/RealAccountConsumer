package com.qa.account.accountapi.reciever;

import com.qa.account.accountapi.persistence.domain.Account;
import com.qa.account.accountapi.persistence.repository.MongoAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AccountReceiver {


    @Autowired
    MongoAccountRepo repo;

    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
    public void receiveMessage(Account account) {
        repo.insert(account);
    }
}
