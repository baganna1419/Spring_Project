package com.jsp.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jsp.jdbc.entity.Voter;

@Repository("voterDao")
public class IVoterDaoImplementation implements IVoterDao {
	@Autowired
	private JdbcTemplate template;
//	@Autowired
	private RowMapper<Voter> rowMapper=new BeanPropertyRowMapper<Voter>(Voter.class);

	public int addVoters(Voter voter) {
		String query = "insert into voters(voter_Id, voter_Name, voter_Age, voter_Address, voter_Gender, voter_Mobile) values(?,?,?,?,?,?)";
		return template.update(query, voter.getVoter_Id(), voter.getVoter_Name(), voter.getVoter_Age(),
				voter.getVoter_Address(), voter.getVoter_Gender(), voter.getVoter_Mobile());
	}

	public int updateMobileNumber(String voterName, String mobileNumber) {
		String update = "update voters set voter_Mobile=? where voter_Name=?";
		return template.update(update, mobileNumber, voterName);
	}

	public int removeVoterDetailsBasedOnVoterId(int voterId) {
		String delete = "delete from voters where voter_Id=?";
		return template.update(delete, voterId);
	}

	public int updateVoterNameById(String voterName, int voterId) {
		String update = "update voters set voter_Name=? where voter_Id=?";
		return template.update(update, voterName, voterId);

	}

	public int updateVoterAgeByNameAndId(int voterId, String voterName, int age) {
		String update = "update voters set voter_Age=? where (voter_Id=?) && (voter_Name=?)";
		return template.update(update, age, voterId, voterName);

	}

	public int updateVoterGenderById(int voterId, String voterGender) {
		String update = "update voters set voter_Gender=? where voter_Id=?";
		return template.update(update, voterGender, voterId);

	}

	public int updateVoterMobileNumberByIdAndName(int voterId, String voterName, String voterMobile) {
		String update = "update voters set voter_Mobile=? where (voter_Id=?) && (voter_Name=?)";
		return template.update(update, voterMobile, voterId, voterName);

	}

	public int updateVoterAddressByIdAndMobile(int voterId, String voterMobile, String address) {
		String update = "update voters set voter_Address=? where (voter_Id=?) && (voter_Mobile=?)";
		return template.update(update, address, voterId, voterMobile);

	}

	public int deleteVoterById(int voterId) {
		String delete = "delete from voters where voter_Id=?";
		return template.update(delete, voterId);

	}

	public int deleteVoterByIdAndMobile(int voterId, String voterMobile) {
		String delete = "delete from voters where (voter_Id=?) &&(voter_Mobile=?)";
		return template.update(delete, voterId, voterMobile);

	}

	public int deleteVoterByNameAndAddress(String name, String address) {
		String delete = "delete from voters where (voter_Name=?) &&(voter_Address=?)";
		return template.update(delete, name, address);

	}

	public void selectDetailsByUsingVoterId(int voterId) {
		String select="select * from voters where voter_Id=?";
		try {
		    Voter voter = template.queryForObject(select, rowMapper ,voterId);
		    System.out.println(voter);
		    System.out.println("-------------------------------------------------");
		}catch(Exception e) {
			System.out.println("++++++ NO VOTER FOUND ++++++");
		}
	}

	public void selectAllVoterDetails() {
		String read="select * from voters";
		List<Voter> listOfVoters = template.query(read, rowMapper);
		if(!listOfVoters.isEmpty()) {
			for (Voter voter : listOfVoters) {
				System.out.println(voter);
				System.out.println("-------------------------------------");
			}
		}
		else {
			System.out.println("No Voters Found..!!!");
		}
				
		
	}

	public void selectDetailsOfVotersByName(String voterName) {
		String read="select * from voters where voter_Name=?";
		List<Voter> listOfVoters = template.query(read, rowMapper,voterName);
		System.out.println(listOfVoters);
		System.out.println("---------------------------------------------");
		
	}

	public void fetchAllDetailsOfVotersByMobileNumber(String voterMobile) {
		String read="select * from voters where voter_Mobile=?";
		List<Voter> list = template.query(read, rowMapper,voterMobile);
		System.out.println(list.getClass().getName());
		if(!list.isEmpty()) {
			System.out.println(list);
		}else {
			System.out.println("No Voter Found By Given Mobile Number : "+voterMobile);
		}
		
		
	}
	
	
	
	
    
	
}
