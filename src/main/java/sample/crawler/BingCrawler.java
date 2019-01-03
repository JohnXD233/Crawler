package sample.crawler;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("BingCrawler")
public class BingCrawler implements ICrawler {

	@RequestMapping("run")
	@Override
	public String run() {
		// TODO Auto-generated method stub
		return this.getClass().getName() + "BingCrawler running.";
	}

}
