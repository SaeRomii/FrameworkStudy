/*===============================================
    CalculatorImpl.java
    - Calculator 인터페이스를 구현하는 클래스.
    - 주 업무가 적용된 클래스.
================================================*/

package com.test.spr;

public class CalculatorImpl implements Calculator	// Calculator이 정미 패밀리.. CalculatorImpl은 패밀리 사이에서 태어난 정미
{
	
	// 주 업무(core concern) 진행을 위한 메소드 구현
	
	@Override
	public int add(int x, int y)
	{
		int result = 0;
		
		result = x + y;
		System.out.printf("%d + %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int sub(int x, int y)
	{
		int result = 0;
		
		result = x - y;
		System.out.printf("%d - %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int multi(int x, int y)
	{
		int result = 0;
		
		result = x * y;
		System.out.printf("%d * %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int div(int x, int y)
	{
		int result = 0;
		
		result = x / y;
		System.out.printf("%d / %d = %d%n", x, y, result);
		
		return result;
	}
	
}
