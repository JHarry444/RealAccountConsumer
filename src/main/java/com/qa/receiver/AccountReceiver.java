package com.qa.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.repository.MongoAccountRepo;
import com.qa.sender.Account;

@Component
public class AccountReceiver {


    @Autowired
    private MongoAccountRepo repo;

    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
    public void receiveMessage(Account account) {
        repo.save(account);
    }
}
