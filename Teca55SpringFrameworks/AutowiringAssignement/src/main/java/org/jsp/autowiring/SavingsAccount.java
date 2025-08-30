package org.jsp.autowiring;

public class SavingsAccount implements Account {
	private String accountNumber;
	private String accountHolderName;
	private String mobileNumber;
	private String email;
	private double balance;

	public SavingsAccount() {

	}

	public SavingsAccount(String accountNumber, String accountHolderName, String mobileNumber, String email,
			double balance) {
		System.out.println("Argument constructor of Bank class....!!!!");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.balance = balance;
	}

	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", balance=" + balance + "]";
	}

	

}
