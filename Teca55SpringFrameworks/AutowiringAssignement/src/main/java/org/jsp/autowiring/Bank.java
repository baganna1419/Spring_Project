package org.jsp.autowiring;

public class Bank {
	private String bankname;
	private Branch branch;
	private String ifsc;
	private Address address;
	private Account account;

	public Bank() {
		System.out.println("No-argument constructor of Bank class....!!!!");
	}

//	public Bank(Branch branch, Address address, Account account) {
//		this.branch = branch;
//		this.address = address;
//		this.account = account;
//	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
