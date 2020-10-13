package springbootprojects.testspringdata.person;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Service;

public interface PersonRepository extends CrudRepository<Person, String> {                       
	
	

}
