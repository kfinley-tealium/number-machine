package com.tealium;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NumberMachine {

	public List<Integer> getFactors(int number) {

		List<Integer> factors = new LinkedList<>();

		int max = Math.max(number, number / 2);
		for (int i = 0; i <= max; i++) {

			for (int j = i; j <= max; j++) {
				if (i * j == number) {
					factors.add(i);
					if (i != j) {
						factors.add(j);
					}
				}
			}
		}

		factors.sort(Integer::compareTo);
		return factors;
	}

	public long generateRandom() {
		return new Random().nextLong();
	}
}
