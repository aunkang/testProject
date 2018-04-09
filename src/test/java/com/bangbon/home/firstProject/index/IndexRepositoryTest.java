package com.bangbon.home.firstProject.index;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexRepositoryTest {
	
	IndexRepository indexRepo = new IndexRepository();

	@Test
	public void itemNameShouldBe_potato() {	
		String actuallyValue = this.indexRepo.listItem().get(0).getItemName();
		
		assertEquals("potato", actuallyValue);
	}
	
	@Test
	public void itemColorShouldBe_brown() {
		String actuallyValue = this.indexRepo.listItem().get(0).getItemColor();
		
		assertEquals("brown", actuallyValue);
	}
	
	@Test
	public void itemWeightShouldBe_5() {
		String actuallyValue = String.valueOf(this.indexRepo.listItem().get(0).getItemWeight());
		
		assertEquals("5", actuallyValue);
	}

}
