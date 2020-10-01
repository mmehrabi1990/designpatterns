package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		log.info("I'm a model duck");
	}
}
