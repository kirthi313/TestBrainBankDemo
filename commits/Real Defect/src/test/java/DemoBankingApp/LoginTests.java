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

import User.Login.Login;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class LoginTests {

	static int i=0;

	@Test
	public void LoginTest1() {
		Login l = new Login();
		assertTrue(l.method1());
	}
	@Test
	public void LoginTest2() {
		Login l = new Login();
		assertTrue(l.method2());
	}
	@Test
	public void LoginTest3() {
		Login l = new Login();
		assertTrue(l.method3());
	}
	@Test
	public void LoginTest4() {
		Login l = new Login();
		assertTrue(l.method4());
	}
	@Test
	public void LoginTest5() {
		Login l = new Login();
		assertTrue(l.method5());
	}
	@Test
	public void LoginTest6() {
		Login l = new Login();
		assertTrue(l.method6());
	}
	@Test
	public void LoginTest7() {
		Login l = new Login();
		assertTrue(l.method7());
	}
	@Test
	public void LoginTest8() {
		Login l = new Login();
		assertTrue(l.method8());
	}
	@Test
	public void LoginTest9() {
		Login l = new Login();
		assertTrue(l.method9());
	}
	@Test
	public void LoginTest10() {
		Login l = new Login();
		assertTrue(l.method10());
	}

	@RepeatedTest(value = 72, name = "{displayName}")
	public void LoginAdditionalTest() {
		Login l = new Login();
		assertTrue(l.method1());
	}
}
