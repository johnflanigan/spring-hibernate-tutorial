package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	String[] fortunes = { "You will lose money tomorrow", "You will trip and fall",
			"You will rip your underwear" };

	@Override
	public String getFortune() {
		int randomIndex = (int) Math.floor(Math.random() * 3);
		return fortunes[randomIndex];
	}

}
