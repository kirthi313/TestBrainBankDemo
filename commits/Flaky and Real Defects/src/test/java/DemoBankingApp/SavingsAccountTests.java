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

import Accounts.SavingsAccount.SavingsAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class SavingsAccountTests {

	static int i=0;

	@Test
	public void SavingsAccountTest1() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method1());
	}
	@Test
	public void SavingsAccountTest2() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method2());
	}
	@Test
	public void SavingsAccountTest3() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method3());
	}
	@Test
	public void SavingsAccountTest4() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method4());
	}
	@Test
	public void SavingsAccountTest5() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method5());
	}
	@Test
	public void SavingsAccountTest6() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method6());
	}
	@Test
	public void SavingsAccountTest7() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method7());
	}
	@Test
	public void SavingsAccountTest8() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method8());
	}
	@Test
	public void SavingsAccountTest9() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method9());
	}
	@Test
	public void SavingsAccountTest10() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method10());
	}

	@RepeatedTest(value = 38, name = "{displayName}")
	public void SavingsAccountAdditionalTest() {
		SavingsAccount l = new SavingsAccount();
		assertTrue(l.method1());
	}

}
