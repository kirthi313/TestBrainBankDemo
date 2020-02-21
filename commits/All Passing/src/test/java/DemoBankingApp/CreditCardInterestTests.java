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

import CreditCard.CreditCardInterest.CreditCardInterest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class CreditCardInterestTests {

	static int i=0;

	@Test
	public void CreditCardInterestInterestTest1() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method1());
	}
	@Test
	public void CreditCardInterestInterestTest2() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method2());
	}
	@Test
	public void CreditCardInterestInterestTest3() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method3());
	}
	@Test
	public void CreditCardInterestInterestTest4() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method4());
	}
	@Test
	public void CreditCardInterestInterestTest5() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method5());
	}
	@Test
	public void CreditCardInterestInterestTest6() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method6());
	}
	@Test
	public void CreditCardInterestInterestTest7() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method7());
	}
	@Test
	public void CreditCardInterestInterestTest8() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method8());
	}
	@Test
	public void CreditCardInterestInterestTest9() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method9());
	}
	@Test
	public void CreditCardInterestInterestTest10() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method10());
	}

	@RepeatedTest(value = 11, name = "{displayName}")
	public void CreditCardInterestInterestAdditionalTest() {
		CreditCardInterest cci = new CreditCardInterest();
		assertTrue(cci.method1());
	}
}
