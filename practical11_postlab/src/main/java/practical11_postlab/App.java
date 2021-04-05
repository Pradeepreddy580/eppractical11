package practical11_postlab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e = (Employee) c.getBean("employee");
		
		System.out.println("Employee Id : "+ e.getEmpId());
		System.out.println("Employee Name : "+e.getEmpName());
		System.out.println("Door No : "+ e.getAddress().getDno());
		System.out.println("Street : "+e.getAddress().getStreet());
		System.out.println("City : "+e.getAddress().getCity());
		System.out.println("State : "+e.getAddress().getState());
		System.out.println(" ");
	}

}
