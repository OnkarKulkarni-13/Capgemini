package petstoreproject.petstroreapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
        
    	PetStore store = (PetStore) context.getBean("petStore",PetStore.class);  //-> I'd And class_name.class
        System.out.println(store.getStoreName());
        System.out.println(store.getAddress());
        System.out.println("---------------------------------------------------------------------");
        
        Customer ctr =  context.getBean("customer",Customer.class);  //id-> "customer" define in springbeans  
        System.out.println(ctr.getCustomerName() );
        System.out.println(ctr.getAddress());
        System.out.println(ctr.getEmail());
        System.out.println("---------------------------------------------------------------------");
        
       
        Pet pet=context.getBean("pet",Pet.class);
        System.out.println(pet.getPetName());
        System.out.println(pet.getAge());
        System.out.println(pet.getType());
        System.out.println("---------------------------------------------------------------------");
        
        PetHelpLineService petservice = context.getBean("petHelplineService",PetHelpLineService.class);
        System.out.println(petservice.getHelplineNumber());
        System.out.println("---------------------------------------------------------------------");
        
        PetFood petfood =context.getBean("petFood",PetFood.class);
        System.out.println(petfood.getFoodtype());
        System.out.println(petfood.getCalories());
        System.out.println(petfood.getQuantity());
        System.out.println("-----------------------------------------------------------------------");
        
        PetService petService=context.getBean("petService",PetService.class);
    	System.out.println(store.getStoreName());
    	System.out.println(store.getAddress());
    	System.out.println("-----------------------------------------------------------------------");
    	
        CustomerService cservice = context.getBean("customerservice",CustomerService.class);
        System.out.println(cservice.getServiceHelplineNumber());
        System.out.println(cservice.getCouncellorName());
        System.out.println("-----------------------------------------------------------------------");
        
        List<RescueChamp> rescueChampList =petService.getRescueChampList();
        
        System.out.println("Heroes of this month");
        for(RescueChamp r:rescueChampList)
        {
      	  System.out.println("************************");
      	  System.out.println(r.getChampName());
      	  System.out.println(r.getAnimalsRescued());
        }
}
}
