package org.jsp.personandproductdao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.jsp.personandproduct.entity.Person;
import org.springframework.stereotype.Component;
@Component
public class PersonDaoImplementation implements PersonDao {

	public void insertPersonDetails(Person person) throws Exception {
		List<Person> persons;
		try {
			persons = takeOldDetails();
		} catch (EOFException e) {
			persons = new ArrayList<Person>();
		}
		persons.add(person);
		File file = new File("D://Persons.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(persons);
		objectOutputStream.flush();
		objectOutputStream.close();
		System.out.println("!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!");
		System.out.println("👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍");
		System.out.println("✔✔✔✔ Person Added Successfully ✔✔✔✔");
		System.out.println("👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍");
		System.out.println("!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!");

	}

	public List<Person> takeOldDetails() throws Exception {
		File file = new File("D://Persons.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return (List<Person>) objectInputStream.readObject();

	}

	public List<Person> getDetailsOfPerson() throws Exception {
		List<Person> personsList = new ArrayList<Person>();
		try {
			File file = new File("D://Persons.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			personsList = (List<Person>) (objectInputStream.readObject());
			return personsList;

		} catch (EOFException e) {
			System.out.println("👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎");
			System.out.println("************No Persons Found**********");
			System.out.println("👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎");
			return null;
		}

	}

	public void updateEmailByName(String name, String email) throws Exception {
		List<Person> detailsOfPerson = getDetailsOfPerson();
		if (!detailsOfPerson.isEmpty()) {
			for (Person person : detailsOfPerson) {
				if (person.getPersonName().equalsIgnoreCase(name)) {
					person.setPersonEmailId(email);
					System.out.println("!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!");
					System.out.println("👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍");
					System.out.println("✔✔✔✔ Email Updated Successfully ✔✔✔✔");
					System.out.println("👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍👍");
					System.out.println("!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!");
				}
			}
			storePersons(detailsOfPerson);
		} else {

			System.out.println("👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎");
			System.out.println("************No persons Found**********");
			System.out.println("👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎👎");
		}

	}

	public void storePersons(List<Person> persons) throws Exception {
		File file = new File("D://Persons.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(persons);
		objectOutputStream.flush();
		objectOutputStream.close();

	}

	public void deletePersonName(String name) throws Exception {
		List<Person> detailsOfPerson = getDetailsOfPerson();
		if(detailsOfPerson!=null) {
			ListIterator<Person> personListIterator=detailsOfPerson.listIterator();
			while (personListIterator.hasNext()) {
				Person person = (Person) personListIterator.next();
				if(person.getPersonName().equalsIgnoreCase(name)) {
					personListIterator.remove();
					System.out.println("******************************************");
					System.out.println("******************************************");
                    System.out.println("*-*-*-*-*-*-*-* PERSON REMOVED *-*-*-*-*-*");
					System.out.println("******************************************");
					System.out.println("******************************************");

				}
			}
		}
		storePersons(detailsOfPerson);
		
	}

}
