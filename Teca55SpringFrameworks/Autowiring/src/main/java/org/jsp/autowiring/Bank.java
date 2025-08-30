package org.jsp.autowiring;

public class Bank {
	private String bankname;
	private String branch;
	private String ifsc;
	private String address;
	private Account account;

	public Bank() {
		System.out.println("No-argument constructor of Bank class....!!!!");
	}

	public Bank(Account account) {
		this.account = account;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", branch=" + branch + ", ifsc=" + ifsc + ", address=" + address
				+ ", account=" + account + "]";
	}

}
