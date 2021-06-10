/*==================
   Record.java
   - 인터페이스
===================*/

package com.test.spr;

public interface Record
{
	// 메소드 선언만 해주는 인터페이스
	
	public void setKor(int kor);
	public int getKor();
	
	public void setEng(int eng);
	public int getEng();
	
	public void setMat(int mat);
	public int getMat();
	
	public int getTotal();
	
	public double getAvg();
}
