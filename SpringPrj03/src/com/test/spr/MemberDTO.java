/*=======================================
   MemberDTO.java
   - TBL_MEMBERLIST 테이블 레코드 참조
=======================================*/

package com.test.spr;

public class MemberDTO 
{
	// 주요 속성 구성 → TBL_MEMBERLIST 테이블 레코드 형식
	private String id, pw, name, tel, email;

	// 인자 없는 생성자 → 기본 생성자(default) → 생략
	// 그동안 만들었던 생성자는 매개변수 받는 생성자 필요했고, 
	// 그러면 기본 생성자가 자동으로 생성 안돼서 만들어줬지만 SpringPrj에서는 
	// 따로 안만들어서 필요 없으니까 생략
	
	// getter / setter 구성
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
