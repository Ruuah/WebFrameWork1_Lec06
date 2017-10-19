/* Example Using XML */
package kr.ac.hansung.spring.aop;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final, 초기화되지 않은 필드를 인자로 가진 생성자 삽입
public class PetOwner {
	
	private final AnimalType animal;

	public void play() {
		animal.sound();
	}
	
}
