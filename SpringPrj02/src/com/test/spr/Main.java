/*===========================================
    Main.java
    - main() 메소드가 포함된 테스트 클래스
============================================*/

package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		// 메인에서 어떻게 코드 처리하느냐에 따라 보여지는게 다르게 해줌
		// rec1이랑 rec2 찍어보면 콘솔에 결과 다르게 보임 
		// [스프링이 처리하고 관리하게 될 영역]
		//-----------------------------------------------------------------------------------------------
		
		/*
		// ① RecordImpl1(Record) 객체 생성 과정
		Record rec1 = new RecordImpl1();		//-- dependency (의존 객체) 레코드 입장에서
		
		// ② RecordImp2(Record) 객체 생성 과정
		Record rec2 = new RecordImpl2();        //-- dependency (의존 객체) 레코드 입장에서
		
		// RecordViewImpl(RecordView) 객체 생성 과정
		//-- Record 객체(의존 객체 - RecordImpl1 / RecordImpl2) 필요
		RecordView view = new RecordViewImpl1();
		
		// 의존 객체 주입
		//-- 의존 객체 주입 방법을 사용하게 되면  
		//   느슨한 결합을 구성할 수 있게 되고(유연성 향상)
		//   한 쪽의 변동 상황이 다른 쪽에 영향을 덜 줄 수 있게 된다.
		
		// 구체적으로 명시한게 아니라 인터페이스를 명시한거라서
		// ex) 사람 한 명 한 명 명시가 아니라 사람을 명시해둔거라서 사람인 아무나 접근가능
		view.setRecord(rec1);					//-- setter injection
												//   (setter 를 통한 주입)
		
		*/
		//-------------------------------------------------------------------------------------------------
		
		// ※ 스프링 프레임워크에서는
		//	  객체 생성 과정 및 DI(의존 객체 주입)에 대한 설정은
		//	  스프링 환경 설정 파일로 대체된다. (→ applicationContext.xml)
		
		// 스프링 프레임워크에서 『applicationContext.xml』 파일을 읽어서
		// 생성 및 관리할 객체에 대한 정보를 얻어야 한다.
		
		
		// ClassPathXmlApplicationContext : 클래스의 경로를 xml을 통해서 Context 얻게 해주는 객체
		// 위에선 직접 객체 생성해주고 생성한 객체 찍어서 확인했는데, 이건
		// 작업지시서(applicationContext.xml) 주소 알려주고 처리하라고 하는 방법임
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 『getBean()』 메소드를 이용하여 사용자가 원하는 객체를 얻는다.
		// 메소드 인자값으로 id 속성값을 지정하게 된다.
		// RecordView view = new RecordViewImpl1(); 넘길거라서 "view"로 넣어줌
		// 다운캐스팅
		//RecordView view = (RecordViewImpl1)context.getBean("view");
		
		// 스프링 3.0 이후 버전부터 사용 가능한 코드
		// 두번째 파라미터 값으로 캐스팅 해야할 값 넘겨주는거 가능
		// 스프링쪽에서 받는부분 
		RecordView view = (RecordView)context.getBean("view", RecordViewImpl1.class);    
	      
		// 받은거 사용
	    view.input();
	    view.output();

		
		
	}
}
