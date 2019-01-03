package sample.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.crawler.BaiduCrawler;
import sample.crawler.ICrawler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("crawler")
@RestController
public class CrawlerController {

	
    @RequestMapping(value = "/crawler/{name}/run", method = RequestMethod.GET)
    public String run(@PathVariable final String name) {
        ICrawler crawler = null;
		try {
			crawler = (ICrawler) Class.forName(name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return crawler.run();
    }

}