package GradleProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	
	@Bean("person")
	public Person getPerson() {
		Person obj = new Person();
		obj.setPersonName("Sarvesh Kulkarni");
		obj.setAge(25);
		return obj;
	}

}
