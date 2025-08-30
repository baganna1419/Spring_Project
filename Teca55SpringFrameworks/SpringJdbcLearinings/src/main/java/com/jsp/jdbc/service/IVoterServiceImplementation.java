package com.jsp.jdbc.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.jdbc.dao.IVoterDao;
import com.jsp.jdbc.entity.Voter;

@Service("voterService")
public class IVoterServiceImplementation implements IVoterService {

	Scanner sc = new Scanner(System.in);
	@Autowired
	IVoterDao voterDao;

	public void register() {
		Voter voter = new Voter();
		System.out.print("Enter Voter Id : ");
		voter.setVoter_Id(sc.nextInt());
		System.out.print("Enter Voter Name : ");
		voter.setVoter_Name(sc.next());
		System.out.print("Enter Voter Age : ");
		voter.setVoter_Age(sc.nextInt());
		System.out.print("Enter Voter Address : ");
		voter.setVoter_Address(sc.next());
		System.out.print("Enter Voter Gender : ");
		voter.setVoter_Gender(sc.next());
		System.out.print("Enter Voter Mobile Number : ");
		voter.setVoter_Mobile(sc.next());
		int result = voterDao.addVoters(voter);
		if (result != 0) {
			System.out.println("Data Inserted Successfully..!!!!");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("504 Error..");
		}

	}

	public void updateMobileNumberByVoterName() {
		System.out.print("Enter Voter Name : ");
		String voterName = sc.next();
		System.out.println("Enter New Mobile Number To Update : ");
		String mobileNumber = sc.next();
		int result = voterDao.updateMobileNumber(voterName, mobileNumber);
		if (result != 0) {
			System.out.println("Updated Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter Name");
		}

	}

	public void deleteVoterByVoterId() {
		System.out.print("Enter Voter-Id : ");
		int voterId = sc.nextInt();
		System.out.print("Re-Enter Voter-Id For Confirmation : ");
		int confirmVoterId = sc.nextInt();
		if (voterId == confirmVoterId) {
			int result = voterDao.removeVoterDetailsBasedOnVoterId(confirmVoterId);
			if (result != 0) {
				System.out.println("Removed Succesfully...!");
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			}
		} else {
			System.out.println("Invalid Confirmation Id..");
		}
	}

	public void changeVoterNameById() {
		System.out.print("Enter Voter Name : ");
		String voterName = sc.next();
		System.out.print("Enter Voter-Id : ");
		int voterId = sc.nextInt();
		int result = voterDao.updateVoterNameById(voterName, voterId);
		if (result != 0) {
			System.out.println("Name Updated Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter Id");
		}

	}

	public void changeVoterAgeByNameAndId() {
		System.out.print("Enter Voter-Id : ");
		int voterId = sc.nextInt();
		System.out.print("Enter Voter Name : ");
		String voterName = sc.next();
		System.out.print("Enter Age To Update : ");
		int age = sc.nextInt();
		int result = voterDao.updateVoterAgeByNameAndId(voterId, voterName, age);
		if (result != 0) {
			System.out.println("Age Updated Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter ");
		}

	}

	public void changeVoterGenderById() {
		System.out.print("Enter Voter Id : ");
		int voterId = sc.nextInt();
		System.out.print("Enter Voter gender To Update : ");
		String voterGender = sc.next();
		int result = voterDao.updateVoterGenderById(voterId, voterGender);
		if (result != 0) {
			System.out.println("Gender Updated Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter ");
		}

	}

	public void changeVoterMobileByIdAndName() {
		System.out.print("Enter Voter Id : ");
		int voterId = sc.nextInt();
		System.out.print("Enter Voter Name : ");
		String voterName = sc.next();
		System.out.print("Enter Mobile Number to Update : ");
		String voterMobile = sc.next();
		int result = voterDao.updateVoterMobileNumberByIdAndName(voterId, voterName, voterMobile);
		if (result != 0) {
			System.out.println("MobileNumber Updated Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter ");
		}

	}

	public void changeVoterAddressByIdAndMobile() {
		System.out.print("Enter Voter Id : ");
		int voterId = sc.nextInt();
		System.out.print("Enter Mobile Number : ");
		String voterMobile = sc.next();
		System.out.print("Enter Address to Update : ");
		String address = sc.next();
		int result = voterDao.updateVoterAddressByIdAndMobile(voterId, voterMobile, address);
		if (result != 0) {
			System.out.println("Address Updated Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter ");
		}

	}

	public void removeVoterById() {
		System.out.print("Enter Voter Id : ");
		int voterId = sc.nextInt();
		int result = voterDao.deleteVoterById(voterId);
		if (result != 0) {
			System.out.println("Deleted Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter ");
		}
	}

	public void removeVoterByMobileAndId() {
		System.out.print("Enter Voter Id : ");
		int voterId = sc.nextInt();
		System.out.print("Enter Mobile Number : ");
		String voterMobile = sc.next();
		int result = voterDao.deleteVoterByIdAndMobile(voterId, voterMobile);
		if (result != 0) {
			System.out.println("Deleted Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter ");
		}

	}

	public void removeVoterByNameAndAddress() {
		System.out.print("Enter Voter name : ");
		String voterName = sc.next();
		System.out.print("Enter Address  : ");
		String address = sc.next();
		int result = voterDao.deleteVoterByNameAndAddress(voterName, address);
		if (result != 0) {
			System.out.println("Deleted Successfully...");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		} else {
			System.out.println("Invalid Voter ");
		}

	}

	public void showDetailsOfVoterById() {
		System.out.print("Enter Voter Id : ");
		int voterId = sc.nextInt();
		voterDao.selectDetailsByUsingVoterId(voterId);

	}

	public void showAllDetailsOFVoters() {
		voterDao.selectAllVoterDetails();
		
	}

	public void showDetailsOfVoterByName() {
		System.out.print("Enter Voter Name : ");
		String voterName = sc.next();
		voterDao.selectDetailsOfVotersByName(voterName);
		
	}

	public void showAllTheDetailsOfVoterByMobileNumber() {
		System.out.print("Enter Mobile Number : ");
		String voterMobile = sc.next();
		voterDao.fetchAllDetailsOfVotersByMobileNumber(voterMobile);
		
		
	}
	
	



	
	

	



	
	
	
	

}
