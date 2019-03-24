package designpatterns.behavioral.template.builder;

abstract class Builder {
	final public void build() {
		this.test();
		this.lint();
		this.assemble();
		this.deploy();
	}

	abstract public void test();

	abstract public void lint();

	abstract public void assemble();

	abstract public void deploy();
}
