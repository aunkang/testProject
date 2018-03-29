package com.bangbon.home.firstProject.model;


public class Item {
	private String itemName;
	private String itemColor;
	private Integer itemWeight;
	
	public Item(String itemName, String itemColor, Integer itemWeight) {
		this.itemName = itemName;
		this.itemColor = itemColor;
		this.itemWeight = itemWeight;
	}
	
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemColor
	 */
	public String getItemColor() {
		return itemColor;
	}
	/**
	 * @param itemColor the itemColor to set
	 */
	public void setItemColor(String itemColor) {
		this.itemColor = itemColor;
	}
	/**
	 * @return the itemWeight
	 */
	public Integer getItemWeight() {
		return itemWeight;
	}
	/**
	 * @param itemWeight the itemWeight to set
	 */
	public void setItemWeight(Integer itemWeight) {
		this.itemWeight = itemWeight;
	}
	
	
}
