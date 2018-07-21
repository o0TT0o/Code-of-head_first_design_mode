package actions;

import actionsImpl.QuackBehavior;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("֨֨Squeak");
	}
}
