/*==========================================
   Main.java
   - main() 메소드가 포함된 테스트 클래스
===========================================*/

package com.test.spr;

import java.lang.reflect.Proxy;

public class Main
{
	public static void main(String[] args)
	{
		// 주 업무 실행을 할 수 있는 객체 준비
		// 인터페이스 변수 = new 인터페이스구현클래스();
		Calculator cal = new CalculatorImpl();
		// Calculator 타입의 CalculatorImpl
		
		/*
		// 주 업무 실행에 대한 테스트(AOP 기법을 적용하기 전 코드)
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		*/
		
		// 주 업무 실행에 대한 테스트(AOP 기법 적용 후)
		//Proxy.newProxyInstance(loader, interfaces, h);    
		// loader = 주 업무 실행 클래스에 대한 정보 전달
		// interfaces = 주 업무 실행 클래스의 인터페이스에 대한 정보 전달 (즉, 정미 패밀리)
		// h = 보조 업무 실행 클래스에 대한 정보 전달 (즉, 가영이)
		
		Calculator proxy = (Calculator)Proxy.newProxyInstance(cal.getClass().getClassLoader(), cal.getClass().getInterfaces(), new CalculatorProxy(cal));
		// 첫 번째 파라미터 : class 정보가 메모리에 올라가고 getclassloader로 클래스 읽어주게 만들어줌 (정미의 설계도 넘긴거)
		// 두 번째 파라미터 : getInterfaces 정미가 implements 하고 있는 정보들 (정미 패밀리)
		// 세 번째 파라미터 : CalculatorProxy에서(가영이 생성자) cal(정미) 넘김
		//--> 이제 정미인 척 할 수 있는 Object가 됐음!
		// Object를 Calculator로 다운캐스팅
		
		int add = proxy.add(10, 20);	//프록시가 이제 수행(정미가) 원래는 가영인데..
		System.out.println(add);
		
		int sub = proxy.sub(10, 20);
		System.out.println(sub);
		
		int multi = proxy.multi(10, 20);
		System.out.println(multi);
		
		int div = proxy.div(10, 20);
		System.out.println(div);
		
	}
}
