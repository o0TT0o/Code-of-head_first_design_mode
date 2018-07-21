package actions;

import actionsImpl.QuackBehavior;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
