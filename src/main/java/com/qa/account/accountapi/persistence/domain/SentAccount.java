package com.qa.account.accountapi.persistence.domain;

public class SentAccount {

    private Long accountId;

    private String firstName;

    private String lastName;

    private String accountNumber;

    private SentPrize sentPrize;

    public SentAccount() {
    }

    public SentAccount(Long accountId, String firstName, String lastName, String accountNumber, SentPrize sentPrize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.accountId = accountId;
        this.sentPrize = sentPrize;
    }

    public Long getId() {
        return accountId;
    }

    public void setId(Long id) {
        this.accountId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SentPrize getSentPrize() {
        return sentPrize;
    }

    public void setSentPrize(SentPrize sentPrize) {
        this.sentPrize = sentPrize;
    }

}