package br.com.camargos.services;

import br.com.camargos.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();

	public Person findById(String id){
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leandro");
		person.setLastName("Camargos");
		person.setAddress("Brasília");
		person.setGender("Male");
		return person;
	}

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leandro "+i);
		person.setLastName("Camargos"+i);
		person.setAddress("Brasília"+i);
		person.setGender("Male");
		return person;
	}

	public Person create(Person person){
		return person;
	}

	public Person update(Person person){
		return person;
	}

	public void delete(String id){

	}

}
