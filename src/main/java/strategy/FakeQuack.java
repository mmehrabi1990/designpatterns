package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FakeQuack implements QuackBehavior {
	public void quack() {
		log.info("Qwak");
	}
}
