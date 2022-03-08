package GradleProject;

import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Payment {
	private float amount;
	@Resource(name="person")
	private Person person;
	
	public Payment(){
		super();
	}
	public float getAmount() {
		return amount;
	}
	@Required
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Person getPerson() {
		return person;
	}
	//@Autowired
	//@Qualifier("person1")
	
	public void setPerson(Person person) {
		this.person = person;
	}

}
