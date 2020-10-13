package springbootprojects.testspringdata.person;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity                           //POJO class that is persisted in a database
public class Person {

	@Id                         //primary key annotation
	private String id;
	private String name;
	private String age;

	public Person() {
	}

	public Person(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
