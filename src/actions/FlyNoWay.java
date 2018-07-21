package actions;

import actionsImpl.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	//@override
	//	Make Java Compiler To Check Function Parameters
	//	让编译器检查覆写的方法是否正确。
	@Override
	public void fly() {
		System.out.println("I can not fly...");
		
	}

}
