package com.qa.sender;

public class Account {
	private Long id;
	private String accountNumber;
	private String forename;
	private String lastname;

	public Account() {
		
	}
	
	public Account(Long id, String accountNumber, String forename, String lastname) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.forename = forename;
		this.lastname = lastname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", forename=" + forename + ", lastname="
				+ lastname + "]";
	}

}
