package ducks;

import actionsImpl.FlyBehavior;
import actionsImpl.QuackBehavior;

public abstract class Duck {
	
	//	Delcare two var  for action , All Duck-Classes( in the same package ) inherid them.
	//	为行为接口声明两个引用变量，所有鸭子类（在同一个package中）都继承他们
	QuackBehavior quackBehavior;
	
	FlyBehavior flyBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void swim() {
		
		System.out.println("All ducks float, even decoys");
	}
	
	
	//	Deleget to "Action Classes"
	// 	委托给行为类
	public void performQuack() {
		
		quackBehavior.quack();
	}
	
	public void performFly() {
		
		flyBehavior.fly();
	}
	
}
