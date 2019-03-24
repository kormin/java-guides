package designpatterns.structural.bridge.webpage;

public class About implements WebPage {
	protected Theme theme;
	
	public About(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String getContent() {
		return "About page in " + theme.getColor();
	}

}
