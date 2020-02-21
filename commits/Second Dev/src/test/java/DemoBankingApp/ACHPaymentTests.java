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

import Payments.ACHPayments.ACHPayments;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class ACHPaymentTests {

	static int i=0;

	//8 tests

	@Test
	public void ACHPaymentTest1() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method1());
	}
	@Test
	public void ACHPaymentTest2() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method2());
	}
	@Test
	public void ACHPaymentTest3() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method3());
	}
	@Test
	public void ACHPaymentTest4() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method4());
	}
	@Test
	public void ACHPaymentTest5() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method5());
	}
	@Test
	public void ACHPaymentTest6() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method6());
	}
	@Test
	public void ACHPaymentTest7() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method7());
	}
	@Test
	public void ACHPaymentTest8() {
		ACHPayments payment = new ACHPayments();
		assertTrue(payment.method8());
	}
}
