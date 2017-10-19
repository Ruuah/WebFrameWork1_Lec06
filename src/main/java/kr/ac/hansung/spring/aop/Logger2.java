package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger2 {

	@Pointcut("execution( void kr.ac.hansung.spring.aop.*.sound() )")
	// Signature : Pointcut에 대한 id를 지정해주기 위한 method
	private void selectSound() {

	}

	// selectSound Pointcut에 대해 아래 함수를 실행하겠다
	@After("selectSound()")
	public void aboutToSound() {
		System.out.println("after advice: just now sound()");
	}

}
