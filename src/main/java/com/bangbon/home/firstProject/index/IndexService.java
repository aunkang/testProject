package com.bangbon.home.firstProject.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbon.home.firstProject.model.Item;

@Service
public class IndexService {
	
	@Autowired
	IndexRepository indexRepository;
	
	public List<Item> listItem() {
		return this.indexRepository.listItem();
	}
}
