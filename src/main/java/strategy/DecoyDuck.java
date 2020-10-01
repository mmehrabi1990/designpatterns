package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		log.info("I'm a duck Decoy");
	}
}
