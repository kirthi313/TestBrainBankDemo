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

import Transfers.OnlineTransfters.OnlineTransfers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class OnlineTransfersTests {

	static int i=0;

	@Test
	public void OnlineTransfersTest1() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method1());
	}
	@Test
	public void OnlineTransfersTest2() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method2());
	}
	@Test
	public void OnlineTransfersTest3() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method3());
	}
	@Test
	public void OnlineTransfersTest4() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method4());
	}
	@Test
	public void OnlineTransfersTest5() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method5());
	}
	@Test
	public void OnlineTransfersTest6() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method6());
	}
	@Test
	public void OnlineTransfersTest7() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method7());
	}
	@Test
	public void OnlineTransfersTest8() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method8());
	}
	@Test
	public void OnlineTransfersTest9() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method9());
	}
	@Test
	public void OnlineTransfersTest10() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method10());
	}

	@RepeatedTest(value = 5, name = "{displayName}")
	public void OnlineTransfersAdditionalTest() {
		OnlineTransfers l = new OnlineTransfers();
		assertTrue(l.method1());
	}


}
