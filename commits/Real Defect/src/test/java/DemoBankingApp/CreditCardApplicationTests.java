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

import CreditCard.CreditCardApplication.CreditCardApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class CreditCardApplicationTests {

	static int i=0;

	@Test
	public void CreditCardApplicationTest1() {
		CreditCardApplication cca = new CreditCardApplication();
		assertTrue(cca.method1());
	}
	@Test
	public void CreditCardApplicationTest2() {
		CreditCardApplication cca = new CreditCardApplication();
		assertTrue(cca.method2());
	}
	@Test
	public void CreditCardApplicationTest3() {
		CreditCardApplication cca = new CreditCardApplication();
		assertTrue(cca.method3());
	}
	@Test
	public void CreditCardApplicationTest4() {
		CreditCardApplication cca = new CreditCardApplication();
		assertTrue(cca.method4());
	}
	@Test
	public void CreditCardApplicationTest5() {
		CreditCardApplication cca = new CreditCardApplication();
		assertTrue(cca.method5());
	}
}
