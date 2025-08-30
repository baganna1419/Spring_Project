package com.jsp.jdbc.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.jdbc.entity.Voter;

@Component
public class VoterRowMapperImplemenatation implements RowMapper<Voter> {

	public Voter mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Voter voter=new Voter();
		voter.setVoter_Id(resultSet.getInt(1));
		voter.setVoter_Name(resultSet.getString(2));
		voter.setVoter_Age(resultSet.getInt(3));
		voter.setVoter_Address(resultSet.getString(4));
		voter.setVoter_Gender(resultSet.getString(5));
		voter.setVoter_Mobile(resultSet.getString(6));
		return voter;
	}

}
