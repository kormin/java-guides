package designpatterns.behavioral.template.builder;

/**
 * @author tom
 *
 *         Description: Imagine we have a build tool that helps us test, lint,
 *         build, generate build reports (i.e. code coverage reports, linting
 *         report etc) and deploy our app on the test server.
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-template-method
 * 
 */
public class Main {

	public static void main(String[] args) {
		Builder androidBuilder = new AndroidBuilder();
		androidBuilder.build();

		Builder iosBuilder = new IosBuilder();
		iosBuilder.build();
	}

}
