package sample.crawler;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("SoGouCrawler")
public class SoGouCrawler implements ICrawler {

	@RequestMapping("run")
	@Override
	public String run() {
		// TODO Auto-generated method stub
		return this.getClass().getName() + "SoGouCrawler running.";
	}

}
