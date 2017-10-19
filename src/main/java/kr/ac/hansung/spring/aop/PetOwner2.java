/* Example Using annotation */
package kr.ac.hansung.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner2 {

	/* Wiring by Type, Type에 맞는 bean이 자동으로 주입된다
	 * 주입되는 값이 여러 개면 null이 들어간다
	 * qualifer로 어떤 값을 넣을지 명시해준다	 */
	@Autowired
	@Qualifier(value="qf_dog")
	private AnimalType animal;

	public void play() {
		animal.sound();
	}
	
}
