package org.jsp.personandproduct.sevice;

import java.util.List;

import org.jsp.personandproduct.entity.Person;

public interface PersonService {
	void addPerson() throws Exception;
	void getPersonDetails() throws Exception;
	void changeEmailByName() throws Exception;
	String findName(String name) throws Exception;
	void deletePersonByName() throws Exception;

}
