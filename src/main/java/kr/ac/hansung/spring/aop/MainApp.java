package kr.ac.hansung.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("/kr/ac/hansung/spring/aop/conf/animal.xml");

		PetOwner person = (PetOwner) context.getBean("id_owner");
		person.play();
		
		PetOwner2 person2 = (PetOwner2) context.getBean("id_owner2");
		person2.play();

		context.close();
	}

}
