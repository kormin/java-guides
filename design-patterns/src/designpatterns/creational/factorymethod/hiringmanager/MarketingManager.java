package designpatterns.creational.factorymethod.hiringmanager;

public class MarketingManager extends HiringManager{

	@Override
	protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
	}

}
