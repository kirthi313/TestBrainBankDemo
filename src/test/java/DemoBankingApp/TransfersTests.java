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

import Transfers.Transfers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class TransfersTests {

	static int i=0;

	@Test
	public void TransfersTest1() {
		Transfers l = new Transfers();
		assertTrue(l.method1());
	}
	@Test
	public void TransfersTest2() {
		Transfers l = new Transfers();
		assertTrue(l.method2());
	}
	@Test
	public void TransfersTest3() {
		Transfers l = new Transfers();
		assertTrue(l.method3());
	}
	@Test
	public void TransfersTest4() {
		Transfers l = new Transfers();
		assertTrue(l.method4());
	}
	@Test
	public void TransfersTest5() {
		Transfers l = new Transfers();
		assertTrue(l.method5());
	}
	@Test
	public void TransfersTest6() {
		Transfers l = new Transfers();
		assertTrue(l.method6());
	}
	@Test
	public void TransfersTest7() {
		Transfers l = new Transfers();
		assertTrue(l.method7());
	}
	@Test
	public void TransfersTest8() {
		Transfers l = new Transfers();
		assertTrue(l.method8());
	}
	@Test
	public void TransfersTest9() {
		Transfers l = new Transfers();
		assertTrue(l.method9());
	}
	@Test
	public void TransfersTest10() {
		Transfers l = new Transfers();
		assertTrue(l.method10());
	}

	@RepeatedTest(value = 68, name = "{displayName}")
	public void TransfersAdditionalTest() {
		Transfers l = new Transfers();
		assertTrue(l.method1());
	}

}
