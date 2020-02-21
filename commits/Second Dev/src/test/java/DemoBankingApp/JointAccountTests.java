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

import Accounts.JointAccount.JointAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class JointAccountTests {

	static int i=0;

	@Test
	public void JointAccountTest1() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method1());
	}
	@Test
	public void JointAccountTest2() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method2());
	}
	@Test
	public void JointAccountTest3() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method3());
	}
	@Test
	public void JointAccountTest4() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method4());
	}
	@Test
	public void JointAccountTest5() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method5());
	}
	@Test
	public void JointAccountTest6() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method6());
	}
	@Test
	public void JointAccountTest7() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method7());
	}
	@Test
	public void JointAccountTest8() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method8());
	}
	@Test
	public void JointAccountTest9() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method9());
	}
	@Test
	public void JointAccountTest10() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method10());
	}

	@RepeatedTest(value = 9, name = "{displayName}")
	public void JointAccountAdditionalTest() {
		JointAccount ja = new JointAccount();
		assertTrue(ja.method1());
	}
}
