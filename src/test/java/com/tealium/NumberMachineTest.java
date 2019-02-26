package com.tealium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NumberMachineTest {

	NumberMachine machine;

	@Before
	public void setup() {
		machine = new NumberMachine();
	}

	@Test
	public void getFactors() {
		List<Integer> factors = machine.getFactors(0);
		assertThat(factors, is(Arrays.asList(0)));

		factors = machine.getFactors(1);
		assertThat(factors, is(Arrays.asList(1)));

		factors = machine.getFactors(2);
		assertThat(factors, is(Arrays.asList(1, 2)));

		factors = machine.getFactors(3);
		assertThat(factors, is(Arrays.asList(1, 3)));

		factors = machine.getFactors(4);
		assertThat(factors, is(Arrays.asList(1, 2, 4)));

	}

	@Test
	public void multiply() {
		assertEquals(1, machine.multiply(1, 1));
		assertEquals(4, machine.multiply(2, 2));
	}
}
