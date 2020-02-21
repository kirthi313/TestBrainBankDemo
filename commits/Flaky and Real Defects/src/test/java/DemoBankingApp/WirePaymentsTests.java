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

import Payments.WirePayments.WirePayments;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class WirePaymentsTests {

	static int i=0;


		@Test
		public void WirePaymentsTest1() {
			WirePayments l = new WirePayments();
			assertTrue(l.method1());
		}
		@Test
		public void WirePaymentsTest2() {
			WirePayments l = new WirePayments();
			assertTrue(l.method2());
		}
		@Test
		public void WirePaymentsTest3() {
			WirePayments l = new WirePayments();
			assertTrue(l.method3());
		}
		@Test
		public void WirePaymentsTest4() {
			WirePayments l = new WirePayments();
			assertTrue(l.method4());
		}
		@Test
		public void WirePaymentsTest5() {
			WirePayments l = new WirePayments();
			assertTrue(l.method5());
		}
		@Test
		public void WirePaymentsTest6() {
			WirePayments l = new WirePayments();
			assertTrue(l.method6());
		}

}
