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

import ChequeProcessing.ChequeProcessing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class ChequeProcessingTests {

	static int i=0;

	public void ChequeProcessingTest1() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method1());
	}

	public void ChequeProcessingTest2() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method2());
	}

	public void ChequeProcessingTest3() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method3());
	}
	public void ChequeProcessingTest4() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method4());
	}
	public void ChequeProcessingTest5() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method5());
	}

	public void ChequeProcessingTest6() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method6());
	}
	public void ChequeProcessingTest7() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method7());
	}
	public void ChequeProcessingTest8() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method8());
	}
	public void ChequeProcessingTest9() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method9());
	}
	public void ChequeProcessingTest10() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method10());
	}



	@RepeatedTest(value = 53, name = "{displayName}")
	public void ChequeProcessingAdditionalTest() {
		ChequeProcessing cp = new ChequeProcessing();
		assertTrue(cp.method1());
	}
}
