package com.jsp.jdbc.dao;

import com.jsp.jdbc.entity.Voter;

public interface IVoterDao {
	int addVoters(Voter voter);

	int updateMobileNumber(String voterName, String mobileNumber);

	int removeVoterDetailsBasedOnVoterId(int voterId);

	int updateVoterNameById(String voterName, int voterId);

	int updateVoterAgeByNameAndId(int voterId, String voterName, int age);

	int updateVoterGenderById(int voterId, String voterGender);

	int updateVoterMobileNumberByIdAndName(int voterId, String voterName, String voterMobile);

	int updateVoterAddressByIdAndMobile(int voterId, String voterMobile, String address);

	int deleteVoterById(int voterId);

	int deleteVoterByIdAndMobile(int voterId, String voterMobile);

	int deleteVoterByNameAndAddress(String name, String address);

	void selectDetailsByUsingVoterId(int voterId);

	void selectAllVoterDetails();

	void selectDetailsOfVotersByName(String voterName);

	void fetchAllDetailsOfVotersByMobileNumber(String voterMobile);

}
