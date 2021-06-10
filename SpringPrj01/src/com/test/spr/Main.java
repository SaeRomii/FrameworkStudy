/*===========================================
    Main.java
    - main() 메소드가 포함된 테스트 클래스
============================================*/

package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		// 메인에서 어떻게 코드 처리하느냐에 따라 보여지는게 다르게 해줌
		// rec1이랑 rec2 찍어보면 콘솔에 결과 다르게 보임 
		// [스프링이 처리하고 관리하게 될 영역]
		//-----------------------------------------------------------------------------------------------
		
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
		
		
		//-------------------------------------------------------------------------------------------------
		
		
		
		view.input();
		view.output();
		
		
	}
}
