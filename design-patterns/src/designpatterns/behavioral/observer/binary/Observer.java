package designpatterns.behavioral.observer.binary;

abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
