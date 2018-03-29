package com.bangbon.home.firstProject.index;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bangbon.home.firstProject.model.Item;

@Repository
public class IndexRepository {
	
	public List<Item> listItem() {
		List<Item> listOfItem = new ArrayList<Item>();
		listOfItem.add(new Item("potato", "brown", 5));
		return listOfItem;
	}

}
