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

import Navigation.Navigation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class NavigationTests {

	static int i=0;

	@Test
	public void NavigationTest1() {
		Navigation n = new Navigation();
		assertTrue(n.method1());
	}
	@Test
	public void NavigationTest2() {
		Navigation n = new Navigation();
		assertTrue(n.method2());
	}
	@Test
	public void NavigationTest3() {
		Navigation n = new Navigation();
		assertTrue(n.method3());
	}
	@Test
	public void NavigationTest4() {
		Navigation n = new Navigation();
		assertTrue(n.method4());
	}
	@Test
	public void NavigationTest5() {
		Navigation n = new Navigation();
		assertTrue(n.method5());
	}
	@Test
	public void NavigationTest6() {
		Navigation n = new Navigation();
		assertTrue(n.method6());
	}
	@Test
	public void NavigationTest7() {
		Navigation n = new Navigation();
		assertTrue(n.method7());
	}
	@Test
	public void NavigationTest8() {
		Navigation n = new Navigation();
		assertTrue(n.method8());
	}
	@Test
	public void NavigationTest9() {
		Navigation n = new Navigation();
		assertTrue(n.method9());
	}
}
