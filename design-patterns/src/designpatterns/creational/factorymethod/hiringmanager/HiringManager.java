package designpatterns.creational.factorymethod.hiringmanager;

abstract class HiringManager {
	protected abstract Interviewer makeInterviewer();
	
	public void takeInterview() {
		Interviewer interviewer = makeInterviewer();
		interviewer.askQuestions();
	}
}
