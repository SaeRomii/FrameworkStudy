/*==========================================
   Main.java
   - main() 메소드가 포함된 테스트 클래스
 =========================================*/

package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		// 주 업무 실행에 대한 테스트(Spring AOP 기법 적용 후)
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//Calculator cal = new CalculatorImpl();
		Calculator cal = context.getBean("proxy", Calculator.class);
		
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		
		/* 즉, 주업무클래스의 설계도, 주업무클래스가 implements 하는 interfaces, Proxy 클래스를 
		인자로 넘겨주면 주업무를 따라하는 Proxy 가 만들어진다. !!!  이렇게하면 proxy.주업무메소드() 가 가능해지는데
		(add, sub, multi, div) 이 메소드들 시작과 끝에 proxy클래스의 invoke() 메소드에서 설정해뒀던 보조업무가 함께 수행된다.*/

	}
}
