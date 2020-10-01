package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Quack implements QuackBehavior {
	public void quack() {
		log.info("Quack");
	}
}
