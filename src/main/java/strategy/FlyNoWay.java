package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		log.info("I can't fly");
	}
}
