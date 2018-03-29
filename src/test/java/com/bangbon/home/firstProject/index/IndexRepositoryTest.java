package com.bangbon.home.firstProject.index;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexRepositoryTest {

	@Test
	public void testListItem() {
		IndexRepository indexRepo = new IndexRepository(); 
		String expectedValue = "potatobrown5";
		String actuallyValue = indexRepo.listItem().get(0).getItemName() + 
				indexRepo.listItem().get(0).getItemColor() +
				indexRepo.listItem().get(0).getItemWeight();
		
		assertEquals(expectedValue, actuallyValue);

	}

}
