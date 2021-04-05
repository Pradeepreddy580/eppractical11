package practical11_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		
		 Student s=(Student)c.getBean("st"); 
		 System.out.println("stId:"+s.getStId());
		 System.out.println("stName:"+s.getStName());
		 System.out.println("st Mark:");
		 System.out.println("maths:"+s.getMark().getMaths());
		 System.out.println("physics:"+s.getMark().getPhysics());
		 System.out.println("chemistry:"+s.getMark().getChemistry());
		
	}
}
