/*=================================
   CalculatorBeforAdvice.java
   - Before Advice 구성
=================================*/

package com.test.spr;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class CalculatorBeforeAdvice implements MethodBeforeAdvice	// 사전업무 수행하라는 의미로 인식함
{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable
	{
		Log log = LogFactory.getLog(this.getClass());
		log.info("Before Advice 실행 ----------------------------------------------");
		log.info("주 업무 실행 전에 수행되어야 하는 작업");
		log.info("---------------------------------------------- Before Advice 실행");
		
	}

}
