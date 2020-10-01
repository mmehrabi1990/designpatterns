package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		log.info("I'm a real Red Headed duck");
	}
}
