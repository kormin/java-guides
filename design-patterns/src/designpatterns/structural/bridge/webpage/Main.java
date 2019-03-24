package designpatterns.structural.bridge.webpage;

/**
 * @author tom
 *
 *         Description: Translating our WebPage example from above. Here we have
 *         the WebPage hierarchy
 * 
 *         Link:
 *         https://github.com/kamranahmedse/design-patterns-for-humans#-bridge
 */
public class Main {

	public static void main(String[] args) {
		Theme darkTheme = new DarkTheme();
		
		WebPage about = new About(darkTheme);
		WebPage careers = new Careers(darkTheme);
		
		System.out.println(about.getContent());
		System.out.println(careers.getContent());
	}

}
