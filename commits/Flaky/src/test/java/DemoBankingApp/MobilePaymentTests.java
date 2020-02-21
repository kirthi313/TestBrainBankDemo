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

import Payments.OnlinePayments.MobilePayments.MobilePayments;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class MobilePaymentTests {

	static int i=0;

	@Test
	public void MobilePaymentTest1() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method1());
	}
	@Test
	public void MobilePaymentTest2() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method2());
	}
	@Test
	public void MobilePaymentTest3() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method3());
	}
	@Test
	public void MobilePaymentTest4() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method4());
	}
	@Test
	public void MobilePaymentTest5() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method5());
	}
	@Test
	public void MobilePaymentTest6() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method6());
	}
	@Test
	public void MobilePaymentTest7() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method7());
	}
	@Test
	public void MobilePaymentTest8() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method8());
	}
	@Test
	public void MobilePaymentTest9() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method9());
	}
	@Test
	public void MobilePaymentTest10() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method10());
	}

	@RepeatedTest(value = 12, name = "{displayName}")
	public void MobilePaymentAdditionalTest() {
		MobilePayments mp = new MobilePayments();
		assertTrue(mp.method1());
	}
}
