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

import BranchConfiguration.BranchConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class BranchConfigurationTests {

	static int i=0;
	//44 tests

	@Test
	public void BranchConfigurationTest1() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method1());
	}
	public void BranchConfigurationTest2() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method2());
	}
	public void BranchConfigurationTest3() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method3());
	}
	public void BranchConfigurationTest4() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method4());
	}
	public void BranchConfigurationTest5() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method5());
	}
	public void BranchConfigurationTest6() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method6());
	}
	public void BranchConfigurationTest7() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method7());
	}
	public void BranchConfigurationTest8() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method8());
	}
	public void BranchConfigurationTest9() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method9());
	}
	public void BranchConfigurationTest10() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method10());
	}

	@RepeatedTest(value = 34, name = "{displayName}")
	public void BranchConfigurationAdditionalTest() {
		BranchConfiguration bc = new BranchConfiguration();
		assertTrue(bc.method1());
	}
}
