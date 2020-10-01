package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		log.info("I'm a real Mallard duck");
	}
}
