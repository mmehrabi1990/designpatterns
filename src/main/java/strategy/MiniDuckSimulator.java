package strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		FlyBehavior cantFly = () -> log.info("I can't fly");
		QuackBehavior squeak = () -> log.info("Squeak");
		RubberDuck	rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck	 model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
