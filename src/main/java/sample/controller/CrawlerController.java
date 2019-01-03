package sample.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.crawler.BaiduCrawler;
import sample.crawler.ICrawler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CrawlerController {

	@Autowired
	ICrawler crawler;
	
    @RequestMapping(value = "/crawler/{name}/run", method = RequestMethod.GET)
    public String run(@PathVariable final String name) {
        return crawler.run();
    }

}