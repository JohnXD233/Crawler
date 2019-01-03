package sample.crawler;

import org.springframework.stereotype.Component;

@Component
public class BingCrawler implements ICrawler {

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return this.getClass().getName() + "BingCrawler running.";
	}

}
