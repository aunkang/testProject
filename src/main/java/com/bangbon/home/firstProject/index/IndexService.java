package com.bangbon.home.firstProject.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbon.home.firstProject.model.Item;


public class IndexService {
	
	@Autowired
	IndexRepository indexRepository;
	
	IndexService() {
		System.out.println(">>>> indexService");
	}
	
	public List<Item> listItem() {
		return this.indexRepository.listItem();
	}
}
