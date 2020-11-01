package com.whatrazvancooks.api;

import org.junit.jupiter.api.Test;

import java.util.Optional;

//@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		String value = func();
		Optional<String> optional = Optional.ofNullable(value);
		if(optional.isEmpty()) {
			System.out.println("is empty");
		} else {
			String optionalValue = optional.get();
			System.out.println(optionalValue);
		}
	}

	private String func() {
		return "asdsad";
	}

}
