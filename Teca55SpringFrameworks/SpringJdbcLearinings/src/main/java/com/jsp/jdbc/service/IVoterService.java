package com.jsp.jdbc.service;

public interface IVoterService {
	void register();

	void updateMobileNumberByVoterName();

	void deleteVoterByVoterId();

	void changeVoterNameById();

	void changeVoterAgeByNameAndId();

	void changeVoterGenderById();

	void changeVoterMobileByIdAndName();

	void changeVoterAddressByIdAndMobile();

	void removeVoterById();

	void removeVoterByMobileAndId();

	void removeVoterByNameAndAddress();

	void showDetailsOfVoterById();

	void showAllDetailsOFVoters();

	

	void showDetailsOfVoterByName();

	void showAllTheDetailsOfVoterByMobileNumber();

	

}
