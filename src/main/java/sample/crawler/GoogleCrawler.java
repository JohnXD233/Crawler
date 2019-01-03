package sample.crawler;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("GoogleCrawler")
public class GoogleCrawler implements ICrawler {

	@RequestMapping("run")
    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
