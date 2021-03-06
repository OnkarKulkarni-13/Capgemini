/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GradleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Library {
	
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
    	System.out.println("Hello World");
    	
    	/*
    	ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
    	
        Person person = context.getBean("person",Person.class);
        System.out.println(person.getPersonName());
        System.out.println(person.getAge());
        
        Payment payment = context.getBean("payment",Payment.class);
        System.out.println(payment.getAmount());
        System.out.println(payment.getPerson().getPersonName());
        System.out.println(payment.getPerson().getAge());
       */
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("GradelProject");
    	context.refresh();
    	Person person=context.getBean("person",Person.class);
    	System.out.println(person.getPersonName());
    	System.out.println(person.getAge());
    }
    
}
