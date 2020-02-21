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

import User.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class UserTests {

	static int i=0;

	@Test
	public void UserTest1() {
		User l = new User();
		assertTrue(l.method1());
	}
	@Test
	public void UserTest2() {
		User l = new User();
		assertTrue(l.method2());
	}
	@Test
	public void UserTest3() {
		User l = new User();
		assertTrue(l.method3());
	}
	@Test
	public void UserTest4() {
		User l = new User();
		assertTrue(l.method4());
	}
	@Test
	public void UserTest5() {
		User l = new User();
		assertTrue(l.method5());
	}
	@Test
	public void UserTest6() {
		User l = new User();
		assertTrue(l.method6());
	}
	@Test
	public void UserTest7() {
		User l = new User();
		assertTrue(l.method7());
	}
	@Test
	public void UserTest8() {
		User l = new User();
		assertTrue(l.method8());
	}
	@Test
	public void UserTest9() {
		User l = new User();
		assertTrue(l.method9());
	}
	@Test
	public void UserTest10() {
		User l = new User();
		assertTrue(l.method10());
	}

	@RepeatedTest(value = 2, name = "{displayName}")
	public void UserAdditionalTest() {
		User l = new User();
		assertTrue(l.method1());
	}

}
