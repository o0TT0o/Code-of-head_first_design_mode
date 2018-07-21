package actions;

import actionsImpl.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<<	Silence >>");
	}
}
