/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package DemoBankingApp;

import Accounts.OnlineAccounts.OnlineAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class OnlineAccountTests {

	static int i=0;

	@Test
	public void OnlineAccountTest1() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}

	@Test
	public void OnlineAccountTest2() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method2(), "Real Defect");
		//fail("Real Defect");
	}

	@Test
	public void OnlineAccountTest3() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method3(), "Real Defect");
		//fail("Real Defect");
	}

	@Test
	public void OnlineAccountTest4() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method4(), "Phone Turned Off");
		//fail("Phone turned off");

	}

	@Test
	public void OnlineAccountTest5() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method5(), "Real Defect");
		//fail("Real Defect");
	}

	@Test
	public void OnlineAccountTest6() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method6(), "Phone Turned Off");
		//flaky
	}

	@Test
	public void OnlineAccountTest7() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method7());
	}

	@Test
	public void OnlineAccountTest8() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method8());
	}
	@Test
	public void OnlineAccountTest9() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method9());
	}
	@Test
	public void OnlineAccountTest10() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method10());
	}
	@Test
	public void OnlineAccountTest11() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest12() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest13() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest14() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest15() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest16() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest17() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest18() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest19() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest20() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest21() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
	@Test
	public void OnlineAccountTest22() {
		OnlineAccount oa = new OnlineAccount();
		assertTrue(oa.method1());
	}
}
