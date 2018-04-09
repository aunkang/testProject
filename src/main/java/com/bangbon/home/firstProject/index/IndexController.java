package com.bangbon.home.firstProject.index;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bangbon.home.firstProject.model.Item;

@RestController
public class IndexController {
	
//	@Autowired
//	IndexService indexService;
	
    @GetMapping("/index")
    private Index index(@RequestParam(name="name", required=false, defaultValue="World") 
    String name) {
        Index index1 = new Index(name, "ours password");
        return index1;
    }
    
    @GetMapping("/index/listItem")
    private void listItem() {
//    	IndexService indexService = new IndexService();
//    	return indexService.listItem();
    }

}
