package ducks;

import actions.FlyWithWings;
import actions.Quack;


public class MallardDuck extends Duck {
	public MallardDuck() {
		
		// When in the same package with super class , auto get the define of "FlyBehavior" and "QucakBehavior"
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		display();
	}
	
	@Override
	public void display() {
		
		System.out.println("Im a mallard duck ");
		
	}
}
