package org.jsp.personandproductdao;

import java.util.List;

import org.jsp.personandproduct.entity.Person;

public interface PersonDao {
	List<Person> takeOldDetails() throws Exception;
	void insertPersonDetails(Person person) throws Exception;
	List<Person> getDetailsOfPerson() throws Exception;
	void updateEmailByName(String name,String email) throws Exception;
	void storePersons(List<Person> persons) throws Exception;
	void deletePersonName(String name) throws Exception;
	

}
