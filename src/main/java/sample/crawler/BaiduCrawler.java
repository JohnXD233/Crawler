package sample.crawler;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("BaiduCrawler")
public class BaiduCrawler implements ICrawler {

	@RequestMapping("run")
    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
