/* Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package DemoBankingApp;
import Payments.Payments;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class PaymentTests {

	static int i=0;

	@Test
	public void PaymentsTest1() {
		Payments l = new Payments();
		assertTrue(l.method1());
	}
	@Test
	public void PaymentsTest2() {
		Payments l = new Payments();
		assertTrue(l.method2());
	}
	@Test
	public void PaymentsTest3() {
		Payments l = new Payments();
		assertTrue(l.method3());
	}
	@Test
	public void PaymentsTest4() {
		Payments l = new Payments();
		assertTrue(l.method4());
	}
	@Test
	public void PaymentsTest5() {
		Payments l = new Payments();
		assertTrue(l.method5());
	}
	@Test
	public void PaymentsTest6() {
		Payments l = new Payments();
		assertTrue(l.method6());
	}
	@Test
	public void PaymentsTest7() {
		Payments l = new Payments();
		assertTrue(l.method7());
	}
	@Test
	public void PaymentsTest8() {
		Payments l = new Payments();
		assertTrue(l.method8());
	}
	@Test
	public void PaymentsTest9() {
		Payments l = new Payments();
		assertTrue(l.method9());
	}
	@Test
	public void PaymentsTest10() {
		Payments l = new Payments();
		assertTrue(l.method10());
	}

	@RepeatedTest(value = 23, name = "{displayName}")
	public void PaymentsAdditionalTest() {
		Payments l = new Payments();
		assertTrue(l.method1());
	}

}
