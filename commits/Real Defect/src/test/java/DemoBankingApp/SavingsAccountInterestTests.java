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

import Accounts.SavingsAccount.SavingsAccountInterest.SavingsAccountInterest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class SavingsAccountInterestTests {

	static int i=0;

	@Test
	public void SavingsAccountInterestTest1() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method1());
	}
	@Test
	public void SavingsAccountInterestTest2() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method2());
	}
	@Test
	public void SavingsAccountInterestTest3() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method3());
	}
	@Test
	public void SavingsAccountInterestTest4() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method4());
	}
	@Test
	public void SavingsAccountInterestTest5() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method5());
	}
	@Test
	public void SavingsAccountInterestTest6() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method6());
	}
	@Test
	public void SavingsAccountInterestTest7() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method7());
	}
	@Test
	public void SavingsAccountInterestTest8() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method8());
	}
	@Test
	public void SavingsAccountInterestTest9() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method9());
	}
	@Test
	public void SavingsAccountInterestTest10() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method10());
	}

	@RepeatedTest(value = 1, name = "{displayName}")
	public void SavingsAccountInterestAdditionalTest() {
		SavingsAccountInterest l = new SavingsAccountInterest();
		assertTrue(l.method1());
	}

}
