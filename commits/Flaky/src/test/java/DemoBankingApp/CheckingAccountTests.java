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

import Accounts.CheckingAccount.CheckingAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class CheckingAccountTests {

	static int i=0;

	public void CheckingAccountTest1() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method1());
	}
	public void CheckingAccountTest2() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method2());
	}
	public void CheckingAccountTest3() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method3());
	}
	public void CheckingAccountTest4() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method4());
	}
	public void CheckingAccountTest5() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method5());
	}
	public void CheckingAccountTest6() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method6());
	}
	public void CheckingAccountTest7() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method7());
	}
	public void CheckingAccountTest8() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method8());
	}
	public void CheckingAccountTest9() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method9());
	}
	public void CheckingAccountTest10() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method10());
	}

	@RepeatedTest(value = 6, name = "{displayName}")
	public void CheckingAccountAdditionalTest() {
		CheckingAccount ca = new CheckingAccount();
		assertTrue(ca.method1());
	}
}
