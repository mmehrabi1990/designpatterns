package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Squeak implements QuackBehavior {
	public void quack() {
		log.info("Squeak");
	}
}
