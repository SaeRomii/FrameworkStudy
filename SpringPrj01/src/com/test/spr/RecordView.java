/*====================
   RecordView.java
   - 인터페이스
====================*/

package com.test.spr;

public interface RecordView
{
	// setter() 메소드 선언
	public void setRecord(Record record);
	// record 타입 매개변수로 넘겨받아서 세팅하겠다.
	// RecordView 입장에서 정상적인 처리 위해 Record 필요 
	
	// 입력 액션 전용 메소드 선언
	public void input();
	
	// 출력 액션 전용 메소드 선언
	public void output();
}
