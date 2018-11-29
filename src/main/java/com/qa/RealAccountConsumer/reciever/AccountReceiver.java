package com.qa.RealAccountConsumer.reciever;

import com.qa.RealAccountConsumer.persistence.domain.Account;
import com.qa.RealAccountConsumer.persistence.repository.MongoAccountRepo;
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
