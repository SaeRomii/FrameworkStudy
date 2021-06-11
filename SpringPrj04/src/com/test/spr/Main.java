/*=============================================
    Main.java
    - main() 메소드를 포함하는 테스트 클래스
==============================================*/

package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		//MemberList memberList = new MemberList();  MemberList에 대한 객체 생성 우리가 하지 않음!!
		//-- 객체 생성 과정을 스프링이 담당하게 되므로
		//   인스턴스 생성 구문을 모두 삭제한다.
		
		// 스프링 환경 설정 파일인 『applicationContext.xml』에서
		// MemberList 객체를 얻어온다.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// MemberList 있는 beans 얻어오는거라서 member 넣으면 됨~!
		MemberList memberList = context.getBean("member", MemberList.class);
		
		memberList.print();
	}
	
	
	
}
