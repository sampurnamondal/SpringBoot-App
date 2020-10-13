package springbootprojects.testspringdata.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public List<Person> getAllPersons() {

		List<Person> persons = new ArrayList<>();
		// personRepository.findAll()
		// .forEach(persons::add);
		for (Person person : personRepository.findAll()) {
			persons.add(person);
		}

		return persons;
	}

	public Optional<Person> getPerson(String id) {

		return personRepository.findById(id);
	}

	public void addPerson(Person person) {

		personRepository.save(person);
	}

	public void updatePerson(Person person) {

		personRepository.save(person);
	}

	public void deletePerson(String id) {

		personRepository.deleteById(id);
	}

}
