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

import Payments.OnlinePayments.OnlinePayments;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class OnlinePaymentsTests {

	static int i=0;

	@Test
	public void OnlinePaymentsTest1() {
		OnlinePayments l = new OnlinePayments();
		assertTrue(l.method1());
	}
	@Test
	public void OnlinePaymentsTest2() {
		OnlinePayments l = new OnlinePayments();
		assertTrue(l.method2());
	}
	@Test
	public void OnlinePaymentsTest3() {
		OnlinePayments l = new OnlinePayments();
		assertTrue(l.method3());
	}
	@Test
	public void OnlinePaymentsTest4() {
		OnlinePayments l = new OnlinePayments();
		assertTrue(l.method4());
	}
	@Test
	public void OnlinePaymentsTest5() {
		OnlinePayments l = new OnlinePayments();
		assertTrue(l.method5());
	}
	@Test
	public void OnlinePaymentsTest6() {
		OnlinePayments l = new OnlinePayments();
		assertTrue(l.method6());
	}

}
